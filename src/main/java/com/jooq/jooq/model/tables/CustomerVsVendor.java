/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CustomerVsVendorRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class CustomerVsVendor extends TableImpl<CustomerVsVendorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.customer_vs_vendor</code>
     */
    public static final CustomerVsVendor CUSTOMER_VS_VENDOR = new CustomerVsVendor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerVsVendorRecord> getRecordType() {
        return CustomerVsVendorRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.customer_vs_vendor.COMP_CODE</code>.
     */
    public final TableField<CustomerVsVendorRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_vs_vendor.CUSTOMER</code>.
     */
    public final TableField<CustomerVsVendorRecord, String> CUSTOMER = createField(DSL.name("CUSTOMER"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_vs_vendor.PLANT_VENDOR</code>.
     */
    public final TableField<CustomerVsVendorRecord, String> PLANT_VENDOR = createField(DSL.name("PLANT_VENDOR"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_vs_vendor.SEC_DEPOSIT</code>.
     */
    public final TableField<CustomerVsVendorRecord, String> SEC_DEPOSIT = createField(DSL.name("SEC_DEPOSIT"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_vs_vendor.FINANCE_VENDOR</code>.
     */
    public final TableField<CustomerVsVendorRecord, String> FINANCE_VENDOR = createField(DSL.name("FINANCE_VENDOR"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_vs_vendor.TRANSPORT_VENDOR</code>.
     */
    public final TableField<CustomerVsVendorRecord, String> TRANSPORT_VENDOR = createField(DSL.name("TRANSPORT_VENDOR"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_vs_vendor.RPMV_VENDOR</code>.
     */
    public final TableField<CustomerVsVendorRecord, String> RPMV_VENDOR = createField(DSL.name("RPMV_VENDOR"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_vs_vendor.CREATED_BY</code>.
     */
    public final TableField<CustomerVsVendorRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_vs_vendor.CREATED_ON</code>.
     */
    public final TableField<CustomerVsVendorRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_vs_vendor.LAST_CHANGED_BY</code>.
     */
    public final TableField<CustomerVsVendorRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_vs_vendor.LAST_CHANGED_ON</code>.
     */
    public final TableField<CustomerVsVendorRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private CustomerVsVendor(Name alias, Table<CustomerVsVendorRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomerVsVendor(Name alias, Table<CustomerVsVendorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.customer_vs_vendor</code> table reference
     */
    public CustomerVsVendor(String alias) {
        this(DSL.name(alias), CUSTOMER_VS_VENDOR);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.customer_vs_vendor</code> table reference
     */
    public CustomerVsVendor(Name alias) {
        this(alias, CUSTOMER_VS_VENDOR);
    }

    /**
     * Create a <code>vendor_portal_pbx.customer_vs_vendor</code> table reference
     */
    public CustomerVsVendor() {
        this(DSL.name("customer_vs_vendor"), null);
    }

    public <O extends Record> CustomerVsVendor(Table<O> child, ForeignKey<O, CustomerVsVendorRecord> key) {
        super(child, key, CUSTOMER_VS_VENDOR);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CustomerVsVendorRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMER_VS_VENDOR_PRIMARY;
    }

    @Override
    public List<UniqueKey<CustomerVsVendorRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomerVsVendorRecord>>asList(Keys.KEY_CUSTOMER_VS_VENDOR_PRIMARY);
    }

    @Override
    public CustomerVsVendor as(String alias) {
        return new CustomerVsVendor(DSL.name(alias), this);
    }

    @Override
    public CustomerVsVendor as(Name alias) {
        return new CustomerVsVendor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerVsVendor rename(String name) {
        return new CustomerVsVendor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerVsVendor rename(Name name) {
        return new CustomerVsVendor(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
