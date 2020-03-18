package com.irs.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.irs.mapper.TbCvsMapper;
import com.irs.mapper.TbPostsCvsMapper;
import com.irs.pojo.*;
import com.irs.pojo.TbCvsExample.Criteria;
import com.irs.service.CvService;
import com.irs.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class CvServiceImpl implements CvService {

	@Autowired
	private TbCvsMapper tbCvsMapper;

	@Autowired
	private TbPostsCvsMapper tbPostsCvsMapper;
//	@Override
//	public TbCvs selCvByEmail(String eMail,Long uid) {
//		TbCvsExample example=new TbCvsExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andEMailEqualTo(eMail);
//		if(uid!=null&&!"".equals(uid)){
//			criteria.andUidNotEqualTo(uid);
//		}
//		List<TbCvs> Cvs = tbCvsMapper.selectByExample(example);
//		if(Cvs!=null&&Cvs.size()>0){
//			return Cvs.get(0);
//		}
//		return null;
//	}
//
//	@Override
//	public TbCvs selCvByNickname(String nickname,Long uid) {
//		TbCvsExample example=new TbCvsExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andNicknameEqualTo(nickname);
//		if(uid!=null&&!"".equals(uid)){
//			criteria.andUidNotEqualTo(uid);
//		}
//		List<TbCvs> Cvs = tbCvsMapper.selectByExample(example);
//		if(Cvs!=null&&Cvs.size()>0){
//			return Cvs.get(0);
//		}
//		return null;
//	}



	@Override
	public ResultUtil selCvs(Integer page, Integer limit,CvSearch search) {
		ResultUtil resultUtil = new ResultUtil();
		List<TbCvs> Cvs = new ArrayList<TbCvs>();
		TbCvsExample example=new TbCvsExample();
		Criteria criteria = example.createCriteria();
//		if(search.getZwid()!=null&&!"".equals(search.getZwid())){
//			criteria.andUidNotEqualTo(uid);
//		}
		if(search.getZwid()!=null&&!"0".equals(search.getZwid())){
			Cvs = tbPostsCvsMapper.getTbCvs(search.getZwid());
		}
		else{
			Cvs = tbCvsMapper.selectByExample(example);
		}

		PageInfo<TbCvs> pageInfo = new PageInfo<TbCvs>(Cvs);
		resultUtil.setCode(0);
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		return resultUtil;
	}

	@Override
	public void insCv2PostService(String postStr) {
		String[] posts = postStr.split(",");
		TbPostsCvs tbPostsCvs = new TbPostsCvs();
		tbPostsCvs.setCreatetime(new Date());
		tbPostsCvs.setCvcode(posts[0]);
		tbPostsCvs.setSubmiter("人力资源部");
		if(posts!=null&&posts.length>0){
			for (int i = 1; i < posts.length ; i++) {
				tbPostsCvs.setPostcode(posts[i]);
				tbPostsCvsMapper.insert(tbPostsCvs);
			}
		}
	}
//
//	@Override
//	public void delCvByUid(String uid) {
//		tbCvsMapper.deleteByPrimaryKey(Long.parseLong(uid));
//	}
//
	@Override
	public TbCvs selCvByUid(Long uid) {
		return tbCvsMapper.selectByPrimaryKey(uid);
	}
//
//	@Override
//	public void updCvService(TbCvs Cv) {
//		TbCvs u = tbCvsMapper.selectByPrimaryKey(Cv.getUid());
//		Cv.setPassword(u.getPassword());
//		Cv.seteCode(u.geteCode());
//		Cv.setCreateTime(u.getCreateTime());
//		tbCvsMapper.updateByPrimaryKey(Cv);
//	}

}
