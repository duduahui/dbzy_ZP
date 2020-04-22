package com.irs.service;

import com.irs.pojo.CvSearch;
import com.irs.pojo.PsnSearch;
import com.irs.pojo.TbDepts;
import com.irs.pojo.TbPsndoc;
import com.irs.util.ResultUtil;

import java.util.List;

/**
 * @author dudu
 * @create 2020-04-15 10:06
 */
public interface PsndocService {
    public ResultUtil selPsndocList(Integer page, Integer limit,String nickname);
    public ResultUtil selPsndocList(Integer page, Integer limit,PsnSearch nickname);
    public String getPsnName(String psncode);
}
