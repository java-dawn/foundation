package com.study.foundation.dao1.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillInfoExample() {
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

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Long value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Long value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Long value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Long value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Long value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Long value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Long> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Long> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Long value1, Long value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Long value1, Long value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(Long value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(Long value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(Long value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(Long value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(Long value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(Long value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<Long> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<Long> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(Long value1, Long value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(Long value1, Long value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(String value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(String value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(String value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(String value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(String value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLike(String value) {
            addCriterion("deleted like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotLike(String value) {
            addCriterion("deleted not like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<String> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<String> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(String value1, String value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(String value1, String value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andBillCodeIsNull() {
            addCriterion("bill_code is null");
            return (Criteria) this;
        }

        public Criteria andBillCodeIsNotNull() {
            addCriterion("bill_code is not null");
            return (Criteria) this;
        }

        public Criteria andBillCodeEqualTo(String value) {
            addCriterion("bill_code =", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotEqualTo(String value) {
            addCriterion("bill_code <>", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeGreaterThan(String value) {
            addCriterion("bill_code >", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bill_code >=", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLessThan(String value) {
            addCriterion("bill_code <", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLessThanOrEqualTo(String value) {
            addCriterion("bill_code <=", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLike(String value) {
            addCriterion("bill_code like", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotLike(String value) {
            addCriterion("bill_code not like", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeIn(List<String> values) {
            addCriterion("bill_code in", values, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotIn(List<String> values) {
            addCriterion("bill_code not in", values, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeBetween(String value1, String value2) {
            addCriterion("bill_code between", value1, value2, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotBetween(String value1, String value2) {
            addCriterion("bill_code not between", value1, value2, "billCode");
            return (Criteria) this;
        }

        public Criteria andPacketIdIsNull() {
            addCriterion("packet_id is null");
            return (Criteria) this;
        }

        public Criteria andPacketIdIsNotNull() {
            addCriterion("packet_id is not null");
            return (Criteria) this;
        }

        public Criteria andPacketIdEqualTo(Long value) {
            addCriterion("packet_id =", value, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdNotEqualTo(Long value) {
            addCriterion("packet_id <>", value, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdGreaterThan(Long value) {
            addCriterion("packet_id >", value, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdGreaterThanOrEqualTo(Long value) {
            addCriterion("packet_id >=", value, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdLessThan(Long value) {
            addCriterion("packet_id <", value, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdLessThanOrEqualTo(Long value) {
            addCriterion("packet_id <=", value, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdIn(List<Long> values) {
            addCriterion("packet_id in", values, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdNotIn(List<Long> values) {
            addCriterion("packet_id not in", values, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdBetween(Long value1, Long value2) {
            addCriterion("packet_id between", value1, value2, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdNotBetween(Long value1, Long value2) {
            addCriterion("packet_id not between", value1, value2, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketCodeIsNull() {
            addCriterion("packet_code is null");
            return (Criteria) this;
        }

        public Criteria andPacketCodeIsNotNull() {
            addCriterion("packet_code is not null");
            return (Criteria) this;
        }

        public Criteria andPacketCodeEqualTo(String value) {
            addCriterion("packet_code =", value, "packetCode");
            return (Criteria) this;
        }

        public Criteria andPacketCodeNotEqualTo(String value) {
            addCriterion("packet_code <>", value, "packetCode");
            return (Criteria) this;
        }

        public Criteria andPacketCodeGreaterThan(String value) {
            addCriterion("packet_code >", value, "packetCode");
            return (Criteria) this;
        }

        public Criteria andPacketCodeGreaterThanOrEqualTo(String value) {
            addCriterion("packet_code >=", value, "packetCode");
            return (Criteria) this;
        }

        public Criteria andPacketCodeLessThan(String value) {
            addCriterion("packet_code <", value, "packetCode");
            return (Criteria) this;
        }

        public Criteria andPacketCodeLessThanOrEqualTo(String value) {
            addCriterion("packet_code <=", value, "packetCode");
            return (Criteria) this;
        }

        public Criteria andPacketCodeLike(String value) {
            addCriterion("packet_code like", value, "packetCode");
            return (Criteria) this;
        }

        public Criteria andPacketCodeNotLike(String value) {
            addCriterion("packet_code not like", value, "packetCode");
            return (Criteria) this;
        }

        public Criteria andPacketCodeIn(List<String> values) {
            addCriterion("packet_code in", values, "packetCode");
            return (Criteria) this;
        }

        public Criteria andPacketCodeNotIn(List<String> values) {
            addCriterion("packet_code not in", values, "packetCode");
            return (Criteria) this;
        }

        public Criteria andPacketCodeBetween(String value1, String value2) {
            addCriterion("packet_code between", value1, value2, "packetCode");
            return (Criteria) this;
        }

        public Criteria andPacketCodeNotBetween(String value1, String value2) {
            addCriterion("packet_code not between", value1, value2, "packetCode");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Long value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Long value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Long value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Long value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Long> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Long> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Long value1, Long value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNull() {
            addCriterion("project_code is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("project_code is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(String value) {
            addCriterion("project_code =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(String value) {
            addCriterion("project_code <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(String value) {
            addCriterion("project_code >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("project_code >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(String value) {
            addCriterion("project_code <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("project_code <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLike(String value) {
            addCriterion("project_code like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotLike(String value) {
            addCriterion("project_code not like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<String> values) {
            addCriterion("project_code in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<String> values) {
            addCriterion("project_code not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(String value1, String value2) {
            addCriterion("project_code between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(String value1, String value2) {
            addCriterion("project_code not between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgIdIsNull() {
            addCriterion("company_org_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgIdIsNotNull() {
            addCriterion("company_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgIdEqualTo(Long value) {
            addCriterion("company_org_id =", value, "companyOrgId");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgIdNotEqualTo(Long value) {
            addCriterion("company_org_id <>", value, "companyOrgId");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgIdGreaterThan(Long value) {
            addCriterion("company_org_id >", value, "companyOrgId");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_org_id >=", value, "companyOrgId");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgIdLessThan(Long value) {
            addCriterion("company_org_id <", value, "companyOrgId");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("company_org_id <=", value, "companyOrgId");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgIdIn(List<Long> values) {
            addCriterion("company_org_id in", values, "companyOrgId");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgIdNotIn(List<Long> values) {
            addCriterion("company_org_id not in", values, "companyOrgId");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgIdBetween(Long value1, Long value2) {
            addCriterion("company_org_id between", value1, value2, "companyOrgId");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("company_org_id not between", value1, value2, "companyOrgId");
            return (Criteria) this;
        }

        public Criteria andSecondLendingIdIsNull() {
            addCriterion("second_lending_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondLendingIdIsNotNull() {
            addCriterion("second_lending_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondLendingIdEqualTo(Long value) {
            addCriterion("second_lending_id =", value, "secondLendingId");
            return (Criteria) this;
        }

        public Criteria andSecondLendingIdNotEqualTo(Long value) {
            addCriterion("second_lending_id <>", value, "secondLendingId");
            return (Criteria) this;
        }

        public Criteria andSecondLendingIdGreaterThan(Long value) {
            addCriterion("second_lending_id >", value, "secondLendingId");
            return (Criteria) this;
        }

        public Criteria andSecondLendingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("second_lending_id >=", value, "secondLendingId");
            return (Criteria) this;
        }

        public Criteria andSecondLendingIdLessThan(Long value) {
            addCriterion("second_lending_id <", value, "secondLendingId");
            return (Criteria) this;
        }

        public Criteria andSecondLendingIdLessThanOrEqualTo(Long value) {
            addCriterion("second_lending_id <=", value, "secondLendingId");
            return (Criteria) this;
        }

        public Criteria andSecondLendingIdIn(List<Long> values) {
            addCriterion("second_lending_id in", values, "secondLendingId");
            return (Criteria) this;
        }

        public Criteria andSecondLendingIdNotIn(List<Long> values) {
            addCriterion("second_lending_id not in", values, "secondLendingId");
            return (Criteria) this;
        }

        public Criteria andSecondLendingIdBetween(Long value1, Long value2) {
            addCriterion("second_lending_id between", value1, value2, "secondLendingId");
            return (Criteria) this;
        }

        public Criteria andSecondLendingIdNotBetween(Long value1, Long value2) {
            addCriterion("second_lending_id not between", value1, value2, "secondLendingId");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNull() {
            addCriterion("product_num is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("product_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(String value) {
            addCriterion("product_num =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(String value) {
            addCriterion("product_num <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(String value) {
            addCriterion("product_num >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(String value) {
            addCriterion("product_num >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(String value) {
            addCriterion("product_num <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(String value) {
            addCriterion("product_num <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLike(String value) {
            addCriterion("product_num like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotLike(String value) {
            addCriterion("product_num not like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<String> values) {
            addCriterion("product_num in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<String> values) {
            addCriterion("product_num not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(String value1, String value2) {
            addCriterion("product_num between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(String value1, String value2) {
            addCriterion("product_num not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumIsNull() {
            addCriterion("certificate_num is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumIsNotNull() {
            addCriterion("certificate_num is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumEqualTo(String value) {
            addCriterion("certificate_num =", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotEqualTo(String value) {
            addCriterion("certificate_num <>", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumGreaterThan(String value) {
            addCriterion("certificate_num >", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_num >=", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumLessThan(String value) {
            addCriterion("certificate_num <", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumLessThanOrEqualTo(String value) {
            addCriterion("certificate_num <=", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumLike(String value) {
            addCriterion("certificate_num like", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotLike(String value) {
            addCriterion("certificate_num not like", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumIn(List<String> values) {
            addCriterion("certificate_num in", values, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotIn(List<String> values) {
            addCriterion("certificate_num not in", values, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumBetween(String value1, String value2) {
            addCriterion("certificate_num between", value1, value2, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotBetween(String value1, String value2) {
            addCriterion("certificate_num not between", value1, value2, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andOverdueDayIsNull() {
            addCriterion("overdue_day is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDayIsNotNull() {
            addCriterion("overdue_day is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDayEqualTo(Integer value) {
            addCriterion("overdue_day =", value, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayNotEqualTo(Integer value) {
            addCriterion("overdue_day <>", value, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayGreaterThan(Integer value) {
            addCriterion("overdue_day >", value, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_day >=", value, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayLessThan(Integer value) {
            addCriterion("overdue_day <", value, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_day <=", value, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayIn(List<Integer> values) {
            addCriterion("overdue_day in", values, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayNotIn(List<Integer> values) {
            addCriterion("overdue_day not in", values, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayBetween(Integer value1, Integer value2) {
            addCriterion("overdue_day between", value1, value2, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andOverdueDayNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_day not between", value1, value2, "overdueDay");
            return (Criteria) this;
        }

        public Criteria andBucketIsNull() {
            addCriterion("bucket is null");
            return (Criteria) this;
        }

        public Criteria andBucketIsNotNull() {
            addCriterion("bucket is not null");
            return (Criteria) this;
        }

        public Criteria andBucketEqualTo(String value) {
            addCriterion("bucket =", value, "bucket");
            return (Criteria) this;
        }

        public Criteria andBucketNotEqualTo(String value) {
            addCriterion("bucket <>", value, "bucket");
            return (Criteria) this;
        }

        public Criteria andBucketGreaterThan(String value) {
            addCriterion("bucket >", value, "bucket");
            return (Criteria) this;
        }

        public Criteria andBucketGreaterThanOrEqualTo(String value) {
            addCriterion("bucket >=", value, "bucket");
            return (Criteria) this;
        }

        public Criteria andBucketLessThan(String value) {
            addCriterion("bucket <", value, "bucket");
            return (Criteria) this;
        }

        public Criteria andBucketLessThanOrEqualTo(String value) {
            addCriterion("bucket <=", value, "bucket");
            return (Criteria) this;
        }

        public Criteria andBucketLike(String value) {
            addCriterion("bucket like", value, "bucket");
            return (Criteria) this;
        }

        public Criteria andBucketNotLike(String value) {
            addCriterion("bucket not like", value, "bucket");
            return (Criteria) this;
        }

        public Criteria andBucketIn(List<String> values) {
            addCriterion("bucket in", values, "bucket");
            return (Criteria) this;
        }

        public Criteria andBucketNotIn(List<String> values) {
            addCriterion("bucket not in", values, "bucket");
            return (Criteria) this;
        }

        public Criteria andBucketBetween(String value1, String value2) {
            addCriterion("bucket between", value1, value2, "bucket");
            return (Criteria) this;
        }

        public Criteria andBucketNotBetween(String value1, String value2) {
            addCriterion("bucket not between", value1, value2, "bucket");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesIsNull() {
            addCriterion("bill_batch_times is null");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesIsNotNull() {
            addCriterion("bill_batch_times is not null");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesEqualTo(String value) {
            addCriterion("bill_batch_times =", value, "billBatchTimes");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesNotEqualTo(String value) {
            addCriterion("bill_batch_times <>", value, "billBatchTimes");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesGreaterThan(String value) {
            addCriterion("bill_batch_times >", value, "billBatchTimes");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesGreaterThanOrEqualTo(String value) {
            addCriterion("bill_batch_times >=", value, "billBatchTimes");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesLessThan(String value) {
            addCriterion("bill_batch_times <", value, "billBatchTimes");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesLessThanOrEqualTo(String value) {
            addCriterion("bill_batch_times <=", value, "billBatchTimes");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesLike(String value) {
            addCriterion("bill_batch_times like", value, "billBatchTimes");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesNotLike(String value) {
            addCriterion("bill_batch_times not like", value, "billBatchTimes");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesIn(List<String> values) {
            addCriterion("bill_batch_times in", values, "billBatchTimes");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesNotIn(List<String> values) {
            addCriterion("bill_batch_times not in", values, "billBatchTimes");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesBetween(String value1, String value2) {
            addCriterion("bill_batch_times between", value1, value2, "billBatchTimes");
            return (Criteria) this;
        }

        public Criteria andBillBatchTimesNotBetween(String value1, String value2) {
            addCriterion("bill_batch_times not between", value1, value2, "billBatchTimes");
            return (Criteria) this;
        }

        public Criteria andCommitMoneyIsNull() {
            addCriterion("commit_money is null");
            return (Criteria) this;
        }

        public Criteria andCommitMoneyIsNotNull() {
            addCriterion("commit_money is not null");
            return (Criteria) this;
        }

        public Criteria andCommitMoneyEqualTo(BigDecimal value) {
            addCriterion("commit_money =", value, "commitMoney");
            return (Criteria) this;
        }

        public Criteria andCommitMoneyNotEqualTo(BigDecimal value) {
            addCriterion("commit_money <>", value, "commitMoney");
            return (Criteria) this;
        }

        public Criteria andCommitMoneyGreaterThan(BigDecimal value) {
            addCriterion("commit_money >", value, "commitMoney");
            return (Criteria) this;
        }

        public Criteria andCommitMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commit_money >=", value, "commitMoney");
            return (Criteria) this;
        }

        public Criteria andCommitMoneyLessThan(BigDecimal value) {
            addCriterion("commit_money <", value, "commitMoney");
            return (Criteria) this;
        }

        public Criteria andCommitMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commit_money <=", value, "commitMoney");
            return (Criteria) this;
        }

        public Criteria andCommitMoneyIn(List<BigDecimal> values) {
            addCriterion("commit_money in", values, "commitMoney");
            return (Criteria) this;
        }

        public Criteria andCommitMoneyNotIn(List<BigDecimal> values) {
            addCriterion("commit_money not in", values, "commitMoney");
            return (Criteria) this;
        }

        public Criteria andCommitMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commit_money between", value1, value2, "commitMoney");
            return (Criteria) this;
        }

        public Criteria andCommitMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commit_money not between", value1, value2, "commitMoney");
            return (Criteria) this;
        }

        public Criteria andTotalRepayMoneyIsNull() {
            addCriterion("total_repay_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalRepayMoneyIsNotNull() {
            addCriterion("total_repay_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRepayMoneyEqualTo(BigDecimal value) {
            addCriterion("total_repay_money =", value, "totalRepayMoney");
            return (Criteria) this;
        }

        public Criteria andTotalRepayMoneyNotEqualTo(BigDecimal value) {
            addCriterion("total_repay_money <>", value, "totalRepayMoney");
            return (Criteria) this;
        }

        public Criteria andTotalRepayMoneyGreaterThan(BigDecimal value) {
            addCriterion("total_repay_money >", value, "totalRepayMoney");
            return (Criteria) this;
        }

        public Criteria andTotalRepayMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_repay_money >=", value, "totalRepayMoney");
            return (Criteria) this;
        }

        public Criteria andTotalRepayMoneyLessThan(BigDecimal value) {
            addCriterion("total_repay_money <", value, "totalRepayMoney");
            return (Criteria) this;
        }

        public Criteria andTotalRepayMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_repay_money <=", value, "totalRepayMoney");
            return (Criteria) this;
        }

        public Criteria andTotalRepayMoneyIn(List<BigDecimal> values) {
            addCriterion("total_repay_money in", values, "totalRepayMoney");
            return (Criteria) this;
        }

        public Criteria andTotalRepayMoneyNotIn(List<BigDecimal> values) {
            addCriterion("total_repay_money not in", values, "totalRepayMoney");
            return (Criteria) this;
        }

        public Criteria andTotalRepayMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_repay_money between", value1, value2, "totalRepayMoney");
            return (Criteria) this;
        }

        public Criteria andTotalRepayMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_repay_money not between", value1, value2, "totalRepayMoney");
            return (Criteria) this;
        }

        public Criteria andLatestCommitMoneyIsNull() {
            addCriterion("latest_commit_money is null");
            return (Criteria) this;
        }

        public Criteria andLatestCommitMoneyIsNotNull() {
            addCriterion("latest_commit_money is not null");
            return (Criteria) this;
        }

        public Criteria andLatestCommitMoneyEqualTo(BigDecimal value) {
            addCriterion("latest_commit_money =", value, "latestCommitMoney");
            return (Criteria) this;
        }

        public Criteria andLatestCommitMoneyNotEqualTo(BigDecimal value) {
            addCriterion("latest_commit_money <>", value, "latestCommitMoney");
            return (Criteria) this;
        }

        public Criteria andLatestCommitMoneyGreaterThan(BigDecimal value) {
            addCriterion("latest_commit_money >", value, "latestCommitMoney");
            return (Criteria) this;
        }

        public Criteria andLatestCommitMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_commit_money >=", value, "latestCommitMoney");
            return (Criteria) this;
        }

        public Criteria andLatestCommitMoneyLessThan(BigDecimal value) {
            addCriterion("latest_commit_money <", value, "latestCommitMoney");
            return (Criteria) this;
        }

        public Criteria andLatestCommitMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_commit_money <=", value, "latestCommitMoney");
            return (Criteria) this;
        }

        public Criteria andLatestCommitMoneyIn(List<BigDecimal> values) {
            addCriterion("latest_commit_money in", values, "latestCommitMoney");
            return (Criteria) this;
        }

        public Criteria andLatestCommitMoneyNotIn(List<BigDecimal> values) {
            addCriterion("latest_commit_money not in", values, "latestCommitMoney");
            return (Criteria) this;
        }

        public Criteria andLatestCommitMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_commit_money between", value1, value2, "latestCommitMoney");
            return (Criteria) this;
        }

        public Criteria andLatestCommitMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_commit_money not between", value1, value2, "latestCommitMoney");
            return (Criteria) this;
        }

        public Criteria andLatestDebtMoneyIsNull() {
            addCriterion("latest_debt_money is null");
            return (Criteria) this;
        }

        public Criteria andLatestDebtMoneyIsNotNull() {
            addCriterion("latest_debt_money is not null");
            return (Criteria) this;
        }

        public Criteria andLatestDebtMoneyEqualTo(BigDecimal value) {
            addCriterion("latest_debt_money =", value, "latestDebtMoney");
            return (Criteria) this;
        }

        public Criteria andLatestDebtMoneyNotEqualTo(BigDecimal value) {
            addCriterion("latest_debt_money <>", value, "latestDebtMoney");
            return (Criteria) this;
        }

        public Criteria andLatestDebtMoneyGreaterThan(BigDecimal value) {
            addCriterion("latest_debt_money >", value, "latestDebtMoney");
            return (Criteria) this;
        }

        public Criteria andLatestDebtMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_debt_money >=", value, "latestDebtMoney");
            return (Criteria) this;
        }

        public Criteria andLatestDebtMoneyLessThan(BigDecimal value) {
            addCriterion("latest_debt_money <", value, "latestDebtMoney");
            return (Criteria) this;
        }

        public Criteria andLatestDebtMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latest_debt_money <=", value, "latestDebtMoney");
            return (Criteria) this;
        }

        public Criteria andLatestDebtMoneyIn(List<BigDecimal> values) {
            addCriterion("latest_debt_money in", values, "latestDebtMoney");
            return (Criteria) this;
        }

        public Criteria andLatestDebtMoneyNotIn(List<BigDecimal> values) {
            addCriterion("latest_debt_money not in", values, "latestDebtMoney");
            return (Criteria) this;
        }

        public Criteria andLatestDebtMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_debt_money between", value1, value2, "latestDebtMoney");
            return (Criteria) this;
        }

        public Criteria andLatestDebtMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latest_debt_money not between", value1, value2, "latestDebtMoney");
            return (Criteria) this;
        }

        public Criteria andCommitDateIsNull() {
            addCriterion("commit_date is null");
            return (Criteria) this;
        }

        public Criteria andCommitDateIsNotNull() {
            addCriterion("commit_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommitDateEqualTo(Date value) {
            addCriterion("commit_date =", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateNotEqualTo(Date value) {
            addCriterion("commit_date <>", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateGreaterThan(Date value) {
            addCriterion("commit_date >", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("commit_date >=", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateLessThan(Date value) {
            addCriterion("commit_date <", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateLessThanOrEqualTo(Date value) {
            addCriterion("commit_date <=", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateIn(List<Date> values) {
            addCriterion("commit_date in", values, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateNotIn(List<Date> values) {
            addCriterion("commit_date not in", values, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateBetween(Date value1, Date value2) {
            addCriterion("commit_date between", value1, value2, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateNotBetween(Date value1, Date value2) {
            addCriterion("commit_date not between", value1, value2, "commitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateIsNull() {
            addCriterion("limit_date is null");
            return (Criteria) this;
        }

        public Criteria andLimitDateIsNotNull() {
            addCriterion("limit_date is not null");
            return (Criteria) this;
        }

        public Criteria andLimitDateEqualTo(Date value) {
            addCriterion("limit_date =", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotEqualTo(Date value) {
            addCriterion("limit_date <>", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateGreaterThan(Date value) {
            addCriterion("limit_date >", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("limit_date >=", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLessThan(Date value) {
            addCriterion("limit_date <", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLessThanOrEqualTo(Date value) {
            addCriterion("limit_date <=", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateIn(List<Date> values) {
            addCriterion("limit_date in", values, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotIn(List<Date> values) {
            addCriterion("limit_date not in", values, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateBetween(Date value1, Date value2) {
            addCriterion("limit_date between", value1, value2, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotBetween(Date value1, Date value2) {
            addCriterion("limit_date not between", value1, value2, "limitDate");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIdIsNull() {
            addCriterion("case_area_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIdIsNotNull() {
            addCriterion("case_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIdEqualTo(Long value) {
            addCriterion("case_area_id =", value, "caseAreaId");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIdNotEqualTo(Long value) {
            addCriterion("case_area_id <>", value, "caseAreaId");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIdGreaterThan(Long value) {
            addCriterion("case_area_id >", value, "caseAreaId");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("case_area_id >=", value, "caseAreaId");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIdLessThan(Long value) {
            addCriterion("case_area_id <", value, "caseAreaId");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("case_area_id <=", value, "caseAreaId");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIdIn(List<Long> values) {
            addCriterion("case_area_id in", values, "caseAreaId");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIdNotIn(List<Long> values) {
            addCriterion("case_area_id not in", values, "caseAreaId");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIdBetween(Long value1, Long value2) {
            addCriterion("case_area_id between", value1, value2, "caseAreaId");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("case_area_id not between", value1, value2, "caseAreaId");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIsNull() {
            addCriterion("case_area is null");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIsNotNull() {
            addCriterion("case_area is not null");
            return (Criteria) this;
        }

        public Criteria andCaseAreaEqualTo(String value) {
            addCriterion("case_area =", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaNotEqualTo(String value) {
            addCriterion("case_area <>", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaGreaterThan(String value) {
            addCriterion("case_area >", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaGreaterThanOrEqualTo(String value) {
            addCriterion("case_area >=", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaLessThan(String value) {
            addCriterion("case_area <", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaLessThanOrEqualTo(String value) {
            addCriterion("case_area <=", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaLike(String value) {
            addCriterion("case_area like", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaNotLike(String value) {
            addCriterion("case_area not like", value, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaIn(List<String> values) {
            addCriterion("case_area in", values, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaNotIn(List<String> values) {
            addCriterion("case_area not in", values, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaBetween(String value1, String value2) {
            addCriterion("case_area between", value1, value2, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCaseAreaNotBetween(String value1, String value2) {
            addCriterion("case_area not between", value1, value2, "caseArea");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andBillDaysIsNull() {
            addCriterion("bill_days is null");
            return (Criteria) this;
        }

        public Criteria andBillDaysIsNotNull() {
            addCriterion("bill_days is not null");
            return (Criteria) this;
        }

        public Criteria andBillDaysEqualTo(Integer value) {
            addCriterion("bill_days =", value, "billDays");
            return (Criteria) this;
        }

        public Criteria andBillDaysNotEqualTo(Integer value) {
            addCriterion("bill_days <>", value, "billDays");
            return (Criteria) this;
        }

        public Criteria andBillDaysGreaterThan(Integer value) {
            addCriterion("bill_days >", value, "billDays");
            return (Criteria) this;
        }

        public Criteria andBillDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_days >=", value, "billDays");
            return (Criteria) this;
        }

        public Criteria andBillDaysLessThan(Integer value) {
            addCriterion("bill_days <", value, "billDays");
            return (Criteria) this;
        }

        public Criteria andBillDaysLessThanOrEqualTo(Integer value) {
            addCriterion("bill_days <=", value, "billDays");
            return (Criteria) this;
        }

        public Criteria andBillDaysIn(List<Integer> values) {
            addCriterion("bill_days in", values, "billDays");
            return (Criteria) this;
        }

        public Criteria andBillDaysNotIn(List<Integer> values) {
            addCriterion("bill_days not in", values, "billDays");
            return (Criteria) this;
        }

        public Criteria andBillDaysBetween(Integer value1, Integer value2) {
            addCriterion("bill_days between", value1, value2, "billDays");
            return (Criteria) this;
        }

        public Criteria andBillDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_days not between", value1, value2, "billDays");
            return (Criteria) this;
        }

        public Criteria andFollowDateIsNull() {
            addCriterion("follow_date is null");
            return (Criteria) this;
        }

        public Criteria andFollowDateIsNotNull() {
            addCriterion("follow_date is not null");
            return (Criteria) this;
        }

        public Criteria andFollowDateEqualTo(Date value) {
            addCriterion("follow_date =", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateNotEqualTo(Date value) {
            addCriterion("follow_date <>", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateGreaterThan(Date value) {
            addCriterion("follow_date >", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateGreaterThanOrEqualTo(Date value) {
            addCriterion("follow_date >=", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateLessThan(Date value) {
            addCriterion("follow_date <", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateLessThanOrEqualTo(Date value) {
            addCriterion("follow_date <=", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateIn(List<Date> values) {
            addCriterion("follow_date in", values, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateNotIn(List<Date> values) {
            addCriterion("follow_date not in", values, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateBetween(Date value1, Date value2) {
            addCriterion("follow_date between", value1, value2, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateNotBetween(Date value1, Date value2) {
            addCriterion("follow_date not between", value1, value2, "followDate");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNull() {
            addCriterion("bill_status is null");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("bill_status is not null");
            return (Criteria) this;
        }

        public Criteria andBillStatusEqualTo(String value) {
            addCriterion("bill_status =", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotEqualTo(String value) {
            addCriterion("bill_status <>", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThan(String value) {
            addCriterion("bill_status >", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(String value) {
            addCriterion("bill_status >=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThan(String value) {
            addCriterion("bill_status <", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(String value) {
            addCriterion("bill_status <=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLike(String value) {
            addCriterion("bill_status like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotLike(String value) {
            addCriterion("bill_status not like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIn(List<String> values) {
            addCriterion("bill_status in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotIn(List<String> values) {
            addCriterion("bill_status not in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusBetween(String value1, String value2) {
            addCriterion("bill_status between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotBetween(String value1, String value2) {
            addCriterion("bill_status not between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusIsNull() {
            addCriterion("bill_repay_status is null");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusIsNotNull() {
            addCriterion("bill_repay_status is not null");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusEqualTo(String value) {
            addCriterion("bill_repay_status =", value, "billRepayStatus");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusNotEqualTo(String value) {
            addCriterion("bill_repay_status <>", value, "billRepayStatus");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusGreaterThan(String value) {
            addCriterion("bill_repay_status >", value, "billRepayStatus");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("bill_repay_status >=", value, "billRepayStatus");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusLessThan(String value) {
            addCriterion("bill_repay_status <", value, "billRepayStatus");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusLessThanOrEqualTo(String value) {
            addCriterion("bill_repay_status <=", value, "billRepayStatus");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusLike(String value) {
            addCriterion("bill_repay_status like", value, "billRepayStatus");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusNotLike(String value) {
            addCriterion("bill_repay_status not like", value, "billRepayStatus");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusIn(List<String> values) {
            addCriterion("bill_repay_status in", values, "billRepayStatus");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusNotIn(List<String> values) {
            addCriterion("bill_repay_status not in", values, "billRepayStatus");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusBetween(String value1, String value2) {
            addCriterion("bill_repay_status between", value1, value2, "billRepayStatus");
            return (Criteria) this;
        }

        public Criteria andBillRepayStatusNotBetween(String value1, String value2) {
            addCriterion("bill_repay_status not between", value1, value2, "billRepayStatus");
            return (Criteria) this;
        }

        public Criteria andBillClassifyIdIsNull() {
            addCriterion("bill_classify_id is null");
            return (Criteria) this;
        }

        public Criteria andBillClassifyIdIsNotNull() {
            addCriterion("bill_classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillClassifyIdEqualTo(Long value) {
            addCriterion("bill_classify_id =", value, "billClassifyId");
            return (Criteria) this;
        }

        public Criteria andBillClassifyIdNotEqualTo(Long value) {
            addCriterion("bill_classify_id <>", value, "billClassifyId");
            return (Criteria) this;
        }

        public Criteria andBillClassifyIdGreaterThan(Long value) {
            addCriterion("bill_classify_id >", value, "billClassifyId");
            return (Criteria) this;
        }

        public Criteria andBillClassifyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bill_classify_id >=", value, "billClassifyId");
            return (Criteria) this;
        }

        public Criteria andBillClassifyIdLessThan(Long value) {
            addCriterion("bill_classify_id <", value, "billClassifyId");
            return (Criteria) this;
        }

        public Criteria andBillClassifyIdLessThanOrEqualTo(Long value) {
            addCriterion("bill_classify_id <=", value, "billClassifyId");
            return (Criteria) this;
        }

        public Criteria andBillClassifyIdIn(List<Long> values) {
            addCriterion("bill_classify_id in", values, "billClassifyId");
            return (Criteria) this;
        }

        public Criteria andBillClassifyIdNotIn(List<Long> values) {
            addCriterion("bill_classify_id not in", values, "billClassifyId");
            return (Criteria) this;
        }

        public Criteria andBillClassifyIdBetween(Long value1, Long value2) {
            addCriterion("bill_classify_id between", value1, value2, "billClassifyId");
            return (Criteria) this;
        }

        public Criteria andBillClassifyIdNotBetween(Long value1, Long value2) {
            addCriterion("bill_classify_id not between", value1, value2, "billClassifyId");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIsNull() {
            addCriterion("collection_type is null");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIsNotNull() {
            addCriterion("collection_type is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeEqualTo(String value) {
            addCriterion("collection_type =", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotEqualTo(String value) {
            addCriterion("collection_type <>", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeGreaterThan(String value) {
            addCriterion("collection_type >", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("collection_type >=", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeLessThan(String value) {
            addCriterion("collection_type <", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeLessThanOrEqualTo(String value) {
            addCriterion("collection_type <=", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeLike(String value) {
            addCriterion("collection_type like", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotLike(String value) {
            addCriterion("collection_type not like", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIn(List<String> values) {
            addCriterion("collection_type in", values, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotIn(List<String> values) {
            addCriterion("collection_type not in", values, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeBetween(String value1, String value2) {
            addCriterion("collection_type between", value1, value2, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotBetween(String value1, String value2) {
            addCriterion("collection_type not between", value1, value2, "collectionType");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Long value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Long value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Long value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Long value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Long> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Long> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Long value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Long value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Long value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Long value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Long value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Long> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Long> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Long value1, Long value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Long value1, Long value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andBeginColDateIsNull() {
            addCriterion("begin_col_date is null");
            return (Criteria) this;
        }

        public Criteria andBeginColDateIsNotNull() {
            addCriterion("begin_col_date is not null");
            return (Criteria) this;
        }

        public Criteria andBeginColDateEqualTo(Date value) {
            addCriterion("begin_col_date =", value, "beginColDate");
            return (Criteria) this;
        }

        public Criteria andBeginColDateNotEqualTo(Date value) {
            addCriterion("begin_col_date <>", value, "beginColDate");
            return (Criteria) this;
        }

        public Criteria andBeginColDateGreaterThan(Date value) {
            addCriterion("begin_col_date >", value, "beginColDate");
            return (Criteria) this;
        }

        public Criteria andBeginColDateGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_col_date >=", value, "beginColDate");
            return (Criteria) this;
        }

        public Criteria andBeginColDateLessThan(Date value) {
            addCriterion("begin_col_date <", value, "beginColDate");
            return (Criteria) this;
        }

        public Criteria andBeginColDateLessThanOrEqualTo(Date value) {
            addCriterion("begin_col_date <=", value, "beginColDate");
            return (Criteria) this;
        }

        public Criteria andBeginColDateIn(List<Date> values) {
            addCriterion("begin_col_date in", values, "beginColDate");
            return (Criteria) this;
        }

        public Criteria andBeginColDateNotIn(List<Date> values) {
            addCriterion("begin_col_date not in", values, "beginColDate");
            return (Criteria) this;
        }

        public Criteria andBeginColDateBetween(Date value1, Date value2) {
            addCriterion("begin_col_date between", value1, value2, "beginColDate");
            return (Criteria) this;
        }

        public Criteria andBeginColDateNotBetween(Date value1, Date value2) {
            addCriterion("begin_col_date not between", value1, value2, "beginColDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateIsNull() {
            addCriterion("allot_date is null");
            return (Criteria) this;
        }

        public Criteria andAllotDateIsNotNull() {
            addCriterion("allot_date is not null");
            return (Criteria) this;
        }

        public Criteria andAllotDateEqualTo(Date value) {
            addCriterion("allot_date =", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateNotEqualTo(Date value) {
            addCriterion("allot_date <>", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateGreaterThan(Date value) {
            addCriterion("allot_date >", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateGreaterThanOrEqualTo(Date value) {
            addCriterion("allot_date >=", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateLessThan(Date value) {
            addCriterion("allot_date <", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateLessThanOrEqualTo(Date value) {
            addCriterion("allot_date <=", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateIn(List<Date> values) {
            addCriterion("allot_date in", values, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateNotIn(List<Date> values) {
            addCriterion("allot_date not in", values, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateBetween(Date value1, Date value2) {
            addCriterion("allot_date between", value1, value2, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateNotBetween(Date value1, Date value2) {
            addCriterion("allot_date not between", value1, value2, "allotDate");
            return (Criteria) this;
        }

        public Criteria andDeAgentIdIsNull() {
            addCriterion("de_agent_id is null");
            return (Criteria) this;
        }

        public Criteria andDeAgentIdIsNotNull() {
            addCriterion("de_agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeAgentIdEqualTo(Long value) {
            addCriterion("de_agent_id =", value, "deAgentId");
            return (Criteria) this;
        }

        public Criteria andDeAgentIdNotEqualTo(Long value) {
            addCriterion("de_agent_id <>", value, "deAgentId");
            return (Criteria) this;
        }

        public Criteria andDeAgentIdGreaterThan(Long value) {
            addCriterion("de_agent_id >", value, "deAgentId");
            return (Criteria) this;
        }

        public Criteria andDeAgentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("de_agent_id >=", value, "deAgentId");
            return (Criteria) this;
        }

        public Criteria andDeAgentIdLessThan(Long value) {
            addCriterion("de_agent_id <", value, "deAgentId");
            return (Criteria) this;
        }

        public Criteria andDeAgentIdLessThanOrEqualTo(Long value) {
            addCriterion("de_agent_id <=", value, "deAgentId");
            return (Criteria) this;
        }

        public Criteria andDeAgentIdIn(List<Long> values) {
            addCriterion("de_agent_id in", values, "deAgentId");
            return (Criteria) this;
        }

        public Criteria andDeAgentIdNotIn(List<Long> values) {
            addCriterion("de_agent_id not in", values, "deAgentId");
            return (Criteria) this;
        }

        public Criteria andDeAgentIdBetween(Long value1, Long value2) {
            addCriterion("de_agent_id between", value1, value2, "deAgentId");
            return (Criteria) this;
        }

        public Criteria andDeAgentIdNotBetween(Long value1, Long value2) {
            addCriterion("de_agent_id not between", value1, value2, "deAgentId");
            return (Criteria) this;
        }
    }

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