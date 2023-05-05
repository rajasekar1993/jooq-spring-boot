/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.MilkPaymentHaRecord;

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
public class MilkPaymentHa extends TableImpl<MilkPaymentHaRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.milk_payment_ha</code>
     */
    public static final MilkPaymentHa MILK_PAYMENT_HA = new MilkPaymentHa();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MilkPaymentHaRecord> getRecordType() {
        return MilkPaymentHaRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.COMP_CODE</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.BILL_NUM</code>.
     */
    public final TableField<MilkPaymentHaRecord, Long> BILL_NUM = createField(DSL.name("BILL_NUM"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.DATE_FRM</code>.
     */
    public final TableField<MilkPaymentHaRecord, LocalDate> DATE_FRM = createField(DSL.name("DATE_FRM"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.DATE_TO</code>.
     */
    public final TableField<MilkPaymentHaRecord, LocalDate> DATE_TO = createField(DSL.name("DATE_TO"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.PLANT</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> PLANT = createField(DSL.name("PLANT"), SQLDataType.VARCHAR(8).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.SOCIETY</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> SOCIETY = createField(DSL.name("SOCIETY"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.FARMER</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> FARMER = createField(DSL.name("FARMER"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.GROSS_AMT</code>.
     */
    public final TableField<MilkPaymentHaRecord, BigDecimal> GROSS_AMT = createField(DSL.name("GROSS_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.DEDUCTIONS</code>.
     */
    public final TableField<MilkPaymentHaRecord, BigDecimal> DEDUCTIONS = createField(DSL.name("DEDUCTIONS"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.RECOVERIES</code>.
     */
    public final TableField<MilkPaymentHaRecord, BigDecimal> RECOVERIES = createField(DSL.name("RECOVERIES"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.ARREARS</code>.
     */
    public final TableField<MilkPaymentHaRecord, BigDecimal> ARREARS = createField(DSL.name("ARREARS"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.NET_AMT</code>.
     */
    public final TableField<MilkPaymentHaRecord, BigDecimal> NET_AMT = createField(DSL.name("NET_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.ACT_DED</code>.
     */
    public final TableField<MilkPaymentHaRecord, BigDecimal> ACT_DED = createField(DSL.name("ACT_DED"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.ADJ_DOC_POST_BY</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> ADJ_DOC_POST_BY = createField(DSL.name("ADJ_DOC_POST_BY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.AVG_RATE</code>.
     */
    public final TableField<MilkPaymentHaRecord, BigDecimal> AVG_RATE = createField(DSL.name("AVG_RATE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.BASIC_MILK</code>.
     */
    public final TableField<MilkPaymentHaRecord, BigDecimal> BASIC_MILK = createField(DSL.name("BASIC_MILK"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.BLK_CNT</code>.
     */
    public final TableField<MilkPaymentHaRecord, Integer> BLK_CNT = createField(DSL.name("BLK_CNT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.BUS_TYP</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> BUS_TYP = createField(DSL.name("BUS_TYP"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.C_NAME</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> C_NAME = createField(DSL.name("C_NAME"), SQLDataType.VARCHAR(35), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.DOCNO</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> DOCNO = createField(DSL.name("DOCNO"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.FARMER_TY</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> FARMER_TY = createField(DSL.name("FARMER_TY"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.FAR_CNT</code>.
     */
    public final TableField<MilkPaymentHaRecord, Integer> FAR_CNT = createField(DSL.name("FAR_CNT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.FV_CNT</code>.
     */
    public final TableField<MilkPaymentHaRecord, Integer> FV_CNT = createField(DSL.name("FV_CNT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.F_NAME</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> F_NAME = createField(DSL.name("F_NAME"), SQLDataType.VARCHAR(35), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.HMB_CNT</code>.
     */
    public final TableField<MilkPaymentHaRecord, Integer> HMB_CNT = createField(DSL.name("HMB_CNT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.INCENTIVE</code>.
     */
    public final TableField<MilkPaymentHaRecord, BigDecimal> INCENTIVE = createField(DSL.name("INCENTIVE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.NAME1</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> NAME1 = createField(DSL.name("NAME1"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.NEG_ADJ_DOC_C</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> NEG_ADJ_DOC_C = createField(DSL.name("NEG_ADJ_DOC_C"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.NEG_ADJ_DOC_F</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> NEG_ADJ_DOC_F = createField(DSL.name("NEG_ADJ_DOC_F"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.NEG_POST_DATE</code>.
     */
    public final TableField<MilkPaymentHaRecord, LocalDate> NEG_POST_DATE = createField(DSL.name("NEG_POST_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.PAYEE</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> PAYEE = createField(DSL.name("PAYEE"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.POST_BY</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> POST_BY = createField(DSL.name("POST_BY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.POST_DAT</code>.
     */
    public final TableField<MilkPaymentHaRecord, LocalDate> POST_DAT = createField(DSL.name("POST_DAT"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.P_CODE</code>.
     */
    public final TableField<MilkPaymentHaRecord, Integer> P_CODE = createField(DSL.name("P_CODE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.P_SO</code>.
     */
    public final TableField<MilkPaymentHaRecord, Integer> P_SO = createField(DSL.name("P_SO"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.QUANTITY</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> QUANTITY = createField(DSL.name("QUANTITY"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.REMARKS</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.ROUTE</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> ROUTE = createField(DSL.name("ROUTE"), SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.R_NAME</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> R_NAME = createField(DSL.name("R_NAME"), SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.STATUS</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.CREATED_BY</code>.
     */
    public final TableField<MilkPaymentHaRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.CREATED_ON</code>.
     */
    public final TableField<MilkPaymentHaRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.LAST_CHANGED_BY</code>.
     */
    public final TableField<MilkPaymentHaRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.LAST_CHANGED_ON</code>.
     */
    public final TableField<MilkPaymentHaRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.BANKN</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> BANKN = createField(DSL.name("BANKN"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.BANKL</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> BANKL = createField(DSL.name("BANKL"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha.FEED_ELIGIBLE</code>.
     */
    public final TableField<MilkPaymentHaRecord, String> FEED_ELIGIBLE = createField(DSL.name("FEED_ELIGIBLE"), SQLDataType.VARCHAR(260), this, "");

    private MilkPaymentHa(Name alias, Table<MilkPaymentHaRecord> aliased) {
        this(alias, aliased, null);
    }

    private MilkPaymentHa(Name alias, Table<MilkPaymentHaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_payment_ha</code> table reference
     */
    public MilkPaymentHa(String alias) {
        this(DSL.name(alias), MILK_PAYMENT_HA);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_payment_ha</code> table reference
     */
    public MilkPaymentHa(Name alias) {
        this(alias, MILK_PAYMENT_HA);
    }

    /**
     * Create a <code>vendor_portal_pbx.milk_payment_ha</code> table reference
     */
    public MilkPaymentHa() {
        this(DSL.name("milk_payment_ha"), null);
    }

    public <O extends Record> MilkPaymentHa(Table<O> child, ForeignKey<O, MilkPaymentHaRecord> key) {
        super(child, key, MILK_PAYMENT_HA);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MILK_PAYMENT_HA_IDX_SECONDMILKPAYHA, Indexes.MILK_PAYMENT_HA_SECONDARY_MILK_DEDUCTION, Indexes.MILK_PAYMENT_HA_SECONDARY_MILKPAYMENTHA);
    }

    @Override
    public UniqueKey<MilkPaymentHaRecord> getPrimaryKey() {
        return Keys.KEY_MILK_PAYMENT_HA_PRIMARY;
    }

    @Override
    public List<UniqueKey<MilkPaymentHaRecord>> getKeys() {
        return Arrays.<UniqueKey<MilkPaymentHaRecord>>asList(Keys.KEY_MILK_PAYMENT_HA_PRIMARY);
    }

    @Override
    public MilkPaymentHa as(String alias) {
        return new MilkPaymentHa(DSL.name(alias), this);
    }

    @Override
    public MilkPaymentHa as(Name alias) {
        return new MilkPaymentHa(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkPaymentHa rename(String name) {
        return new MilkPaymentHa(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkPaymentHa rename(Name name) {
        return new MilkPaymentHa(name, null);
    }
}
