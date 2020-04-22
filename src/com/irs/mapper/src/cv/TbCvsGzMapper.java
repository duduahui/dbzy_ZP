package com.irs.mapper.src.cv;

import com.irs.pojo.cv.TbCvsGz;
import com.irs.pojo.cv.TbCvsGzExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TbCvsGzMapper {
    long countByExample(TbCvsGzExample example);

    int deleteByExample(TbCvsGzExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(TbCvsGz record);

    int insertSelective(TbCvsGz record);

    List<TbCvsGz> selectByExample(TbCvsGzExample example);


    TbCvsGz selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") TbCvsGz record, @Param("example") TbCvsGzExample example);

    int updateByExample(@Param("record") TbCvsGz record, @Param("example") TbCvsGzExample example);

    int updateByPrimaryKeySelective(TbCvsGz record);

    int updateByPrimaryKey(TbCvsGz record);
}