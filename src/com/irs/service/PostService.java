package com.irs.service;

import com.irs.pojo.PostSearch;
import com.irs.pojo.TbPosts;
import com.irs.util.ResultUtil;

import java.util.List;

public interface PostService {
	//职位邮箱唯一性检验
//	public TbPosts selPostByEmail(String eMail, Long uid);

	//职位昵称唯一性检验
//	public TbPosts selPostByNickname(String nickname, Long uid);

	//增加职位
	public void insPostService(TbPosts post) throws Exception;

	//得到职位信息
	public ResultUtil selPosts(Integer page, Integer limit, PostSearch search);

//	批量删除职位
//	public void delPostsService(String PostStr);

//	删除指定职位
//	public void delPostByUid(String uid);

	//查询职位
	public TbPosts selPostByUid(Long uid);

	//更新职位信息
	public void updPostService(TbPosts post);

	//更新职位信息-职位状态
	public void updPostByUid(String uids,String zstatus);
	//小程序查询职位
	public List<TbPosts> selPostsByXCX(Integer page, Integer limit, PostSearch search);
}
