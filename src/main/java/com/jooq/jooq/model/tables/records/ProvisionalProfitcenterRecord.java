/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.ProvisionalProfitcenter;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProvisionalProfitcenterRecord extends UpdatableRecordImpl<ProvisionalProfitcenterRecord> implements Record5<String, String, String, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.provisional_profitcenter.PROFIT_CENTER</code>.
     */
    public ProvisionalProfitcenterRecord setProfitCenter(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_profitcenter.PROFIT_CENTER</code>.
     */
    public String getProfitCenter() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_profitcenter.COST_CETER</code>.
     */
    public ProvisionalProfitcenterRecord setCostCeter(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_profitcenter.COST_CETER</code>.
     */
    public String getCostCeter() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_profitcenter.PC_DESC</code>.
     */
    public ProvisionalProfitcenterRecord setPcDesc(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_profitcenter.PC_DESC</code>.
     */
    public String getPcDesc() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_profitcenter.CREATED_ON</code>.
     */
    public ProvisionalProfitcenterRecord setCreatedOn(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_profitcenter.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_profitcenter.CREATED_BY</code>.
     */
    public ProvisionalProfitcenterRecord setCreatedBy(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_profitcenter.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, LocalDateTime, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, LocalDateTime, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ProvisionalProfitcenter.PROVISIONAL_PROFITCENTER.PROFIT_CENTER;
    }

    @Override
    public Field<String> field2() {
        return ProvisionalProfitcenter.PROVISIONAL_PROFITCENTER.COST_CETER;
    }

    @Override
    public Field<String> field3() {
        return ProvisionalProfitcenter.PROVISIONAL_PROFITCENTER.PC_DESC;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return ProvisionalProfitcenter.PROVISIONAL_PROFITCENTER.CREATED_ON;
    }

    @Override
    public Field<String> field5() {
        return ProvisionalProfitcenter.PROVISIONAL_PROFITCENTER.CREATED_BY;
    }

    @Override
    public String component1() {
        return getProfitCenter();
    }

    @Override
    public String component2() {
        return getCostCeter();
    }

    @Override
    public String component3() {
        return getPcDesc();
    }

    @Override
    public LocalDateTime component4() {
        return getCreatedOn();
    }

    @Override
    public String component5() {
        return getCreatedBy();
    }

    @Override
    public String value1() {
        return getProfitCenter();
    }

    @Override
    public String value2() {
        return getCostCeter();
    }

    @Override
    public String value3() {
        return getPcDesc();
    }

    @Override
    public LocalDateTime value4() {
        return getCreatedOn();
    }

    @Override
    public String value5() {
        return getCreatedBy();
    }

    @Override
    public ProvisionalProfitcenterRecord value1(String value) {
        setProfitCenter(value);
        return this;
    }

    @Override
    public ProvisionalProfitcenterRecord value2(String value) {
        setCostCeter(value);
        return this;
    }

    @Override
    public ProvisionalProfitcenterRecord value3(String value) {
        setPcDesc(value);
        return this;
    }

    @Override
    public ProvisionalProfitcenterRecord value4(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public ProvisionalProfitcenterRecord value5(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public ProvisionalProfitcenterRecord values(String value1, String value2, String value3, LocalDateTime value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProvisionalProfitcenterRecord
     */
    public ProvisionalProfitcenterRecord() {
        super(ProvisionalProfitcenter.PROVISIONAL_PROFITCENTER);
    }

    /**
     * Create a detached, initialised ProvisionalProfitcenterRecord
     */
    public ProvisionalProfitcenterRecord(String profitCenter, String costCeter, String pcDesc, LocalDateTime createdOn, String createdBy) {
        super(ProvisionalProfitcenter.PROVISIONAL_PROFITCENTER);

        setProfitCenter(profitCenter);
        setCostCeter(costCeter);
        setPcDesc(pcDesc);
        setCreatedOn(createdOn);
        setCreatedBy(createdBy);
    }
}
