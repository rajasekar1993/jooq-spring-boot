/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.MenuCardUploadRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class MenuCardUpload extends TableImpl<MenuCardUploadRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.menu_Card_Upload</code>
     */
    public static final MenuCardUpload MENU_CARD_UPLOAD = new MenuCardUpload();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MenuCardUploadRecord> getRecordType() {
        return MenuCardUploadRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.menu_Card_Upload.SERIAL_NO</code>.
     */
    public final TableField<MenuCardUploadRecord, String> SERIAL_NO = createField(DSL.name("SERIAL_NO"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.menu_Card_Upload.ATTACHMENT</code>.
     */
    public final TableField<MenuCardUploadRecord, byte[]> ATTACHMENT = createField(DSL.name("ATTACHMENT"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.menu_Card_Upload.ATTACHMENT_TYPE</code>.
     */
    public final TableField<MenuCardUploadRecord, String> ATTACHMENT_TYPE = createField(DSL.name("ATTACHMENT_TYPE"), SQLDataType.VARCHAR(55).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.menu_Card_Upload.ATTACHMENT_NAME</code>.
     */
    public final TableField<MenuCardUploadRecord, String> ATTACHMENT_NAME = createField(DSL.name("ATTACHMENT_NAME"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.menu_Card_Upload.ATTACHMENT_DATE</code>.
     */
    public final TableField<MenuCardUploadRecord, LocalDateTime> ATTACHMENT_DATE = createField(DSL.name("ATTACHMENT_DATE"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.menu_Card_Upload.STATUS</code>.
     */
    public final TableField<MenuCardUploadRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.menu_Card_Upload.CREATED_ON</code>.
     */
    public final TableField<MenuCardUploadRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.menu_Card_Upload.CREATED_BY</code>.
     */
    public final TableField<MenuCardUploadRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.menu_Card_Upload.CHANGED_ON</code>.
     */
    public final TableField<MenuCardUploadRecord, LocalDateTime> CHANGED_ON = createField(DSL.name("CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.menu_Card_Upload.CHANGED_BY</code>.
     */
    public final TableField<MenuCardUploadRecord, String> CHANGED_BY = createField(DSL.name("CHANGED_BY"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.menu_Card_Upload.COUNTRY_CODE</code>.
     */
    public final TableField<MenuCardUploadRecord, String> COUNTRY_CODE = createField(DSL.name("COUNTRY_CODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.menu_Card_Upload.DIVISION</code>.
     */
    public final TableField<MenuCardUploadRecord, String> DIVISION = createField(DSL.name("DIVISION"), SQLDataType.VARCHAR(45), this, "");

    private MenuCardUpload(Name alias, Table<MenuCardUploadRecord> aliased) {
        this(alias, aliased, null);
    }

    private MenuCardUpload(Name alias, Table<MenuCardUploadRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.menu_Card_Upload</code> table reference
     */
    public MenuCardUpload(String alias) {
        this(DSL.name(alias), MENU_CARD_UPLOAD);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.menu_Card_Upload</code> table reference
     */
    public MenuCardUpload(Name alias) {
        this(alias, MENU_CARD_UPLOAD);
    }

    /**
     * Create a <code>vendor_portal_pbx.menu_Card_Upload</code> table reference
     */
    public MenuCardUpload() {
        this(DSL.name("menu_Card_Upload"), null);
    }

    public <O extends Record> MenuCardUpload(Table<O> child, ForeignKey<O, MenuCardUploadRecord> key) {
        super(child, key, MENU_CARD_UPLOAD);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<MenuCardUploadRecord> getPrimaryKey() {
        return Keys.KEY_MENU_CARD_UPLOAD_PRIMARY;
    }

    @Override
    public List<UniqueKey<MenuCardUploadRecord>> getKeys() {
        return Arrays.<UniqueKey<MenuCardUploadRecord>>asList(Keys.KEY_MENU_CARD_UPLOAD_PRIMARY);
    }

    @Override
    public MenuCardUpload as(String alias) {
        return new MenuCardUpload(DSL.name(alias), this);
    }

    @Override
    public MenuCardUpload as(Name alias) {
        return new MenuCardUpload(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MenuCardUpload rename(String name) {
        return new MenuCardUpload(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MenuCardUpload rename(Name name) {
        return new MenuCardUpload(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, byte[], String, String, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
