package com.irs.pojo;

import com.irs.util.GetStatusName;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_msgl_pj
 * @author 
 */
public class TbMsglPj implements Serializable {
    private Long uid;

    /**
     * 跟踪表id
     */
    private String gzid;

    private String pjname;

    /**
     * 评价内容
     */
    private String pjdesc;

    private String pjstatus;

    /**
     * 评价时间
     */
    private Date pjdate;

    private static final long serialVersionUID = 1L;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getGzid() {
        return gzid;
    }

    public void setGzid(String gzid) {
        this.gzid = gzid;
    }

    public String getPjname() {
        return pjname;
    }

    public void setPjname(String pjname) {
        this.pjname = pjname;
    }

    public String getPjdesc() {
        return pjdesc;
    }

    public void setPjdesc(String pjdesc) {
        this.pjdesc = pjdesc;
    }

    public String getPjstatus() {
        return pjstatus;
    }

    public void setPjstatus(String pjstatus) {
        this.pjstatus = pjstatus;
//        this.pjstatus = new GetStatusName().evaluate(pjstatus);
    }

    public Date getPjdate() {
        return pjdate;
    }

    public void setPjdate(Date pjdate) {
        this.pjdate = pjdate;
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
        TbMsglPj other = (TbMsglPj) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getGzid() == null ? other.getGzid() == null : this.getGzid().equals(other.getGzid()))
            && (this.getPjname() == null ? other.getPjname() == null : this.getPjname().equals(other.getPjname()))
            && (this.getPjdesc() == null ? other.getPjdesc() == null : this.getPjdesc().equals(other.getPjdesc()))
            && (this.getPjstatus() == null ? other.getPjstatus() == null : this.getPjstatus().equals(other.getPjstatus()))
            && (this.getPjdate() == null ? other.getPjdate() == null : this.getPjdate().equals(other.getPjdate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getGzid() == null) ? 0 : getGzid().hashCode());
        result = prime * result + ((getPjname() == null) ? 0 : getPjname().hashCode());
        result = prime * result + ((getPjdesc() == null) ? 0 : getPjdesc().hashCode());
        result = prime * result + ((getPjstatus() == null) ? 0 : getPjstatus().hashCode());
        result = prime * result + ((getPjdate() == null) ? 0 : getPjdate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", gzid=").append(gzid);
        sb.append(", pjname=").append(pjname);
        sb.append(", pjdesc=").append(pjdesc);
        sb.append(", pjstatus=").append(pjstatus);
        sb.append(", pjdate=").append(pjdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}