package com.irs.mapper;

import com.irs.pojo.TbCvs;
import com.irs.pojo.TbCvsExample;
import com.irs.pojo.cv.TbCvsGz;
import com.irs.pojo.cv.TbCvsJy;
import com.irs.pojo.cv.TbCvsPx;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbCvsMapper {
    long countByExample(TbCvsExample example);

    int deleteByExample(TbCvsExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(TbCvs record);

    int insertSelective(TbCvs record);

    List<TbCvs> selectByExample(TbCvsExample example);

    TbCvs selectByPrimaryKey(Long uid);

    @Select("select t.* from tb_cvs t where t.cvid  =#{0} ")
    TbCvs selectByCvid(String cvid);

    int updateByExampleSelective(@Param("record") TbCvs record, @Param("example") TbCvsExample example);

    int updateByExample(@Param("record") TbCvs record, @Param("example") TbCvsExample example);

    int updateByPrimaryKeySelective(TbCvs record);

    int updateByPrimaryKey(TbCvs record);

    @Select("select t.cvid,t.gzdw,t.zhiwu,t.xcdy,t.gzms, DATE_FORMAT(t.startdate,'%Y-%d-%m')  column1," +
            "DATE_FORMAT(t.enddate,'%Y-%d-%m')  column2   from tb_cvs_gz t where t.cvid  =#{0} "+" order by  t.startdate desc")
    List<TbCvsGz> selectByGzCvid(String cvid);

    @Select("select t.cvid,t.school,t.xueli,t.zhuanye, DATE_FORMAT(t.startdate,'%Y-%d-%m')  column1," +
            "DATE_FORMAT(t.enddate,'%Y-%d-%m')  column2 from tb_cvs_jy t  where  t.cvid  =#{0} "+" order by  t.startdate desc")
    List<TbCvsJy> selectByJyCvid(String cvid);

    @Select("select t.cvid,t.pxjg,t.pxkc,t.pxzs, DATE_FORMAT(t.startdate,'%Y-%d-%m')  column1," +
            "DATE_FORMAT(t.enddate,'%Y-%d-%m') column2 from tb_cvs_px t  where   t.cvid  =#{0} "+" order by  t.startdate desc")
    List<TbCvsPx> selectByPxCvid(String cvid);
}