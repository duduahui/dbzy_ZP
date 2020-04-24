package com.irs.service.impl;

import com.github.pagehelper.PageInfo;
import com.irs.mapper.*;
import com.irs.pojo.*;
import com.irs.pojo.TbMsglPj;
import com.irs.service.MsService;
import com.irs.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class MsServiceImpl implements MsService {

	@Autowired
	private TbCvsMapper tbCvsMapper;

	@Autowired
	private DeptMapper deptMapper;
	@Autowired
	private TbPostsCvsMapper tbPostsCvsMapper;
	@Autowired
	private TbPostsMapper tbPostsMapper;
	@Autowired
	private TbMsglPjMapper tbMsglPjMapper;
	@Autowired
	private PsndocMapper psndocMapper;


	//得到简历信息
	@Override
	public ResultUtil selCvs(Integer page, Integer limit, CvSearch search) {
		ResultUtil resultUtil = new ResultUtil();
		TbPostsCvsExample tbPostsCvsExample = new TbPostsCvsExample();
		TbPostsCvsExample.Criteria criteria = tbPostsCvsExample.createCriteria();
		//面试跟踪状态大于等于5
		criteria.andCvstatusGreaterThanOrEqualTo("5");
		tbPostsCvsExample.setOrderByClause("createtime DESC");

		List<TbPostsCvs> tbPostsCvs = tbPostsCvsMapper.selectByExample(tbPostsCvsExample);
		List<TbMsgzList> msLists = new ArrayList<TbMsgzList>();
		for (TbPostsCvs pc:tbPostsCvs){
			TbPosts post = tbPostsMapper.selectByPrimaryKey(Long.parseLong(pc.getPostcode()));
			TbCvs cv = tbCvsMapper.selectByCvid(pc.getCvcode());
			TbMsglPj pj = tbMsglPjMapper.getMsglPj(pc.getUid()+"",pc.getCvstatus());
			TbMsgzList mList = new TbMsgzList();
			mList.setUid(pc.getUid());//序号
			mList.setNickname(cv.getNickname());//姓名
			mList.setZname(post.getZname());//应聘职位
			mList.setZdeptname(deptMapper.getDeptName(post.getZdept()));//用人单位
			if(pj!=null){
				mList.setMsg(pj.getPjname());//面试官
				mList.setMspj(pj.getPjdesc());//面试评价
				mList.setMssj(pj.getPjdate());//，面试时间
			}
			mList.setZstatus(pc.getCvstatus());//简历状态
			msLists.add(mList);
		}
		PageInfo<TbMsgzList> pageInfo = new PageInfo<TbMsgzList>(msLists);
		resultUtil.setCode(0);
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		return resultUtil;
	}



	@Override
    public  List<TbMsglPj> selMsglPj(String gzid)
    {
        return tbMsglPjMapper.getMsglPjLists(gzid);
    }

	//更新面试记录
	@Override
	public void updMsglPj(String uid){
		TbMsglPj tbMsglPj = tbMsglPjMapper.selectByPrimaryKey(Long.parseLong(uid));
		tbMsglPj.setPjstatus(tbMsglPj.getPjstatus()+1);
		tbMsglPj.setPjdesc(tbMsglPj.getPjdesc());//面试评价，待传入
		tbMsglPj.setPjdate(new Date());//评价时间
		tbMsglPjMapper.updateByPrimaryKey(tbMsglPj);
	}

	//插入面试记录
	@Override
	public void insMsglPj(String str){
		String[] str_value = str.split(",");
		TbMsglPj tbMsglPj = new TbMsglPj();
		tbMsglPj.setGzid(str_value[0]);
		tbMsglPj.setPjname(psndocMapper.getPsnname(str_value[1]));//面试官，姓名
		tbMsglPj.setPjstatus(str_value[2]);
		tbMsglPjMapper.insert(tbMsglPj);
	}
}