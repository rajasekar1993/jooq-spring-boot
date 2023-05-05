/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.HmbServiceArrear;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HmbServiceArrearRecord extends UpdatableRecordImpl<HmbServiceArrearRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.COMP_CODE</code>.
     */
    public HmbServiceArrearRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.TRANS_NO</code>.
     */
    public HmbServiceArrearRecord setTransNo(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.TRANS_NO</code>.
     */
    public String getTransNo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.POST_DAT</code>.
     */
    public HmbServiceArrearRecord setPostDat(LocalDate value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.POST_DAT</code>.
     */
    public LocalDate getPostDat() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.PLANT</code>.
     */
    public HmbServiceArrearRecord setPlant(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.PLANT</code>.
     */
    public String getPlant() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.BUKRS</code>.
     */
    public HmbServiceArrearRecord setBukrs(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.BUKRS</code>.
     */
    public String getBukrs() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.PLANT_DESC</code>.
     */
    public HmbServiceArrearRecord setPlantDesc(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.PLANT_DESC</code>.
     */
    public String getPlantDesc() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.CENTER_CODE</code>.
     */
    public HmbServiceArrearRecord setCenterCode(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.CENTER_CODE</code>.
     */
    public String getCenterCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.CENTER_DESC</code>.
     */
    public HmbServiceArrearRecord setCenterDesc(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.CENTER_DESC</code>.
     */
    public String getCenterDesc() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.PERSON_RESP</code>.
     */
    public HmbServiceArrearRecord setPersonResp(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.PERSON_RESP</code>.
     */
    public String getPersonResp() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.J_1KFTBUS</code>.
     */
    public HmbServiceArrearRecord setJ_1kftbus(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.J_1KFTBUS</code>.
     */
    public String getJ_1kftbus() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.ARREAR_CODE</code>.
     */
    public HmbServiceArrearRecord setArrearCode(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.ARREAR_CODE</code>.
     */
    public String getArrearCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.ARREAR_DESC</code>.
     */
    public HmbServiceArrearRecord setArrearDesc(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.ARREAR_DESC</code>.
     */
    public String getArrearDesc() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.ARRALL_DATE</code>.
     */
    public HmbServiceArrearRecord setArrallDate(LocalDate value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.ARRALL_DATE</code>.
     */
    public LocalDate getArrallDate() {
        return (LocalDate) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.TRANS_DATE</code>.
     */
    public HmbServiceArrearRecord setTransDate(LocalDate value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.TRANS_DATE</code>.
     */
    public LocalDate getTransDate() {
        return (LocalDate) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.AMT</code>.
     */
    public HmbServiceArrearRecord setAmt(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.AMT</code>.
     */
    public BigDecimal getAmt() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.SAKNR</code>.
     */
    public HmbServiceArrearRecord setSaknr(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.SAKNR</code>.
     */
    public String getSaknr() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.KOSTL</code>.
     */
    public HmbServiceArrearRecord setKostl(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.KOSTL</code>.
     */
    public String getKostl() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.PROFIT_CENTER</code>.
     */
    public HmbServiceArrearRecord setProfitCenter(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.PROFIT_CENTER</code>.
     */
    public String getProfitCenter() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.SAP_STATUS</code>.
     */
    public HmbServiceArrearRecord setSapStatus(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.SAP_STATUS</code>.
     */
    public String getSapStatus() {
        return (String) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.FI_DOC_NO</code>.
     */
    public HmbServiceArrearRecord setFiDocNo(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.FI_DOC_NO</code>.
     */
    public String getFiDocNo() {
        return (String) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.SAP_CREATED_BY</code>.
     */
    public HmbServiceArrearRecord setSapCreatedBy(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.SAP_CREATED_BY</code>.
     */
    public String getSapCreatedBy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.SAP_CREATED_ON</code>.
     */
    public HmbServiceArrearRecord setSapCreatedOn(LocalDate value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.SAP_CREATED_ON</code>.
     */
    public LocalDate getSapCreatedOn() {
        return (LocalDate) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.APPROVED_BY</code>.
     */
    public HmbServiceArrearRecord setApprovedBy(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.APPROVED_BY</code>.
     */
    public String getApprovedBy() {
        return (String) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.APPROVAL_DATE</code>.
     */
    public HmbServiceArrearRecord setApprovalDate(LocalDate value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.APPROVAL_DATE</code>.
     */
    public LocalDate getApprovalDate() {
        return (LocalDate) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.REJECTED_BY</code>.
     */
    public HmbServiceArrearRecord setRejectedBy(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.REJECTED_BY</code>.
     */
    public String getRejectedBy() {
        return (String) get(24);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.REJECTED_ON</code>.
     */
    public HmbServiceArrearRecord setRejectedOn(LocalDate value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.REJECTED_ON</code>.
     */
    public LocalDate getRejectedOn() {
        return (LocalDate) get(25);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.PAID_FLG</code>.
     */
    public HmbServiceArrearRecord setPaidFlg(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.PAID_FLG</code>.
     */
    public String getPaidFlg() {
        return (String) get(26);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.BILL_NUM</code>.
     */
    public HmbServiceArrearRecord setBillNum(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.BILL_NUM</code>.
     */
    public String getBillNum() {
        return (String) get(27);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.TEXT</code>.
     */
    public HmbServiceArrearRecord setText(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.TEXT</code>.
     */
    public String getText() {
        return (String) get(28);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.WHT_TYPE</code>.
     */
    public HmbServiceArrearRecord setWhtType(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.WHT_TYPE</code>.
     */
    public String getWhtType() {
        return (String) get(29);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.WHT_CODE</code>.
     */
    public HmbServiceArrearRecord setWhtCode(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.WHT_CODE</code>.
     */
    public String getWhtCode() {
        return (String) get(30);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.TDS_PERC</code>.
     */
    public HmbServiceArrearRecord setTdsPerc(String value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.TDS_PERC</code>.
     */
    public String getTdsPerc() {
        return (String) get(31);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.TOTAL_TDS</code>.
     */
    public HmbServiceArrearRecord setTotalTds(BigDecimal value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.TOTAL_TDS</code>.
     */
    public BigDecimal getTotalTds() {
        return (BigDecimal) get(32);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.NET_ARREAR</code>.
     */
    public HmbServiceArrearRecord setNetArrear(BigDecimal value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.NET_ARREAR</code>.
     */
    public BigDecimal getNetArrear() {
        return (BigDecimal) get(33);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.STATUS</code>.
     */
    public HmbServiceArrearRecord setStatus(String value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(34);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.CREATED_BY</code>.
     */
    public HmbServiceArrearRecord setCreatedBy(Integer value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(35);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.CREATED_ON</code>.
     */
    public HmbServiceArrearRecord setCreatedOn(LocalDateTime value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(36);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.LAST_CHANGED_BY</code>.
     */
    public HmbServiceArrearRecord setLastChangedBy(Integer value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(37);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.LAST_CHANGED_ON</code>.
     */
    public HmbServiceArrearRecord setLastChangedOn(LocalDateTime value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(38);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HmbServiceArrearRecord
     */
    public HmbServiceArrearRecord() {
        super(HmbServiceArrear.HMB_SERVICE_ARREAR);
    }

    /**
     * Create a detached, initialised HmbServiceArrearRecord
     */
    public HmbServiceArrearRecord(String compCode, String transNo, LocalDate postDat, String plant, String bukrs, String plantDesc, String centerCode, String centerDesc, String personResp, String j_1kftbus, String arrearCode, String arrearDesc, LocalDate arrallDate, LocalDate transDate, BigDecimal amt, String saknr, String kostl, String profitCenter, String sapStatus, String fiDocNo, String sapCreatedBy, LocalDate sapCreatedOn, String approvedBy, LocalDate approvalDate, String rejectedBy, LocalDate rejectedOn, String paidFlg, String billNum, String text, String whtType, String whtCode, String tdsPerc, BigDecimal totalTds, BigDecimal netArrear, String status, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn) {
        super(HmbServiceArrear.HMB_SERVICE_ARREAR);

        setCompCode(compCode);
        setTransNo(transNo);
        setPostDat(postDat);
        setPlant(plant);
        setBukrs(bukrs);
        setPlantDesc(plantDesc);
        setCenterCode(centerCode);
        setCenterDesc(centerDesc);
        setPersonResp(personResp);
        setJ_1kftbus(j_1kftbus);
        setArrearCode(arrearCode);
        setArrearDesc(arrearDesc);
        setArrallDate(arrallDate);
        setTransDate(transDate);
        setAmt(amt);
        setSaknr(saknr);
        setKostl(kostl);
        setProfitCenter(profitCenter);
        setSapStatus(sapStatus);
        setFiDocNo(fiDocNo);
        setSapCreatedBy(sapCreatedBy);
        setSapCreatedOn(sapCreatedOn);
        setApprovedBy(approvedBy);
        setApprovalDate(approvalDate);
        setRejectedBy(rejectedBy);
        setRejectedOn(rejectedOn);
        setPaidFlg(paidFlg);
        setBillNum(billNum);
        setText(text);
        setWhtType(whtType);
        setWhtCode(whtCode);
        setTdsPerc(tdsPerc);
        setTotalTds(totalTds);
        setNetArrear(netArrear);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}
