package com.irs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPostsCvsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TbPostsCvsExample() {
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

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andCvcodeIsNull() {
            addCriterion("cvcode is null");
            return (Criteria) this;
        }

        public Criteria andCvcodeIsNotNull() {
            addCriterion("cvcode is not null");
            return (Criteria) this;
        }

        public Criteria andCvcodeEqualTo(String value) {
            addCriterion("cvcode =", value, "cvcode");
            return (Criteria) this;
        }

        public Criteria andCvcodeNotEqualTo(String value) {
            addCriterion("cvcode <>", value, "cvcode");
            return (Criteria) this;
        }

        public Criteria andCvcodeGreaterThan(String value) {
            addCriterion("cvcode >", value, "cvcode");
            return (Criteria) this;
        }

        public Criteria andCvcodeGreaterThanOrEqualTo(String value) {
            addCriterion("cvcode >=", value, "cvcode");
            return (Criteria) this;
        }

        public Criteria andCvcodeLessThan(String value) {
            addCriterion("cvcode <", value, "cvcode");
            return (Criteria) this;
        }

        public Criteria andCvcodeLessThanOrEqualTo(String value) {
            addCriterion("cvcode <=", value, "cvcode");
            return (Criteria) this;
        }

        public Criteria andCvcodeLike(String value) {
            addCriterion("cvcode like", value, "cvcode");
            return (Criteria) this;
        }

        public Criteria andCvcodeNotLike(String value) {
            addCriterion("cvcode not like", value, "cvcode");
            return (Criteria) this;
        }

        public Criteria andCvcodeIn(List<String> values) {
            addCriterion("cvcode in", values, "cvcode");
            return (Criteria) this;
        }

        public Criteria andCvcodeNotIn(List<String> values) {
            addCriterion("cvcode not in", values, "cvcode");
            return (Criteria) this;
        }

        public Criteria andCvcodeBetween(String value1, String value2) {
            addCriterion("cvcode between", value1, value2, "cvcode");
            return (Criteria) this;
        }

        public Criteria andCvcodeNotBetween(String value1, String value2) {
            addCriterion("cvcode not between", value1, value2, "cvcode");
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

        public Criteria andSubmiterIsNull() {
            addCriterion("submiter is null");
            return (Criteria) this;
        }

        public Criteria andSubmiterIsNotNull() {
            addCriterion("submiter is not null");
            return (Criteria) this;
        }

        public Criteria andSubmiterEqualTo(String value) {
            addCriterion("submiter =", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterNotEqualTo(String value) {
            addCriterion("submiter <>", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterGreaterThan(String value) {
            addCriterion("submiter >", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterGreaterThanOrEqualTo(String value) {
            addCriterion("submiter >=", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterLessThan(String value) {
            addCriterion("submiter <", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterLessThanOrEqualTo(String value) {
            addCriterion("submiter <=", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterLike(String value) {
            addCriterion("submiter like", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterNotLike(String value) {
            addCriterion("submiter not like", value, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterIn(List<String> values) {
            addCriterion("submiter in", values, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterNotIn(List<String> values) {
            addCriterion("submiter not in", values, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterBetween(String value1, String value2) {
            addCriterion("submiter between", value1, value2, "submiter");
            return (Criteria) this;
        }

        public Criteria andSubmiterNotBetween(String value1, String value2) {
            addCriterion("submiter not between", value1, value2, "submiter");
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