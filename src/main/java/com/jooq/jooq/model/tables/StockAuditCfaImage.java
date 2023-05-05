/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.StockAuditCfaImageRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class StockAuditCfaImage extends TableImpl<StockAuditCfaImageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.stock_audit_cfa_image</code>
     */
    public static final StockAuditCfaImage STOCK_AUDIT_CFA_IMAGE = new StockAuditCfaImage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StockAuditCfaImageRecord> getRecordType() {
        return StockAuditCfaImageRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.stock_audit_cfa_image.COMP_CODE</code>.
     */
    public final TableField<StockAuditCfaImageRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.stock_audit_cfa_image.PLANT_CODE</code>.
     */
    public final TableField<StockAuditCfaImageRecord, String> PLANT_CODE = createField(DSL.name("PLANT_CODE"), SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.stock_audit_cfa_image.CREATED_ON</code>.
     */
    public final TableField<StockAuditCfaImageRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.stock_audit_cfa_image.STORAGE_LOCATION</code>.
     */
    public final TableField<StockAuditCfaImageRecord, String> STORAGE_LOCATION = createField(DSL.name("STORAGE_LOCATION"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.stock_audit_cfa_image.CREATED_BY</code>.
     */
    public final TableField<StockAuditCfaImageRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.stock_audit_cfa_image.IMAGE_URL</code>.
     */
    public final TableField<StockAuditCfaImageRecord, String> IMAGE_URL = createField(DSL.name("IMAGE_URL"), SQLDataType.VARCHAR(400), this, "");

    /**
     * The column <code>vendor_portal_pbx.stock_audit_cfa_image.IMAGE_NAME</code>.
     */
    public final TableField<StockAuditCfaImageRecord, String> IMAGE_NAME = createField(DSL.name("IMAGE_NAME"), SQLDataType.VARCHAR(400), this, "");

    /**
     * The column <code>vendor_portal_pbx.stock_audit_cfa_image.IMAGE_TYPE</code>.
     */
    public final TableField<StockAuditCfaImageRecord, String> IMAGE_TYPE = createField(DSL.name("IMAGE_TYPE"), SQLDataType.VARCHAR(45), this, "");

    private StockAuditCfaImage(Name alias, Table<StockAuditCfaImageRecord> aliased) {
        this(alias, aliased, null);
    }

    private StockAuditCfaImage(Name alias, Table<StockAuditCfaImageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.stock_audit_cfa_image</code> table reference
     */
    public StockAuditCfaImage(String alias) {
        this(DSL.name(alias), STOCK_AUDIT_CFA_IMAGE);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.stock_audit_cfa_image</code> table reference
     */
    public StockAuditCfaImage(Name alias) {
        this(alias, STOCK_AUDIT_CFA_IMAGE);
    }

    /**
     * Create a <code>vendor_portal_pbx.stock_audit_cfa_image</code> table reference
     */
    public StockAuditCfaImage() {
        this(DSL.name("stock_audit_cfa_image"), null);
    }

    public <O extends Record> StockAuditCfaImage(Table<O> child, ForeignKey<O, StockAuditCfaImageRecord> key) {
        super(child, key, STOCK_AUDIT_CFA_IMAGE);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<StockAuditCfaImageRecord> getPrimaryKey() {
        return Keys.KEY_STOCK_AUDIT_CFA_IMAGE_PRIMARY;
    }

    @Override
    public List<UniqueKey<StockAuditCfaImageRecord>> getKeys() {
        return Arrays.<UniqueKey<StockAuditCfaImageRecord>>asList(Keys.KEY_STOCK_AUDIT_CFA_IMAGE_PRIMARY);
    }

    @Override
    public StockAuditCfaImage as(String alias) {
        return new StockAuditCfaImage(DSL.name(alias), this);
    }

    @Override
    public StockAuditCfaImage as(Name alias) {
        return new StockAuditCfaImage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StockAuditCfaImage rename(String name) {
        return new StockAuditCfaImage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StockAuditCfaImage rename(Name name) {
        return new StockAuditCfaImage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, LocalDateTime, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
