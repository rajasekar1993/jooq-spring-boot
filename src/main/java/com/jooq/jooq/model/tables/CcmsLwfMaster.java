/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CcmsLwfMasterRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class CcmsLwfMaster extends TableImpl<CcmsLwfMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ccms_lwf_master</code>
     */
    public static final CcmsLwfMaster CCMS_LWF_MASTER = new CcmsLwfMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CcmsLwfMasterRecord> getRecordType() {
        return CcmsLwfMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ccms_lwf_master.year</code>.
     */
    public final TableField<CcmsLwfMasterRecord, Integer> YEAR = createField(DSL.name("year"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_lwf_master.month</code>.
     */
    public final TableField<CcmsLwfMasterRecord, Integer> MONTH = createField(DSL.name("month"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_lwf_master.name</code>.
     */
    public final TableField<CcmsLwfMasterRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_lwf_master.lwf_ee</code>.
     */
    public final TableField<CcmsLwfMasterRecord, Double> LWF_EE = createField(DSL.name("lwf_ee"), SQLDataType.FLOAT.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_lwf_master.lwf_er</code>.
     */
    public final TableField<CcmsLwfMasterRecord, Double> LWF_ER = createField(DSL.name("lwf_er"), SQLDataType.FLOAT.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_lwf_master.status</code>.
     */
    public final TableField<CcmsLwfMasterRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_lwf_master.created_on</code>.
     */
    public final TableField<CcmsLwfMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_lwf_master.created_by</code>.
     */
    public final TableField<CcmsLwfMasterRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_lwf_master.last_changed_on</code>.
     */
    public final TableField<CcmsLwfMasterRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("last_changed_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_lwf_master.last_changed_by</code>.
     */
    public final TableField<CcmsLwfMasterRecord, String> LAST_CHANGED_BY = createField(DSL.name("last_changed_by"), SQLDataType.VARCHAR(45), this, "");

    private CcmsLwfMaster(Name alias, Table<CcmsLwfMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private CcmsLwfMaster(Name alias, Table<CcmsLwfMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_lwf_master</code> table reference
     */
    public CcmsLwfMaster(String alias) {
        this(DSL.name(alias), CCMS_LWF_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_lwf_master</code> table reference
     */
    public CcmsLwfMaster(Name alias) {
        this(alias, CCMS_LWF_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.ccms_lwf_master</code> table reference
     */
    public CcmsLwfMaster() {
        this(DSL.name("ccms_lwf_master"), null);
    }

    public <O extends Record> CcmsLwfMaster(Table<O> child, ForeignKey<O, CcmsLwfMasterRecord> key) {
        super(child, key, CCMS_LWF_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CcmsLwfMasterRecord> getPrimaryKey() {
        return Keys.KEY_CCMS_LWF_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<CcmsLwfMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<CcmsLwfMasterRecord>>asList(Keys.KEY_CCMS_LWF_MASTER_PRIMARY);
    }

    @Override
    public CcmsLwfMaster as(String alias) {
        return new CcmsLwfMaster(DSL.name(alias), this);
    }

    @Override
    public CcmsLwfMaster as(Name alias) {
        return new CcmsLwfMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsLwfMaster rename(String name) {
        return new CcmsLwfMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsLwfMaster rename(Name name) {
        return new CcmsLwfMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, Integer, String, Double, Double, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
