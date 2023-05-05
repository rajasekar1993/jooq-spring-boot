/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.HmbReasonMasterRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class HmbReasonMaster extends TableImpl<HmbReasonMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.hmb_reason_master</code>
     */
    public static final HmbReasonMaster HMB_REASON_MASTER = new HmbReasonMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HmbReasonMasterRecord> getRecordType() {
        return HmbReasonMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.hmb_reason_master.ID</code>.
     */
    public final TableField<HmbReasonMasterRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_reason_master.REASON_KEY</code>.
     */
    public final TableField<HmbReasonMasterRecord, String> REASON_KEY = createField(DSL.name("REASON_KEY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_reason_master.REASON_VALUE</code>.
     */
    public final TableField<HmbReasonMasterRecord, String> REASON_VALUE = createField(DSL.name("REASON_VALUE"), SQLDataType.VARCHAR(45), this, "");

    private HmbReasonMaster(Name alias, Table<HmbReasonMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private HmbReasonMaster(Name alias, Table<HmbReasonMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.hmb_reason_master</code> table reference
     */
    public HmbReasonMaster(String alias) {
        this(DSL.name(alias), HMB_REASON_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.hmb_reason_master</code> table reference
     */
    public HmbReasonMaster(Name alias) {
        this(alias, HMB_REASON_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.hmb_reason_master</code> table reference
     */
    public HmbReasonMaster() {
        this(DSL.name("hmb_reason_master"), null);
    }

    public <O extends Record> HmbReasonMaster(Table<O> child, ForeignKey<O, HmbReasonMasterRecord> key) {
        super(child, key, HMB_REASON_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public Identity<HmbReasonMasterRecord, Integer> getIdentity() {
        return (Identity<HmbReasonMasterRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<HmbReasonMasterRecord> getPrimaryKey() {
        return Keys.KEY_HMB_REASON_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<HmbReasonMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<HmbReasonMasterRecord>>asList(Keys.KEY_HMB_REASON_MASTER_PRIMARY);
    }

    @Override
    public HmbReasonMaster as(String alias) {
        return new HmbReasonMaster(DSL.name(alias), this);
    }

    @Override
    public HmbReasonMaster as(Name alias) {
        return new HmbReasonMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HmbReasonMaster rename(String name) {
        return new HmbReasonMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HmbReasonMaster rename(Name name) {
        return new HmbReasonMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
