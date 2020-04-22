package com.irs.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 
 */
public class TbPostsList implements Serializable {

    /**
     * 职位编码
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
     * 简历数量
     */
    private String jlsl;

    /**
     * 职位名称
     */
    private String zname;

    /**
     * 工作地点
     */
    private String gzdd;
    /**
     * 学历要求
     */
    private String xlyq;
    /**
     * 岗位序列
     */
    private String gwxl;
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 职位状态
     */
    private String zstatus;

    public String getXlyq() {
        return xlyq;
    }

    public void setXlyq(String xlyq) {
        this.xlyq = xlyq;
    }

    public String getGwxl() {
        return gwxl;
    }

    public void setGwxl(String gwxl) {
        this.gwxl = gwxl;
    }

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

    public String getJlsl() {
        return jlsl;
    }

    public void setJlsl(String jlsl) {
        this.jlsl = jlsl;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getGzdd() {
        return gzdd;
    }

    public void setGzdd(String gzdd) {
        this.gzdd = gzdd;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getZstatus() {
        return zstatus;
    }

    public void setZstatus(String zstatus) {
        this.zstatus = zstatus;
    }
}