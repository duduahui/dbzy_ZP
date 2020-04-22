package com.irs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCvsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TbCvsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUidIsNull() {
            addCriterion("`uid` is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("`uid` is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("`uid` =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("`uid` <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("`uid` >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("`uid` >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("`uid` <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("`uid` <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("`uid` in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("`uid` not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("`uid` between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("`uid` not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andCvidIsNull() {
            addCriterion("cvid is null");
            return (Criteria) this;
        }

        public Criteria andCvidIsNotNull() {
            addCriterion("cvid is not null");
            return (Criteria) this;
        }

        public Criteria andCvidEqualTo(String value) {
            addCriterion("cvid =", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidNotEqualTo(String value) {
            addCriterion("cvid <>", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidGreaterThan(String value) {
            addCriterion("cvid >", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidGreaterThanOrEqualTo(String value) {
            addCriterion("cvid >=", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidLessThan(String value) {
            addCriterion("cvid <", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidLessThanOrEqualTo(String value) {
            addCriterion("cvid <=", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidLike(String value) {
            addCriterion("cvid like", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidNotLike(String value) {
            addCriterion("cvid not like", value, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidIn(List<String> values) {
            addCriterion("cvid in", values, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidNotIn(List<String> values) {
            addCriterion("cvid not in", values, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidBetween(String value1, String value2) {
            addCriterion("cvid between", value1, value2, "cvid");
            return (Criteria) this;
        }

        public Criteria andCvidNotBetween(String value1, String value2) {
            addCriterion("cvid not between", value1, value2, "cvid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNull() {
            addCriterion("minzu is null");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNotNull() {
            addCriterion("minzu is not null");
            return (Criteria) this;
        }

        public Criteria andMinzuEqualTo(String value) {
            addCriterion("minzu =", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotEqualTo(String value) {
            addCriterion("minzu <>", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThan(String value) {
            addCriterion("minzu >", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThanOrEqualTo(String value) {
            addCriterion("minzu >=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThan(String value) {
            addCriterion("minzu <", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThanOrEqualTo(String value) {
            addCriterion("minzu <=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLike(String value) {
            addCriterion("minzu like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotLike(String value) {
            addCriterion("minzu not like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuIn(List<String> values) {
            addCriterion("minzu in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotIn(List<String> values) {
            addCriterion("minzu not in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuBetween(String value1, String value2) {
            addCriterion("minzu between", value1, value2, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotBetween(String value1, String value2) {
            addCriterion("minzu not between", value1, value2, "minzu");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNull() {
            addCriterion("hyzk is null");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNotNull() {
            addCriterion("hyzk is not null");
            return (Criteria) this;
        }

        public Criteria andHyzkEqualTo(String value) {
            addCriterion("hyzk =", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotEqualTo(String value) {
            addCriterion("hyzk <>", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThan(String value) {
            addCriterion("hyzk >", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThanOrEqualTo(String value) {
            addCriterion("hyzk >=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThan(String value) {
            addCriterion("hyzk <", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThanOrEqualTo(String value) {
            addCriterion("hyzk <=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLike(String value) {
            addCriterion("hyzk like", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotLike(String value) {
            addCriterion("hyzk not like", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkIn(List<String> values) {
            addCriterion("hyzk in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotIn(List<String> values) {
            addCriterion("hyzk not in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkBetween(String value1, String value2) {
            addCriterion("hyzk between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotBetween(String value1, String value2) {
            addCriterion("hyzk not between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNull() {
            addCriterion("zzmm is null");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNotNull() {
            addCriterion("zzmm is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmEqualTo(String value) {
            addCriterion("zzmm =", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotEqualTo(String value) {
            addCriterion("zzmm <>", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThan(String value) {
            addCriterion("zzmm >", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("zzmm >=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThan(String value) {
            addCriterion("zzmm <", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThanOrEqualTo(String value) {
            addCriterion("zzmm <=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLike(String value) {
            addCriterion("zzmm like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotLike(String value) {
            addCriterion("zzmm not like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmIn(List<String> values) {
            addCriterion("zzmm in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotIn(List<String> values) {
            addCriterion("zzmm not in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmBetween(String value1, String value2) {
            addCriterion("zzmm between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotBetween(String value1, String value2) {
            addCriterion("zzmm not between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andXjzdIsNull() {
            addCriterion("xjzd is null");
            return (Criteria) this;
        }

        public Criteria andXjzdIsNotNull() {
            addCriterion("xjzd is not null");
            return (Criteria) this;
        }

        public Criteria andXjzdEqualTo(String value) {
            addCriterion("xjzd =", value, "xjzd");
            return (Criteria) this;
        }

        public Criteria andXjzdNotEqualTo(String value) {
            addCriterion("xjzd <>", value, "xjzd");
            return (Criteria) this;
        }

        public Criteria andXjzdGreaterThan(String value) {
            addCriterion("xjzd >", value, "xjzd");
            return (Criteria) this;
        }

        public Criteria andXjzdGreaterThanOrEqualTo(String value) {
            addCriterion("xjzd >=", value, "xjzd");
            return (Criteria) this;
        }

        public Criteria andXjzdLessThan(String value) {
            addCriterion("xjzd <", value, "xjzd");
            return (Criteria) this;
        }

        public Criteria andXjzdLessThanOrEqualTo(String value) {
            addCriterion("xjzd <=", value, "xjzd");
            return (Criteria) this;
        }

        public Criteria andXjzdLike(String value) {
            addCriterion("xjzd like", value, "xjzd");
            return (Criteria) this;
        }

        public Criteria andXjzdNotLike(String value) {
            addCriterion("xjzd not like", value, "xjzd");
            return (Criteria) this;
        }

        public Criteria andXjzdIn(List<String> values) {
            addCriterion("xjzd in", values, "xjzd");
            return (Criteria) this;
        }

        public Criteria andXjzdNotIn(List<String> values) {
            addCriterion("xjzd not in", values, "xjzd");
            return (Criteria) this;
        }

        public Criteria andXjzdBetween(String value1, String value2) {
            addCriterion("xjzd between", value1, value2, "xjzd");
            return (Criteria) this;
        }

        public Criteria andXjzdNotBetween(String value1, String value2) {
            addCriterion("xjzd not between", value1, value2, "xjzd");
            return (Criteria) this;
        }

        public Criteria andShengaoIsNull() {
            addCriterion("shengao is null");
            return (Criteria) this;
        }

        public Criteria andShengaoIsNotNull() {
            addCriterion("shengao is not null");
            return (Criteria) this;
        }

        public Criteria andShengaoEqualTo(String value) {
            addCriterion("shengao =", value, "shengao");
            return (Criteria) this;
        }

        public Criteria andShengaoNotEqualTo(String value) {
            addCriterion("shengao <>", value, "shengao");
            return (Criteria) this;
        }

        public Criteria andShengaoGreaterThan(String value) {
            addCriterion("shengao >", value, "shengao");
            return (Criteria) this;
        }

        public Criteria andShengaoGreaterThanOrEqualTo(String value) {
            addCriterion("shengao >=", value, "shengao");
            return (Criteria) this;
        }

        public Criteria andShengaoLessThan(String value) {
            addCriterion("shengao <", value, "shengao");
            return (Criteria) this;
        }

        public Criteria andShengaoLessThanOrEqualTo(String value) {
            addCriterion("shengao <=", value, "shengao");
            return (Criteria) this;
        }

        public Criteria andShengaoLike(String value) {
            addCriterion("shengao like", value, "shengao");
            return (Criteria) this;
        }

        public Criteria andShengaoNotLike(String value) {
            addCriterion("shengao not like", value, "shengao");
            return (Criteria) this;
        }

        public Criteria andShengaoIn(List<String> values) {
            addCriterion("shengao in", values, "shengao");
            return (Criteria) this;
        }

        public Criteria andShengaoNotIn(List<String> values) {
            addCriterion("shengao not in", values, "shengao");
            return (Criteria) this;
        }

        public Criteria andShengaoBetween(String value1, String value2) {
            addCriterion("shengao between", value1, value2, "shengao");
            return (Criteria) this;
        }

        public Criteria andShengaoNotBetween(String value1, String value2) {
            addCriterion("shengao not between", value1, value2, "shengao");
            return (Criteria) this;
        }

        public Criteria andSfzIsNull() {
            addCriterion("sfz is null");
            return (Criteria) this;
        }

        public Criteria andSfzIsNotNull() {
            addCriterion("sfz is not null");
            return (Criteria) this;
        }

        public Criteria andSfzEqualTo(String value) {
            addCriterion("sfz =", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzNotEqualTo(String value) {
            addCriterion("sfz <>", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzGreaterThan(String value) {
            addCriterion("sfz >", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzGreaterThanOrEqualTo(String value) {
            addCriterion("sfz >=", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzLessThan(String value) {
            addCriterion("sfz <", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzLessThanOrEqualTo(String value) {
            addCriterion("sfz <=", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzLike(String value) {
            addCriterion("sfz like", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzNotLike(String value) {
            addCriterion("sfz not like", value, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzIn(List<String> values) {
            addCriterion("sfz in", values, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzNotIn(List<String> values) {
            addCriterion("sfz not in", values, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzBetween(String value1, String value2) {
            addCriterion("sfz between", value1, value2, "sfz");
            return (Criteria) this;
        }

        public Criteria andSfzNotBetween(String value1, String value2) {
            addCriterion("sfz not between", value1, value2, "sfz");
            return (Criteria) this;
        }

        public Criteria andByyxIsNull() {
            addCriterion("byyx is null");
            return (Criteria) this;
        }

        public Criteria andByyxIsNotNull() {
            addCriterion("byyx is not null");
            return (Criteria) this;
        }

        public Criteria andByyxEqualTo(String value) {
            addCriterion("byyx =", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxNotEqualTo(String value) {
            addCriterion("byyx <>", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxGreaterThan(String value) {
            addCriterion("byyx >", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxGreaterThanOrEqualTo(String value) {
            addCriterion("byyx >=", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxLessThan(String value) {
            addCriterion("byyx <", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxLessThanOrEqualTo(String value) {
            addCriterion("byyx <=", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxLike(String value) {
            addCriterion("byyx like", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxNotLike(String value) {
            addCriterion("byyx not like", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxIn(List<String> values) {
            addCriterion("byyx in", values, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxNotIn(List<String> values) {
            addCriterion("byyx not in", values, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxBetween(String value1, String value2) {
            addCriterion("byyx between", value1, value2, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxNotBetween(String value1, String value2) {
            addCriterion("byyx not between", value1, value2, "byyx");
            return (Criteria) this;
        }

        public Criteria andSxzyIsNull() {
            addCriterion("sxzy is null");
            return (Criteria) this;
        }

        public Criteria andSxzyIsNotNull() {
            addCriterion("sxzy is not null");
            return (Criteria) this;
        }

        public Criteria andSxzyEqualTo(String value) {
            addCriterion("sxzy =", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyNotEqualTo(String value) {
            addCriterion("sxzy <>", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyGreaterThan(String value) {
            addCriterion("sxzy >", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyGreaterThanOrEqualTo(String value) {
            addCriterion("sxzy >=", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyLessThan(String value) {
            addCriterion("sxzy <", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyLessThanOrEqualTo(String value) {
            addCriterion("sxzy <=", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyLike(String value) {
            addCriterion("sxzy like", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyNotLike(String value) {
            addCriterion("sxzy not like", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyIn(List<String> values) {
            addCriterion("sxzy in", values, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyNotIn(List<String> values) {
            addCriterion("sxzy not in", values, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyBetween(String value1, String value2) {
            addCriterion("sxzy between", value1, value2, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyNotBetween(String value1, String value2) {
            addCriterion("sxzy not between", value1, value2, "sxzy");
            return (Criteria) this;
        }

        public Criteria andXueliIsNull() {
            addCriterion("xueli is null");
            return (Criteria) this;
        }

        public Criteria andXueliIsNotNull() {
            addCriterion("xueli is not null");
            return (Criteria) this;
        }

        public Criteria andXueliEqualTo(String value) {
            addCriterion("xueli =", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotEqualTo(String value) {
            addCriterion("xueli <>", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThan(String value) {
            addCriterion("xueli >", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThanOrEqualTo(String value) {
            addCriterion("xueli >=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThan(String value) {
            addCriterion("xueli <", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThanOrEqualTo(String value) {
            addCriterion("xueli <=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLike(String value) {
            addCriterion("xueli like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotLike(String value) {
            addCriterion("xueli not like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliIn(List<String> values) {
            addCriterion("xueli in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotIn(List<String> values) {
            addCriterion("xueli not in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliBetween(String value1, String value2) {
            addCriterion("xueli between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotBetween(String value1, String value2) {
            addCriterion("xueli not between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueweiIsNull() {
            addCriterion("xuewei is null");
            return (Criteria) this;
        }

        public Criteria andXueweiIsNotNull() {
            addCriterion("xuewei is not null");
            return (Criteria) this;
        }

        public Criteria andXueweiEqualTo(String value) {
            addCriterion("xuewei =", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotEqualTo(String value) {
            addCriterion("xuewei <>", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiGreaterThan(String value) {
            addCriterion("xuewei >", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiGreaterThanOrEqualTo(String value) {
            addCriterion("xuewei >=", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLessThan(String value) {
            addCriterion("xuewei <", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLessThanOrEqualTo(String value) {
            addCriterion("xuewei <=", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLike(String value) {
            addCriterion("xuewei like", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotLike(String value) {
            addCriterion("xuewei not like", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiIn(List<String> values) {
            addCriterion("xuewei in", values, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotIn(List<String> values) {
            addCriterion("xuewei not in", values, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiBetween(String value1, String value2) {
            addCriterion("xuewei between", value1, value2, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotBetween(String value1, String value2) {
            addCriterion("xuewei not between", value1, value2, "xuewei");
            return (Criteria) this;
        }

        public Criteria andYyspIsNull() {
            addCriterion("yysp is null");
            return (Criteria) this;
        }

        public Criteria andYyspIsNotNull() {
            addCriterion("yysp is not null");
            return (Criteria) this;
        }

        public Criteria andYyspEqualTo(String value) {
            addCriterion("yysp =", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspNotEqualTo(String value) {
            addCriterion("yysp <>", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspGreaterThan(String value) {
            addCriterion("yysp >", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspGreaterThanOrEqualTo(String value) {
            addCriterion("yysp >=", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspLessThan(String value) {
            addCriterion("yysp <", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspLessThanOrEqualTo(String value) {
            addCriterion("yysp <=", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspLike(String value) {
            addCriterion("yysp like", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspNotLike(String value) {
            addCriterion("yysp not like", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspIn(List<String> values) {
            addCriterion("yysp in", values, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspNotIn(List<String> values) {
            addCriterion("yysp not in", values, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspBetween(String value1, String value2) {
            addCriterion("yysp between", value1, value2, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspNotBetween(String value1, String value2) {
            addCriterion("yysp not between", value1, value2, "yysp");
            return (Criteria) this;
        }

        public Criteria andZcdjIsNull() {
            addCriterion("zcdj is null");
            return (Criteria) this;
        }

        public Criteria andZcdjIsNotNull() {
            addCriterion("zcdj is not null");
            return (Criteria) this;
        }

        public Criteria andZcdjEqualTo(String value) {
            addCriterion("zcdj =", value, "zcdj");
            return (Criteria) this;
        }

        public Criteria andZcdjNotEqualTo(String value) {
            addCriterion("zcdj <>", value, "zcdj");
            return (Criteria) this;
        }

        public Criteria andZcdjGreaterThan(String value) {
            addCriterion("zcdj >", value, "zcdj");
            return (Criteria) this;
        }

        public Criteria andZcdjGreaterThanOrEqualTo(String value) {
            addCriterion("zcdj >=", value, "zcdj");
            return (Criteria) this;
        }

        public Criteria andZcdjLessThan(String value) {
            addCriterion("zcdj <", value, "zcdj");
            return (Criteria) this;
        }

        public Criteria andZcdjLessThanOrEqualTo(String value) {
            addCriterion("zcdj <=", value, "zcdj");
            return (Criteria) this;
        }

        public Criteria andZcdjLike(String value) {
            addCriterion("zcdj like", value, "zcdj");
            return (Criteria) this;
        }

        public Criteria andZcdjNotLike(String value) {
            addCriterion("zcdj not like", value, "zcdj");
            return (Criteria) this;
        }

        public Criteria andZcdjIn(List<String> values) {
            addCriterion("zcdj in", values, "zcdj");
            return (Criteria) this;
        }

        public Criteria andZcdjNotIn(List<String> values) {
            addCriterion("zcdj not in", values, "zcdj");
            return (Criteria) this;
        }

        public Criteria andZcdjBetween(String value1, String value2) {
            addCriterion("zcdj between", value1, value2, "zcdj");
            return (Criteria) this;
        }

        public Criteria andZcdjNotBetween(String value1, String value2) {
            addCriterion("zcdj not between", value1, value2, "zcdj");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andDgsjIsNull() {
            addCriterion("dgsj is null");
            return (Criteria) this;
        }

        public Criteria andDgsjIsNotNull() {
            addCriterion("dgsj is not null");
            return (Criteria) this;
        }

        public Criteria andDgsjEqualTo(String value) {
            addCriterion("dgsj =", value, "dgsj");
            return (Criteria) this;
        }

        public Criteria andDgsjNotEqualTo(String value) {
            addCriterion("dgsj <>", value, "dgsj");
            return (Criteria) this;
        }

        public Criteria andDgsjGreaterThan(String value) {
            addCriterion("dgsj >", value, "dgsj");
            return (Criteria) this;
        }

        public Criteria andDgsjGreaterThanOrEqualTo(String value) {
            addCriterion("dgsj >=", value, "dgsj");
            return (Criteria) this;
        }

        public Criteria andDgsjLessThan(String value) {
            addCriterion("dgsj <", value, "dgsj");
            return (Criteria) this;
        }

        public Criteria andDgsjLessThanOrEqualTo(String value) {
            addCriterion("dgsj <=", value, "dgsj");
            return (Criteria) this;
        }

        public Criteria andDgsjLike(String value) {
            addCriterion("dgsj like", value, "dgsj");
            return (Criteria) this;
        }

        public Criteria andDgsjNotLike(String value) {
            addCriterion("dgsj not like", value, "dgsj");
            return (Criteria) this;
        }

        public Criteria andDgsjIn(List<String> values) {
            addCriterion("dgsj in", values, "dgsj");
            return (Criteria) this;
        }

        public Criteria andDgsjNotIn(List<String> values) {
            addCriterion("dgsj not in", values, "dgsj");
            return (Criteria) this;
        }

        public Criteria andDgsjBetween(String value1, String value2) {
            addCriterion("dgsj between", value1, value2, "dgsj");
            return (Criteria) this;
        }

        public Criteria andDgsjNotBetween(String value1, String value2) {
            addCriterion("dgsj not between", value1, value2, "dgsj");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCvstatusIsNull() {
            addCriterion("cvstatus is null");
            return (Criteria) this;
        }

        public Criteria andCvstatusIsNotNull() {
            addCriterion("cvstatus is not null");
            return (Criteria) this;
        }

        public Criteria andCvstatusEqualTo(String value) {
            addCriterion("cvstatus =", value, "cvstatus");
            return (Criteria) this;
        }

        public Criteria andCvstatusNotEqualTo(String value) {
            addCriterion("cvstatus <>", value, "cvstatus");
            return (Criteria) this;
        }

        public Criteria andCvstatusGreaterThan(String value) {
            addCriterion("cvstatus >", value, "cvstatus");
            return (Criteria) this;
        }

        public Criteria andCvstatusGreaterThanOrEqualTo(String value) {
            addCriterion("cvstatus >=", value, "cvstatus");
            return (Criteria) this;
        }

        public Criteria andCvstatusLessThan(String value) {
            addCriterion("cvstatus <", value, "cvstatus");
            return (Criteria) this;
        }

        public Criteria andCvstatusLessThanOrEqualTo(String value) {
            addCriterion("cvstatus <=", value, "cvstatus");
            return (Criteria) this;
        }

        public Criteria andCvstatusLike(String value) {
            addCriterion("cvstatus like", value, "cvstatus");
            return (Criteria) this;
        }

        public Criteria andCvstatusNotLike(String value) {
            addCriterion("cvstatus not like", value, "cvstatus");
            return (Criteria) this;
        }

        public Criteria andCvstatusIn(List<String> values) {
            addCriterion("cvstatus in", values, "cvstatus");
            return (Criteria) this;
        }

        public Criteria andCvstatusNotIn(List<String> values) {
            addCriterion("cvstatus not in", values, "cvstatus");
            return (Criteria) this;
        }

        public Criteria andCvstatusBetween(String value1, String value2) {
            addCriterion("cvstatus between", value1, value2, "cvstatus");
            return (Criteria) this;
        }

        public Criteria andCvstatusNotBetween(String value1, String value2) {
            addCriterion("cvstatus not between", value1, value2, "cvstatus");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNull() {
            addCriterion("column1 is null");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNotNull() {
            addCriterion("column1 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn1EqualTo(String value) {
            addCriterion("column1 =", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotEqualTo(String value) {
            addCriterion("column1 <>", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThan(String value) {
            addCriterion("column1 >", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThanOrEqualTo(String value) {
            addCriterion("column1 >=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThan(String value) {
            addCriterion("column1 <", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThanOrEqualTo(String value) {
            addCriterion("column1 <=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Like(String value) {
            addCriterion("column1 like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotLike(String value) {
            addCriterion("column1 not like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1In(List<String> values) {
            addCriterion("column1 in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotIn(List<String> values) {
            addCriterion("column1 not in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Between(String value1, String value2) {
            addCriterion("column1 between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotBetween(String value1, String value2) {
            addCriterion("column1 not between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNull() {
            addCriterion("column2 is null");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNotNull() {
            addCriterion("column2 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn2EqualTo(String value) {
            addCriterion("column2 =", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotEqualTo(String value) {
            addCriterion("column2 <>", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThan(String value) {
            addCriterion("column2 >", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThanOrEqualTo(String value) {
            addCriterion("column2 >=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThan(String value) {
            addCriterion("column2 <", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThanOrEqualTo(String value) {
            addCriterion("column2 <=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Like(String value) {
            addCriterion("column2 like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotLike(String value) {
            addCriterion("column2 not like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2In(List<String> values) {
            addCriterion("column2 in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotIn(List<String> values) {
            addCriterion("column2 not in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Between(String value1, String value2) {
            addCriterion("column2 between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotBetween(String value1, String value2) {
            addCriterion("column2 not between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn3IsNull() {
            addCriterion("column3 is null");
            return (Criteria) this;
        }

        public Criteria andColumn3IsNotNull() {
            addCriterion("column3 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn3EqualTo(String value) {
            addCriterion("column3 =", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotEqualTo(String value) {
            addCriterion("column3 <>", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3GreaterThan(String value) {
            addCriterion("column3 >", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3GreaterThanOrEqualTo(String value) {
            addCriterion("column3 >=", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3LessThan(String value) {
            addCriterion("column3 <", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3LessThanOrEqualTo(String value) {
            addCriterion("column3 <=", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3Like(String value) {
            addCriterion("column3 like", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotLike(String value) {
            addCriterion("column3 not like", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3In(List<String> values) {
            addCriterion("column3 in", values, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotIn(List<String> values) {
            addCriterion("column3 not in", values, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3Between(String value1, String value2) {
            addCriterion("column3 between", value1, value2, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotBetween(String value1, String value2) {
            addCriterion("column3 not between", value1, value2, "column3");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}