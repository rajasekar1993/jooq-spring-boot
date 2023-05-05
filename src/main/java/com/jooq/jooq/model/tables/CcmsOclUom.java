/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CcmsOclUomRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class CcmsOclUom extends TableImpl<CcmsOclUomRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ccms_ocl_uom</code>
     */
    public static final CcmsOclUom CCMS_OCL_UOM = new CcmsOclUom();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CcmsOclUomRecord> getRecordType() {
        return CcmsOclUomRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ccms_ocl_uom.uom</code>.
     */
    public final TableField<CcmsOclUomRecord, String> UOM = createField(DSL.name("uom"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_ocl_uom.status</code>.
     */
    public final TableField<CcmsOclUomRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_ocl_uom.created_on</code>.
     */
    public final TableField<CcmsOclUomRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_ocl_uom.created_by</code>.
     */
    public final TableField<CcmsOclUomRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_ocl_uom.last_changed_on</code>.
     */
    public final TableField<CcmsOclUomRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("last_changed_on"), SQLDataType.LOCALDATETIME(0), this, "");

    private CcmsOclUom(Name alias, Table<CcmsOclUomRecord> aliased) {
        this(alias, aliased, null);
    }

    private CcmsOclUom(Name alias, Table<CcmsOclUomRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_ocl_uom</code> table reference
     */
    public CcmsOclUom(String alias) {
        this(DSL.name(alias), CCMS_OCL_UOM);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_ocl_uom</code> table reference
     */
    public CcmsOclUom(Name alias) {
        this(alias, CCMS_OCL_UOM);
    }

    /**
     * Create a <code>vendor_portal_pbx.ccms_ocl_uom</code> table reference
     */
    public CcmsOclUom() {
        this(DSL.name("ccms_ocl_uom"), null);
    }

    public <O extends Record> CcmsOclUom(Table<O> child, ForeignKey<O, CcmsOclUomRecord> key) {
        super(child, key, CCMS_OCL_UOM);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CcmsOclUomRecord> getPrimaryKey() {
        return Keys.KEY_CCMS_OCL_UOM_PRIMARY;
    }

    @Override
    public List<UniqueKey<CcmsOclUomRecord>> getKeys() {
        return Arrays.<UniqueKey<CcmsOclUomRecord>>asList(Keys.KEY_CCMS_OCL_UOM_PRIMARY);
    }

    @Override
    public CcmsOclUom as(String alias) {
        return new CcmsOclUom(DSL.name(alias), this);
    }

    @Override
    public CcmsOclUom as(Name alias) {
        return new CcmsOclUom(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsOclUom rename(String name) {
        return new CcmsOclUom(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsOclUom rename(Name name) {
        return new CcmsOclUom(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
