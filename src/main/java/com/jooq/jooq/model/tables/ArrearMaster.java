/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.ArrearMasterRecord;

import java.time.LocalDateTime;
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
public class ArrearMaster extends TableImpl<ArrearMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.arrear_master</code>
     */
    public static final ArrearMaster ARREAR_MASTER = new ArrearMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ArrearMasterRecord> getRecordType() {
        return ArrearMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.arrear_master.ARREAR_CODE</code>.
     */
    public final TableField<ArrearMasterRecord, String> ARREAR_CODE = createField(DSL.name("ARREAR_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.arrear_master.ARREAR_NAME</code>.
     */
    public final TableField<ArrearMasterRecord, String> ARREAR_NAME = createField(DSL.name("ARREAR_NAME"), SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>vendor_portal_pbx.arrear_master.STATUS</code>.
     */
    public final TableField<ArrearMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.arrear_master.CREATED_BY</code>.
     */
    public final TableField<ArrearMasterRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.arrear_master.CREATED_ON</code>.
     */
    public final TableField<ArrearMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.arrear_master.LAST_CHANGED_BY</code>.
     */
    public final TableField<ArrearMasterRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.arrear_master.LAST_CHANGED_ON</code>.
     */
    public final TableField<ArrearMasterRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private ArrearMaster(Name alias, Table<ArrearMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private ArrearMaster(Name alias, Table<ArrearMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.arrear_master</code> table reference
     */
    public ArrearMaster(String alias) {
        this(DSL.name(alias), ARREAR_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.arrear_master</code> table reference
     */
    public ArrearMaster(Name alias) {
        this(alias, ARREAR_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.arrear_master</code> table reference
     */
    public ArrearMaster() {
        this(DSL.name("arrear_master"), null);
    }

    public <O extends Record> ArrearMaster(Table<O> child, ForeignKey<O, ArrearMasterRecord> key) {
        super(child, key, ARREAR_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<ArrearMasterRecord> getPrimaryKey() {
        return Keys.KEY_ARREAR_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<ArrearMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<ArrearMasterRecord>>asList(Keys.KEY_ARREAR_MASTER_PRIMARY);
    }

    @Override
    public ArrearMaster as(String alias) {
        return new ArrearMaster(DSL.name(alias), this);
    }

    @Override
    public ArrearMaster as(Name alias) {
        return new ArrearMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ArrearMaster rename(String name) {
        return new ArrearMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ArrearMaster rename(Name name) {
        return new ArrearMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
