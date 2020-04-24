package com.irs.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.irs.mapper.DeptMapper;
import com.irs.mapper.TbPostsCvsMapper;
import com.irs.mapper.TbPostsMapper;
import com.irs.pojo.*;
import com.irs.service.PostService;
import com.irs.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private TbPostsMapper tbPostsMapper;

	@Autowired
	private DeptMapper deptMapper;

	@Autowired
	private TbPostsCvsMapper tbPostsCvsMapper;
	
//	@Override
//	public TbPosts selPostByEmail(String eMail,Long uid) {
//		TbPostsExample example=new TbPostsExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andEMailEqualTo(eMail);
//		if(uid!=null&&!"".equals(uid)){
//			criteria.andUidNotEqualTo(uid);
//		}
//		List<TbPosts> Posts = tbPostsMapper.selectByExample(example);
//		if(Posts!=null&&Posts.size()>0){
//			return Posts.get(0);
//		}
//		return null;
//	}
//
//	@Override
//	public TbPosts selPostByNickname(String nickname,Long uid) {
//		TbPostsExample example=new TbPostsExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andNicknameEqualTo(nickname);
//		if(uid!=null&&!"".equals(uid)){
//			criteria.andUidNotEqualTo(uid);
//		}
//		List<TbPosts> Posts = tbPostsMapper.selectByExample(example);
//		if(Posts!=null&&Posts.size()>0){
//			return Posts.get(0);
//		}
//		return null;
//	}

	@Override
	public void insPostService(TbPosts Post) throws Exception {
		Post.setCreateTime(new Date());
		tbPostsMapper.insert(Post);
	}

	@Override
	public ResultUtil selPosts(Integer page, Integer limit,PostSearch search) {
		PageHelper.startPage(page, limit);
		TbPostsExample example=new TbPostsExample();
		//设置按创建时间降序排序
		example.setOrderByClause("create_time DESC");
//		Criteria criteria = example.createCriteria();
//
//		if(search.getZpbm()!=null&&!"".equals(search.getZpbm())){
//			//注意：模糊查询需要进行拼接”%“  如下，不进行拼接是不能完成查询的哦。
//			criteria.andZpbmEqualTo("%"+search.getZpbm()+"%");
//		}
//		if(search.getZpgw()!=null&&!"-1".equals(search.getZpgw())){
//			criteria.andZpgwEqualTo(search.getZpgw());
//		}
//		if(search.getRztj()!=null&&!"-1".equals(search.getRztj())){
//			criteria.andZpgwEqualTo(search.getZpgw());
//		}
//		if(search.getCreateTimeStart()!=null&&!"".equals(search.getCreateTimeStart())){
//			criteria.andCreateTimeGreaterThanOrEqualTo(MyUtil.getDateByString(search.getCreateTimeStart()));
//		}
//		if(search.getCreateTimeEnd()!=null&&!"".equals(search.getCreateTimeEnd())){
//			criteria.andCreateTimeLessThanOrEqualTo(MyUtil.getDateByString(search.getCreateTimeEnd()));
//		}

		List<TbPosts> Posts = tbPostsMapper.selectByExample(example);
		List<TbPostsList> PostsList = new ArrayList<TbPostsList>();
		for (TbPosts p:Posts) {
			TbPostsList pl = new TbPostsList();
			pl.setCreateTime(p.getCreateTime());
			pl.setGzdd(p.getGzdd());
			pl.setUid(p.getUid());
			pl.setZdept(p.getZdept());
			pl.setZname(p.getZname());
			pl.setXlyq(p.getXlyq());
			pl.setGwxl(p.getGwxl());
			pl.setZdeptname(deptMapper.getDeptName(p.getZdept()));//用人单位名称
			pl.setJlsl(tbPostsCvsMapper.countCvs(p.getUid()));//简历数量
			pl.setZstatus(p.getZstatus());
			PostsList.add(pl);
		}
		PageInfo<TbPostsList> pageInfo = new PageInfo<TbPostsList>(PostsList);
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setCode(0);
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		return resultUtil;
	}
	@Override
	public List<TbPosts> selPostsByXCX(Integer page, Integer limit,PostSearch search) {
		PageHelper.startPage(page, limit);
		TbPostsExample example=new TbPostsExample();
		//设置按创建时间降序排序
		example.setOrderByClause("create_time DESC");
		return tbPostsMapper.selectByExample(example);
	}

//	@Override
//	public void delPostsService(String PostStr) {
//		String[] Posts = PostStr.split(",");
//		if(Posts!=null&&Posts.length>0){
//			for (String uid : Posts) {
//				tbPostsMapper.deleteByPrimaryKey(Long.parseLong(uid));
//			}
//		}
//	}
//
//	@Override
//	public void delPostByUid(String uid) {
//		tbPostsMapper.deleteByPrimaryKey(Long.parseLong(uid));
//	}
//
	@Override
	public TbPosts selPostByUid(Long uid) {
		return tbPostsMapper.selectByPrimaryKey(uid);
	}

	@Override
	public void updPostService(TbPosts post) {
		TbPosts u = tbPostsMapper.selectByPrimaryKey(post.getUid());
		post.setCreateTime(new Date());
		tbPostsMapper.updateByPrimaryKey(post);
	}
	@Override
	public void updPostByUid(String uids,String zstatus) {
		String[] Posts = uids.split(",");
		if(Posts!=null&&Posts.length>0){
			for (String uid : Posts) {
				TbPosts post = tbPostsMapper.selectByPrimaryKey(Long.parseLong(uid));
				post.setZstatus(zstatus);
				post.setCreateTime(new Date());
				tbPostsMapper.updateByPrimaryKey(post);
			}
		}
	}


}
