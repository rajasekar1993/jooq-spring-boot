/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CcmsMotherTongueRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class CcmsMotherTongue extends TableImpl<CcmsMotherTongueRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ccms_mother_tongue</code>
     */
    public static final CcmsMotherTongue CCMS_MOTHER_TONGUE = new CcmsMotherTongue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CcmsMotherTongueRecord> getRecordType() {
        return CcmsMotherTongueRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ccms_mother_tongue.name</code>.
     */
    public final TableField<CcmsMotherTongueRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_mother_tongue.status</code>.
     */
    public final TableField<CcmsMotherTongueRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_mother_tongue.created_by</code>.
     */
    public final TableField<CcmsMotherTongueRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_mother_tongue.created_on</code>.
     */
    public final TableField<CcmsMotherTongueRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_mother_tongue.last_changed_by</code>.
     */
    public final TableField<CcmsMotherTongueRecord, String> LAST_CHANGED_BY = createField(DSL.name("last_changed_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_mother_tongue.last_changed_on</code>.
     */
    public final TableField<CcmsMotherTongueRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("last_changed_on"), SQLDataType.LOCALDATETIME(0), this, "");

    private CcmsMotherTongue(Name alias, Table<CcmsMotherTongueRecord> aliased) {
        this(alias, aliased, null);
    }

    private CcmsMotherTongue(Name alias, Table<CcmsMotherTongueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_mother_tongue</code> table reference
     */
    public CcmsMotherTongue(String alias) {
        this(DSL.name(alias), CCMS_MOTHER_TONGUE);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_mother_tongue</code> table reference
     */
    public CcmsMotherTongue(Name alias) {
        this(alias, CCMS_MOTHER_TONGUE);
    }

    /**
     * Create a <code>vendor_portal_pbx.ccms_mother_tongue</code> table reference
     */
    public CcmsMotherTongue() {
        this(DSL.name("ccms_mother_tongue"), null);
    }

    public <O extends Record> CcmsMotherTongue(Table<O> child, ForeignKey<O, CcmsMotherTongueRecord> key) {
        super(child, key, CCMS_MOTHER_TONGUE);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CcmsMotherTongueRecord> getPrimaryKey() {
        return Keys.KEY_CCMS_MOTHER_TONGUE_PRIMARY;
    }

    @Override
    public List<UniqueKey<CcmsMotherTongueRecord>> getKeys() {
        return Arrays.<UniqueKey<CcmsMotherTongueRecord>>asList(Keys.KEY_CCMS_MOTHER_TONGUE_PRIMARY);
    }

    @Override
    public CcmsMotherTongue as(String alias) {
        return new CcmsMotherTongue(DSL.name(alias), this);
    }

    @Override
    public CcmsMotherTongue as(Name alias) {
        return new CcmsMotherTongue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsMotherTongue rename(String name) {
        return new CcmsMotherTongue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsMotherTongue rename(Name name) {
        return new CcmsMotherTongue(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
