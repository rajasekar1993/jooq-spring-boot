/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CcmsWorkingHours;

import java.math.BigDecimal;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CcmsWorkingHoursRecord extends UpdatableRecordImpl<CcmsWorkingHoursRecord> implements Record2<LocalTime, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ccms_working_hours.work_time</code>.
     */
    public CcmsWorkingHoursRecord setWorkTime(LocalTime value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_working_hours.work_time</code>.
     */
    public LocalTime getWorkTime() {
        return (LocalTime) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_working_hours.day_count</code>.
     */
    public CcmsWorkingHoursRecord setDayCount(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_working_hours.day_count</code>.
     */
    public BigDecimal getDayCount() {
        return (BigDecimal) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<LocalTime> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<LocalTime, BigDecimal> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<LocalTime, BigDecimal> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<LocalTime> field1() {
        return CcmsWorkingHours.CCMS_WORKING_HOURS.WORK_TIME;
    }

    @Override
    public Field<BigDecimal> field2() {
        return CcmsWorkingHours.CCMS_WORKING_HOURS.DAY_COUNT;
    }

    @Override
    public LocalTime component1() {
        return getWorkTime();
    }

    @Override
    public BigDecimal component2() {
        return getDayCount();
    }

    @Override
    public LocalTime value1() {
        return getWorkTime();
    }

    @Override
    public BigDecimal value2() {
        return getDayCount();
    }

    @Override
    public CcmsWorkingHoursRecord value1(LocalTime value) {
        setWorkTime(value);
        return this;
    }

    @Override
    public CcmsWorkingHoursRecord value2(BigDecimal value) {
        setDayCount(value);
        return this;
    }

    @Override
    public CcmsWorkingHoursRecord values(LocalTime value1, BigDecimal value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CcmsWorkingHoursRecord
     */
    public CcmsWorkingHoursRecord() {
        super(CcmsWorkingHours.CCMS_WORKING_HOURS);
    }

    /**
     * Create a detached, initialised CcmsWorkingHoursRecord
     */
    public CcmsWorkingHoursRecord(LocalTime workTime, BigDecimal dayCount) {
        super(CcmsWorkingHours.CCMS_WORKING_HOURS);

        setWorkTime(workTime);
        setDayCount(dayCount);
    }
}
