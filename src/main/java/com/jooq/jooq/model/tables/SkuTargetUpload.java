/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.SkuTargetUploadRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
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
public class SkuTargetUpload extends TableImpl<SkuTargetUploadRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.sku_target_upload</code>
     */
    public static final SkuTargetUpload SKU_TARGET_UPLOAD = new SkuTargetUpload();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SkuTargetUploadRecord> getRecordType() {
        return SkuTargetUploadRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.CUSTOMER_CODE</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> CUSTOMER_CODE = createField(DSL.name("CUSTOMER_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.FROM_DATE</code>.
     */
    public final TableField<SkuTargetUploadRecord, LocalDate> FROM_DATE = createField(DSL.name("FROM_DATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.TO_DATE</code>.
     */
    public final TableField<SkuTargetUploadRecord, LocalDate> TO_DATE = createField(DSL.name("TO_DATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.CUSTOMER_NAME</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> CUSTOMER_NAME = createField(DSL.name("CUSTOMER_NAME"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.STATE</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> STATE = createField(DSL.name("STATE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.AREA</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> AREA = createField(DSL.name("AREA"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.HEADER_JSON</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> HEADER_JSON = createField(DSL.name("HEADER_JSON"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.DATA_JSON</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> DATA_JSON = createField(DSL.name("DATA_JSON"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.STATUS</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.TYPE_1</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> TYPE_1 = createField(DSL.name("TYPE_1"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.TYPE_2</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> TYPE_2 = createField(DSL.name("TYPE_2"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.TYPE_3</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> TYPE_3 = createField(DSL.name("TYPE_3"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.TYPE_4</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> TYPE_4 = createField(DSL.name("TYPE_4"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.TYPE_5</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> TYPE_5 = createField(DSL.name("TYPE_5"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.TYPE_6</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> TYPE_6 = createField(DSL.name("TYPE_6"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.CREATED_ON</code>.
     */
    public final TableField<SkuTargetUploadRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.sku_target_upload.CREATED_BY</code>.
     */
    public final TableField<SkuTargetUploadRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    private SkuTargetUpload(Name alias, Table<SkuTargetUploadRecord> aliased) {
        this(alias, aliased, null);
    }

    private SkuTargetUpload(Name alias, Table<SkuTargetUploadRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.sku_target_upload</code> table reference
     */
    public SkuTargetUpload(String alias) {
        this(DSL.name(alias), SKU_TARGET_UPLOAD);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.sku_target_upload</code> table reference
     */
    public SkuTargetUpload(Name alias) {
        this(alias, SKU_TARGET_UPLOAD);
    }

    /**
     * Create a <code>vendor_portal_pbx.sku_target_upload</code> table reference
     */
    public SkuTargetUpload() {
        this(DSL.name("sku_target_upload"), null);
    }

    public <O extends Record> SkuTargetUpload(Table<O> child, ForeignKey<O, SkuTargetUploadRecord> key) {
        super(child, key, SKU_TARGET_UPLOAD);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<SkuTargetUploadRecord> getPrimaryKey() {
        return Keys.KEY_SKU_TARGET_UPLOAD_PRIMARY;
    }

    @Override
    public List<UniqueKey<SkuTargetUploadRecord>> getKeys() {
        return Arrays.<UniqueKey<SkuTargetUploadRecord>>asList(Keys.KEY_SKU_TARGET_UPLOAD_PRIMARY);
    }

    @Override
    public SkuTargetUpload as(String alias) {
        return new SkuTargetUpload(DSL.name(alias), this);
    }

    @Override
    public SkuTargetUpload as(Name alias) {
        return new SkuTargetUpload(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SkuTargetUpload rename(String name) {
        return new SkuTargetUpload(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SkuTargetUpload rename(Name name) {
        return new SkuTargetUpload(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, LocalDate, LocalDate, String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}
