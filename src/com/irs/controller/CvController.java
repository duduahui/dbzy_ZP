package com.irs.controller;

import com.irs.pojo.*;
import com.irs.pojo.cv.TbCvsGz;
import com.irs.pojo.cv.TbCvsJy;
import com.irs.pojo.cv.TbCvsPx;
import com.irs.service.CvService;
import com.irs.service.PostService;
import com.irs.service.PsndocService;
import com.irs.util.ResultUtil;
import com.irs.util.TurnBPM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("cv/")
public class CvController {


	@Autowired
	private CvService cvServiceImpl;
	@Autowired
	private PostService postServiceImpl;
	@Autowired
	private PsndocService psndocServiceImpl;

	

	@RequestMapping("cvList")
//	@RequiresPermissions("post:post:list")
	public String cvList(){
		return "page/cv/cvList";
	}
    @RequestMapping("cvRckList")
//	@RequiresPermissions("post:post:list")
    public String cvRckList(){
        return "page/cv/cvRckList";
    }
	@RequestMapping("getCvList")
	@ResponseBody
	public ResultUtil getCvList(Integer page, Integer limit, CvSearch search){
		return cvServiceImpl.selCvs(page,limit,search);
	}
	@RequestMapping("getRckCvList")
	@ResponseBody
	public ResultUtil getRckCvList(Integer page, Integer limit, CvSearch search){
		search.setCvstatus("4");
		return cvServiceImpl.selCvs(page,limit,search);
	}

	/**
	 * 简历列表
	 * **/
	@RequestMapping("getCvList/{uid}")
	@ResponseBody

	public ResultUtil getCvList(Integer page, Integer limit, CvSearch search,@PathVariable("uid")String uid){

		if(uid==null&&"".equals(uid)){
			//不是由职位跳转过来
			return cvServiceImpl.selCvs(page,limit,search);
		}else{
			search.setPostid(uid);
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
//    @ResponseBody
	public String checkCv(@PathVariable("uid")String uid, Model model){
		String[] post_cv = uid.split(",");
		TbCvs cv=cvServiceImpl.selCvByUid(Long.parseLong(post_cv[0]));
        List<TbCvsPx> tbCvsPxList =cvServiceImpl.selCvsPxByUid(cv.getCvid());
		List<TbCvsJy> tbCvsJyList =cvServiceImpl.selCvsJyByUid(cv.getCvid());
		List<TbCvsGz> tbCvsGzList =cvServiceImpl.selCvsGzByUid(cv.getCvid());

		model.addAttribute("cv", cv);
		model.addAttribute("post", post_cv[1]);
		model.addAttribute("cvjy", tbCvsJyList);
		model.addAttribute("cvgz", tbCvsGzList);
		model.addAttribute("cvpx", tbCvsPxList);
		return "page/cv/checkCv";
	}
	/**
	 * 查看简历
	 * dudu
	 * 2020年3月5日09:40:44
	 **/
	@RequestMapping("checkCv")
//    @ResponseBody
	public String checkCv(){
//		TbCvs cv=cvServiceImpl.selCvByUid(Long.parseLong(uid));
//		model.addAttribute("cv", cv);
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
     * 选择BPM流程处理人
     * **/
    @RequestMapping("bpmCLR/{str}")
    public String bpmCLR(@PathVariable("str")String str, Model model){
//        TbPsndoc tbPsndoc=psndocServiceImpl.selPsndocList (Long.parseLong(uid));
		String[] post_cv = str.split(",");
        model.addAttribute("cvid", post_cv[0]);
		model.addAttribute("post", post_cv[1]);
        return "page/bpm/bpmCLR";
    }
	/**
	 * 人员列表
	 * **/
	@RequestMapping("getPsnList")
	@ResponseBody

	public ResultUtil getPsnList(Integer page, Integer limit, PsnSearch nickname){
		return psndocServiceImpl.selPsndocList(page,limit,nickname);
	}
    /**
     * 触发BPM流程
     * **/
	@RequestMapping("subBpm/{postStr}")
	@ResponseBody
	public ResultUtil subBpm(@PathVariable("postStr")String postStr, Model model){

		TurnBPM turnBPM = new TurnBPM();
		int result =  turnBPM.get(postStr);
		if(result == 0){
            try{
                String[] uid_value = postStr.split(",");
                TbCvs tbCvs = cvServiceImpl.selCvByUid(Long.parseLong(uid_value[0]));
                tbCvs.setCvstatus("5");
                cvServiceImpl.editCvService(tbCvs);
                return ResultUtil.ok();
            }catch (Exception e){

            }
		}
		return ResultUtil.error("提交失败！");
	}
	/**
	 * 更新简历状态
	 * **/
	@RequestMapping("updCvs/{uid}")
	@ResponseBody
	public ResultUtil updCvs(@PathVariable("uid")String uid){
		String[] uid_value = uid.split(",");
        int result = 0;
		try{
			TbCvs tbCvs = cvServiceImpl.selCvByUid(Long.parseLong(uid_value[0]));
			tbCvs.setCvstatus(uid_value[1]);
			cvServiceImpl.editCvService(tbCvs);
		}catch (Exception e){
            result = 1;
	}
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
//	 * 更新简历状态
//	 * @param cv
//	 * @return
//	 */
//	@SysLog(value="更新简历状态")
//	@RequestMapping("updCvs")
//	@ResponseBody
//	public ResultUtil updCvs(TbUsers user){
//		try {
//			postServiceImpl.updUserService(user);
//			return ResultUtil.ok();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return ResultUtil.error();
//		}
//	}
}
