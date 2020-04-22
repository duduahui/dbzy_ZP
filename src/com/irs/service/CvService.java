package com.irs.service;

import com.irs.pojo.CvSearch;
import com.irs.pojo.TbCvs;
import com.irs.pojo.TbPostsCvs;
import com.irs.pojo.cv.TbCvsGz;
import com.irs.pojo.cv.TbCvsJy;
import com.irs.pojo.cv.TbCvsPx;
import com.irs.util.ResultUtil;

import java.util.List;

public interface CvService {

	//职位邮箱唯一性检验
//	public TbCvs selCvByEmail(String eMail, Long uid);

	//职位昵称唯一性检验
//	public TbCvs selCvByNickname(String nickname, Long uid);

	//增加简历
	public void insCvService(TbCvs Cv) throws Exception;


	//修改简历
	public void editCvService(TbCvs Cv) throws Exception;

	//删除简历
	public void delCvService(TbCvs Cv) throws Exception;

	//得到简历信息
	public ResultUtil selCvs(Integer page, Integer limit, CvSearch search);

	//查询简历
	public TbCvs selCvByUid(Long uid);


    //根据职位查询简历
	public ResultUtil selPostCvs(Integer page, Integer limit,CvSearch search);

 	//转发简历至职位
 	public void insCv2PostService(String postStr);

	//查询简历教育子表
	public List<TbCvsJy> selCvsJyByUid(String cvid);

	//查询简历培训子表
	public List<TbCvsPx> selCvsPxByUid(String cvid);

	//查询简历工作子表
	public List<TbCvsGz> selCvsGzByUid(String cvid);



	//职位简历关系表
	public TbPostsCvs selPostCvService(String uid);

	//更新职位简历关系表
	public void updPostCvService(TbPostsCvs tbPostsCvs);
}
