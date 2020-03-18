package com.irs.pojo;

import java.io.Serializable;

/**
 * tb_posts_cvs
 * @author 
 */
public class TbPostsCvsKey implements Serializable {
    private String postcode;

    private String cvcode;

    private static final long serialVersionUID = 1L;

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
        TbPostsCvsKey other = (TbPostsCvsKey) that;
        return (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
            && (this.getCvcode() == null ? other.getCvcode() == null : this.getCvcode().equals(other.getCvcode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getCvcode() == null) ? 0 : getCvcode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postcode=").append(postcode);
        sb.append(", cvcode=").append(cvcode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}