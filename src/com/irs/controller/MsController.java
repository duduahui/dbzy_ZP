package com.irs.controller;


import com.irs.pojo.*;
import com.irs.pojo.TbMsglPj;
import com.irs.pojo.cv.TbCvsGz;
import com.irs.pojo.cv.TbCvsJy;
import com.irs.pojo.cv.TbCvsPx;
import com.irs.service.CvService;
import com.irs.service.MsService;
import com.irs.service.PostService;
import com.irs.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("msgl/")
public class MsController {


	@Autowired
	private CvService cvServiceImpl;
	@Autowired
	private MsService msServiceImpl;
	@Autowired
	private PostService postServiceImpl;

	

	@RequestMapping("msglList")
	public String msglList(){
		return "page/msgl/msglList";
	}

	@RequestMapping("getmsglList")
	@ResponseBody
	public ResultUtil getCvList(Integer page, Integer limit, CvSearch search){
		return msServiceImpl.selCvs(page,limit,search);
	}

	/**
	 * 查看简历
	 * dudu
	 * 2020年3月5日09:40:44
	 **/
	@RequestMapping("checkMsgl/{uid}")
//    @ResponseBody
	public String checkMsgl(@PathVariable("uid")String uid, Model model){
		TbPostsCvs tbPostsCvs = cvServiceImpl.selPostCvService(uid);
		//查询简历
		TbCvs cv=cvServiceImpl.selCvByCvid(tbPostsCvs.getCvcode());
		List<TbCvsPx> tbCvsPxList =cvServiceImpl.selCvsPxByUid(cv.getCvid());
		List<TbCvsJy> tbCvsJyList =cvServiceImpl.selCvsJyByUid(cv.getCvid());
		List<TbCvsGz> tbCvsGzList =cvServiceImpl.selCvsGzByUid(cv.getCvid());
		List<TbMsglPj> tbMsglPjs =msServiceImpl.selMsglPj(uid);
		model.addAttribute("cv", cv);
		model.addAttribute("postcvid", tbPostsCvs.getUid());
		model.addAttribute("cvjy", tbCvsJyList);
		model.addAttribute("cvgz", tbCvsGzList);
		model.addAttribute("cvpx", tbCvsPxList);
		model.addAttribute("pj", tbMsglPjs);
		return "page/msgl/checkMsgl";
	}
	@RequestMapping("cvList/{uid}")
	public String getCvList(@PathVariable("uid")String uid,Model model){

		TbPosts post=postServiceImpl.selPostByUid(Long.parseLong(uid));
		model.addAttribute("post", post);
		return "page/cv/cvList";
	}
}
