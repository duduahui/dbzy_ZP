package com.irs.controller.web;

import com.irs.pojo.PostSearch;
import com.irs.pojo.TbPosts;
import com.irs.service.PostService;
import com.irs.util.ResponseUtil;
import com.irs.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("wx")
public  class WxPostController {

	@Autowired
	private PostService postService;

	@RequestMapping("/getPostList")
	@ResponseBody
	public Object getPostList(Integer page, Integer limit, PostSearch search){


		ResultUtil resultUtil = postService.selPosts(1,10,search);
		List<TbPosts> postList = (List<TbPosts>)resultUtil.getData();
		List<Map<String, Object>> data = new ArrayList<>(postList.size());
		for (TbPosts tbPosts : postList) {
			Map<String, Object> resultAll = new HashMap<>();
			resultAll.put("uid", tbPosts.getUid());
            resultAll.put("resultImage", "../../images/dyzp/zp.png");
//			resultAll.put("resultTitle", tbPosts.getZpbm());//招聘部门
//			resultAll.put("resultContent", "岗位："+tbPosts.getZpgw()+"——任职要求："+tbPosts.getRztj());//招聘岗位
			resultAll.put("resultLocation", tbPosts.getCreateTime());//发布时间
			data.add(resultAll);
		}
		return ResponseUtil.ok(data);
	}
}
