package com.irs.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_cvs
 * @author 
 */
public class TbCvs implements Serializable {
    private Long uid;

    /**
     * 简历编号
     */
    private String cvid;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 姓名
     */
    private String nickname;

    /**
     * 性别

     */
    private String sex;

    /**
     * 出生年月
     */
    private Date birthday;

    /**
     * 民族
     */
    private String minzu;

    /**
     * 婚姻状况
     */
    private String hyzk;

    /**
     * 政治面貌
     */
    private String zzmm;

    /**
     * 现居住地
     */
    private String xjzd;

    /**
     * 身高
     */
    private String shengao;

    /**
     * 身份证
     */
    private String sfz;

    /**
     * 毕业院校
     */
    private String byyx;

    /**
     * 所学专业
     */
    private String sxzy;

    /**
     * 学历
     */
    private String xueli;

    /**
     * 学位

     */
    private String xuewei;

    /**
     * 英语水平
     */
    private String yysp;

    /**
     * 职称（技能）等级
     */
    private String zcdj;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 最快到岗时间
     */
    private String dgsj;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 简历状态
     */
    private String cvstatus;

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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMinzu() {
        return minzu;
    }

    public void setMinzu(String minzu) {
        this.minzu = minzu;
    }

    public String getHyzk() {
        return hyzk;
    }

    public void setHyzk(String hyzk) {
        this.hyzk = hyzk;
    }

    public String getZzmm() {
        return zzmm;
    }

    public void setZzmm(String zzmm) {
        this.zzmm = zzmm;
    }

    public String getXjzd() {
        return xjzd;
    }

    public void setXjzd(String xjzd) {
        this.xjzd = xjzd;
    }

    public String getShengao() {
        return shengao;
    }

    public void setShengao(String shengao) {
        this.shengao = shengao;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    public String getByyx() {
        return byyx;
    }

    public void setByyx(String byyx) {
        this.byyx = byyx;
    }

    public String getSxzy() {
        return sxzy;
    }

    public void setSxzy(String sxzy) {
        this.sxzy = sxzy;
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    public String getXuewei() {
        return xuewei;
    }

    public void setXuewei(String xuewei) {
        this.xuewei = xuewei;
    }

    public String getYysp() {
        return yysp;
    }

    public void setYysp(String yysp) {
        this.yysp = yysp;
    }

    public String getZcdj() {
        return zcdj;
    }

    public void setZcdj(String zcdj) {
        this.zcdj = zcdj;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDgsj() {
        return dgsj;
    }

    public void setDgsj(String dgsj) {
        this.dgsj = dgsj;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCvstatus() {
        return cvstatus;
    }

    public void setCvstatus(String cvstatus) {
        this.cvstatus = cvstatus;
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
        TbCvs other = (TbCvs) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getCvid() == null ? other.getCvid() == null : this.getCvid().equals(other.getCvid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getMinzu() == null ? other.getMinzu() == null : this.getMinzu().equals(other.getMinzu()))
            && (this.getHyzk() == null ? other.getHyzk() == null : this.getHyzk().equals(other.getHyzk()))
            && (this.getZzmm() == null ? other.getZzmm() == null : this.getZzmm().equals(other.getZzmm()))
            && (this.getXjzd() == null ? other.getXjzd() == null : this.getXjzd().equals(other.getXjzd()))
            && (this.getShengao() == null ? other.getShengao() == null : this.getShengao().equals(other.getShengao()))
            && (this.getSfz() == null ? other.getSfz() == null : this.getSfz().equals(other.getSfz()))
            && (this.getByyx() == null ? other.getByyx() == null : this.getByyx().equals(other.getByyx()))
            && (this.getSxzy() == null ? other.getSxzy() == null : this.getSxzy().equals(other.getSxzy()))
            && (this.getXueli() == null ? other.getXueli() == null : this.getXueli().equals(other.getXueli()))
            && (this.getXuewei() == null ? other.getXuewei() == null : this.getXuewei().equals(other.getXuewei()))
            && (this.getYysp() == null ? other.getYysp() == null : this.getYysp().equals(other.getYysp()))
            && (this.getZcdj() == null ? other.getZcdj() == null : this.getZcdj().equals(other.getZcdj()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getDgsj() == null ? other.getDgsj() == null : this.getDgsj().equals(other.getDgsj()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCvstatus() == null ? other.getCvstatus() == null : this.getCvstatus().equals(other.getCvstatus()))
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
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getMinzu() == null) ? 0 : getMinzu().hashCode());
        result = prime * result + ((getHyzk() == null) ? 0 : getHyzk().hashCode());
        result = prime * result + ((getZzmm() == null) ? 0 : getZzmm().hashCode());
        result = prime * result + ((getXjzd() == null) ? 0 : getXjzd().hashCode());
        result = prime * result + ((getShengao() == null) ? 0 : getShengao().hashCode());
        result = prime * result + ((getSfz() == null) ? 0 : getSfz().hashCode());
        result = prime * result + ((getByyx() == null) ? 0 : getByyx().hashCode());
        result = prime * result + ((getSxzy() == null) ? 0 : getSxzy().hashCode());
        result = prime * result + ((getXueli() == null) ? 0 : getXueli().hashCode());
        result = prime * result + ((getXuewei() == null) ? 0 : getXuewei().hashCode());
        result = prime * result + ((getYysp() == null) ? 0 : getYysp().hashCode());
        result = prime * result + ((getZcdj() == null) ? 0 : getZcdj().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getDgsj() == null) ? 0 : getDgsj().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCvstatus() == null) ? 0 : getCvstatus().hashCode());
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
        sb.append(", userid=").append(userid);
        sb.append(", nickname=").append(nickname);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", minzu=").append(minzu);
        sb.append(", hyzk=").append(hyzk);
        sb.append(", zzmm=").append(zzmm);
        sb.append(", xjzd=").append(xjzd);
        sb.append(", shengao=").append(shengao);
        sb.append(", sfz=").append(sfz);
        sb.append(", byyx=").append(byyx);
        sb.append(", sxzy=").append(sxzy);
        sb.append(", xueli=").append(xueli);
        sb.append(", xuewei=").append(xuewei);
        sb.append(", yysp=").append(yysp);
        sb.append(", zcdj=").append(zcdj);
        sb.append(", phone=").append(phone);
        sb.append(", dgsj=").append(dgsj);
        sb.append(", createtime=").append(createtime);
        sb.append(", cvstatus=").append(cvstatus);
        sb.append(", column1=").append(column1);
        sb.append(", column2=").append(column2);
        sb.append(", column3=").append(column3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}