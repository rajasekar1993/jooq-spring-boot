/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.VendorTurnover;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VendorTurnoverRecord extends UpdatableRecordImpl<VendorTurnoverRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.VENDOR_CODE</code>.
     */
    public VendorTurnoverRecord setVendorCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.FINANCIAL_YEAR</code>.
     */
    public VendorTurnoverRecord setFinancialYear(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.FINANCIAL_YEAR</code>.
     */
    public String getFinancialYear() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.QUANTITY_VOLUME</code>.
     */
    public VendorTurnoverRecord setQuantityVolume(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.QUANTITY_VOLUME</code>.
     */
    public String getQuantityVolume() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.UNIT_OF_MEASUREMENT</code>.
     */
    public VendorTurnoverRecord setUnitOfMeasurement(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.UNIT_OF_MEASUREMENT</code>.
     */
    public String getUnitOfMeasurement() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.TURNOVER</code>.
     */
    public VendorTurnoverRecord setTurnover(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.TURNOVER</code>.
     */
    public String getTurnover() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.POTENTIAL_CATEGORY</code>.
     */
    public VendorTurnoverRecord setPotentialCategory(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.POTENTIAL_CATEGORY</code>.
     */
    public String getPotentialCategory() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.BUSINESS_TYPE</code>.
     */
    public VendorTurnoverRecord setBusinessType(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.BUSINESS_TYPE</code>.
     */
    public String getBusinessType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.BUS_SCALE_TYPE</code>.
     */
    public VendorTurnoverRecord setBusScaleType(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.BUS_SCALE_TYPE</code>.
     */
    public String getBusScaleType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.ATTACHMENT</code>.
     */
    public VendorTurnoverRecord setAttachment(byte[] value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.ATTACHMENT</code>.
     */
    public byte[] getAttachment() {
        return (byte[]) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.ATTACHMENT_TYPE</code>.
     */
    public VendorTurnoverRecord setAttachmentType(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.ATTACHMENT_TYPE</code>.
     */
    public String getAttachmentType() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.ATTACHMENT_NAME</code>.
     */
    public VendorTurnoverRecord setAttachmentName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.ATTACHMENT_NAME</code>.
     */
    public String getAttachmentName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.FIRM_TYPE</code>.
     */
    public VendorTurnoverRecord setFirmType(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.FIRM_TYPE</code>.
     */
    public String getFirmType() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.ISSUE_DATE</code>.
     */
    public VendorTurnoverRecord setIssueDate(LocalDate value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.ISSUE_DATE</code>.
     */
    public LocalDate getIssueDate() {
        return (LocalDate) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.START_DATE</code>.
     */
    public VendorTurnoverRecord setStartDate(LocalDate value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.START_DATE</code>.
     */
    public LocalDate getStartDate() {
        return (LocalDate) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.END_DATE</code>.
     */
    public VendorTurnoverRecord setEndDate(LocalDate value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.END_DATE</code>.
     */
    public LocalDate getEndDate() {
        return (LocalDate) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.CREATED_BY</code>.
     */
    public VendorTurnoverRecord setCreatedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.CREATED_ON</code>.
     */
    public VendorTurnoverRecord setCreatedOn(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.LAST_CHANGED_BY</code>.
     */
    public VendorTurnoverRecord setLastChangedBy(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.LAST_CHANGED_ON</code>.
     */
    public VendorTurnoverRecord setLastChangedOn(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.MSMC_CERTIFICATE_NO</code>.
     */
    public VendorTurnoverRecord setMsmcCertificateNo(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.MSMC_CERTIFICATE_NO</code>.
     */
    public String getMsmcCertificateNo() {
        return (String) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.PROTENTIAL_ATTACHMENT</code>.
     */
    public VendorTurnoverRecord setProtentialAttachment(byte[] value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.PROTENTIAL_ATTACHMENT</code>.
     */
    public byte[] getProtentialAttachment() {
        return (byte[]) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.PROTENTIAL_ATTACHMENT_NAME</code>.
     */
    public VendorTurnoverRecord setProtentialAttachmentName(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.PROTENTIAL_ATTACHMENT_NAME</code>.
     */
    public String getProtentialAttachmentName() {
        return (String) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.PROTENTIAL_ATTACHMENT_TYPE</code>.
     */
    public VendorTurnoverRecord setProtentialAttachmentType(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.PROTENTIAL_ATTACHMENT_TYPE</code>.
     */
    public String getProtentialAttachmentType() {
        return (String) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.TURNOVER_DECLARATION_NAME</code>.
     */
    public VendorTurnoverRecord setTurnoverDeclarationName(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.TURNOVER_DECLARATION_NAME</code>.
     */
    public String getTurnoverDeclarationName() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_turnover.TURNOVER_DECLARATION_NO</code>.
     */
    public VendorTurnoverRecord setTurnoverDeclarationNo(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_turnover.TURNOVER_DECLARATION_NO</code>.
     */
    public String getTurnoverDeclarationNo() {
        return (String) get(24);
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
     * Create a detached VendorTurnoverRecord
     */
    public VendorTurnoverRecord() {
        super(VendorTurnover.VENDOR_TURNOVER);
    }

    /**
     * Create a detached, initialised VendorTurnoverRecord
     */
    public VendorTurnoverRecord(String vendorCode, String financialYear, String quantityVolume, String unitOfMeasurement, String turnover, String potentialCategory, String businessType, String busScaleType, byte[] attachment, String attachmentType, String attachmentName, String firmType, LocalDate issueDate, LocalDate startDate, LocalDate endDate, String createdBy, LocalDateTime createdOn, String lastChangedBy, LocalDateTime lastChangedOn, String msmcCertificateNo, byte[] protentialAttachment, String protentialAttachmentName, String protentialAttachmentType, String turnoverDeclarationName, String turnoverDeclarationNo) {
        super(VendorTurnover.VENDOR_TURNOVER);

        setVendorCode(vendorCode);
        setFinancialYear(financialYear);
        setQuantityVolume(quantityVolume);
        setUnitOfMeasurement(unitOfMeasurement);
        setTurnover(turnover);
        setPotentialCategory(potentialCategory);
        setBusinessType(businessType);
        setBusScaleType(busScaleType);
        setAttachment(attachment);
        setAttachmentType(attachmentType);
        setAttachmentName(attachmentName);
        setFirmType(firmType);
        setIssueDate(issueDate);
        setStartDate(startDate);
        setEndDate(endDate);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
        setMsmcCertificateNo(msmcCertificateNo);
        setProtentialAttachment(protentialAttachment);
        setProtentialAttachmentName(protentialAttachmentName);
        setProtentialAttachmentType(protentialAttachmentType);
        setTurnoverDeclarationName(turnoverDeclarationName);
        setTurnoverDeclarationNo(turnoverDeclarationNo);
    }
}
