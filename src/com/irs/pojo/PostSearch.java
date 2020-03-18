package com.irs.pojo;

public class PostSearch {
	private String zpbm;
	private String zpgw;
	private String rztj;
	private String createTimeStart;
	private String createTimeEnd;
	private String operation;

	public String getZpbm() {
		return zpbm;
	}

	public String getZpgw() {
		return zpgw;
	}

	public void setZpgw(String zpgw) {
		this.zpgw = zpgw;
	}

	public void setZpbm(String zpbm) {
		this.zpbm = zpbm;
	}

	public String getCreateTimeStart() {
		return createTimeStart;
	}
	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
	}
	public String getCreateTimeEnd() {
		return createTimeEnd;
	}
	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getRztj() {
		return rztj;
	}

	public void setRztj(String rztj) {
		this.rztj = rztj;
	}
}
