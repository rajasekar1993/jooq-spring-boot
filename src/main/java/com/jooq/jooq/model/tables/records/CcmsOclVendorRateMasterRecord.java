/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CcmsOclVendorRateMaster;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Record5;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CcmsOclVendorRateMasterRecord extends UpdatableRecordImpl<CcmsOclVendorRateMasterRecord> implements Record11<String, String, String, String, String, Short, String, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.effective_from</code>.
     */
    public CcmsOclVendorRateMasterRecord setEffectiveFrom(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.effective_from</code>.
     */
    public String getEffectiveFrom() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.department</code>.
     */
    public CcmsOclVendorRateMasterRecord setDepartment(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.department</code>.
     */
    public String getDepartment() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.plant</code>.
     */
    public CcmsOclVendorRateMasterRecord setPlant(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.plant</code>.
     */
    public String getPlant() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.vendor</code>.
     */
    public CcmsOclVendorRateMasterRecord setVendor(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.vendor</code>.
     */
    public String getVendor() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.uom</code>.
     */
    public CcmsOclVendorRateMasterRecord setUom(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.uom</code>.
     */
    public String getUom() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.value</code>.
     */
    public CcmsOclVendorRateMasterRecord setValue(Short value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.value</code>.
     */
    public Short getValue() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.status</code>.
     */
    public CcmsOclVendorRateMasterRecord setStatus(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.status</code>.
     */
    public String getStatus() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.created_by</code>.
     */
    public CcmsOclVendorRateMasterRecord setCreatedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.created_on</code>.
     */
    public CcmsOclVendorRateMasterRecord setCreatedOn(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.last_changed_by</code>.
     */
    public CcmsOclVendorRateMasterRecord setLastChangedBy(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.last_changed_on</code>.
     */
    public CcmsOclVendorRateMasterRecord setLastChangedOn(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_ocl_vendor_rate_master.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record5<String, String, String, String, String> key() {
        return (Record5) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, String, String, Short, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, String, String, String, String, Short, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CcmsOclVendorRateMaster.CCMS_OCL_VENDOR_RATE_MASTER.EFFECTIVE_FROM;
    }

    @Override
    public Field<String> field2() {
        return CcmsOclVendorRateMaster.CCMS_OCL_VENDOR_RATE_MASTER.DEPARTMENT;
    }

    @Override
    public Field<String> field3() {
        return CcmsOclVendorRateMaster.CCMS_OCL_VENDOR_RATE_MASTER.PLANT;
    }

    @Override
    public Field<String> field4() {
        return CcmsOclVendorRateMaster.CCMS_OCL_VENDOR_RATE_MASTER.VENDOR;
    }

    @Override
    public Field<String> field5() {
        return CcmsOclVendorRateMaster.CCMS_OCL_VENDOR_RATE_MASTER.UOM;
    }

    @Override
    public Field<Short> field6() {
        return CcmsOclVendorRateMaster.CCMS_OCL_VENDOR_RATE_MASTER.VALUE;
    }

    @Override
    public Field<String> field7() {
        return CcmsOclVendorRateMaster.CCMS_OCL_VENDOR_RATE_MASTER.STATUS;
    }

    @Override
    public Field<String> field8() {
        return CcmsOclVendorRateMaster.CCMS_OCL_VENDOR_RATE_MASTER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return CcmsOclVendorRateMaster.CCMS_OCL_VENDOR_RATE_MASTER.CREATED_ON;
    }

    @Override
    public Field<String> field10() {
        return CcmsOclVendorRateMaster.CCMS_OCL_VENDOR_RATE_MASTER.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return CcmsOclVendorRateMaster.CCMS_OCL_VENDOR_RATE_MASTER.LAST_CHANGED_ON;
    }

    @Override
    public String component1() {
        return getEffectiveFrom();
    }

    @Override
    public String component2() {
        return getDepartment();
    }

    @Override
    public String component3() {
        return getPlant();
    }

    @Override
    public String component4() {
        return getVendor();
    }

    @Override
    public String component5() {
        return getUom();
    }

    @Override
    public Short component6() {
        return getValue();
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
    public String value1() {
        return getEffectiveFrom();
    }

    @Override
    public String value2() {
        return getDepartment();
    }

    @Override
    public String value3() {
        return getPlant();
    }

    @Override
    public String value4() {
        return getVendor();
    }

    @Override
    public String value5() {
        return getUom();
    }

    @Override
    public Short value6() {
        return getValue();
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
    public CcmsOclVendorRateMasterRecord value1(String value) {
        setEffectiveFrom(value);
        return this;
    }

    @Override
    public CcmsOclVendorRateMasterRecord value2(String value) {
        setDepartment(value);
        return this;
    }

    @Override
    public CcmsOclVendorRateMasterRecord value3(String value) {
        setPlant(value);
        return this;
    }

    @Override
    public CcmsOclVendorRateMasterRecord value4(String value) {
        setVendor(value);
        return this;
    }

    @Override
    public CcmsOclVendorRateMasterRecord value5(String value) {
        setUom(value);
        return this;
    }

    @Override
    public CcmsOclVendorRateMasterRecord value6(Short value) {
        setValue(value);
        return this;
    }

    @Override
    public CcmsOclVendorRateMasterRecord value7(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public CcmsOclVendorRateMasterRecord value8(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CcmsOclVendorRateMasterRecord value9(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public CcmsOclVendorRateMasterRecord value10(String value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public CcmsOclVendorRateMasterRecord value11(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public CcmsOclVendorRateMasterRecord values(String value1, String value2, String value3, String value4, String value5, Short value6, String value7, String value8, LocalDateTime value9, String value10, LocalDateTime value11) {
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
     * Create a detached CcmsOclVendorRateMasterRecord
     */
    public CcmsOclVendorRateMasterRecord() {
        super(CcmsOclVendorRateMaster.CCMS_OCL_VENDOR_RATE_MASTER);
    }

    /**
     * Create a detached, initialised CcmsOclVendorRateMasterRecord
     */
    public CcmsOclVendorRateMasterRecord(String effectiveFrom, String department, String plant, String vendor, String uom, Short value, String status, String createdBy, LocalDateTime createdOn, String lastChangedBy, LocalDateTime lastChangedOn) {
        super(CcmsOclVendorRateMaster.CCMS_OCL_VENDOR_RATE_MASTER);

        setEffectiveFrom(effectiveFrom);
        setDepartment(department);
        setPlant(plant);
        setVendor(vendor);
        setUom(uom);
        setValue(value);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}
