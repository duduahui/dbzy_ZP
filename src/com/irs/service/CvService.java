package com.irs.service;

import com.irs.pojo.CvSearch;
import com.irs.pojo.TbCvs;
import com.irs.util.ResultUtil;

public interface CvService {
	//职位邮箱唯一性检验
//	public TbCvs selCvByEmail(String eMail, Long uid);
//
//	//职位昵称唯一性检验
//	public TbCvs selCvByNickname(String nickname, Long uid);

	//增加职位
//	public void insCvService(TbCvs Cv) throws Exception;

	//得到简历信息
	public ResultUtil selCvs(Integer page, Integer limit, CvSearch search);
//
//	//查询简历
	public TbCvs selCvByUid(Long uid);

//
 	//转发简历至职位
 	public void insCv2PostService(String postStr);
}
