package com.irs.mapper;

import com.irs.pojo.TbPostsCvs;
import com.irs.pojo.TbPostsCvsExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbPostsCvsMapper {
    long countByExample(TbPostsCvsExample example);

    int deleteByExample(TbPostsCvsExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(TbPostsCvs record);

    int insertSelective(TbPostsCvs record);

    List<TbPostsCvs> selectByExample(TbPostsCvsExample example);

    TbPostsCvs selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") TbPostsCvs record, @Param("example") TbPostsCvsExample example);

    int updateByExample(@Param("record") TbPostsCvs record, @Param("example") TbPostsCvsExample example);

    int updateByPrimaryKeySelective(TbPostsCvs record);

    int updateByPrimaryKey(TbPostsCvs record);

    @Select("select count(*) from tb_posts_cvs t where t.postcode  =#{0} ")
    String countCvs(Long postid);
}