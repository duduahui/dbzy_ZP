package com.irs.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_posts_cvs
 * @author 
 */
public class TbPostsCvs implements Serializable {
    private Long uid;

    private String postcode;

    private String cvcode;

    private String cvstatus;

    private Date createtime;

    private String submiter;

    private static final long serialVersionUID = 1L;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCvcode() {
        return cvcode;
    }

    public void setCvcode(String cvcode) {
        this.cvcode = cvcode;
    }

    public String getCvstatus() {
        return cvstatus;
    }

    public void setCvstatus(String cvstatus) {
        this.cvstatus = cvstatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getSubmiter() {
        return submiter;
    }

    public void setSubmiter(String submiter) {
        this.submiter = submiter;
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
        TbPostsCvs other = (TbPostsCvs) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
            && (this.getCvcode() == null ? other.getCvcode() == null : this.getCvcode().equals(other.getCvcode()))
            && (this.getCvstatus() == null ? other.getCvstatus() == null : this.getCvstatus().equals(other.getCvstatus()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getSubmiter() == null ? other.getSubmiter() == null : this.getSubmiter().equals(other.getSubmiter()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getCvcode() == null) ? 0 : getCvcode().hashCode());
        result = prime * result + ((getCvstatus() == null) ? 0 : getCvstatus().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getSubmiter() == null) ? 0 : getSubmiter().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", postcode=").append(postcode);
        sb.append(", cvcode=").append(cvcode);
        sb.append(", cvstatus=").append(cvstatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", submiter=").append(submiter);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}