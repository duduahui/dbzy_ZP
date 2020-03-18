package com.irs.pojo;

import java.io.Serializable;

public class Dept implements Serializable {
	/**
	 * 部门列表
	 */
	private String uid;
	private String deptid;
	private String deptname;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
}
