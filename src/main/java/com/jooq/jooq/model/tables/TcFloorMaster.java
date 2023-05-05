/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.TcFloorMasterRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
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
public class TcFloorMaster extends TableImpl<TcFloorMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.TC_FLOOR_MASTER</code>
     */
    public static final TcFloorMaster TC_FLOOR_MASTER = new TcFloorMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TcFloorMasterRecord> getRecordType() {
        return TcFloorMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.TC_FLOOR_MASTER.FLOOR_CODE</code>.
     */
    public final TableField<TcFloorMasterRecord, Integer> FLOOR_CODE = createField(DSL.name("FLOOR_CODE"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_FLOOR_MASTER.BUILDING_CODE</code>.
     */
    public final TableField<TcFloorMasterRecord, Integer> BUILDING_CODE = createField(DSL.name("BUILDING_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_FLOOR_MASTER.FLOOR_NAME</code>.
     */
    public final TableField<TcFloorMasterRecord, String> FLOOR_NAME = createField(DSL.name("FLOOR_NAME"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_FLOOR_MASTER.FROM_DATE</code>.
     */
    public final TableField<TcFloorMasterRecord, LocalDate> FROM_DATE = createField(DSL.name("FROM_DATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_FLOOR_MASTER.TO_DATE</code>.
     */
    public final TableField<TcFloorMasterRecord, LocalDate> TO_DATE = createField(DSL.name("TO_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_FLOOR_MASTER.STATUS</code>.
     */
    public final TableField<TcFloorMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_FLOOR_MASTER.CREATED_BY</code>.
     */
    public final TableField<TcFloorMasterRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_FLOOR_MASTER.CREATED_ON</code>.
     */
    public final TableField<TcFloorMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_FLOOR_MASTER.LAST_CHANGED_BY</code>.
     */
    public final TableField<TcFloorMasterRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_FLOOR_MASTER.LAST_CHANGED_ON</code>.
     */
    public final TableField<TcFloorMasterRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private TcFloorMaster(Name alias, Table<TcFloorMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private TcFloorMaster(Name alias, Table<TcFloorMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_FLOOR_MASTER</code> table reference
     */
    public TcFloorMaster(String alias) {
        this(DSL.name(alias), TC_FLOOR_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_FLOOR_MASTER</code> table reference
     */
    public TcFloorMaster(Name alias) {
        this(alias, TC_FLOOR_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.TC_FLOOR_MASTER</code> table reference
     */
    public TcFloorMaster() {
        this(DSL.name("TC_FLOOR_MASTER"), null);
    }

    public <O extends Record> TcFloorMaster(Table<O> child, ForeignKey<O, TcFloorMasterRecord> key) {
        super(child, key, TC_FLOOR_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TC_FLOOR_MASTER_PK_INDEXES);
    }

    @Override
    public Identity<TcFloorMasterRecord, Integer> getIdentity() {
        return (Identity<TcFloorMasterRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<TcFloorMasterRecord> getPrimaryKey() {
        return Keys.KEY_TC_FLOOR_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<TcFloorMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<TcFloorMasterRecord>>asList(Keys.KEY_TC_FLOOR_MASTER_PRIMARY);
    }

    @Override
    public TcFloorMaster as(String alias) {
        return new TcFloorMaster(DSL.name(alias), this);
    }

    @Override
    public TcFloorMaster as(Name alias) {
        return new TcFloorMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TcFloorMaster rename(String name) {
        return new TcFloorMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TcFloorMaster rename(Name name) {
        return new TcFloorMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, Integer, String, LocalDate, LocalDate, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
