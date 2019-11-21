package com.study.foundation.dao2.model;

import java.util.ArrayList;
import java.util.List;

public class ConstantPoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConstantPoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIsNull() {
            addCriterion("constant_type is null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIsNotNull() {
            addCriterion("constant_type is not null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeEqualTo(String value) {
            addCriterion("constant_type =", value, "constantType");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNotEqualTo(String value) {
            addCriterion("constant_type <>", value, "constantType");
            return (Criteria) this;
        }

        public Criteria andConstantTypeGreaterThan(String value) {
            addCriterion("constant_type >", value, "constantType");
            return (Criteria) this;
        }

        public Criteria andConstantTypeGreaterThanOrEqualTo(String value) {
            addCriterion("constant_type >=", value, "constantType");
            return (Criteria) this;
        }

        public Criteria andConstantTypeLessThan(String value) {
            addCriterion("constant_type <", value, "constantType");
            return (Criteria) this;
        }

        public Criteria andConstantTypeLessThanOrEqualTo(String value) {
            addCriterion("constant_type <=", value, "constantType");
            return (Criteria) this;
        }

        public Criteria andConstantTypeLike(String value) {
            addCriterion("constant_type like", value, "constantType");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNotLike(String value) {
            addCriterion("constant_type not like", value, "constantType");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIn(List<String> values) {
            addCriterion("constant_type in", values, "constantType");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNotIn(List<String> values) {
            addCriterion("constant_type not in", values, "constantType");
            return (Criteria) this;
        }

        public Criteria andConstantTypeBetween(String value1, String value2) {
            addCriterion("constant_type between", value1, value2, "constantType");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNotBetween(String value1, String value2) {
            addCriterion("constant_type not between", value1, value2, "constantType");
            return (Criteria) this;
        }

        public Criteria andConstantValueIsNull() {
            addCriterion("constant_value is null");
            return (Criteria) this;
        }

        public Criteria andConstantValueIsNotNull() {
            addCriterion("constant_value is not null");
            return (Criteria) this;
        }

        public Criteria andConstantValueEqualTo(String value) {
            addCriterion("constant_value =", value, "constantValue");
            return (Criteria) this;
        }

        public Criteria andConstantValueNotEqualTo(String value) {
            addCriterion("constant_value <>", value, "constantValue");
            return (Criteria) this;
        }

        public Criteria andConstantValueGreaterThan(String value) {
            addCriterion("constant_value >", value, "constantValue");
            return (Criteria) this;
        }

        public Criteria andConstantValueGreaterThanOrEqualTo(String value) {
            addCriterion("constant_value >=", value, "constantValue");
            return (Criteria) this;
        }

        public Criteria andConstantValueLessThan(String value) {
            addCriterion("constant_value <", value, "constantValue");
            return (Criteria) this;
        }

        public Criteria andConstantValueLessThanOrEqualTo(String value) {
            addCriterion("constant_value <=", value, "constantValue");
            return (Criteria) this;
        }

        public Criteria andConstantValueLike(String value) {
            addCriterion("constant_value like", value, "constantValue");
            return (Criteria) this;
        }

        public Criteria andConstantValueNotLike(String value) {
            addCriterion("constant_value not like", value, "constantValue");
            return (Criteria) this;
        }

        public Criteria andConstantValueIn(List<String> values) {
            addCriterion("constant_value in", values, "constantValue");
            return (Criteria) this;
        }

        public Criteria andConstantValueNotIn(List<String> values) {
            addCriterion("constant_value not in", values, "constantValue");
            return (Criteria) this;
        }

        public Criteria andConstantValueBetween(String value1, String value2) {
            addCriterion("constant_value between", value1, value2, "constantValue");
            return (Criteria) this;
        }

        public Criteria andConstantValueNotBetween(String value1, String value2) {
            addCriterion("constant_value not between", value1, value2, "constantValue");
            return (Criteria) this;
        }

        public Criteria andConstantNameIsNull() {
            addCriterion("constant_name is null");
            return (Criteria) this;
        }

        public Criteria andConstantNameIsNotNull() {
            addCriterion("constant_name is not null");
            return (Criteria) this;
        }

        public Criteria andConstantNameEqualTo(String value) {
            addCriterion("constant_name =", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotEqualTo(String value) {
            addCriterion("constant_name <>", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameGreaterThan(String value) {
            addCriterion("constant_name >", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameGreaterThanOrEqualTo(String value) {
            addCriterion("constant_name >=", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameLessThan(String value) {
            addCriterion("constant_name <", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameLessThanOrEqualTo(String value) {
            addCriterion("constant_name <=", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameLike(String value) {
            addCriterion("constant_name like", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotLike(String value) {
            addCriterion("constant_name not like", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameIn(List<String> values) {
            addCriterion("constant_name in", values, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotIn(List<String> values) {
            addCriterion("constant_name not in", values, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameBetween(String value1, String value2) {
            addCriterion("constant_name between", value1, value2, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotBetween(String value1, String value2) {
            addCriterion("constant_name not between", value1, value2, "constantName");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
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