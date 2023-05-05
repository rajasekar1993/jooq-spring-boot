/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.FieldForceStaffOld;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Record4;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FieldForceStaffOldRecord extends UpdatableRecordImpl<FieldForceStaffOldRecord> implements Record16<String, String, LocalDate, String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.PLANT_CODE</code>.
     */
    public FieldForceStaffOldRecord setPlantCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.PLANT_CODE</code>.
     */
    public String getPlantCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.HMB</code>.
     */
    public FieldForceStaffOldRecord setHmb(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.HMB</code>.
     */
    public String getHmb() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.HMB_DATE</code>.
     */
    public FieldForceStaffOldRecord setHmbDate(LocalDate value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.HMB_DATE</code>.
     */
    public LocalDate getHmbDate() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.POSITION</code>.
     */
    public FieldForceStaffOldRecord setPosition(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.POSITION</code>.
     */
    public String getPosition() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.PNAME</code>.
     */
    public FieldForceStaffOldRecord setPname(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.PNAME</code>.
     */
    public String getPname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.HMB_NAME</code>.
     */
    public FieldForceStaffOldRecord setHmbName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.HMB_NAME</code>.
     */
    public String getHmbName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.VENDOR</code>.
     */
    public FieldForceStaffOldRecord setVendor(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.VENDOR</code>.
     */
    public String getVendor() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.NAME</code>.
     */
    public FieldForceStaffOldRecord setName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.NAME</code>.
     */
    public String getName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.STATUS</code>.
     */
    public FieldForceStaffOldRecord setStatus(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.CREATED_BY</code>.
     */
    public FieldForceStaffOldRecord setCreatedBy(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.CREATED_ON</code>.
     */
    public FieldForceStaffOldRecord setCreatedOn(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.LAST_CHANGED_BY</code>.
     */
    public FieldForceStaffOldRecord setLastChangedBy(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.LAST_CHANGED_ON</code>.
     */
    public FieldForceStaffOldRecord setLastChangedOn(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.DESG_TYPE</code>.
     */
    public FieldForceStaffOldRecord setDesgType(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.DESG_TYPE</code>.
     */
    public String getDesgType() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.DESG_DESCR</code>.
     */
    public FieldForceStaffOldRecord setDesgDescr(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.DESG_DESCR</code>.
     */
    public String getDesgDescr() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.field_force_staff_old.DESG_LEVEL</code>.
     */
    public FieldForceStaffOldRecord setDesgLevel(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.field_force_staff_old.DESG_LEVEL</code>.
     */
    public String getDesgLevel() {
        return (String) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<String, String, String, LocalDate> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, String, LocalDate, String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime, String, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<String, String, LocalDate, String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime, String, String, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.PLANT_CODE;
    }

    @Override
    public Field<String> field2() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.HMB;
    }

    @Override
    public Field<LocalDate> field3() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.HMB_DATE;
    }

    @Override
    public Field<String> field4() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.POSITION;
    }

    @Override
    public Field<String> field5() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.PNAME;
    }

    @Override
    public Field<String> field6() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.HMB_NAME;
    }

    @Override
    public Field<String> field7() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.VENDOR;
    }

    @Override
    public Field<String> field8() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.NAME;
    }

    @Override
    public Field<String> field9() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.STATUS;
    }

    @Override
    public Field<Integer> field10() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.CREATED_ON;
    }

    @Override
    public Field<Integer> field12() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.LAST_CHANGED_ON;
    }

    @Override
    public Field<String> field14() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.DESG_TYPE;
    }

    @Override
    public Field<String> field15() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.DESG_DESCR;
    }

    @Override
    public Field<String> field16() {
        return FieldForceStaffOld.FIELD_FORCE_STAFF_OLD.DESG_LEVEL;
    }

    @Override
    public String component1() {
        return getPlantCode();
    }

    @Override
    public String component2() {
        return getHmb();
    }

    @Override
    public LocalDate component3() {
        return getHmbDate();
    }

    @Override
    public String component4() {
        return getPosition();
    }

    @Override
    public String component5() {
        return getPname();
    }

    @Override
    public String component6() {
        return getHmbName();
    }

    @Override
    public String component7() {
        return getVendor();
    }

    @Override
    public String component8() {
        return getName();
    }

    @Override
    public String component9() {
        return getStatus();
    }

    @Override
    public Integer component10() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component11() {
        return getCreatedOn();
    }

    @Override
    public Integer component12() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component13() {
        return getLastChangedOn();
    }

    @Override
    public String component14() {
        return getDesgType();
    }

    @Override
    public String component15() {
        return getDesgDescr();
    }

    @Override
    public String component16() {
        return getDesgLevel();
    }

    @Override
    public String value1() {
        return getPlantCode();
    }

    @Override
    public String value2() {
        return getHmb();
    }

    @Override
    public LocalDate value3() {
        return getHmbDate();
    }

    @Override
    public String value4() {
        return getPosition();
    }

    @Override
    public String value5() {
        return getPname();
    }

    @Override
    public String value6() {
        return getHmbName();
    }

    @Override
    public String value7() {
        return getVendor();
    }

    @Override
    public String value8() {
        return getName();
    }

    @Override
    public String value9() {
        return getStatus();
    }

    @Override
    public Integer value10() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value11() {
        return getCreatedOn();
    }

    @Override
    public Integer value12() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value13() {
        return getLastChangedOn();
    }

    @Override
    public String value14() {
        return getDesgType();
    }

    @Override
    public String value15() {
        return getDesgDescr();
    }

    @Override
    public String value16() {
        return getDesgLevel();
    }

    @Override
    public FieldForceStaffOldRecord value1(String value) {
        setPlantCode(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value2(String value) {
        setHmb(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value3(LocalDate value) {
        setHmbDate(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value4(String value) {
        setPosition(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value5(String value) {
        setPname(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value6(String value) {
        setHmbName(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value7(String value) {
        setVendor(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value8(String value) {
        setName(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value9(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value10(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value11(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value12(Integer value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value13(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value14(String value) {
        setDesgType(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value15(String value) {
        setDesgDescr(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord value16(String value) {
        setDesgLevel(value);
        return this;
    }

    @Override
    public FieldForceStaffOldRecord values(String value1, String value2, LocalDate value3, String value4, String value5, String value6, String value7, String value8, String value9, Integer value10, LocalDateTime value11, Integer value12, LocalDateTime value13, String value14, String value15, String value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FieldForceStaffOldRecord
     */
    public FieldForceStaffOldRecord() {
        super(FieldForceStaffOld.FIELD_FORCE_STAFF_OLD);
    }

    /**
     * Create a detached, initialised FieldForceStaffOldRecord
     */
    public FieldForceStaffOldRecord(String plantCode, String hmb, LocalDate hmbDate, String position, String pname, String hmbName, String vendor, String name, String status, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn, String desgType, String desgDescr, String desgLevel) {
        super(FieldForceStaffOld.FIELD_FORCE_STAFF_OLD);

        setPlantCode(plantCode);
        setHmb(hmb);
        setHmbDate(hmbDate);
        setPosition(position);
        setPname(pname);
        setHmbName(hmbName);
        setVendor(vendor);
        setName(name);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
        setDesgType(desgType);
        setDesgDescr(desgDescr);
        setDesgLevel(desgLevel);
    }
}
