package com.irs.service;

import com.irs.pojo.TbDepts;
import java.util.List;

public interface DeptService {

	//添加部门
//	public void insDept(TbDepts dept);

	//获取部门列表
	List<TbDepts> selDeptList();

	String getDeptName(String uid);

}
