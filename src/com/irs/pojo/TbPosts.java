package com.irs.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_posts
 * @author 
 */
public class TbPosts implements Serializable {
    private Long uid;

    /**
     * 招聘部门
     */
    private String zpbm;

    /**
     * 招聘岗位
     */
    private String zpgw;

    /**
     * 任职条件
     */
    private String rztj;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getZpbm() {
        return zpbm;
    }

    public void setZpbm(String zpbm) {
        this.zpbm = zpbm;
    }

    public String getZpgw() {
        return zpgw;
    }

    public void setZpgw(String zpgw) {
        this.zpgw = zpgw;
    }

    public String getRztj() {
        return rztj;
    }

    public void setRztj(String rztj) {
        this.rztj = rztj;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
            && (this.getZpbm() == null ? other.getZpbm() == null : this.getZpbm().equals(other.getZpbm()))
            && (this.getZpgw() == null ? other.getZpgw() == null : this.getZpgw().equals(other.getZpgw()))
            && (this.getRztj() == null ? other.getRztj() == null : this.getRztj().equals(other.getRztj()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getZpbm() == null) ? 0 : getZpbm().hashCode());
        result = prime * result + ((getZpgw() == null) ? 0 : getZpgw().hashCode());
        result = prime * result + ((getRztj() == null) ? 0 : getRztj().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", zpbm=").append(zpbm);
        sb.append(", zpgw=").append(zpgw);
        sb.append(", rztj=").append(rztj);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}