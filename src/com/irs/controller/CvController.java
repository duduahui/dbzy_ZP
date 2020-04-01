package com.irs.controller;

import com.irs.pojo.CvSearch;
import com.irs.pojo.TbCvs;
import com.irs.pojo.TbPosts;
import com.irs.service.CvService;
import com.irs.service.PostService;
import com.irs.util.ResultUtil;
import com.irs.util.TurnBPM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("cv/")
public class CvController {


	@Autowired
	private CvService cvServiceImpl;
	@Autowired
	private PostService postServiceImpl;
	

	@RequestMapping("cvList")
//	@RequiresPermissions("post:post:list")
	public String cvList(){
		return "page/cv/cvList";
	}
	@RequestMapping("getCvList")
//	@RequiresPermissions("post:post:list")
	@ResponseBody
	public ResultUtil getCvList(Integer page, Integer limit, CvSearch search){
		return cvServiceImpl.selCvs(page,limit,search);
	}

	/**
	 * 简历列表
	 * **/
	@RequestMapping("getCvList/{uid}")
//	@RequiresPermissions("post:post:list")
	@ResponseBody

	public ResultUtil getCvList(Integer page, Integer limit, CvSearch search,@PathVariable("uid")String uid){

		if(uid==null&&"".equals(uid)){
			//不是由职位跳转过来
			return cvServiceImpl.selCvs(page,limit,search);
		}else{
			search.setUserid(uid);
			return cvServiceImpl.selPostCvs(page,limit,search);
		}
	}

	@RequestMapping("cvList/{uid}")
//	@RequiresPermissions("user:user:save")
	public String getCvList(@PathVariable("uid")String uid,Model model){

		TbPosts post=postServiceImpl.selPostByUid(Long.parseLong(uid));
		model.addAttribute("post", post);
		return "page/cv/cvList";
	}

    /**
     * 查看简历
     * dudu
     * 2020年3月5日09:40:44
     **/
	@RequestMapping("checkCv/{uid}")
    @ResponseBody
	public String checkCv(@PathVariable("uid")String uid, Model model){
		TbCvs cv=cvServiceImpl.selCvByUid(Long.parseLong(uid));
		model.addAttribute("cv", cv);
		return "page/cv/checkCv";
	}

    /**
     * 转发简历
     * dudu
     * 2020年3月12日09:40:44
     **/
    @RequestMapping("turnCv/{postStr}")
	@ResponseBody
    public ResultUtil turnCv(@PathVariable("postStr")String postStr){

		try {
			cvServiceImpl.insCv2PostService(postStr);
			return ResultUtil.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return ResultUtil.error();
		}
    }
    /**
     * 触发BPM流程
     * **/
	@RequestMapping("subCv/{zwid}")
	@ResponseBody
	public ResultUtil subCv(@PathVariable("zwid")String zwid, Model model){
		TurnBPM turnBPM = new TurnBPM();
		int result =  turnBPM.get(zwid);
		if(result == 0){
			return ResultUtil.ok();
		}
		return ResultUtil.error("提交失败！");

	}
//	@RequestMapping("addUser")
//	@RequiresPermissions("user:user:save")
//	public String userAdd(){
//		return "page/user/addUser";
//	}
//	@RequestMapping("addPost")
//	@RequiresPermissions("post:post:save")
//	public String postAdd(){
//		return "page/post/addPost";
//	}

//	@RequestMapping("checkUserByEmail")
//	@ResponseBody
//	public ResultUtil checkUserEmail(String eMail,Long uid){
//		TbUsers user = postServiceImpl.selUserByEmail(eMail,uid);
//		if(user!=null){
//			return new ResultUtil(500,"邮箱已存在，请重新填写！");
//		}
//		return new ResultUtil(0);
//	}
//	
//	@RequestMapping("checkUserByNickname/{nickname}")
//	@ResponseBody
//	public ResultUtil checkNickname(@PathVariable("nickname")String nickname,Long uid){
//		TbUsers user = postServiceImpl.selUserByNickname(nickname,uid);
//		if(user!=null){
//			return new ResultUtil(501,"昵称已存在，请重新填写！");
//		}
//		return new ResultUtil(0);
//	}

//	/**
//	 * 添加职位
//	 * @param post
//	 * @return
//	 */
//	@SysLog(value="添加职位")
//	@RequestMapping("insPost")
//	@RequiresPermissions("post:post:save")
//	@ResponseBody
//	public ResultUtil insPost(TbPosts post){
//		//防止浏览器提交
//		String u1 = "";
//		try {
//			postServiceImpl.insPostService(post);
//			return ResultUtil.ok();
//		} catch (Exception e) {
//			//e.printStackTrace();
//			return new ResultUtil(502,"职位添加错误，请检查！");
//		}
//	}




//	/**
//	 * 批量删除用户
//	 * @param userStr
//	 * @return
//	 */
//	@SysLog(value="批量删除用户")
//	@RequestMapping("delUsers/{userStr}")
//	@RequiresPermissions("user:user:delete")
//	@ResponseBody
//	public ResultUtil delUsers(@PathVariable("userStr")String userStr){
//		try {
//			postServiceImpl.delUsersService(userStr);
//			return ResultUtil.ok();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return ResultUtil.error();
//		}
//	}
//	
//	/**
//	 * 根据ID删除用户
//	 * @param uid
//	 * @return
//	 */
//	@SysLog(value="根据ID删除用户")
//	@RequestMapping("delUserByUid/{uid}")
//	@RequiresPermissions("user:user:delete")
//	@ResponseBody
//	public ResultUtil delUserByUid(@PathVariable("uid")String uid){
//		try {
//			postServiceImpl.delUserByUid(uid);;
//			return ResultUtil.ok();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return ResultUtil.error();
//		}
//	}
//	
//	@RequestMapping("editUser/{uid}")
//	@RequiresPermissions("user:user:save")
//	public String editUser(@PathVariable("uid")String uid,Model model){
//		TbUsers user=postServiceImpl.selUserByUid(Long.parseLong(uid));
//		model.addAttribute("user", user);
//		return "page/user/editUser";
//	}
//	
//	/**
//	 * 更新用户信息
//	 * @param user
//	 * @return
//	 */
//	@SysLog(value="更新用户信息")
//	@RequestMapping("updUser")
//	@RequiresPermissions("user:user:update")
//	@ResponseBody
//	public ResultUtil updUser(TbUsers user){
//		try {
//			postServiceImpl.updUserService(user);
//			return ResultUtil.ok();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return ResultUtil.error();
//		}
//	}
}
