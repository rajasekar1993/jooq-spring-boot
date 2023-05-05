/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.IvrLanguageMasterRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class IvrLanguageMaster extends TableImpl<IvrLanguageMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ivr_language_master</code>
     */
    public static final IvrLanguageMaster IVR_LANGUAGE_MASTER = new IvrLanguageMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IvrLanguageMasterRecord> getRecordType() {
        return IvrLanguageMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ivr_language_master.LANGUAGE_ID</code>.
     */
    public final TableField<IvrLanguageMasterRecord, Integer> LANGUAGE_ID = createField(DSL.name("LANGUAGE_ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_language_master.LANGUAGE_NAME</code>.
     */
    public final TableField<IvrLanguageMasterRecord, String> LANGUAGE_NAME = createField(DSL.name("LANGUAGE_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_language_master.LANGUAGE_KEY</code>.
     */
    public final TableField<IvrLanguageMasterRecord, String> LANGUAGE_KEY = createField(DSL.name("LANGUAGE_KEY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_language_master.STATUS</code>.
     */
    public final TableField<IvrLanguageMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_language_master.CREATED_BY</code>.
     */
    public final TableField<IvrLanguageMasterRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_language_master.CREATED_ON</code>.
     */
    public final TableField<IvrLanguageMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private IvrLanguageMaster(Name alias, Table<IvrLanguageMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private IvrLanguageMaster(Name alias, Table<IvrLanguageMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ivr_language_master</code> table reference
     */
    public IvrLanguageMaster(String alias) {
        this(DSL.name(alias), IVR_LANGUAGE_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ivr_language_master</code> table reference
     */
    public IvrLanguageMaster(Name alias) {
        this(alias, IVR_LANGUAGE_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.ivr_language_master</code> table reference
     */
    public IvrLanguageMaster() {
        this(DSL.name("ivr_language_master"), null);
    }

    public <O extends Record> IvrLanguageMaster(Table<O> child, ForeignKey<O, IvrLanguageMasterRecord> key) {
        super(child, key, IVR_LANGUAGE_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public Identity<IvrLanguageMasterRecord, Integer> getIdentity() {
        return (Identity<IvrLanguageMasterRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<IvrLanguageMasterRecord> getPrimaryKey() {
        return Keys.KEY_IVR_LANGUAGE_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<IvrLanguageMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<IvrLanguageMasterRecord>>asList(Keys.KEY_IVR_LANGUAGE_MASTER_PRIMARY);
    }

    @Override
    public IvrLanguageMaster as(String alias) {
        return new IvrLanguageMaster(DSL.name(alias), this);
    }

    @Override
    public IvrLanguageMaster as(Name alias) {
        return new IvrLanguageMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IvrLanguageMaster rename(String name) {
        return new IvrLanguageMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IvrLanguageMaster rename(Name name) {
        return new IvrLanguageMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
