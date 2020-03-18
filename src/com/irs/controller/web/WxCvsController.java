package com.irs.controller.web;

import com.irs.annotation.SysLog;
import com.irs.pojo.CvSearch;
import com.irs.pojo.TbCvs;
import com.irs.pojo.TbPosts;
import com.irs.service.CvService;
import com.irs.util.ResponseUtil;
import com.irs.util.ResultUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("wx")
public  class WxCvsController {

	@Autowired
	private CvService cvServiceImpl;

	/**
	 * 查看简历Cv
	 * @param
	 * @return
	 */
	@SysLog(value="查看简历")
	@RequestMapping("/getCvsList/{userid}")
	@ResponseBody
	public Object getCvsList(@PathVariable("userid")String userid, CvSearch search){

		search.setUserid(userid);
		ResultUtil resultUtil = cvServiceImpl.selCvs(1,10,search);
		List<TbCvs> cvsList = (List<TbCvs>)resultUtil.getData();
		List<Map<String, Object>> data = new ArrayList<>(cvsList.size());
		for (TbCvs tbCvs : cvsList) {
			Map<String, Object> resultAll = new HashMap<>();
			resultAll.put("userid", tbCvs.getUserid());
            resultAll.put("nickname",tbCvs.getNickname());
			resultAll.put("phone", tbCvs.getPhone());
			resultAll.put("email", tbCvs.getEmail());
			data.add(resultAll);
		}
		return ResponseUtil.ok(data);
	}
	/**
	 * 添加简历Cv
	 * @param
	 * @return
	 */
	@SysLog(value="添加简历")
	@RequestMapping("/insCvs")
	@ResponseBody
	public ResultUtil insCvs(TbCvs cvs){
		//防止浏览器提交
		try {
			cvServiceImpl.insCvService(cvs);
			return ResultUtil.ok();
		} catch (Exception e) {
			//e.printStackTrace();
			return new ResultUtil(502,"简历添加错误，请检查！");
		}
	}
//	@RequestMapping("/addCvs")
//	@ResponseBody
//	public Object addCvs(@PathVariable("userid")String userid, CvSearch search){
//
//		search.setUserid(userid);
//		ResultUtil resultUtil = cvService.selCvs(1,10,search);
//		List<TbCvs> cvsList = (List<TbCvs>)resultUtil.getData();
//		List<Map<String, Object>> data = new ArrayList<>(cvsList.size());
//		for (TbCvs tbCvs : cvsList) {
//			Map<String, Object> resultAll = new HashMap<>();
//			resultAll.put("userid", tbCvs.getUserid());
//			resultAll.put("nickname",tbCvs.getNickname());
//			resultAll.put("phone", tbCvs.getPhone());
//			resultAll.put("email", tbCvs.getEmail());
//			data.add(resultAll);
//		}
//		return ResponseUtil.ok(data);
//	}
}
