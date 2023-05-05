/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.VendorContactHistoryRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row16;
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
public class VendorContactHistory extends TableImpl<VendorContactHistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.vendor_contact_history</code>
     */
    public static final VendorContactHistory VENDOR_CONTACT_HISTORY = new VendorContactHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VendorContactHistoryRecord> getRecordType() {
        return VendorContactHistoryRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.VENDOR_CODE</code>.
     */
    public final TableField<VendorContactHistoryRecord, String> VENDOR_CODE = createField(DSL.name("VENDOR_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.SERIAL_NO</code>.
     */
    public final TableField<VendorContactHistoryRecord, String> SERIAL_NO = createField(DSL.name("SERIAL_NO"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.FLAG_TYPE</code>.
     */
    public final TableField<VendorContactHistoryRecord, String> FLAG_TYPE = createField(DSL.name("FLAG_TYPE"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.CONTACT_PERSON_NAME</code>.
     */
    public final TableField<VendorContactHistoryRecord, String> CONTACT_PERSON_NAME = createField(DSL.name("CONTACT_PERSON_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.DESIGNATION</code>.
     */
    public final TableField<VendorContactHistoryRecord, String> DESIGNATION = createField(DSL.name("DESIGNATION"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.DEPARTMENT</code>.
     */
    public final TableField<VendorContactHistoryRecord, String> DEPARTMENT = createField(DSL.name("DEPARTMENT"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.TELEPHONE_NO</code>.
     */
    public final TableField<VendorContactHistoryRecord, String> TELEPHONE_NO = createField(DSL.name("TELEPHONE_NO"), SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.MOBILE_NO</code>.
     */
    public final TableField<VendorContactHistoryRecord, String> MOBILE_NO = createField(DSL.name("MOBILE_NO"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.EMAIL_ID</code>.
     */
    public final TableField<VendorContactHistoryRecord, String> EMAIL_ID = createField(DSL.name("EMAIL_ID"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.CREATED_BY</code>.
     */
    public final TableField<VendorContactHistoryRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.CREATED_ON</code>.
     */
    public final TableField<VendorContactHistoryRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.LAST_CHANGED_BY</code>.
     */
    public final TableField<VendorContactHistoryRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.LAST_CHANGED_ON</code>.
     */
    public final TableField<VendorContactHistoryRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.CONTACT_DECLARATION_NAME</code>.
     */
    public final TableField<VendorContactHistoryRecord, String> CONTACT_DECLARATION_NAME = createField(DSL.name("CONTACT_DECLARATION_NAME"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.CONTACT_DECLARATION_NO</code>.
     */
    public final TableField<VendorContactHistoryRecord, String> CONTACT_DECLARATION_NO = createField(DSL.name("CONTACT_DECLARATION_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_contact_history.LAST_EDITED_ON</code>.
     */
    public final TableField<VendorContactHistoryRecord, LocalDateTime> LAST_EDITED_ON = createField(DSL.name("LAST_EDITED_ON"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    private VendorContactHistory(Name alias, Table<VendorContactHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private VendorContactHistory(Name alias, Table<VendorContactHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.vendor_contact_history</code> table reference
     */
    public VendorContactHistory(String alias) {
        this(DSL.name(alias), VENDOR_CONTACT_HISTORY);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.vendor_contact_history</code> table reference
     */
    public VendorContactHistory(Name alias) {
        this(alias, VENDOR_CONTACT_HISTORY);
    }

    /**
     * Create a <code>vendor_portal_pbx.vendor_contact_history</code> table reference
     */
    public VendorContactHistory() {
        this(DSL.name("vendor_contact_history"), null);
    }

    public <O extends Record> VendorContactHistory(Table<O> child, ForeignKey<O, VendorContactHistoryRecord> key) {
        super(child, key, VENDOR_CONTACT_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<VendorContactHistoryRecord> getPrimaryKey() {
        return Keys.KEY_VENDOR_CONTACT_HISTORY_PRIMARY;
    }

    @Override
    public List<UniqueKey<VendorContactHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<VendorContactHistoryRecord>>asList(Keys.KEY_VENDOR_CONTACT_HISTORY_PRIMARY);
    }

    @Override
    public VendorContactHistory as(String alias) {
        return new VendorContactHistory(DSL.name(alias), this);
    }

    @Override
    public VendorContactHistory as(Name alias) {
        return new VendorContactHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VendorContactHistory rename(String name) {
        return new VendorContactHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VendorContactHistory rename(Name name) {
        return new VendorContactHistory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, String, String, String, String, String, String, String, String, String, LocalDateTime, String, LocalDateTime, String, String, LocalDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}
