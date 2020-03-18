package com.irs.mapper;

import com.irs.pojo.TbPosts;
import com.irs.pojo.TbPostsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPostsMapper {
    long countByExample(TbPostsExample example);

    int deleteByExample(TbPostsExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(TbPosts record);

    int insertSelective(TbPosts record);

    List<TbPosts> selectByExample(TbPostsExample example);

    TbPosts selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") TbPosts record, @Param("example") TbPostsExample example);

    int updateByExample(@Param("record") TbPosts record, @Param("example") TbPostsExample example);

    int updateByPrimaryKeySelective(TbPosts record);

    int updateByPrimaryKey(TbPosts record);
}