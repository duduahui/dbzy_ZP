package com.irs.mapper;

import com.irs.pojo.TbDepts;
import com.irs.pojo.TbPsndoc;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PsndocMapper {
	@Select("SELECT distinct t.* FROM tb_psndoc t ")
	List<TbPsndoc> getPsndocLists();

	@Select("SELECT  distinct t.* FROM tb_psndoc t where t.psncode like CONCAT('%',#{0},'%') or  t.psnname like CONCAT('%',#{0},'%')")
	List<TbPsndoc> getPsndoc(String nickname);

	@Select("SELECT distinct t.psnname FROM tb_psndoc t where t.psncode =#{0}")
	String getPsnname(String psncode);
}
