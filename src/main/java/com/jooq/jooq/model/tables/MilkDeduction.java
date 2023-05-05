/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.MilkDeductionRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class MilkDeduction extends TableImpl<MilkDeductionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.milk_deduction</code>
     */
    public static final MilkDeduction MILK_DEDUCTION = new MilkDeduction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MilkDeductionRecord> getRecordType() {
        return MilkDeductionRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.COMP_CODE</code>.
     */
    public final TableField<MilkDeductionRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZDOCNO</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZDOCNO = createField(DSL.name("ZDOCNO"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZDOCITEM</code>.
     */
    public final TableField<MilkDeductionRecord, Integer> ZDOCITEM = createField(DSL.name("ZDOCITEM"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZDEDTYPE</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZDEDTYPE = createField(DSL.name("ZDEDTYPE"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZLOANTYPE</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZLOANTYPE = createField(DSL.name("ZLOANTYPE"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZEDATE</code>.
     */
    public final TableField<MilkDeductionRecord, LocalDate> ZEDATE = createField(DSL.name("ZEDATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZSEQUENCE</code>.
     */
    public final TableField<MilkDeductionRecord, Integer> ZSEQUENCE = createField(DSL.name("ZSEQUENCE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZVENDOR</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZVENDOR = createField(DSL.name("ZVENDOR"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.BUKRS</code>.
     */
    public final TableField<MilkDeductionRecord, String> BUKRS = createField(DSL.name("BUKRS"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZCUSTOMER</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZCUSTOMER = createField(DSL.name("ZCUSTOMER"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.WERKS</code>.
     */
    public final TableField<MilkDeductionRecord, String> WERKS = createField(DSL.name("WERKS"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZSDATE</code>.
     */
    public final TableField<MilkDeductionRecord, LocalDate> ZSDATE = createField(DSL.name("ZSDATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZCC_HMB</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZCC_HMB = createField(DSL.name("ZCC_HMB"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZBILLCYCLE</code>.
     */
    public final TableField<MilkDeductionRecord, Integer> ZBILLCYCLE = createField(DSL.name("ZBILLCYCLE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZAMOUNT</code>.
     */
    public final TableField<MilkDeductionRecord, BigDecimal> ZAMOUNT = createField(DSL.name("ZAMOUNT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZEMIAMT</code>.
     */
    public final TableField<MilkDeductionRecord, BigDecimal> ZEMIAMT = createField(DSL.name("ZEMIAMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.P_AMT</code>.
     */
    public final TableField<MilkDeductionRecord, BigDecimal> P_AMT = createField(DSL.name("P_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZDEDAMT</code>.
     */
    public final TableField<MilkDeductionRecord, BigDecimal> ZDEDAMT = createField(DSL.name("ZDEDAMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.S_AMT</code>.
     */
    public final TableField<MilkDeductionRecord, BigDecimal> S_AMT = createField(DSL.name("S_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZBALANCE</code>.
     */
    public final TableField<MilkDeductionRecord, BigDecimal> ZBALANCE = createField(DSL.name("ZBALANCE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZLOANAC</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZLOANAC = createField(DSL.name("ZLOANAC"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZBANKEY</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZBANKEY = createField(DSL.name("ZBANKEY"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.SAKNR</code>.
     */
    public final TableField<MilkDeductionRecord, String> SAKNR = createField(DSL.name("SAKNR"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZDEDDOC</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZDEDDOC = createField(DSL.name("ZDEDDOC"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZPRSTA</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZPRSTA = createField(DSL.name("ZPRSTA"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZAPPSTA</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZAPPSTA = createField(DSL.name("ZAPPSTA"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZAPPRBY</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZAPPRBY = createField(DSL.name("ZAPPRBY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZAPPDATE</code>.
     */
    public final TableField<MilkDeductionRecord, LocalDate> ZAPPDATE = createField(DSL.name("ZAPPDATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZREJBY</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZREJBY = createField(DSL.name("ZREJBY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZREJDATE</code>.
     */
    public final TableField<MilkDeductionRecord, LocalDate> ZREJDATE = createField(DSL.name("ZREJDATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZDELFG</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZDELFG = createField(DSL.name("ZDELFG"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZDELBY</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZDELBY = createField(DSL.name("ZDELBY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZDELDATE</code>.
     */
    public final TableField<MilkDeductionRecord, LocalDate> ZDELDATE = createField(DSL.name("ZDELDATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZREMARK1</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZREMARK1 = createField(DSL.name("ZREMARK1"), SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZREMARK2</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZREMARK2 = createField(DSL.name("ZREMARK2"), SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ZWERKS</code>.
     */
    public final TableField<MilkDeductionRecord, String> ZWERKS = createField(DSL.name("ZWERKS"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.ROUTE_NO</code>.
     */
    public final TableField<MilkDeductionRecord, String> ROUTE_NO = createField(DSL.name("ROUTE_NO"), SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.TRUCK_NO</code>.
     */
    public final TableField<MilkDeductionRecord, String> TRUCK_NO = createField(DSL.name("TRUCK_NO"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.PAID</code>.
     */
    public final TableField<MilkDeductionRecord, String> PAID = createField(DSL.name("PAID"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.BILL_NUM</code>.
     */
    public final TableField<MilkDeductionRecord, String> BILL_NUM = createField(DSL.name("BILL_NUM"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.QUANTITY</code>.
     */
    public final TableField<MilkDeductionRecord, String> QUANTITY = createField(DSL.name("QUANTITY"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.UOM</code>.
     */
    public final TableField<MilkDeductionRecord, String> UOM = createField(DSL.name("UOM"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.STATUS</code>.
     */
    public final TableField<MilkDeductionRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.CREATED_BY</code>.
     */
    public final TableField<MilkDeductionRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.CREATED_ON</code>.
     */
    public final TableField<MilkDeductionRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.LAST_CHANGED_BY</code>.
     */
    public final TableField<MilkDeductionRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_deduction.LAST_CHANGED_ON</code>.
     */
    public final TableField<MilkDeductionRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private MilkDeduction(Name alias, Table<MilkDeductionRecord> aliased) {
        this(alias, aliased, null);
    }

    private MilkDeduction(Name alias, Table<MilkDeductionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_deduction</code> table reference
     */
    public MilkDeduction(String alias) {
        this(DSL.name(alias), MILK_DEDUCTION);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_deduction</code> table reference
     */
    public MilkDeduction(Name alias) {
        this(alias, MILK_DEDUCTION);
    }

    /**
     * Create a <code>vendor_portal_pbx.milk_deduction</code> table reference
     */
    public MilkDeduction() {
        this(DSL.name("milk_deduction"), null);
    }

    public <O extends Record> MilkDeduction(Table<O> child, ForeignKey<O, MilkDeductionRecord> key) {
        super(child, key, MILK_DEDUCTION);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MILK_DEDUCTION_FARMER_DEDU_INDEX, Indexes.MILK_DEDUCTION_IDX_SECONDMILKPAYDEDUCTION);
    }

    @Override
    public UniqueKey<MilkDeductionRecord> getPrimaryKey() {
        return Keys.KEY_MILK_DEDUCTION_PRIMARY;
    }

    @Override
    public List<UniqueKey<MilkDeductionRecord>> getKeys() {
        return Arrays.<UniqueKey<MilkDeductionRecord>>asList(Keys.KEY_MILK_DEDUCTION_PRIMARY);
    }

    @Override
    public MilkDeduction as(String alias) {
        return new MilkDeduction(DSL.name(alias), this);
    }

    @Override
    public MilkDeduction as(Name alias) {
        return new MilkDeduction(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkDeduction rename(String name) {
        return new MilkDeduction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkDeduction rename(Name name) {
        return new MilkDeduction(name, null);
    }
}
