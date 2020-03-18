package com.irs.mapper;

import com.irs.pojo.TbCvs;
import com.irs.pojo.TbCvsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbCvsMapper {
    long countByExample(TbCvsExample example);

    int deleteByExample(TbCvsExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(TbCvs record);

    int insertSelective(TbCvs record);

    List<TbCvs> selectByExample(TbCvsExample example);

    TbCvs selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") TbCvs record, @Param("example") TbCvsExample example);

    int updateByExample(@Param("record") TbCvs record, @Param("example") TbCvsExample example);

    int updateByPrimaryKeySelective(TbCvs record);

    int updateByPrimaryKey(TbCvs record);
}