package com.irs.controller.web;

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
	private CvService cvService;

	@RequestMapping("/getCvsList/{uid}")
	@ResponseBody
	public Object getPostList(@PathVariable("uid")String uid, CvSearch search){


		ResultUtil resultUtil = cvService.selCvs(1,10,search);
		List<TbCvs> cvsList = (List<TbCvs>)resultUtil.getData();
		List<Map<String, Object>> data = new ArrayList<>(cvsList.size());
		for (TbCvs tbCvs : cvsList) {
			Map<String, Object> resultAll = new HashMap<>();
			resultAll.put("uid", tbCvs.getUid());
            resultAll.put("resultImage", "../../images/dyzp/zp.png");
//			resultAll.put("resultTitle", tbCvs.getZpbm());//招聘部门
//			resultAll.put("resultContent", "岗位："+tbCvs.getZpgw()+"——任职要求："+tbPosts.getRztj());//招聘岗位
//			resultAll.put("resultLocation", tbCvs.getCreateTime());//发布时间
			data.add(resultAll);
		}
		return ResponseUtil.ok(data);
	}
}
