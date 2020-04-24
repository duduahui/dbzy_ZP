package com.irs.pojo;

import com.irs.util.GetStatusName;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 
 */
public class TbMsgzList implements Serializable {

    /**
     * 职位简历关系编码
     */
    private Long uid;

    /**
     * 用人单位编码
     */
    private String zdept;

    /**
     * 用人单位名称
     */
    private String zdeptname;

    /**
     * 职位名称
     */
    private String zname;

    /**
     * 求职者姓名
     */
    private String nickname;
    /**
     * 面试官
     */
    private String msg;
    /**
     * 工作地点
     */
    private String mspj;
    /**
     * 面试时间
     */
    private Date mssj;

    /**
     * 职位状态
     */
    private String zstatus;
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getZdept() {
        return zdept;
    }

    public void setZdept(String zdept) {
        this.zdept = zdept;
    }

    public String getZdeptname() {
        return zdeptname;
    }

    public void setZdeptname(String zdeptname) {
        this.zdeptname = zdeptname;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMspj() {
        return mspj;
    }

    public void setMspj(String mspj) {
        this.mspj = mspj;
    }

    public Date getMssj() {
        return mssj;
    }

    public void setMssj(Date mssj) {
        this.mssj = mssj;
    }

    public String getZstatus() {
        return zstatus;
    }

    public void setZstatus(String zstatus) {
        this.zstatus =  new GetStatusName().evaluate(zstatus);
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}