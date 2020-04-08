package com.irs.mapper;

import com.irs.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbPostsCvsMapper {
    long countByExample(TbPostsCvsExample example);

    int deleteByExample(TbPostsCvsExample example);

    int deleteByPrimaryKey(TbPostsCvsKey key);

    int insert(TbPostsCvs record);

    int insertSelective(TbPostsCvs record);

    List<TbPostsCvs> selectByExample(TbPostsCvsExample example);

    TbPostsCvs selectByPrimaryKey(TbPostsCvsKey key);
    @Select("select t.* from tb_cvs t left join tb_posts_cvs a on t.uid = a.cvcode  where a.postcode =#{0} "+" order by t.createtime desc")
    List<TbCvs> getTbCvs(String zwid);

    int updateByExampleSelective(@Param("record") TbPostsCvs record, @Param("example") TbPostsCvsExample example);

    int updateByExample(@Param("record") TbPostsCvs record, @Param("example") TbPostsCvsExample example);

    int updateByPrimaryKeySelective(TbPostsCvs record);

    int updateByPrimaryKey(TbPostsCvs record);

    @Select("select count(*) from tb_cvs t left join tb_posts_cvs a on t.uid = a.cvcode  where a.postcode =#{0} ")
    String countCvs(Long postid);
}