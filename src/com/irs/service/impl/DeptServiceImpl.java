package com.irs.service.impl;

import com.irs.mapper.DeptMapper;
import com.irs.pojo.TbDepts;
import com.irs.service.DeptService;
import com.irs.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<TbDepts> selDeptList() {
		return deptMapper.getDeptLists();
	}
	@Override
	public String getDeptName(String zdept) {
		return deptMapper.getDeptName(zdept);
	}
}
