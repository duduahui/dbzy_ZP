package com.irs.mapper;

import com.irs.pojo.TbDepts;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DeptMapper {
	@Select("SELECT distinct t.uid,t.deptid,t.deptname FROM tb_dept t order by t.deptid desc")
	List<TbDepts> getDeptLists();
}
