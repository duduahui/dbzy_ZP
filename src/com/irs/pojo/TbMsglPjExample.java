package com.irs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbMsglPjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TbMsglPjExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andGzidIsNull() {
            addCriterion("gzid is null");
            return (Criteria) this;
        }

        public Criteria andGzidIsNotNull() {
            addCriterion("gzid is not null");
            return (Criteria) this;
        }

        public Criteria andGzidEqualTo(String value) {
            addCriterion("gzid =", value, "gzid");
            return (Criteria) this;
        }

        public Criteria andGzidNotEqualTo(String value) {
            addCriterion("gzid <>", value, "gzid");
            return (Criteria) this;
        }

        public Criteria andGzidGreaterThan(String value) {
            addCriterion("gzid >", value, "gzid");
            return (Criteria) this;
        }

        public Criteria andGzidGreaterThanOrEqualTo(String value) {
            addCriterion("gzid >=", value, "gzid");
            return (Criteria) this;
        }

        public Criteria andGzidLessThan(String value) {
            addCriterion("gzid <", value, "gzid");
            return (Criteria) this;
        }

        public Criteria andGzidLessThanOrEqualTo(String value) {
            addCriterion("gzid <=", value, "gzid");
            return (Criteria) this;
        }

        public Criteria andGzidLike(String value) {
            addCriterion("gzid like", value, "gzid");
            return (Criteria) this;
        }

        public Criteria andGzidNotLike(String value) {
            addCriterion("gzid not like", value, "gzid");
            return (Criteria) this;
        }

        public Criteria andGzidIn(List<String> values) {
            addCriterion("gzid in", values, "gzid");
            return (Criteria) this;
        }

        public Criteria andGzidNotIn(List<String> values) {
            addCriterion("gzid not in", values, "gzid");
            return (Criteria) this;
        }

        public Criteria andGzidBetween(String value1, String value2) {
            addCriterion("gzid between", value1, value2, "gzid");
            return (Criteria) this;
        }

        public Criteria andGzidNotBetween(String value1, String value2) {
            addCriterion("gzid not between", value1, value2, "gzid");
            return (Criteria) this;
        }

        public Criteria andPjnameIsNull() {
            addCriterion("pjname is null");
            return (Criteria) this;
        }

        public Criteria andPjnameIsNotNull() {
            addCriterion("pjname is not null");
            return (Criteria) this;
        }

        public Criteria andPjnameEqualTo(String value) {
            addCriterion("pjname =", value, "pjname");
            return (Criteria) this;
        }

        public Criteria andPjnameNotEqualTo(String value) {
            addCriterion("pjname <>", value, "pjname");
            return (Criteria) this;
        }

        public Criteria andPjnameGreaterThan(String value) {
            addCriterion("pjname >", value, "pjname");
            return (Criteria) this;
        }

        public Criteria andPjnameGreaterThanOrEqualTo(String value) {
            addCriterion("pjname >=", value, "pjname");
            return (Criteria) this;
        }

        public Criteria andPjnameLessThan(String value) {
            addCriterion("pjname <", value, "pjname");
            return (Criteria) this;
        }

        public Criteria andPjnameLessThanOrEqualTo(String value) {
            addCriterion("pjname <=", value, "pjname");
            return (Criteria) this;
        }

        public Criteria andPjnameLike(String value) {
            addCriterion("pjname like", value, "pjname");
            return (Criteria) this;
        }

        public Criteria andPjnameNotLike(String value) {
            addCriterion("pjname not like", value, "pjname");
            return (Criteria) this;
        }

        public Criteria andPjnameIn(List<String> values) {
            addCriterion("pjname in", values, "pjname");
            return (Criteria) this;
        }

        public Criteria andPjnameNotIn(List<String> values) {
            addCriterion("pjname not in", values, "pjname");
            return (Criteria) this;
        }

        public Criteria andPjnameBetween(String value1, String value2) {
            addCriterion("pjname between", value1, value2, "pjname");
            return (Criteria) this;
        }

        public Criteria andPjnameNotBetween(String value1, String value2) {
            addCriterion("pjname not between", value1, value2, "pjname");
            return (Criteria) this;
        }

        public Criteria andPjdescIsNull() {
            addCriterion("pjdesc is null");
            return (Criteria) this;
        }

        public Criteria andPjdescIsNotNull() {
            addCriterion("pjdesc is not null");
            return (Criteria) this;
        }

        public Criteria andPjdescEqualTo(String value) {
            addCriterion("pjdesc =", value, "pjdesc");
            return (Criteria) this;
        }

        public Criteria andPjdescNotEqualTo(String value) {
            addCriterion("pjdesc <>", value, "pjdesc");
            return (Criteria) this;
        }

        public Criteria andPjdescGreaterThan(String value) {
            addCriterion("pjdesc >", value, "pjdesc");
            return (Criteria) this;
        }

        public Criteria andPjdescGreaterThanOrEqualTo(String value) {
            addCriterion("pjdesc >=", value, "pjdesc");
            return (Criteria) this;
        }

        public Criteria andPjdescLessThan(String value) {
            addCriterion("pjdesc <", value, "pjdesc");
            return (Criteria) this;
        }

        public Criteria andPjdescLessThanOrEqualTo(String value) {
            addCriterion("pjdesc <=", value, "pjdesc");
            return (Criteria) this;
        }

        public Criteria andPjdescLike(String value) {
            addCriterion("pjdesc like", value, "pjdesc");
            return (Criteria) this;
        }

        public Criteria andPjdescNotLike(String value) {
            addCriterion("pjdesc not like", value, "pjdesc");
            return (Criteria) this;
        }

        public Criteria andPjdescIn(List<String> values) {
            addCriterion("pjdesc in", values, "pjdesc");
            return (Criteria) this;
        }

        public Criteria andPjdescNotIn(List<String> values) {
            addCriterion("pjdesc not in", values, "pjdesc");
            return (Criteria) this;
        }

        public Criteria andPjdescBetween(String value1, String value2) {
            addCriterion("pjdesc between", value1, value2, "pjdesc");
            return (Criteria) this;
        }

        public Criteria andPjdescNotBetween(String value1, String value2) {
            addCriterion("pjdesc not between", value1, value2, "pjdesc");
            return (Criteria) this;
        }

        public Criteria andPjstatusIsNull() {
            addCriterion("pjstatus is null");
            return (Criteria) this;
        }

        public Criteria andPjstatusIsNotNull() {
            addCriterion("pjstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPjstatusEqualTo(String value) {
            addCriterion("pjstatus =", value, "pjstatus");
            return (Criteria) this;
        }

        public Criteria andPjstatusNotEqualTo(String value) {
            addCriterion("pjstatus <>", value, "pjstatus");
            return (Criteria) this;
        }

        public Criteria andPjstatusGreaterThan(String value) {
            addCriterion("pjstatus >", value, "pjstatus");
            return (Criteria) this;
        }

        public Criteria andPjstatusGreaterThanOrEqualTo(String value) {
            addCriterion("pjstatus >=", value, "pjstatus");
            return (Criteria) this;
        }

        public Criteria andPjstatusLessThan(String value) {
            addCriterion("pjstatus <", value, "pjstatus");
            return (Criteria) this;
        }

        public Criteria andPjstatusLessThanOrEqualTo(String value) {
            addCriterion("pjstatus <=", value, "pjstatus");
            return (Criteria) this;
        }

        public Criteria andPjstatusLike(String value) {
            addCriterion("pjstatus like", value, "pjstatus");
            return (Criteria) this;
        }

        public Criteria andPjstatusNotLike(String value) {
            addCriterion("pjstatus not like", value, "pjstatus");
            return (Criteria) this;
        }

        public Criteria andPjstatusIn(List<String> values) {
            addCriterion("pjstatus in", values, "pjstatus");
            return (Criteria) this;
        }

        public Criteria andPjstatusNotIn(List<String> values) {
            addCriterion("pjstatus not in", values, "pjstatus");
            return (Criteria) this;
        }

        public Criteria andPjstatusBetween(String value1, String value2) {
            addCriterion("pjstatus between", value1, value2, "pjstatus");
            return (Criteria) this;
        }

        public Criteria andPjstatusNotBetween(String value1, String value2) {
            addCriterion("pjstatus not between", value1, value2, "pjstatus");
            return (Criteria) this;
        }

        public Criteria andPjdateIsNull() {
            addCriterion("pjdate is null");
            return (Criteria) this;
        }

        public Criteria andPjdateIsNotNull() {
            addCriterion("pjdate is not null");
            return (Criteria) this;
        }

        public Criteria andPjdateEqualTo(Date value) {
            addCriterionForJDBCDate("pjdate =", value, "pjdate");
            return (Criteria) this;
        }

        public Criteria andPjdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pjdate <>", value, "pjdate");
            return (Criteria) this;
        }

        public Criteria andPjdateGreaterThan(Date value) {
            addCriterionForJDBCDate("pjdate >", value, "pjdate");
            return (Criteria) this;
        }

        public Criteria andPjdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pjdate >=", value, "pjdate");
            return (Criteria) this;
        }

        public Criteria andPjdateLessThan(Date value) {
            addCriterionForJDBCDate("pjdate <", value, "pjdate");
            return (Criteria) this;
        }

        public Criteria andPjdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pjdate <=", value, "pjdate");
            return (Criteria) this;
        }

        public Criteria andPjdateIn(List<Date> values) {
            addCriterionForJDBCDate("pjdate in", values, "pjdate");
            return (Criteria) this;
        }

        public Criteria andPjdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pjdate not in", values, "pjdate");
            return (Criteria) this;
        }

        public Criteria andPjdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pjdate between", value1, value2, "pjdate");
            return (Criteria) this;
        }

        public Criteria andPjdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pjdate not between", value1, value2, "pjdate");
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