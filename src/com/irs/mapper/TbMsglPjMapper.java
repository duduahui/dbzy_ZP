package com.irs.mapper;

import com.irs.pojo.TbMsglPj;
import java.util.List;
import com.irs.pojo.TbMsglPjExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TbMsglPjMapper {
    long countByExample(TbMsglPjExample example);

    int deleteByExample(TbMsglPjExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(TbMsglPj record);

    int insertSelective(TbMsglPj record);

    List<TbMsglPj> selectByExample(TbMsglPjExample example);

    TbMsglPj selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") TbMsglPj record, @Param("example") TbMsglPjExample example);

    int updateByExample(@Param("record") TbMsglPj record, @Param("example") TbMsglPjExample example);

    int updateByPrimaryKeySelective(TbMsglPj record);

    int updateByPrimaryKey(TbMsglPj record);

    @Select("SELECT  t.* FROM tb_msgl_pj t where t.gzid = #{0}" )
    List<TbMsglPj> getMsglPjLists(String gzid);

    @Select("SELECT  t.* FROM tb_msgl_pj t where t.gzid = #{0}" + " and t.pjstatus = #{1}")
    TbMsglPj getMsglPj(String gzid, String pjstatus);
}