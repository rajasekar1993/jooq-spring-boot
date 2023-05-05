/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.Scheme;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Record3;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SchemeRecord extends UpdatableRecordImpl<SchemeRecord> implements Record17<Integer, String, Integer, String, String, String, byte[], LocalDate, LocalDate, String, String, LocalDateTime, String, LocalDateTime, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.scheme.ITEM_NO</code>.
     */
    public SchemeRecord setItemNo(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.ITEM_NO</code>.
     */
    public Integer getItemNo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.COMP_CODE</code>.
     */
    public SchemeRecord setCompCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.DEPARTMENT_ID</code>.
     */
    public SchemeRecord setDepartmentId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.DEPARTMENT_ID</code>.
     */
    public Integer getDepartmentId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.SCHEME_NAME</code>.
     */
    public SchemeRecord setSchemeName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.SCHEME_NAME</code>.
     */
    public String getSchemeName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.FILE_NAME</code>.
     */
    public SchemeRecord setFileName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.FILE_NAME</code>.
     */
    public String getFileName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.FILE_TYPE</code>.
     */
    public SchemeRecord setFileType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.FILE_TYPE</code>.
     */
    public String getFileType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.FILE_CONTENT</code>.
     */
    public SchemeRecord setFileContent(byte[] value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.FILE_CONTENT</code>.
     */
    public byte[] getFileContent() {
        return (byte[]) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.FROM_DATE</code>.
     */
    public SchemeRecord setFromDate(LocalDate value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.FROM_DATE</code>.
     */
    public LocalDate getFromDate() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.TO_DATE</code>.
     */
    public SchemeRecord setToDate(LocalDate value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.TO_DATE</code>.
     */
    public LocalDate getToDate() {
        return (LocalDate) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.STATUS</code>.
     */
    public SchemeRecord setStatus(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.CREATED_BY</code>.
     */
    public SchemeRecord setCreatedBy(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.CREATED_ON</code>.
     */
    public SchemeRecord setCreatedOn(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.LAST_CHANGED_BY</code>.
     */
    public SchemeRecord setLastChangedBy(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.LAST_CHANGED_ON</code>.
     */
    public SchemeRecord setLastChangedOn(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.TITLE</code>.
     */
    public SchemeRecord setTitle(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.TITLE</code>.
     */
    public String getTitle() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.MESSAGE</code>.
     */
    public SchemeRecord setMessage(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.MESSAGE</code>.
     */
    public String getMessage() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme.MESSAGE_STATUS</code>.
     */
    public SchemeRecord setMessageStatus(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme.MESSAGE_STATUS</code>.
     */
    public String getMessageStatus() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Integer, String, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<Integer, String, Integer, String, String, String, byte[], LocalDate, LocalDate, String, String, LocalDateTime, String, LocalDateTime, String, String, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<Integer, String, Integer, String, String, String, byte[], LocalDate, LocalDate, String, String, LocalDateTime, String, LocalDateTime, String, String, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Scheme.SCHEME.ITEM_NO;
    }

    @Override
    public Field<String> field2() {
        return Scheme.SCHEME.COMP_CODE;
    }

    @Override
    public Field<Integer> field3() {
        return Scheme.SCHEME.DEPARTMENT_ID;
    }

    @Override
    public Field<String> field4() {
        return Scheme.SCHEME.SCHEME_NAME;
    }

    @Override
    public Field<String> field5() {
        return Scheme.SCHEME.FILE_NAME;
    }

    @Override
    public Field<String> field6() {
        return Scheme.SCHEME.FILE_TYPE;
    }

    @Override
    public Field<byte[]> field7() {
        return Scheme.SCHEME.FILE_CONTENT;
    }

    @Override
    public Field<LocalDate> field8() {
        return Scheme.SCHEME.FROM_DATE;
    }

    @Override
    public Field<LocalDate> field9() {
        return Scheme.SCHEME.TO_DATE;
    }

    @Override
    public Field<String> field10() {
        return Scheme.SCHEME.STATUS;
    }

    @Override
    public Field<String> field11() {
        return Scheme.SCHEME.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return Scheme.SCHEME.CREATED_ON;
    }

    @Override
    public Field<String> field13() {
        return Scheme.SCHEME.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return Scheme.SCHEME.LAST_CHANGED_ON;
    }

    @Override
    public Field<String> field15() {
        return Scheme.SCHEME.TITLE;
    }

    @Override
    public Field<String> field16() {
        return Scheme.SCHEME.MESSAGE;
    }

    @Override
    public Field<String> field17() {
        return Scheme.SCHEME.MESSAGE_STATUS;
    }

    @Override
    public Integer component1() {
        return getItemNo();
    }

    @Override
    public String component2() {
        return getCompCode();
    }

    @Override
    public Integer component3() {
        return getDepartmentId();
    }

    @Override
    public String component4() {
        return getSchemeName();
    }

    @Override
    public String component5() {
        return getFileName();
    }

    @Override
    public String component6() {
        return getFileType();
    }

    @Override
    public byte[] component7() {
        return getFileContent();
    }

    @Override
    public LocalDate component8() {
        return getFromDate();
    }

    @Override
    public LocalDate component9() {
        return getToDate();
    }

    @Override
    public String component10() {
        return getStatus();
    }

    @Override
    public String component11() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component12() {
        return getCreatedOn();
    }

    @Override
    public String component13() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component14() {
        return getLastChangedOn();
    }

    @Override
    public String component15() {
        return getTitle();
    }

    @Override
    public String component16() {
        return getMessage();
    }

    @Override
    public String component17() {
        return getMessageStatus();
    }

    @Override
    public Integer value1() {
        return getItemNo();
    }

    @Override
    public String value2() {
        return getCompCode();
    }

    @Override
    public Integer value3() {
        return getDepartmentId();
    }

    @Override
    public String value4() {
        return getSchemeName();
    }

    @Override
    public String value5() {
        return getFileName();
    }

    @Override
    public String value6() {
        return getFileType();
    }

    @Override
    public byte[] value7() {
        return getFileContent();
    }

    @Override
    public LocalDate value8() {
        return getFromDate();
    }

    @Override
    public LocalDate value9() {
        return getToDate();
    }

    @Override
    public String value10() {
        return getStatus();
    }

    @Override
    public String value11() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value12() {
        return getCreatedOn();
    }

    @Override
    public String value13() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value14() {
        return getLastChangedOn();
    }

    @Override
    public String value15() {
        return getTitle();
    }

    @Override
    public String value16() {
        return getMessage();
    }

    @Override
    public String value17() {
        return getMessageStatus();
    }

    @Override
    public SchemeRecord value1(Integer value) {
        setItemNo(value);
        return this;
    }

    @Override
    public SchemeRecord value2(String value) {
        setCompCode(value);
        return this;
    }

    @Override
    public SchemeRecord value3(Integer value) {
        setDepartmentId(value);
        return this;
    }

    @Override
    public SchemeRecord value4(String value) {
        setSchemeName(value);
        return this;
    }

    @Override
    public SchemeRecord value5(String value) {
        setFileName(value);
        return this;
    }

    @Override
    public SchemeRecord value6(String value) {
        setFileType(value);
        return this;
    }

    @Override
    public SchemeRecord value7(byte[] value) {
        setFileContent(value);
        return this;
    }

    @Override
    public SchemeRecord value8(LocalDate value) {
        setFromDate(value);
        return this;
    }

    @Override
    public SchemeRecord value9(LocalDate value) {
        setToDate(value);
        return this;
    }

    @Override
    public SchemeRecord value10(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public SchemeRecord value11(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SchemeRecord value12(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public SchemeRecord value13(String value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public SchemeRecord value14(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public SchemeRecord value15(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public SchemeRecord value16(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public SchemeRecord value17(String value) {
        setMessageStatus(value);
        return this;
    }

    @Override
    public SchemeRecord values(Integer value1, String value2, Integer value3, String value4, String value5, String value6, byte[] value7, LocalDate value8, LocalDate value9, String value10, String value11, LocalDateTime value12, String value13, LocalDateTime value14, String value15, String value16, String value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SchemeRecord
     */
    public SchemeRecord() {
        super(Scheme.SCHEME);
    }

    /**
     * Create a detached, initialised SchemeRecord
     */
    public SchemeRecord(Integer itemNo, String compCode, Integer departmentId, String schemeName, String fileName, String fileType, byte[] fileContent, LocalDate fromDate, LocalDate toDate, String status, String createdBy, LocalDateTime createdOn, String lastChangedBy, LocalDateTime lastChangedOn, String title, String message, String messageStatus) {
        super(Scheme.SCHEME);

        setItemNo(itemNo);
        setCompCode(compCode);
        setDepartmentId(departmentId);
        setSchemeName(schemeName);
        setFileName(fileName);
        setFileType(fileType);
        setFileContent(fileContent);
        setFromDate(fromDate);
        setToDate(toDate);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
        setTitle(title);
        setMessage(message);
        setMessageStatus(messageStatus);
    }
}
