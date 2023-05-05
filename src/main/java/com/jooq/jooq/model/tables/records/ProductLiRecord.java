/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.ProductLi;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Record4;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductLiRecord extends UpdatableRecordImpl<ProductLiRecord> implements Record11<Integer, String, Integer, Integer, LocalDate, LocalDate, String, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.product_li.ITEM_NO</code>.
     */
    public ProductLiRecord setItemNo(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.product_li.ITEM_NO</code>.
     */
    public Integer getItemNo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.product_li.COMP_CODE</code>.
     */
    public ProductLiRecord setCompCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.product_li.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.product_li.DEPARTMENT_ID</code>.
     */
    public ProductLiRecord setDepartmentId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.product_li.DEPARTMENT_ID</code>.
     */
    public Integer getDepartmentId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.product_li.DEPARTMENT_VISIBLE_ID</code>.
     */
    public ProductLiRecord setDepartmentVisibleId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.product_li.DEPARTMENT_VISIBLE_ID</code>.
     */
    public Integer getDepartmentVisibleId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.product_li.FROM_DATE</code>.
     */
    public ProductLiRecord setFromDate(LocalDate value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.product_li.FROM_DATE</code>.
     */
    public LocalDate getFromDate() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.product_li.TO_DATE</code>.
     */
    public ProductLiRecord setToDate(LocalDate value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.product_li.TO_DATE</code>.
     */
    public LocalDate getToDate() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.product_li.STATUS</code>.
     */
    public ProductLiRecord setStatus(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.product_li.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.product_li.CREATED_BY</code>.
     */
    public ProductLiRecord setCreatedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.product_li.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.product_li.CREATED_ON</code>.
     */
    public ProductLiRecord setCreatedOn(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.product_li.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.product_li.LAST_CHANGED_BY</code>.
     */
    public ProductLiRecord setLastChangedBy(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.product_li.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.product_li.LAST_CHANGED_ON</code>.
     */
    public ProductLiRecord setLastChangedOn(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.product_li.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<Integer, String, Integer, Integer> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, Integer, Integer, LocalDate, LocalDate, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, String, Integer, Integer, LocalDate, LocalDate, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ProductLi.PRODUCT_LI.ITEM_NO;
    }

    @Override
    public Field<String> field2() {
        return ProductLi.PRODUCT_LI.COMP_CODE;
    }

    @Override
    public Field<Integer> field3() {
        return ProductLi.PRODUCT_LI.DEPARTMENT_ID;
    }

    @Override
    public Field<Integer> field4() {
        return ProductLi.PRODUCT_LI.DEPARTMENT_VISIBLE_ID;
    }

    @Override
    public Field<LocalDate> field5() {
        return ProductLi.PRODUCT_LI.FROM_DATE;
    }

    @Override
    public Field<LocalDate> field6() {
        return ProductLi.PRODUCT_LI.TO_DATE;
    }

    @Override
    public Field<String> field7() {
        return ProductLi.PRODUCT_LI.STATUS;
    }

    @Override
    public Field<String> field8() {
        return ProductLi.PRODUCT_LI.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return ProductLi.PRODUCT_LI.CREATED_ON;
    }

    @Override
    public Field<String> field10() {
        return ProductLi.PRODUCT_LI.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return ProductLi.PRODUCT_LI.LAST_CHANGED_ON;
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
    public Integer component4() {
        return getDepartmentVisibleId();
    }

    @Override
    public LocalDate component5() {
        return getFromDate();
    }

    @Override
    public LocalDate component6() {
        return getToDate();
    }

    @Override
    public String component7() {
        return getStatus();
    }

    @Override
    public String component8() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component9() {
        return getCreatedOn();
    }

    @Override
    public String component10() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component11() {
        return getLastChangedOn();
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
    public Integer value4() {
        return getDepartmentVisibleId();
    }

    @Override
    public LocalDate value5() {
        return getFromDate();
    }

    @Override
    public LocalDate value6() {
        return getToDate();
    }

    @Override
    public String value7() {
        return getStatus();
    }

    @Override
    public String value8() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value9() {
        return getCreatedOn();
    }

    @Override
    public String value10() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value11() {
        return getLastChangedOn();
    }

    @Override
    public ProductLiRecord value1(Integer value) {
        setItemNo(value);
        return this;
    }

    @Override
    public ProductLiRecord value2(String value) {
        setCompCode(value);
        return this;
    }

    @Override
    public ProductLiRecord value3(Integer value) {
        setDepartmentId(value);
        return this;
    }

    @Override
    public ProductLiRecord value4(Integer value) {
        setDepartmentVisibleId(value);
        return this;
    }

    @Override
    public ProductLiRecord value5(LocalDate value) {
        setFromDate(value);
        return this;
    }

    @Override
    public ProductLiRecord value6(LocalDate value) {
        setToDate(value);
        return this;
    }

    @Override
    public ProductLiRecord value7(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public ProductLiRecord value8(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public ProductLiRecord value9(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public ProductLiRecord value10(String value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public ProductLiRecord value11(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public ProductLiRecord values(Integer value1, String value2, Integer value3, Integer value4, LocalDate value5, LocalDate value6, String value7, String value8, LocalDateTime value9, String value10, LocalDateTime value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductLiRecord
     */
    public ProductLiRecord() {
        super(ProductLi.PRODUCT_LI);
    }

    /**
     * Create a detached, initialised ProductLiRecord
     */
    public ProductLiRecord(Integer itemNo, String compCode, Integer departmentId, Integer departmentVisibleId, LocalDate fromDate, LocalDate toDate, String status, String createdBy, LocalDateTime createdOn, String lastChangedBy, LocalDateTime lastChangedOn) {
        super(ProductLi.PRODUCT_LI);

        setItemNo(itemNo);
        setCompCode(compCode);
        setDepartmentId(departmentId);
        setDepartmentVisibleId(departmentVisibleId);
        setFromDate(fromDate);
        setToDate(toDate);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}
