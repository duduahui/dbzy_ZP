package com.irs.mapper.src.cv;

import com.irs.pojo.cv.TbCvsGz;
import com.irs.pojo.cv.TbCvsJy;
import com.irs.pojo.cv.TbCvsJyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TbCvsJyMapper {
    long countByExample(TbCvsJyExample example);

    int deleteByExample(TbCvsJyExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(TbCvsJy record);

    int insertSelective(TbCvsJy record);

    List<TbCvsJy> selectByExample(TbCvsJyExample example);


    TbCvsJy selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") TbCvsJy record, @Param("example") TbCvsJyExample example);

    int updateByExample(@Param("record") TbCvsJy record, @Param("example") TbCvsJyExample example);

    int updateByPrimaryKeySelective(TbCvsJy record);

    int updateByPrimaryKey(TbCvsJy record);
}