/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.PoAcknowledgement;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PoAcknowledgementRecord extends UpdatableRecordImpl<PoAcknowledgementRecord> implements Record4<String, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.po_acknowledgement.VENDOR_CODE</code>.
     */
    public PoAcknowledgementRecord setVendorCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.po_acknowledgement.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.po_acknowledgement.PO_NUMBER</code>.
     */
    public PoAcknowledgementRecord setPoNumber(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.po_acknowledgement.PO_NUMBER</code>.
     */
    public String getPoNumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.po_acknowledgement.VIEWED_BY</code>.
     */
    public PoAcknowledgementRecord setViewedBy(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.po_acknowledgement.VIEWED_BY</code>.
     */
    public String getViewedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.po_acknowledgement.VIEWED_ON</code>.
     */
    public PoAcknowledgementRecord setViewedOn(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.po_acknowledgement.VIEWED_ON</code>.
     */
    public LocalDateTime getViewedOn() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PoAcknowledgement.PO_ACKNOWLEDGEMENT.VENDOR_CODE;
    }

    @Override
    public Field<String> field2() {
        return PoAcknowledgement.PO_ACKNOWLEDGEMENT.PO_NUMBER;
    }

    @Override
    public Field<String> field3() {
        return PoAcknowledgement.PO_ACKNOWLEDGEMENT.VIEWED_BY;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return PoAcknowledgement.PO_ACKNOWLEDGEMENT.VIEWED_ON;
    }

    @Override
    public String component1() {
        return getVendorCode();
    }

    @Override
    public String component2() {
        return getPoNumber();
    }

    @Override
    public String component3() {
        return getViewedBy();
    }

    @Override
    public LocalDateTime component4() {
        return getViewedOn();
    }

    @Override
    public String value1() {
        return getVendorCode();
    }

    @Override
    public String value2() {
        return getPoNumber();
    }

    @Override
    public String value3() {
        return getViewedBy();
    }

    @Override
    public LocalDateTime value4() {
        return getViewedOn();
    }

    @Override
    public PoAcknowledgementRecord value1(String value) {
        setVendorCode(value);
        return this;
    }

    @Override
    public PoAcknowledgementRecord value2(String value) {
        setPoNumber(value);
        return this;
    }

    @Override
    public PoAcknowledgementRecord value3(String value) {
        setViewedBy(value);
        return this;
    }

    @Override
    public PoAcknowledgementRecord value4(LocalDateTime value) {
        setViewedOn(value);
        return this;
    }

    @Override
    public PoAcknowledgementRecord values(String value1, String value2, String value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PoAcknowledgementRecord
     */
    public PoAcknowledgementRecord() {
        super(PoAcknowledgement.PO_ACKNOWLEDGEMENT);
    }

    /**
     * Create a detached, initialised PoAcknowledgementRecord
     */
    public PoAcknowledgementRecord(String vendorCode, String poNumber, String viewedBy, LocalDateTime viewedOn) {
        super(PoAcknowledgement.PO_ACKNOWLEDGEMENT);

        setVendorCode(vendorCode);
        setPoNumber(poNumber);
        setViewedBy(viewedBy);
        setViewedOn(viewedOn);
    }
}
