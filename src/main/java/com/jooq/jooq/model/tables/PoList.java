/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.PoListRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
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
public class PoList extends TableImpl<PoListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.po_list</code>
     */
    public static final PoList PO_LIST = new PoList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PoListRecord> getRecordType() {
        return PoListRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.po_list.COMP_CODE</code>.
     */
    public final TableField<PoListRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.VENDOR_CODE</code>.
     */
    public final TableField<PoListRecord, String> VENDOR_CODE = createField(DSL.name("VENDOR_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.PO_NUMBER</code>.
     */
    public final TableField<PoListRecord, String> PO_NUMBER = createField(DSL.name("PO_NUMBER"), SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.PO_ITEM_NO</code>.
     */
    public final TableField<PoListRecord, String> PO_ITEM_NO = createField(DSL.name("PO_ITEM_NO"), SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.DOC_CAT</code>.
     */
    public final TableField<PoListRecord, String> DOC_CAT = createField(DSL.name("DOC_CAT"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.ITEM_CAT</code>.
     */
    public final TableField<PoListRecord, String> ITEM_CAT = createField(DSL.name("ITEM_CAT"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.ACC_ASSIGN_CAT</code>.
     */
    public final TableField<PoListRecord, String> ACC_ASSIGN_CAT = createField(DSL.name("ACC_ASSIGN_CAT"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.DOC_DATE</code>.
     */
    public final TableField<PoListRecord, LocalDate> DOC_DATE = createField(DSL.name("DOC_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.RELEASE_STATUS</code>.
     */
    public final TableField<PoListRecord, String> RELEASE_STATUS = createField(DSL.name("RELEASE_STATUS"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.SHORT_TEXT</code>.
     */
    public final TableField<PoListRecord, String> SHORT_TEXT = createField(DSL.name("SHORT_TEXT"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.MATERIAL_CODE</code>.
     */
    public final TableField<PoListRecord, String> MATERIAL_CODE = createField(DSL.name("MATERIAL_CODE"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.GROSS_VALUE</code>.
     */
    public final TableField<PoListRecord, BigDecimal> GROSS_VALUE = createField(DSL.name("GROSS_VALUE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.NET_VALUE</code>.
     */
    public final TableField<PoListRecord, BigDecimal> NET_VALUE = createField(DSL.name("NET_VALUE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.STATUS</code>.
     */
    public final TableField<PoListRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.CREATED_BY</code>.
     */
    public final TableField<PoListRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.CREATED_ON</code>.
     */
    public final TableField<PoListRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.LAST_CHANGED_BY</code>.
     */
    public final TableField<PoListRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.po_list.LAST_CHANGED_ON</code>.
     */
    public final TableField<PoListRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private PoList(Name alias, Table<PoListRecord> aliased) {
        this(alias, aliased, null);
    }

    private PoList(Name alias, Table<PoListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.po_list</code> table reference
     */
    public PoList(String alias) {
        this(DSL.name(alias), PO_LIST);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.po_list</code> table reference
     */
    public PoList(Name alias) {
        this(alias, PO_LIST);
    }

    /**
     * Create a <code>vendor_portal_pbx.po_list</code> table reference
     */
    public PoList() {
        this(DSL.name("po_list"), null);
    }

    public <O extends Record> PoList(Table<O> child, ForeignKey<O, PoListRecord> key) {
        super(child, key, PO_LIST);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<PoListRecord> getPrimaryKey() {
        return Keys.KEY_PO_LIST_PRIMARY;
    }

    @Override
    public List<UniqueKey<PoListRecord>> getKeys() {
        return Arrays.<UniqueKey<PoListRecord>>asList(Keys.KEY_PO_LIST_PRIMARY);
    }

    @Override
    public PoList as(String alias) {
        return new PoList(DSL.name(alias), this);
    }

    @Override
    public PoList as(Name alias) {
        return new PoList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PoList rename(String name) {
        return new PoList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PoList rename(Name name) {
        return new PoList(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, String, String, String, String, String, LocalDate, String, String, String, BigDecimal, BigDecimal, String, Integer, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
