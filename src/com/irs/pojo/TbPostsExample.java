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

        public Criteria andZpbmIsNull() {
            addCriterion("zpbm is null");
            return (Criteria) this;
        }

        public Criteria andZpbmIsNotNull() {
            addCriterion("zpbm is not null");
            return (Criteria) this;
        }

        public Criteria andZpbmEqualTo(String value) {
            addCriterion("zpbm =", value, "zpbm");
            return (Criteria) this;
        }

        public Criteria andZpbmNotEqualTo(String value) {
            addCriterion("zpbm <>", value, "zpbm");
            return (Criteria) this;
        }

        public Criteria andZpbmGreaterThan(String value) {
            addCriterion("zpbm >", value, "zpbm");
            return (Criteria) this;
        }

        public Criteria andZpbmGreaterThanOrEqualTo(String value) {
            addCriterion("zpbm >=", value, "zpbm");
            return (Criteria) this;
        }

        public Criteria andZpbmLessThan(String value) {
            addCriterion("zpbm <", value, "zpbm");
            return (Criteria) this;
        }

        public Criteria andZpbmLessThanOrEqualTo(String value) {
            addCriterion("zpbm <=", value, "zpbm");
            return (Criteria) this;
        }

        public Criteria andZpbmLike(String value) {
            addCriterion("zpbm like", value, "zpbm");
            return (Criteria) this;
        }

        public Criteria andZpbmNotLike(String value) {
            addCriterion("zpbm not like", value, "zpbm");
            return (Criteria) this;
        }

        public Criteria andZpbmIn(List<String> values) {
            addCriterion("zpbm in", values, "zpbm");
            return (Criteria) this;
        }

        public Criteria andZpbmNotIn(List<String> values) {
            addCriterion("zpbm not in", values, "zpbm");
            return (Criteria) this;
        }

        public Criteria andZpbmBetween(String value1, String value2) {
            addCriterion("zpbm between", value1, value2, "zpbm");
            return (Criteria) this;
        }

        public Criteria andZpbmNotBetween(String value1, String value2) {
            addCriterion("zpbm not between", value1, value2, "zpbm");
            return (Criteria) this;
        }

        public Criteria andZpgwIsNull() {
            addCriterion("zpgw is null");
            return (Criteria) this;
        }

        public Criteria andZpgwIsNotNull() {
            addCriterion("zpgw is not null");
            return (Criteria) this;
        }

        public Criteria andZpgwEqualTo(String value) {
            addCriterion("zpgw =", value, "zpgw");
            return (Criteria) this;
        }

        public Criteria andZpgwNotEqualTo(String value) {
            addCriterion("zpgw <>", value, "zpgw");
            return (Criteria) this;
        }

        public Criteria andZpgwGreaterThan(String value) {
            addCriterion("zpgw >", value, "zpgw");
            return (Criteria) this;
        }

        public Criteria andZpgwGreaterThanOrEqualTo(String value) {
            addCriterion("zpgw >=", value, "zpgw");
            return (Criteria) this;
        }

        public Criteria andZpgwLessThan(String value) {
            addCriterion("zpgw <", value, "zpgw");
            return (Criteria) this;
        }

        public Criteria andZpgwLessThanOrEqualTo(String value) {
            addCriterion("zpgw <=", value, "zpgw");
            return (Criteria) this;
        }

        public Criteria andZpgwLike(String value) {
            addCriterion("zpgw like", value, "zpgw");
            return (Criteria) this;
        }

        public Criteria andZpgwNotLike(String value) {
            addCriterion("zpgw not like", value, "zpgw");
            return (Criteria) this;
        }

        public Criteria andZpgwIn(List<String> values) {
            addCriterion("zpgw in", values, "zpgw");
            return (Criteria) this;
        }

        public Criteria andZpgwNotIn(List<String> values) {
            addCriterion("zpgw not in", values, "zpgw");
            return (Criteria) this;
        }

        public Criteria andZpgwBetween(String value1, String value2) {
            addCriterion("zpgw between", value1, value2, "zpgw");
            return (Criteria) this;
        }

        public Criteria andZpgwNotBetween(String value1, String value2) {
            addCriterion("zpgw not between", value1, value2, "zpgw");
            return (Criteria) this;
        }

        public Criteria andRztjIsNull() {
            addCriterion("rztj is null");
            return (Criteria) this;
        }

        public Criteria andRztjIsNotNull() {
            addCriterion("rztj is not null");
            return (Criteria) this;
        }

        public Criteria andRztjEqualTo(String value) {
            addCriterion("rztj =", value, "rztj");
            return (Criteria) this;
        }

        public Criteria andRztjNotEqualTo(String value) {
            addCriterion("rztj <>", value, "rztj");
            return (Criteria) this;
        }

        public Criteria andRztjGreaterThan(String value) {
            addCriterion("rztj >", value, "rztj");
            return (Criteria) this;
        }

        public Criteria andRztjGreaterThanOrEqualTo(String value) {
            addCriterion("rztj >=", value, "rztj");
            return (Criteria) this;
        }

        public Criteria andRztjLessThan(String value) {
            addCriterion("rztj <", value, "rztj");
            return (Criteria) this;
        }

        public Criteria andRztjLessThanOrEqualTo(String value) {
            addCriterion("rztj <=", value, "rztj");
            return (Criteria) this;
        }

        public Criteria andRztjLike(String value) {
            addCriterion("rztj like", value, "rztj");
            return (Criteria) this;
        }

        public Criteria andRztjNotLike(String value) {
            addCriterion("rztj not like", value, "rztj");
            return (Criteria) this;
        }

        public Criteria andRztjIn(List<String> values) {
            addCriterion("rztj in", values, "rztj");
            return (Criteria) this;
        }

        public Criteria andRztjNotIn(List<String> values) {
            addCriterion("rztj not in", values, "rztj");
            return (Criteria) this;
        }

        public Criteria andRztjBetween(String value1, String value2) {
            addCriterion("rztj between", value1, value2, "rztj");
            return (Criteria) this;
        }

        public Criteria andRztjNotBetween(String value1, String value2) {
            addCriterion("rztj not between", value1, value2, "rztj");
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