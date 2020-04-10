package com.irs.pojo;

public class CvSearch {
	private String userid;
	private String postid;
    private String cvstatus ;

    public String getCvstatus() {
        return cvstatus;
    }

    public void setCvstatus(String cvstatus) {
        this.cvstatus = cvstatus;
    }

    public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPostid() {
		return postid;
	}

	public void setPostid(String postid) {
		this.postid = postid;
	}

	private String nickname;
	private String createTimeStart;
	private String createTimeEnd;



	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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



}
