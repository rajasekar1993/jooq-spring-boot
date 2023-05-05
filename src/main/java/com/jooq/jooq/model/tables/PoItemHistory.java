/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.PoItemHistoryRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class PoItemHistory extends TableImpl<PoItemHistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.po_item_history</code>
     */
    public static final PoItemHistory PO_ITEM_HISTORY = new PoItemHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PoItemHistoryRecord> getRecordType() {
        return PoItemHistoryRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.po_item_history.COMP_CODE</code>.
     */
    public final TableField<PoItemHistoryRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.PO_NUMBER</code>.
     */
    public final TableField<PoItemHistoryRecord, String> PO_NUMBER = createField(DSL.name("PO_NUMBER"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.PO_ITEM_NO</code>.
     */
    public final TableField<PoItemHistoryRecord, String> PO_ITEM_NO = createField(DSL.name("PO_ITEM_NO"), SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.MAT_DOC</code>.
     */
    public final TableField<PoItemHistoryRecord, String> MAT_DOC = createField(DSL.name("MAT_DOC"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.DOC_YEAR</code>.
     */
    public final TableField<PoItemHistoryRecord, String> DOC_YEAR = createField(DSL.name("DOC_YEAR"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.MATDOC_ITM</code>.
     */
    public final TableField<PoItemHistoryRecord, String> MATDOC_ITM = createField(DSL.name("MATDOC_ITM"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.MOVE_TYPE</code>.
     */
    public final TableField<PoItemHistoryRecord, String> MOVE_TYPE = createField(DSL.name("MOVE_TYPE"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.PSTNG_DATE</code>.
     */
    public final TableField<PoItemHistoryRecord, LocalDate> PSTNG_DATE = createField(DSL.name("PSTNG_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.QUANTITY</code>.
     */
    public final TableField<PoItemHistoryRecord, BigDecimal> QUANTITY = createField(DSL.name("QUANTITY"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.MATERIAL</code>.
     */
    public final TableField<PoItemHistoryRecord, String> MATERIAL = createField(DSL.name("MATERIAL"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.PLANT</code>.
     */
    public final TableField<PoItemHistoryRecord, String> PLANT = createField(DSL.name("PLANT"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.REF_DOC_NO_LONG</code>.
     */
    public final TableField<PoItemHistoryRecord, String> REF_DOC_NO_LONG = createField(DSL.name("REF_DOC_NO_LONG"), SQLDataType.VARCHAR(35), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.HIST_TYPE</code>.
     */
    public final TableField<PoItemHistoryRecord, String> HIST_TYPE = createField(DSL.name("HIST_TYPE"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.CREATED_BY</code>.
     */
    public final TableField<PoItemHistoryRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.CREATED_ON</code>.
     */
    public final TableField<PoItemHistoryRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.LAST_CHANGED_BY</code>.
     */
    public final TableField<PoItemHistoryRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.LAST_CHANGED_ON</code>.
     */
    public final TableField<PoItemHistoryRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.UTR_NO</code>.
     */
    public final TableField<PoItemHistoryRecord, String> UTR_NO = createField(DSL.name("UTR_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.PAYMENT_DATE</code>.
     */
    public final TableField<PoItemHistoryRecord, LocalDate> PAYMENT_DATE = createField(DSL.name("PAYMENT_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.PAYMENT_AMT</code>.
     */
    public final TableField<PoItemHistoryRecord, String> PAYMENT_AMT = createField(DSL.name("PAYMENT_AMT"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.VENDOR_INVOICE_NO</code>.
     */
    public final TableField<PoItemHistoryRecord, String> VENDOR_INVOICE_NO = createField(DSL.name("VENDOR_INVOICE_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.PLANT_DESCRIPTION</code>.
     */
    public final TableField<PoItemHistoryRecord, String> PLANT_DESCRIPTION = createField(DSL.name("PLANT_DESCRIPTION"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.po_item_history.MATERIAL_DESCRIPTION</code>.
     */
    public final TableField<PoItemHistoryRecord, String> MATERIAL_DESCRIPTION = createField(DSL.name("MATERIAL_DESCRIPTION"), SQLDataType.VARCHAR(255), this, "");

    private PoItemHistory(Name alias, Table<PoItemHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private PoItemHistory(Name alias, Table<PoItemHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.po_item_history</code> table reference
     */
    public PoItemHistory(String alias) {
        this(DSL.name(alias), PO_ITEM_HISTORY);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.po_item_history</code> table reference
     */
    public PoItemHistory(Name alias) {
        this(alias, PO_ITEM_HISTORY);
    }

    /**
     * Create a <code>vendor_portal_pbx.po_item_history</code> table reference
     */
    public PoItemHistory() {
        this(DSL.name("po_item_history"), null);
    }

    public <O extends Record> PoItemHistory(Table<O> child, ForeignKey<O, PoItemHistoryRecord> key) {
        super(child, key, PO_ITEM_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<PoItemHistoryRecord> getPrimaryKey() {
        return Keys.KEY_PO_ITEM_HISTORY_PRIMARY;
    }

    @Override
    public List<UniqueKey<PoItemHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<PoItemHistoryRecord>>asList(Keys.KEY_PO_ITEM_HISTORY_PRIMARY);
    }

    @Override
    public PoItemHistory as(String alias) {
        return new PoItemHistory(DSL.name(alias), this);
    }

    @Override
    public PoItemHistory as(Name alias) {
        return new PoItemHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PoItemHistory rename(String name) {
        return new PoItemHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PoItemHistory rename(Name name) {
        return new PoItemHistory(name, null);
    }
}
