/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.GrnCustomerUtrDetailsRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GrnCustomerUtrDetails extends TableImpl<GrnCustomerUtrDetailsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.grn_customer_utr_details</code>
     */
    public static final GrnCustomerUtrDetails GRN_CUSTOMER_UTR_DETAILS = new GrnCustomerUtrDetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GrnCustomerUtrDetailsRecord> getRecordType() {
        return GrnCustomerUtrDetailsRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.grn_customer_utr_details.SNO</code>.
     */
    public final TableField<GrnCustomerUtrDetailsRecord, Integer> SNO = createField(DSL.name("SNO"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_utr_details.CFA_CODE</code>.
     */
    public final TableField<GrnCustomerUtrDetailsRecord, String> CFA_CODE = createField(DSL.name("CFA_CODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_utr_details.CUSTOMER_CODE</code>.
     */
    public final TableField<GrnCustomerUtrDetailsRecord, String> CUSTOMER_CODE = createField(DSL.name("CUSTOMER_CODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_utr_details.MODEL</code>.
     */
    public final TableField<GrnCustomerUtrDetailsRecord, String> MODEL = createField(DSL.name("MODEL"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_utr_details.QTY</code>.
     */
    public final TableField<GrnCustomerUtrDetailsRecord, String> QTY = createField(DSL.name("QTY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_utr_details.UTR_NO</code>.
     */
    public final TableField<GrnCustomerUtrDetailsRecord, String> UTR_NO = createField(DSL.name("UTR_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_utr_details.DEPOSITE_AMOUNT</code>.
     */
    public final TableField<GrnCustomerUtrDetailsRecord, String> DEPOSITE_AMOUNT = createField(DSL.name("DEPOSITE_AMOUNT"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_utr_details.PAYMENT_DATE</code>.
     */
    public final TableField<GrnCustomerUtrDetailsRecord, LocalDate> PAYMENT_DATE = createField(DSL.name("PAYMENT_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_utr_details.STATUS</code>.
     */
    public final TableField<GrnCustomerUtrDetailsRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_utr_details.CREATED_BY</code>.
     */
    public final TableField<GrnCustomerUtrDetailsRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_utr_details.CREATED_ON</code>.
     */
    public final TableField<GrnCustomerUtrDetailsRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private GrnCustomerUtrDetails(Name alias, Table<GrnCustomerUtrDetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private GrnCustomerUtrDetails(Name alias, Table<GrnCustomerUtrDetailsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.grn_customer_utr_details</code> table reference
     */
    public GrnCustomerUtrDetails(String alias) {
        this(DSL.name(alias), GRN_CUSTOMER_UTR_DETAILS);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.grn_customer_utr_details</code> table reference
     */
    public GrnCustomerUtrDetails(Name alias) {
        this(alias, GRN_CUSTOMER_UTR_DETAILS);
    }

    /**
     * Create a <code>vendor_portal_pbx.grn_customer_utr_details</code> table reference
     */
    public GrnCustomerUtrDetails() {
        this(DSL.name("grn_customer_utr_details"), null);
    }

    public <O extends Record> GrnCustomerUtrDetails(Table<O> child, ForeignKey<O, GrnCustomerUtrDetailsRecord> key) {
        super(child, key, GRN_CUSTOMER_UTR_DETAILS);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public Identity<GrnCustomerUtrDetailsRecord, Integer> getIdentity() {
        return (Identity<GrnCustomerUtrDetailsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<GrnCustomerUtrDetailsRecord> getPrimaryKey() {
        return Keys.KEY_GRN_CUSTOMER_UTR_DETAILS_PRIMARY;
    }

    @Override
    public List<UniqueKey<GrnCustomerUtrDetailsRecord>> getKeys() {
        return Arrays.<UniqueKey<GrnCustomerUtrDetailsRecord>>asList(Keys.KEY_GRN_CUSTOMER_UTR_DETAILS_PRIMARY);
    }

    @Override
    public GrnCustomerUtrDetails as(String alias) {
        return new GrnCustomerUtrDetails(DSL.name(alias), this);
    }

    @Override
    public GrnCustomerUtrDetails as(Name alias) {
        return new GrnCustomerUtrDetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GrnCustomerUtrDetails rename(String name) {
        return new GrnCustomerUtrDetails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GrnCustomerUtrDetails rename(Name name) {
        return new GrnCustomerUtrDetails(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, String, String, String, String, LocalDate, String, String, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
