package com.irs.pojo;


import com.irs.util.GetStatusName;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 
 */
public class TbCvsList implements Serializable {

    /**
     * 主键编码
     */
    private Long uid;

    /**
     * 简历编码
     */
    private String cvid;

    /**
     * 投递人名称
     */
    private String nickname;

    /**
     * 应聘职位
     */
    private String zname;
    /**
     * 应聘职位id
     */
    private String zwid;

    /**
     * 年龄
     */
    private String age;

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 工作地点
     */
    private String gzdd;

    /**
     * 投递时间
     */
    private Date createtime;

    /**
     * 简历状态
     */
    private String cvstatus;

    /**
     * 简历状态名称
     */
    private String cvstatusname;

    /**
     * 学历
     */
    private String xueli;
    /**
     * 毕业院校
     */
    private String byyx;
    /**
     * 连续工作年限
     */
    private String lxgznx;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getCvid() {
        return cvid;
    }

    public void setCvid(String cvid) {
        this.cvid = cvid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGzdd() {
        return gzdd;
    }

    public void setGzdd(String gzdd) {
        this.gzdd = gzdd;
    }



    public String getCvstatus() {
        return cvstatus;
    }

    public void setCvstatus(String cvstatus) {
        this.cvstatus = cvstatus;
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    public String getByyx() {
        return byyx;
    }

    public void setByyx(String byyx) {
        this.byyx = byyx;
    }

    public String getLxgznx() {
        return lxgznx;
    }

    public void setLxgznx(String lxgznx) {
        this.lxgznx = lxgznx;
    }

    public String getZwid() {
        return zwid;
    }

    public void setZwid(String zwid) {
        this.zwid = zwid;
    }

    public String getCvstatusname() {
        return cvstatusname;
    }

    public void setCvstatusname(String cvstatusname) {
        this.cvstatusname = new GetStatusName().evaluate(cvstatusname);
    }
}