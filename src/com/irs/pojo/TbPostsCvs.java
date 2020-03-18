package com.irs.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_posts_cvs
 * @author 
 */
public class TbPostsCvs extends TbPostsCvsKey implements Serializable {
    private Date createtime;

    private String submiter;

    private static final long serialVersionUID = 1L;

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
        return (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
            && (this.getCvcode() == null ? other.getCvcode() == null : this.getCvcode().equals(other.getCvcode()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getSubmiter() == null ? other.getSubmiter() == null : this.getSubmiter().equals(other.getSubmiter()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getCvcode() == null) ? 0 : getCvcode().hashCode());
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
        sb.append(", createtime=").append(createtime);
        sb.append(", submiter=").append(submiter);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}