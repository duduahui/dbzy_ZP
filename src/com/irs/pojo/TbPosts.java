package com.irs.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_posts
 * @author 
 */
public class TbPosts implements Serializable {
    /**
     * 职位编码
     */
    private Long uid;

    /**
     * 用人单位
     */
    private String zdept;

    /**
     * 职位名称
     */
    private String zname;

    /**
     * 工作地点
     */
    private String gzdd;

    /**
     * 招聘人数
     */
    private String zprs;

    /**
     * 月薪范围
     */
    private String yxfw;

    /**
     * 学历要求
     */
    private String xlyq;

    private Date createTime;

    /**
     * 专业要求
     */
    private String zyyq;

    /**
     * 工作年限（年）
     */
    private String gznx;

    /**
     * 岗位序列
     */
    private String gwxl;

    /**
     * 职位状态
     */
    private String zstatus;

    /**
     * 待定字段1
     */
    private String column1;

    /**
     * 待定字段2
     */
    private String column2;

    /**
     * 待定字段3
     */
    private String column3;

    /**
     * 福利待遇
     */
    private String fldy;

    /**
     * 任职要求
     */
    private String rzyq;

    /**
     * 岗位职责
     */
    private String gwzz;

    public String getFldy() {
        return fldy;
    }

    public void setFldy(String fldy) {
        this.fldy = fldy;
    }

    public String getRzyq() {
        return rzyq;
    }

    public void setRzyq(String rzyq) {
        this.rzyq = rzyq;
    }

    public String getGwzz() {
        return gwzz;
    }

    public void setGwzz(String gwzz) {
        this.gwzz = gwzz;
    }

    private static final long serialVersionUID = 1L;

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

    public String getZprs() {
        return zprs;
    }

    public void setZprs(String zprs) {
        this.zprs = zprs;
    }

    public String getYxfw() {
        return yxfw;
    }

    public void setYxfw(String yxfw) {
        this.yxfw = yxfw;
    }

    public String getXlyq() {
        return xlyq;
    }

    public void setXlyq(String xlyq) {
        this.xlyq = xlyq;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getZyyq() {
        return zyyq;
    }

    public void setZyyq(String zyyq) {
        this.zyyq = zyyq;
    }

    public String getGznx() {
        return gznx;
    }

    public void setGznx(String gznx) {
        this.gznx = gznx;
    }

    public String getGwxl() {
        return gwxl;
    }

    public void setGwxl(String gwxl) {
        this.gwxl = gwxl;
    }

    public String getZstatus() {
        return zstatus;
    }

    public void setZstatus(String zstatus) {
        this.zstatus = zstatus;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbPosts other = (TbPosts) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getZdept() == null ? other.getZdept() == null : this.getZdept().equals(other.getZdept()))
            && (this.getZname() == null ? other.getZname() == null : this.getZname().equals(other.getZname()))
            && (this.getGzdd() == null ? other.getGzdd() == null : this.getGzdd().equals(other.getGzdd()))
            && (this.getZprs() == null ? other.getZprs() == null : this.getZprs().equals(other.getZprs()))
            && (this.getYxfw() == null ? other.getYxfw() == null : this.getYxfw().equals(other.getYxfw()))
            && (this.getXlyq() == null ? other.getXlyq() == null : this.getXlyq().equals(other.getXlyq()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getZyyq() == null ? other.getZyyq() == null : this.getZyyq().equals(other.getZyyq()))
            && (this.getGznx() == null ? other.getGznx() == null : this.getGznx().equals(other.getGznx()))
            && (this.getGwxl() == null ? other.getGwxl() == null : this.getGwxl().equals(other.getGwxl()))
            && (this.getZstatus() == null ? other.getZstatus() == null : this.getZstatus().equals(other.getZstatus()))
            && (this.getColumn1() == null ? other.getColumn1() == null : this.getColumn1().equals(other.getColumn1()))
            && (this.getColumn2() == null ? other.getColumn2() == null : this.getColumn2().equals(other.getColumn2()))
            && (this.getColumn3() == null ? other.getColumn3() == null : this.getColumn3().equals(other.getColumn3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getZdept() == null) ? 0 : getZdept().hashCode());
        result = prime * result + ((getZname() == null) ? 0 : getZname().hashCode());
        result = prime * result + ((getGzdd() == null) ? 0 : getGzdd().hashCode());
        result = prime * result + ((getZprs() == null) ? 0 : getZprs().hashCode());
        result = prime * result + ((getYxfw() == null) ? 0 : getYxfw().hashCode());
        result = prime * result + ((getXlyq() == null) ? 0 : getXlyq().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getZyyq() == null) ? 0 : getZyyq().hashCode());
        result = prime * result + ((getGznx() == null) ? 0 : getGznx().hashCode());
        result = prime * result + ((getGwxl() == null) ? 0 : getGwxl().hashCode());
        result = prime * result + ((getZstatus() == null) ? 0 : getZstatus().hashCode());
        result = prime * result + ((getColumn1() == null) ? 0 : getColumn1().hashCode());
        result = prime * result + ((getColumn2() == null) ? 0 : getColumn2().hashCode());
        result = prime * result + ((getColumn3() == null) ? 0 : getColumn3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", zdept=").append(zdept);
        sb.append(", zname=").append(zname);
        sb.append(", gzdd=").append(gzdd);
        sb.append(", zprs=").append(zprs);
        sb.append(", yxfw=").append(yxfw);
        sb.append(", xlyq=").append(xlyq);
        sb.append(", createTime=").append(createTime);
        sb.append(", zyyq=").append(zyyq);
        sb.append(", gznx=").append(gznx);
        sb.append(", gwxl=").append(gwxl);
        sb.append(", zstatus=").append(zstatus);
        sb.append(", column1=").append(column1);
        sb.append(", column2=").append(column2);
        sb.append(", column3=").append(column3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}