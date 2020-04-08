package com.irs.controller;

import com.irs.annotation.SysLog;
import com.irs.pojo.PostSearch;
import com.irs.pojo.TbPosts;
import com.irs.pojo.TbUsers;
import com.irs.service.DeptService;
import com.irs.service.PostService;
import com.irs.util.ResultUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("post/")
public class PostController {


	@Autowired
	private PostService postServiceImpl;
	@Autowired
	private DeptService deptServiceImpl;
	
//	@RequestMapping("addUser")
//	@RequiresPermissions("user:user:save")
//	public String userAdd(){
//		return "page/user/addUser";
//	}
	@RequestMapping("addPost")
	@RequiresPermissions("post:post:save")
	public String postAdd(){
		return "page/post/addPost";
	}

	@RequestMapping("cv2postList/{uid}")
//	@RequiresPermissions("post:post:list")
	public String cv2postList(@PathVariable("uid")String uid,Model model){
		model.addAttribute("cvid", uid);
		return "page/post/cv2postList";
	}

	@RequestMapping("postList")
	@RequiresPermissions("post:post:list")
	public String postList(){
		return "page/post/postList";
	}

	@RequestMapping("cvList")
//	@RequiresPermissions("post:post:list")
	public String cvList(){
		return "page/cv/cvList";
	}


//
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

	/**
	 * 添加职位
	 * @param post
	 * @return
	 */
	@SysLog(value="添加职位")
	@RequestMapping("insPost")
	@RequiresPermissions("post:post:save")
	@ResponseBody
	public ResultUtil insPost(TbPosts post){
		//防止浏览器提交
		try {
			postServiceImpl.insPostService(post);
			return ResultUtil.ok();
		} catch (Exception e) {
			//e.printStackTrace();
			return new ResultUtil(502,"职位添加错误，请检查！");
		}
	}


	/**
	 * 查询职位列表
	 * @param
	 * @return
	 */
	@RequestMapping("getPostList")
	@RequiresPermissions("post:post:list")
	@ResponseBody
	public ResultUtil getPostList(Integer page, Integer limit, PostSearch search){
		return postServiceImpl.selPosts(page,limit,search);
	}

	/**
	 * 查询职位列表
	 * @param
	 * @return
	 */
	@RequestMapping("getcv2PostList")
//	@RequiresPermissions("post:post:list")
	@ResponseBody
	public ResultUtil getcv2postList(Integer page, Integer limit, PostSearch search){
		return postServiceImpl.selPosts(page,limit,search);
	}
	/***
	 * 查询部门列表
	 * @return
	 */
	@RequestMapping("deptList")
	@ResponseBody
	public ResultUtil deptList(){
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setData(deptServiceImpl.selDeptList());
		return resultUtil;
	}
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

	/**
	 * 根据ID下架职位
	 * @param uid
	 * @return
	 */
	@SysLog(value="根据ID下架职位")
	@RequestMapping("underPostByUid/{uid}")
	@ResponseBody
	public ResultUtil underPostByUid(@PathVariable("uid")Long uid){
		try {
			postServiceImpl.updPostByUid(uid,"下架");
			return ResultUtil.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return ResultUtil.error();
		}
	}

	/**
	 * 根据ID发布职位
	 * @param uid
	 * @return
	 */
	@SysLog(value="根据ID发布职位")
	@RequestMapping("subPostByUid/{uid}")
	@ResponseBody
	public ResultUtil subPostByUid(@PathVariable("uid")Long uid){
		try {
			postServiceImpl.updPostByUid(uid,"发布");
			return ResultUtil.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return ResultUtil.error();
		}
	}

	@RequestMapping("editPost/{uid}")
	@RequiresPermissions("post:post:save")
	public String editUser(@PathVariable("uid")String uid,Model model){
		TbPosts post=postServiceImpl.selPostByUid(Long.parseLong(uid));
		model.addAttribute("post", post);
		model.addAttribute("zdeptname", deptServiceImpl.getDeptName(post.getZdept()));
		return "page/post/editPost";
	}

	/**
	 * 更新职位信息
	 * @param post
	 * @return
	 */
	@SysLog(value="更新职位信息")
	@RequestMapping("updPost")
//	@RequiresPermissions("post:user:update")
	@ResponseBody
	public ResultUtil updPost(TbPosts post){
		try {
			postServiceImpl.updPostService(post);
			return ResultUtil.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return ResultUtil.error();
		}
	}
}
