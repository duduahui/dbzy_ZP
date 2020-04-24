package com.irs.service;

import com.irs.pojo.CvSearch;
import com.irs.pojo.TbMsglPj;
import com.irs.util.ResultUtil;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface MsService {
	//得到简历信息
	public ResultUtil selCvs(Integer page, Integer limit, CvSearch search);
	//得到评价信息
	public List<TbMsglPj> selMsglPj(String gzid);
	//更新面试评价
	public void updMsglPj(String uid);

	//更新面试评价
	public void insMsglPj(String str);
}
