package com.irs.service.impl;

import com.github.pagehelper.PageInfo;
import com.irs.mapper.TbCvsMapper;
import com.irs.mapper.TbPostsCvsMapper;
import com.irs.mapper.TbPostsMapper;
import com.irs.mapper.src.cv.TbCvsGzMapper;
import com.irs.mapper.src.cv.TbCvsJyMapper;
import com.irs.mapper.src.cv.TbCvsPxMapper;
import com.irs.pojo.*;
import com.irs.pojo.TbCvsExample.Criteria;
import com.irs.pojo.cv.TbCvsGz;
import com.irs.pojo.cv.TbCvsGzExample;
import com.irs.pojo.cv.TbCvsJy;
import com.irs.pojo.cv.TbCvsPx;
import com.irs.service.CvService;
import com.irs.util.GetAge;
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
	private TbCvsPxMapper tbCvsPxMapper;

	@Autowired
	private TbCvsJyMapper tbCvsJyMapper;

	@Autowired
	private TbCvsGzMapper tbCvsGzMapper;

	@Autowired
	private TbPostsCvsMapper tbPostsCvsMapper;
	@Autowired
	private TbPostsMapper tbPostsMapper;
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
	public ResultUtil selCvs(Integer page, Integer limit, CvSearch search) {
		ResultUtil resultUtil = new ResultUtil();
		List<TbCvs> Cvs = new ArrayList<TbCvs>();
		TbCvsExample example=new TbCvsExample();
		Criteria criteria = example.createCriteria();
		example.setOrderByClause("createtime DESC");
		if(search.getCvstatus()!=null&&!"".equals(search.getCvstatus())){
			//注意：模糊查询需要进行拼接”%“  如下，不进行拼接是不能完成查询的哦。
			criteria.andCvstatusEqualTo(search.getCvstatus());
		}
		Cvs = tbCvsMapper.selectByExample(example);
		PageInfo<TbCvs> pageInfo = new PageInfo<TbCvs>(Cvs);
		resultUtil.setCode(0);
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		return resultUtil;
	}
	@Override
	public ResultUtil selPostCvs(Integer page, Integer limit,CvSearch search) {
		ResultUtil resultUtil = new ResultUtil();
		List<TbCvs> Cvs = new ArrayList<TbCvs>();
		TbPosts tbPosts = tbPostsMapper.selectByPrimaryKey(Long.parseLong(search.getPostid()));
		Cvs = tbPostsCvsMapper.getTbCvs(search.getPostid());//散装查询
		List<TbCvsList> cvsLists = new ArrayList<TbCvsList>();
		for (TbCvs cv:Cvs
			 ) { TbCvsList cvsList = new TbCvsList();
		    cvsList.setZwid(search.getPostid());//职位id
			cvsList.setUid(cv.getUid());//序号
			cvsList.setCvid(cv.getCvid());//简历编号
			cvsList.setNickname(cv.getNickname());//姓名
			cvsList.setZname(tbPosts.getZname());//应聘职位
			cvsList.setGzdd(tbPosts.getGzdd());//工作地点
			cvsList.setAge(new GetAge().evaluate(cv.getSfz()));//计算年龄
			cvsList.setXueli(cv.getXueli());//学历
			cvsList.setByyx(cv.getByyx());//毕业院校
			cvsList.setLxgznx("3");//连续工作年限
			cvsList.setCreatetime(cv.getCreatetime());//投递时间
			cvsList.setCvstatus(cv.getCvstatus());//简历状态
			cvsLists.add(cvsList);
		}

		PageInfo<TbCvsList> pageInfo = new PageInfo<TbCvsList>(cvsLists);
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
	@Override
	public void insCvService(TbCvs Cvs) throws Exception {

		Date date=new Date();
		Cvs.setCreatetime(date);
		tbCvsMapper.insert(Cvs);
	}

	//修改简历
//	public void editCvService(TbCvs Cv) throws Exception;
//
//	//删除简历
//	public void delCvService(TbCvs Cv) throws Exception;
//
	@Override
	public void delCvService(TbCvs Cv) {
		tbCvsMapper.updateByPrimaryKeySelective(Cv);
	}

	@Override
	public void editCvService(TbCvs Cv) {
		tbCvsMapper.updateByPrimaryKey(Cv);
	}

	@Override
	public TbCvs selCvByUid(Long uid) {
		return tbCvsMapper.selectByPrimaryKey(uid);
	}

	@Override
	public List<TbCvsGz> selCvsGzByUid(String cvid){
		return tbCvsMapper.selectByGzCvid(cvid);
	}

	@Override
	public List<TbCvsJy> selCvsJyByUid(String cvid){
		return tbCvsMapper.selectByJyCvid(cvid);
	}

	@Override
	public List<TbCvsPx> selCvsPxByUid(String cvid){
		return tbCvsMapper.selectByPxCvid(cvid);
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
