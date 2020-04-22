package com.irs.mapper.src.cv;

import com.irs.pojo.cv.TbCvsPx;
import com.irs.pojo.cv.TbCvsPxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TbCvsPxMapper {
    long countByExample(TbCvsPxExample example);

    int deleteByExample(TbCvsPxExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(TbCvsPx record);

    int insertSelective(TbCvsPx record);

    List<TbCvsPx> selectByExample(TbCvsPxExample example);


    TbCvsPx selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") TbCvsPx record, @Param("example") TbCvsPxExample example);

    int updateByExample(@Param("record") TbCvsPx record, @Param("example") TbCvsPxExample example);

    int updateByPrimaryKeySelective(TbCvsPx record);

    int updateByPrimaryKey(TbCvsPx record);
}