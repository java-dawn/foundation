package com.study.foundation.dao1.model;

import java.math.BigDecimal;
import java.util.Date;

public class BillInfo {
    private Long id;

    private Date created;

    private Long creator;

    private Date updated;

    private Long modifier;

    private String deleted;

    private String billCode;

    private Long packetId;

    private String packetCode;

    private Long projectId;

    private String projectCode;

    private Long companyOrgId;

    private Long secondLendingId;

    private String productNum;

    private String certificateNum;

    private Integer overdueDay;

    private String bucket;

    private String billBatchTimes;

    private BigDecimal commitMoney;

    private BigDecimal totalRepayMoney;

    private BigDecimal latestCommitMoney;

    private BigDecimal latestDebtMoney;

    private Date commitDate;

    private Date limitDate;

    private Long caseAreaId;

    private String caseArea;

    private String currency;

    private Integer billDays;

    private Date followDate;

    private String billStatus;

    private String billRepayStatus;

    private Long billClassifyId;

    private String collectionType;

    private Long departmentId;

    private Long agentId;

    private Date beginColDate;

    private Date allotDate;

    private Long deAgentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    public Long getPacketId() {
        return packetId;
    }

    public void setPacketId(Long packetId) {
        this.packetId = packetId;
    }

    public String getPacketCode() {
        return packetCode;
    }

    public void setPacketCode(String packetCode) {
        this.packetCode = packetCode == null ? null : packetCode.trim();
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public Long getCompanyOrgId() {
        return companyOrgId;
    }

    public void setCompanyOrgId(Long companyOrgId) {
        this.companyOrgId = companyOrgId;
    }

    public Long getSecondLendingId() {
        return secondLendingId;
    }

    public void setSecondLendingId(Long secondLendingId) {
        this.secondLendingId = secondLendingId;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum == null ? null : productNum.trim();
    }

    public String getCertificateNum() {
        return certificateNum;
    }

    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum == null ? null : certificateNum.trim();
    }

    public Integer getOverdueDay() {
        return overdueDay;
    }

    public void setOverdueDay(Integer overdueDay) {
        this.overdueDay = overdueDay;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket == null ? null : bucket.trim();
    }

    public String getBillBatchTimes() {
        return billBatchTimes;
    }

    public void setBillBatchTimes(String billBatchTimes) {
        this.billBatchTimes = billBatchTimes == null ? null : billBatchTimes.trim();
    }

    public BigDecimal getCommitMoney() {
        return commitMoney;
    }

    public void setCommitMoney(BigDecimal commitMoney) {
        this.commitMoney = commitMoney;
    }

    public BigDecimal getTotalRepayMoney() {
        return totalRepayMoney;
    }

    public void setTotalRepayMoney(BigDecimal totalRepayMoney) {
        this.totalRepayMoney = totalRepayMoney;
    }

    public BigDecimal getLatestCommitMoney() {
        return latestCommitMoney;
    }

    public void setLatestCommitMoney(BigDecimal latestCommitMoney) {
        this.latestCommitMoney = latestCommitMoney;
    }

    public BigDecimal getLatestDebtMoney() {
        return latestDebtMoney;
    }

    public void setLatestDebtMoney(BigDecimal latestDebtMoney) {
        this.latestDebtMoney = latestDebtMoney;
    }

    public Date getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(Date commitDate) {
        this.commitDate = commitDate;
    }

    public Date getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
    }

    public Long getCaseAreaId() {
        return caseAreaId;
    }

    public void setCaseAreaId(Long caseAreaId) {
        this.caseAreaId = caseAreaId;
    }

    public String getCaseArea() {
        return caseArea;
    }

    public void setCaseArea(String caseArea) {
        this.caseArea = caseArea == null ? null : caseArea.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Integer getBillDays() {
        return billDays;
    }

    public void setBillDays(Integer billDays) {
        this.billDays = billDays;
    }

    public Date getFollowDate() {
        return followDate;
    }

    public void setFollowDate(Date followDate) {
        this.followDate = followDate;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public String getBillRepayStatus() {
        return billRepayStatus;
    }

    public void setBillRepayStatus(String billRepayStatus) {
        this.billRepayStatus = billRepayStatus == null ? null : billRepayStatus.trim();
    }

    public Long getBillClassifyId() {
        return billClassifyId;
    }

    public void setBillClassifyId(Long billClassifyId) {
        this.billClassifyId = billClassifyId;
    }

    public String getCollectionType() {
        return collectionType;
    }

    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType == null ? null : collectionType.trim();
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Date getBeginColDate() {
        return beginColDate;
    }

    public void setBeginColDate(Date beginColDate) {
        this.beginColDate = beginColDate;
    }

    public Date getAllotDate() {
        return allotDate;
    }

    public void setAllotDate(Date allotDate) {
        this.allotDate = allotDate;
    }

    public Long getDeAgentId() {
        return deAgentId;
    }

    public void setDeAgentId(Long deAgentId) {
        this.deAgentId = deAgentId;
    }
}