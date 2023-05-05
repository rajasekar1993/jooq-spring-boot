/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.DistrictMasterRecord;

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
public class DistrictMaster extends TableImpl<DistrictMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.district_master</code>
     */
    public static final DistrictMaster DISTRICT_MASTER = new DistrictMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DistrictMasterRecord> getRecordType() {
        return DistrictMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.district_master.DISTRICT_CODE</code>.
     */
    public final TableField<DistrictMasterRecord, String> DISTRICT_CODE = createField(DSL.name("DISTRICT_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.district_master.REGION_CODE</code>.
     */
    public final TableField<DistrictMasterRecord, String> REGION_CODE = createField(DSL.name("REGION_CODE"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.district_master.COUNTRY_CODE</code>.
     */
    public final TableField<DistrictMasterRecord, String> COUNTRY_CODE = createField(DSL.name("COUNTRY_CODE"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.district_master.DISTRICT_NAME</code>.
     */
    public final TableField<DistrictMasterRecord, String> DISTRICT_NAME = createField(DSL.name("DISTRICT_NAME"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.district_master.STATUS</code>.
     */
    public final TableField<DistrictMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.district_master.STATE_CODE</code>.
     */
    public final TableField<DistrictMasterRecord, String> STATE_CODE = createField(DSL.name("STATE_CODE"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.district_master.CREATED_BY</code>.
     */
    public final TableField<DistrictMasterRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.district_master.CREATED_ON</code>.
     */
    public final TableField<DistrictMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.district_master.LAST_CHANGED_BY</code>.
     */
    public final TableField<DistrictMasterRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.district_master.LAST_CHANGED_ON</code>.
     */
    public final TableField<DistrictMasterRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private DistrictMaster(Name alias, Table<DistrictMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private DistrictMaster(Name alias, Table<DistrictMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.district_master</code> table reference
     */
    public DistrictMaster(String alias) {
        this(DSL.name(alias), DISTRICT_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.district_master</code> table reference
     */
    public DistrictMaster(Name alias) {
        this(alias, DISTRICT_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.district_master</code> table reference
     */
    public DistrictMaster() {
        this(DSL.name("district_master"), null);
    }

    public <O extends Record> DistrictMaster(Table<O> child, ForeignKey<O, DistrictMasterRecord> key) {
        super(child, key, DISTRICT_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<DistrictMasterRecord> getPrimaryKey() {
        return Keys.KEY_DISTRICT_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<DistrictMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<DistrictMasterRecord>>asList(Keys.KEY_DISTRICT_MASTER_PRIMARY);
    }

    @Override
    public DistrictMaster as(String alias) {
        return new DistrictMaster(DSL.name(alias), this);
    }

    @Override
    public DistrictMaster as(Name alias) {
        return new DistrictMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DistrictMaster rename(String name) {
        return new DistrictMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DistrictMaster rename(Name name) {
        return new DistrictMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
