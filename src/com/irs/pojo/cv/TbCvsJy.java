package com.irs.pojo.cv;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_cvs_jy
 * @author 
 */
public class TbCvsJy implements Serializable {
    private Long uid;

    /**
     * 简历编号
     */
    private String cvid;

    /**
     * 教育开始时间
     */
    private Date startdate;

    /**
     * 结束时间
     */
    private Date enddate;

    /**
     * 学习
     */
    private String school;

    /**
     * 专业
     */
    private String zhuanye;

    /**
     * 学历
     */
    private String xueli;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 待用字段1
     */
    private String column1;

    /**
     * 待用字段2
     */
    private String column2;

    /**
     * 待用字段3
     */
    private String column3;

    private static final long serialVersionUID = 1L;

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

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        TbCvsJy other = (TbCvsJy) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getCvid() == null ? other.getCvid() == null : this.getCvid().equals(other.getCvid()))
            && (this.getStartdate() == null ? other.getStartdate() == null : this.getStartdate().equals(other.getStartdate()))
            && (this.getEnddate() == null ? other.getEnddate() == null : this.getEnddate().equals(other.getEnddate()))
            && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()))
            && (this.getZhuanye() == null ? other.getZhuanye() == null : this.getZhuanye().equals(other.getZhuanye()))
            && (this.getXueli() == null ? other.getXueli() == null : this.getXueli().equals(other.getXueli()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getColumn1() == null ? other.getColumn1() == null : this.getColumn1().equals(other.getColumn1()))
            && (this.getColumn2() == null ? other.getColumn2() == null : this.getColumn2().equals(other.getColumn2()))
            && (this.getColumn3() == null ? other.getColumn3() == null : this.getColumn3().equals(other.getColumn3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getCvid() == null) ? 0 : getCvid().hashCode());
        result = prime * result + ((getStartdate() == null) ? 0 : getStartdate().hashCode());
        result = prime * result + ((getEnddate() == null) ? 0 : getEnddate().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        result = prime * result + ((getZhuanye() == null) ? 0 : getZhuanye().hashCode());
        result = prime * result + ((getXueli() == null) ? 0 : getXueli().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
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
        sb.append(", cvid=").append(cvid);
        sb.append(", startdate=").append(startdate);
        sb.append(", enddate=").append(enddate);
        sb.append(", school=").append(school);
        sb.append(", zhuanye=").append(zhuanye);
        sb.append(", xueli=").append(xueli);
        sb.append(", userid=").append(userid);
        sb.append(", createtime=").append(createtime);
        sb.append(", column1=").append(column1);
        sb.append(", column2=").append(column2);
        sb.append(", column3=").append(column3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}