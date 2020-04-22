package com.irs.service.impl;

import com.github.pagehelper.PageInfo;
import com.irs.mapper.PsndocMapper;
import com.irs.pojo.*;
import com.irs.service.DeptService;
import com.irs.service.PsndocService;
import com.irs.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PsndocServiceImpl implements PsndocService {
	
	@Autowired
	private PsndocMapper psndocMapper;

	@Override
	public ResultUtil selPsndocList(Integer page, Integer limit, String nickname) {

		ResultUtil resultUtil = new ResultUtil();
		List<TbPsndoc> Cvs = new ArrayList<TbPsndoc>();
		if(nickname!=null&&!"".equals(nickname)){
			Cvs = psndocMapper.getPsndoc(nickname);
		}else{
//			Cvs = psndocMapper.getPsndocLists();
		}
		PageInfo<TbPsndoc> pageInfo = new PageInfo<TbPsndoc>(Cvs);
		resultUtil.setCode(0);
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		return resultUtil;
	}

	@Override
	public ResultUtil selPsndocList(Integer page, Integer limit, PsnSearch nickname) {

		ResultUtil resultUtil = new ResultUtil();
		List<TbPsndoc> Cvs = new ArrayList<TbPsndoc>();
//		Cvs = psndocMapper.getPsndocLists();
		if(nickname.getNickname()!=null&&!"".equals(nickname.getNickname())){
			Cvs = psndocMapper.getPsndoc("%"+nickname.getNickname()+"%");
		}
		PageInfo<TbPsndoc> pageInfo = new PageInfo<TbPsndoc>(Cvs);
		resultUtil.setCode(0);
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		return resultUtil;
	}

	@Override
	public String getPsnName(String psncode){
		return psndocMapper.getPsnname(psncode);
	}

}
