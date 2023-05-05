/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.IvrDivisionMasterRecord;

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
public class IvrDivisionMaster extends TableImpl<IvrDivisionMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ivr_division_master</code>
     */
    public static final IvrDivisionMaster IVR_DIVISION_MASTER = new IvrDivisionMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IvrDivisionMasterRecord> getRecordType() {
        return IvrDivisionMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ivr_division_master.DIVISION_ID</code>.
     */
    public final TableField<IvrDivisionMasterRecord, String> DIVISION_ID = createField(DSL.name("DIVISION_ID"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_division_master.DIVISION_NAME</code>.
     */
    public final TableField<IvrDivisionMasterRecord, String> DIVISION_NAME = createField(DSL.name("DIVISION_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_division_master.DIVISION_NAME_API</code>.
     */
    public final TableField<IvrDivisionMasterRecord, String> DIVISION_NAME_API = createField(DSL.name("DIVISION_NAME_API"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_division_master.BUSINESS_TYPE_ID</code>.
     */
    public final TableField<IvrDivisionMasterRecord, String> BUSINESS_TYPE_ID = createField(DSL.name("BUSINESS_TYPE_ID"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_division_master.BUSINESS_TYPE</code>.
     */
    public final TableField<IvrDivisionMasterRecord, String> BUSINESS_TYPE = createField(DSL.name("BUSINESS_TYPE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_division_master.BUSINESS_TYPE_API</code>.
     */
    public final TableField<IvrDivisionMasterRecord, String> BUSINESS_TYPE_API = createField(DSL.name("BUSINESS_TYPE_API"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_division_master.CREATED_BY</code>.
     */
    public final TableField<IvrDivisionMasterRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_division_master.CREATED_ON</code>.
     */
    public final TableField<IvrDivisionMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_division_master.STATUS</code>.
     */
    public final TableField<IvrDivisionMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_division_master.ACC_GRP_CODE</code>.
     */
    public final TableField<IvrDivisionMasterRecord, String> ACC_GRP_CODE = createField(DSL.name("ACC_GRP_CODE"), SQLDataType.VARCHAR(15), this, "");

    private IvrDivisionMaster(Name alias, Table<IvrDivisionMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private IvrDivisionMaster(Name alias, Table<IvrDivisionMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ivr_division_master</code> table reference
     */
    public IvrDivisionMaster(String alias) {
        this(DSL.name(alias), IVR_DIVISION_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ivr_division_master</code> table reference
     */
    public IvrDivisionMaster(Name alias) {
        this(alias, IVR_DIVISION_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.ivr_division_master</code> table reference
     */
    public IvrDivisionMaster() {
        this(DSL.name("ivr_division_master"), null);
    }

    public <O extends Record> IvrDivisionMaster(Table<O> child, ForeignKey<O, IvrDivisionMasterRecord> key) {
        super(child, key, IVR_DIVISION_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<IvrDivisionMasterRecord> getPrimaryKey() {
        return Keys.KEY_IVR_DIVISION_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<IvrDivisionMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<IvrDivisionMasterRecord>>asList(Keys.KEY_IVR_DIVISION_MASTER_PRIMARY);
    }

    @Override
    public IvrDivisionMaster as(String alias) {
        return new IvrDivisionMaster(DSL.name(alias), this);
    }

    @Override
    public IvrDivisionMaster as(Name alias) {
        return new IvrDivisionMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IvrDivisionMaster rename(String name) {
        return new IvrDivisionMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IvrDivisionMaster rename(Name name) {
        return new IvrDivisionMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, String, String, String, LocalDateTime, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
