package com.irs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPostsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TbPostsExample() {
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

        public Criteria andZdeptIsNull() {
            addCriterion("zdept is null");
            return (Criteria) this;
        }

        public Criteria andZdeptIsNotNull() {
            addCriterion("zdept is not null");
            return (Criteria) this;
        }

        public Criteria andZdeptEqualTo(String value) {
            addCriterion("zdept =", value, "zdept");
            return (Criteria) this;
        }

        public Criteria andZdeptNotEqualTo(String value) {
            addCriterion("zdept <>", value, "zdept");
            return (Criteria) this;
        }

        public Criteria andZdeptGreaterThan(String value) {
            addCriterion("zdept >", value, "zdept");
            return (Criteria) this;
        }

        public Criteria andZdeptGreaterThanOrEqualTo(String value) {
            addCriterion("zdept >=", value, "zdept");
            return (Criteria) this;
        }

        public Criteria andZdeptLessThan(String value) {
            addCriterion("zdept <", value, "zdept");
            return (Criteria) this;
        }

        public Criteria andZdeptLessThanOrEqualTo(String value) {
            addCriterion("zdept <=", value, "zdept");
            return (Criteria) this;
        }

        public Criteria andZdeptLike(String value) {
            addCriterion("zdept like", value, "zdept");
            return (Criteria) this;
        }

        public Criteria andZdeptNotLike(String value) {
            addCriterion("zdept not like", value, "zdept");
            return (Criteria) this;
        }

        public Criteria andZdeptIn(List<String> values) {
            addCriterion("zdept in", values, "zdept");
            return (Criteria) this;
        }

        public Criteria andZdeptNotIn(List<String> values) {
            addCriterion("zdept not in", values, "zdept");
            return (Criteria) this;
        }

        public Criteria andZdeptBetween(String value1, String value2) {
            addCriterion("zdept between", value1, value2, "zdept");
            return (Criteria) this;
        }

        public Criteria andZdeptNotBetween(String value1, String value2) {
            addCriterion("zdept not between", value1, value2, "zdept");
            return (Criteria) this;
        }

        public Criteria andZnameIsNull() {
            addCriterion("zname is null");
            return (Criteria) this;
        }

        public Criteria andZnameIsNotNull() {
            addCriterion("zname is not null");
            return (Criteria) this;
        }

        public Criteria andZnameEqualTo(String value) {
            addCriterion("zname =", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotEqualTo(String value) {
            addCriterion("zname <>", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameGreaterThan(String value) {
            addCriterion("zname >", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameGreaterThanOrEqualTo(String value) {
            addCriterion("zname >=", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameLessThan(String value) {
            addCriterion("zname <", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameLessThanOrEqualTo(String value) {
            addCriterion("zname <=", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameLike(String value) {
            addCriterion("zname like", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotLike(String value) {
            addCriterion("zname not like", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameIn(List<String> values) {
            addCriterion("zname in", values, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotIn(List<String> values) {
            addCriterion("zname not in", values, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameBetween(String value1, String value2) {
            addCriterion("zname between", value1, value2, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotBetween(String value1, String value2) {
            addCriterion("zname not between", value1, value2, "zname");
            return (Criteria) this;
        }

        public Criteria andGzddIsNull() {
            addCriterion("gzdd is null");
            return (Criteria) this;
        }

        public Criteria andGzddIsNotNull() {
            addCriterion("gzdd is not null");
            return (Criteria) this;
        }

        public Criteria andGzddEqualTo(String value) {
            addCriterion("gzdd =", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddNotEqualTo(String value) {
            addCriterion("gzdd <>", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddGreaterThan(String value) {
            addCriterion("gzdd >", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddGreaterThanOrEqualTo(String value) {
            addCriterion("gzdd >=", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddLessThan(String value) {
            addCriterion("gzdd <", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddLessThanOrEqualTo(String value) {
            addCriterion("gzdd <=", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddLike(String value) {
            addCriterion("gzdd like", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddNotLike(String value) {
            addCriterion("gzdd not like", value, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddIn(List<String> values) {
            addCriterion("gzdd in", values, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddNotIn(List<String> values) {
            addCriterion("gzdd not in", values, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddBetween(String value1, String value2) {
            addCriterion("gzdd between", value1, value2, "gzdd");
            return (Criteria) this;
        }

        public Criteria andGzddNotBetween(String value1, String value2) {
            addCriterion("gzdd not between", value1, value2, "gzdd");
            return (Criteria) this;
        }

        public Criteria andZprsIsNull() {
            addCriterion("zprs is null");
            return (Criteria) this;
        }

        public Criteria andZprsIsNotNull() {
            addCriterion("zprs is not null");
            return (Criteria) this;
        }

        public Criteria andZprsEqualTo(String value) {
            addCriterion("zprs =", value, "zprs");
            return (Criteria) this;
        }

        public Criteria andZprsNotEqualTo(String value) {
            addCriterion("zprs <>", value, "zprs");
            return (Criteria) this;
        }

        public Criteria andZprsGreaterThan(String value) {
            addCriterion("zprs >", value, "zprs");
            return (Criteria) this;
        }

        public Criteria andZprsGreaterThanOrEqualTo(String value) {
            addCriterion("zprs >=", value, "zprs");
            return (Criteria) this;
        }

        public Criteria andZprsLessThan(String value) {
            addCriterion("zprs <", value, "zprs");
            return (Criteria) this;
        }

        public Criteria andZprsLessThanOrEqualTo(String value) {
            addCriterion("zprs <=", value, "zprs");
            return (Criteria) this;
        }

        public Criteria andZprsLike(String value) {
            addCriterion("zprs like", value, "zprs");
            return (Criteria) this;
        }

        public Criteria andZprsNotLike(String value) {
            addCriterion("zprs not like", value, "zprs");
            return (Criteria) this;
        }

        public Criteria andZprsIn(List<String> values) {
            addCriterion("zprs in", values, "zprs");
            return (Criteria) this;
        }

        public Criteria andZprsNotIn(List<String> values) {
            addCriterion("zprs not in", values, "zprs");
            return (Criteria) this;
        }

        public Criteria andZprsBetween(String value1, String value2) {
            addCriterion("zprs between", value1, value2, "zprs");
            return (Criteria) this;
        }

        public Criteria andZprsNotBetween(String value1, String value2) {
            addCriterion("zprs not between", value1, value2, "zprs");
            return (Criteria) this;
        }

        public Criteria andYxfwIsNull() {
            addCriterion("yxfw is null");
            return (Criteria) this;
        }

        public Criteria andYxfwIsNotNull() {
            addCriterion("yxfw is not null");
            return (Criteria) this;
        }

        public Criteria andYxfwEqualTo(String value) {
            addCriterion("yxfw =", value, "yxfw");
            return (Criteria) this;
        }

        public Criteria andYxfwNotEqualTo(String value) {
            addCriterion("yxfw <>", value, "yxfw");
            return (Criteria) this;
        }

        public Criteria andYxfwGreaterThan(String value) {
            addCriterion("yxfw >", value, "yxfw");
            return (Criteria) this;
        }

        public Criteria andYxfwGreaterThanOrEqualTo(String value) {
            addCriterion("yxfw >=", value, "yxfw");
            return (Criteria) this;
        }

        public Criteria andYxfwLessThan(String value) {
            addCriterion("yxfw <", value, "yxfw");
            return (Criteria) this;
        }

        public Criteria andYxfwLessThanOrEqualTo(String value) {
            addCriterion("yxfw <=", value, "yxfw");
            return (Criteria) this;
        }

        public Criteria andYxfwLike(String value) {
            addCriterion("yxfw like", value, "yxfw");
            return (Criteria) this;
        }

        public Criteria andYxfwNotLike(String value) {
            addCriterion("yxfw not like", value, "yxfw");
            return (Criteria) this;
        }

        public Criteria andYxfwIn(List<String> values) {
            addCriterion("yxfw in", values, "yxfw");
            return (Criteria) this;
        }

        public Criteria andYxfwNotIn(List<String> values) {
            addCriterion("yxfw not in", values, "yxfw");
            return (Criteria) this;
        }

        public Criteria andYxfwBetween(String value1, String value2) {
            addCriterion("yxfw between", value1, value2, "yxfw");
            return (Criteria) this;
        }

        public Criteria andYxfwNotBetween(String value1, String value2) {
            addCriterion("yxfw not between", value1, value2, "yxfw");
            return (Criteria) this;
        }

        public Criteria andXlyqIsNull() {
            addCriterion("xlyq is null");
            return (Criteria) this;
        }

        public Criteria andXlyqIsNotNull() {
            addCriterion("xlyq is not null");
            return (Criteria) this;
        }

        public Criteria andXlyqEqualTo(String value) {
            addCriterion("xlyq =", value, "xlyq");
            return (Criteria) this;
        }

        public Criteria andXlyqNotEqualTo(String value) {
            addCriterion("xlyq <>", value, "xlyq");
            return (Criteria) this;
        }

        public Criteria andXlyqGreaterThan(String value) {
            addCriterion("xlyq >", value, "xlyq");
            return (Criteria) this;
        }

        public Criteria andXlyqGreaterThanOrEqualTo(String value) {
            addCriterion("xlyq >=", value, "xlyq");
            return (Criteria) this;
        }

        public Criteria andXlyqLessThan(String value) {
            addCriterion("xlyq <", value, "xlyq");
            return (Criteria) this;
        }

        public Criteria andXlyqLessThanOrEqualTo(String value) {
            addCriterion("xlyq <=", value, "xlyq");
            return (Criteria) this;
        }

        public Criteria andXlyqLike(String value) {
            addCriterion("xlyq like", value, "xlyq");
            return (Criteria) this;
        }

        public Criteria andXlyqNotLike(String value) {
            addCriterion("xlyq not like", value, "xlyq");
            return (Criteria) this;
        }

        public Criteria andXlyqIn(List<String> values) {
            addCriterion("xlyq in", values, "xlyq");
            return (Criteria) this;
        }

        public Criteria andXlyqNotIn(List<String> values) {
            addCriterion("xlyq not in", values, "xlyq");
            return (Criteria) this;
        }

        public Criteria andXlyqBetween(String value1, String value2) {
            addCriterion("xlyq between", value1, value2, "xlyq");
            return (Criteria) this;
        }

        public Criteria andXlyqNotBetween(String value1, String value2) {
            addCriterion("xlyq not between", value1, value2, "xlyq");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andZyyqIsNull() {
            addCriterion("zyyq is null");
            return (Criteria) this;
        }

        public Criteria andZyyqIsNotNull() {
            addCriterion("zyyq is not null");
            return (Criteria) this;
        }

        public Criteria andZyyqEqualTo(String value) {
            addCriterion("zyyq =", value, "zyyq");
            return (Criteria) this;
        }

        public Criteria andZyyqNotEqualTo(String value) {
            addCriterion("zyyq <>", value, "zyyq");
            return (Criteria) this;
        }

        public Criteria andZyyqGreaterThan(String value) {
            addCriterion("zyyq >", value, "zyyq");
            return (Criteria) this;
        }

        public Criteria andZyyqGreaterThanOrEqualTo(String value) {
            addCriterion("zyyq >=", value, "zyyq");
            return (Criteria) this;
        }

        public Criteria andZyyqLessThan(String value) {
            addCriterion("zyyq <", value, "zyyq");
            return (Criteria) this;
        }

        public Criteria andZyyqLessThanOrEqualTo(String value) {
            addCriterion("zyyq <=", value, "zyyq");
            return (Criteria) this;
        }

        public Criteria andZyyqLike(String value) {
            addCriterion("zyyq like", value, "zyyq");
            return (Criteria) this;
        }

        public Criteria andZyyqNotLike(String value) {
            addCriterion("zyyq not like", value, "zyyq");
            return (Criteria) this;
        }

        public Criteria andZyyqIn(List<String> values) {
            addCriterion("zyyq in", values, "zyyq");
            return (Criteria) this;
        }

        public Criteria andZyyqNotIn(List<String> values) {
            addCriterion("zyyq not in", values, "zyyq");
            return (Criteria) this;
        }

        public Criteria andZyyqBetween(String value1, String value2) {
            addCriterion("zyyq between", value1, value2, "zyyq");
            return (Criteria) this;
        }

        public Criteria andZyyqNotBetween(String value1, String value2) {
            addCriterion("zyyq not between", value1, value2, "zyyq");
            return (Criteria) this;
        }

        public Criteria andGznxIsNull() {
            addCriterion("gznx is null");
            return (Criteria) this;
        }

        public Criteria andGznxIsNotNull() {
            addCriterion("gznx is not null");
            return (Criteria) this;
        }

        public Criteria andGznxEqualTo(String value) {
            addCriterion("gznx =", value, "gznx");
            return (Criteria) this;
        }

        public Criteria andGznxNotEqualTo(String value) {
            addCriterion("gznx <>", value, "gznx");
            return (Criteria) this;
        }

        public Criteria andGznxGreaterThan(String value) {
            addCriterion("gznx >", value, "gznx");
            return (Criteria) this;
        }

        public Criteria andGznxGreaterThanOrEqualTo(String value) {
            addCriterion("gznx >=", value, "gznx");
            return (Criteria) this;
        }

        public Criteria andGznxLessThan(String value) {
            addCriterion("gznx <", value, "gznx");
            return (Criteria) this;
        }

        public Criteria andGznxLessThanOrEqualTo(String value) {
            addCriterion("gznx <=", value, "gznx");
            return (Criteria) this;
        }

        public Criteria andGznxLike(String value) {
            addCriterion("gznx like", value, "gznx");
            return (Criteria) this;
        }

        public Criteria andGznxNotLike(String value) {
            addCriterion("gznx not like", value, "gznx");
            return (Criteria) this;
        }

        public Criteria andGznxIn(List<String> values) {
            addCriterion("gznx in", values, "gznx");
            return (Criteria) this;
        }

        public Criteria andGznxNotIn(List<String> values) {
            addCriterion("gznx not in", values, "gznx");
            return (Criteria) this;
        }

        public Criteria andGznxBetween(String value1, String value2) {
            addCriterion("gznx between", value1, value2, "gznx");
            return (Criteria) this;
        }

        public Criteria andGznxNotBetween(String value1, String value2) {
            addCriterion("gznx not between", value1, value2, "gznx");
            return (Criteria) this;
        }

        public Criteria andGwxlIsNull() {
            addCriterion("gwxl is null");
            return (Criteria) this;
        }

        public Criteria andGwxlIsNotNull() {
            addCriterion("gwxl is not null");
            return (Criteria) this;
        }

        public Criteria andGwxlEqualTo(String value) {
            addCriterion("gwxl =", value, "gwxl");
            return (Criteria) this;
        }

        public Criteria andGwxlNotEqualTo(String value) {
            addCriterion("gwxl <>", value, "gwxl");
            return (Criteria) this;
        }

        public Criteria andGwxlGreaterThan(String value) {
            addCriterion("gwxl >", value, "gwxl");
            return (Criteria) this;
        }

        public Criteria andGwxlGreaterThanOrEqualTo(String value) {
            addCriterion("gwxl >=", value, "gwxl");
            return (Criteria) this;
        }

        public Criteria andGwxlLessThan(String value) {
            addCriterion("gwxl <", value, "gwxl");
            return (Criteria) this;
        }

        public Criteria andGwxlLessThanOrEqualTo(String value) {
            addCriterion("gwxl <=", value, "gwxl");
            return (Criteria) this;
        }

        public Criteria andGwxlLike(String value) {
            addCriterion("gwxl like", value, "gwxl");
            return (Criteria) this;
        }

        public Criteria andGwxlNotLike(String value) {
            addCriterion("gwxl not like", value, "gwxl");
            return (Criteria) this;
        }

        public Criteria andGwxlIn(List<String> values) {
            addCriterion("gwxl in", values, "gwxl");
            return (Criteria) this;
        }

        public Criteria andGwxlNotIn(List<String> values) {
            addCriterion("gwxl not in", values, "gwxl");
            return (Criteria) this;
        }

        public Criteria andGwxlBetween(String value1, String value2) {
            addCriterion("gwxl between", value1, value2, "gwxl");
            return (Criteria) this;
        }

        public Criteria andGwxlNotBetween(String value1, String value2) {
            addCriterion("gwxl not between", value1, value2, "gwxl");
            return (Criteria) this;
        }

        public Criteria andZstatusIsNull() {
            addCriterion("zstatus is null");
            return (Criteria) this;
        }

        public Criteria andZstatusIsNotNull() {
            addCriterion("zstatus is not null");
            return (Criteria) this;
        }

        public Criteria andZstatusEqualTo(String value) {
            addCriterion("zstatus =", value, "zstatus");
            return (Criteria) this;
        }

        public Criteria andZstatusNotEqualTo(String value) {
            addCriterion("zstatus <>", value, "zstatus");
            return (Criteria) this;
        }

        public Criteria andZstatusGreaterThan(String value) {
            addCriterion("zstatus >", value, "zstatus");
            return (Criteria) this;
        }

        public Criteria andZstatusGreaterThanOrEqualTo(String value) {
            addCriterion("zstatus >=", value, "zstatus");
            return (Criteria) this;
        }

        public Criteria andZstatusLessThan(String value) {
            addCriterion("zstatus <", value, "zstatus");
            return (Criteria) this;
        }

        public Criteria andZstatusLessThanOrEqualTo(String value) {
            addCriterion("zstatus <=", value, "zstatus");
            return (Criteria) this;
        }

        public Criteria andZstatusLike(String value) {
            addCriterion("zstatus like", value, "zstatus");
            return (Criteria) this;
        }

        public Criteria andZstatusNotLike(String value) {
            addCriterion("zstatus not like", value, "zstatus");
            return (Criteria) this;
        }

        public Criteria andZstatusIn(List<String> values) {
            addCriterion("zstatus in", values, "zstatus");
            return (Criteria) this;
        }

        public Criteria andZstatusNotIn(List<String> values) {
            addCriterion("zstatus not in", values, "zstatus");
            return (Criteria) this;
        }

        public Criteria andZstatusBetween(String value1, String value2) {
            addCriterion("zstatus between", value1, value2, "zstatus");
            return (Criteria) this;
        }

        public Criteria andZstatusNotBetween(String value1, String value2) {
            addCriterion("zstatus not between", value1, value2, "zstatus");
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