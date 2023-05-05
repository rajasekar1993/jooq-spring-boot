/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CfaSlabMasterRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class CfaSlabMaster extends TableImpl<CfaSlabMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.cfa_slab_master</code>
     */
    public static final CfaSlabMaster CFA_SLAB_MASTER = new CfaSlabMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CfaSlabMasterRecord> getRecordType() {
        return CfaSlabMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_master.SNO</code>.
     */
    public final TableField<CfaSlabMasterRecord, Integer> SNO = createField(DSL.name("SNO"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_master.SLAB</code>.
     */
    public final TableField<CfaSlabMasterRecord, String> SLAB = createField(DSL.name("SLAB"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_master.KM</code>.
     */
    public final TableField<CfaSlabMasterRecord, String> KM = createField(DSL.name("KM"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_master.RATE_PER_KM</code>.
     */
    public final TableField<CfaSlabMasterRecord, String> RATE_PER_KM = createField(DSL.name("RATE_PER_KM"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_master.STATUS</code>.
     */
    public final TableField<CfaSlabMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_master.SLAB_NAME</code>.
     */
    public final TableField<CfaSlabMasterRecord, String> SLAB_NAME = createField(DSL.name("SLAB_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_master.REGION</code>.
     */
    public final TableField<CfaSlabMasterRecord, String> REGION = createField(DSL.name("REGION"), SQLDataType.VARCHAR(45), this, "");

    private CfaSlabMaster(Name alias, Table<CfaSlabMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private CfaSlabMaster(Name alias, Table<CfaSlabMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.cfa_slab_master</code> table reference
     */
    public CfaSlabMaster(String alias) {
        this(DSL.name(alias), CFA_SLAB_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.cfa_slab_master</code> table reference
     */
    public CfaSlabMaster(Name alias) {
        this(alias, CFA_SLAB_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.cfa_slab_master</code> table reference
     */
    public CfaSlabMaster() {
        this(DSL.name("cfa_slab_master"), null);
    }

    public <O extends Record> CfaSlabMaster(Table<O> child, ForeignKey<O, CfaSlabMasterRecord> key) {
        super(child, key, CFA_SLAB_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CfaSlabMasterRecord> getPrimaryKey() {
        return Keys.KEY_CFA_SLAB_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<CfaSlabMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<CfaSlabMasterRecord>>asList(Keys.KEY_CFA_SLAB_MASTER_PRIMARY);
    }

    @Override
    public CfaSlabMaster as(String alias) {
        return new CfaSlabMaster(DSL.name(alias), this);
    }

    @Override
    public CfaSlabMaster as(Name alias) {
        return new CfaSlabMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CfaSlabMaster rename(String name) {
        return new CfaSlabMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CfaSlabMaster rename(Name name) {
        return new CfaSlabMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
