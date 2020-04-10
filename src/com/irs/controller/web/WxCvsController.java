package com.irs.controller.web;

import com.irs.annotation.SysLog;
import com.irs.pojo.CvSearch;
import com.irs.pojo.TbCvs;
import com.irs.service.CvService;
import com.irs.util.ResponseUtil;
import com.irs.util.ResultUtil;
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
	@RequestMapping("/getCvsList")
	@ResponseBody
	public Object getCvsList( String userid, CvSearch search){
		search.setUserid(userid);
		ResultUtil resultUtil = cvServiceImpl.selCvs(1,10,search);
		List<TbCvs> cvsList = (List<TbCvs>)resultUtil.getData();
		List<Map<String, Object>> data = new ArrayList<>(cvsList.size());
		for (TbCvs tbCvs : cvsList) {
			Map<String, Object> resultAll = new HashMap<>();
			resultAll.put("userid", tbCvs.getUserid());
			resultAll.put("nickname",tbCvs.getNickname());
			resultAll.put("phone", tbCvs.getPhone());
//			resultAll.put("email", tbCvs.getEmail());
			data.add(resultAll);
		}
		return ResponseUtil.ok(data);

	}
	/**
	 * 查看简历Cv
	 * @param
	 * @return
	 */
	@SysLog(value="查看单个简历")
	@RequestMapping("/getCvs")
	@ResponseBody
	public Object getCvsL( Long uid ){
		TbCvs tbCvs =cvServiceImpl.selCvByUid(uid);
		Map<String, Object> resultAll = new HashMap<>();
		resultAll.put("userid", tbCvs.getUserid());
		resultAll.put("nickname",tbCvs.getNickname());
		resultAll.put("phone", tbCvs.getPhone());
//		resultAll.put("email", tbCvs.getEmail());
		return ResponseUtil.ok(resultAll);
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
	/**
	 * 添加简历Cv
	 * @param
	 * @return
	 */
	@SysLog(value="添加简历--教育经历")
	@RequestMapping("/insCvsJy")
	@ResponseBody
	public ResultUtil insCvsJy(TbCvs cvs){
		//防止浏览器提交
		try {
			cvServiceImpl.insCvService(cvs);
			return ResultUtil.ok();
		} catch (Exception e) {
			//e.printStackTrace();
			return new ResultUtil(502,"简历添加错误，请检查！");
		}
	}
	/**
	 * 添加简历Cv
	 * @param
	 * @return
	 */
	@SysLog(value="添加简历--工作经历")
	@RequestMapping("/insCvsGz")
	@ResponseBody
	public ResultUtil insCvsGz(TbCvs cvs){
		//防止浏览器提交
		try {
			cvServiceImpl.insCvService(cvs);
			return ResultUtil.ok();
		} catch (Exception e) {
			//e.printStackTrace();
			return new ResultUtil(502,"简历添加错误，请检查！");
		}
	}
	/**
	 * 添加简历Cv
	 * @param
	 * @return
	 */
	@SysLog(value="添加简历--培训经历")
	@RequestMapping("/insCvsPx")
	@ResponseBody
	public ResultUtil insCvsPx(TbCvs cvs){
		//防止浏览器提交
		try {
			cvServiceImpl.insCvService(cvs);
			return ResultUtil.ok();
		} catch (Exception e) {
			//e.printStackTrace();
			return new ResultUtil(502,"简历添加错误，请检查！");
		}
	}
	/**
	 * 申请职位，关联简历
	 * dudu
	 * 2020年3月12日09:40:44
	 **/
	@RequestMapping("turnCv/")
	@ResponseBody
	public ResultUtil turnCv(String postStr){//postStr = "cvcode,postcode";
		try {
			cvServiceImpl.insCv2PostService(postStr);
			return ResultUtil.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return ResultUtil.error();
		}
	}
	/**
	 * 修改简历Cv
	 * @param
	 * @return
	 */
	@SysLog(value="修改简历")
	@RequestMapping("/editCvs")
	@ResponseBody
	public ResultUtil editCvs(TbCvs cvs){
		//防止浏览器提交
		try {
			cvServiceImpl.editCvService(cvs);
			return ResultUtil.ok();
		} catch (Exception e) {
			//e.printStackTrace();
			return new ResultUtil(502,"简历添加错误，请检查！");
		}
	}
	/**
	 * 删除简历Cv
	 * @param
	 * @return
	 */
	@SysLog(value="删除简历")
	@RequestMapping("/delCvs/{uid}")
	@ResponseBody
	public ResultUtil delCvs(@PathVariable("uid")Long uid){
		try {
			TbCvs cvs = new TbCvs();
			cvs.setCvstatus("0");
			cvs.setUid(uid);
			cvServiceImpl.insCvService(cvs);
			return ResultUtil.ok();
		} catch (Exception e) {
			//e.printStackTrace();
			return new ResultUtil(502,"简历删除成功，请检查！");
		}
	}

}
