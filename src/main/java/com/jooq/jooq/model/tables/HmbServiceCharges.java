/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.HmbServiceChargesRecord;

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
public class HmbServiceCharges extends TableImpl<HmbServiceChargesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.hmb_service_charges</code>
     */
    public static final HmbServiceCharges HMB_SERVICE_CHARGES = new HmbServiceCharges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HmbServiceChargesRecord> getRecordType() {
        return HmbServiceChargesRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.COMP_CODE</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.BILL_NUM</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> BILL_NUM = createField(DSL.name("BILL_NUM"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.WERKS</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> WERKS = createField(DSL.name("WERKS"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.PARVW</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> PARVW = createField(DSL.name("PARVW"), SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.SOCIETY</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> SOCIETY = createField(DSL.name("SOCIETY"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.C_NAME</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> C_NAME = createField(DSL.name("C_NAME"), SQLDataType.VARCHAR(35).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.GESTYP</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> GESTYP = createField(DSL.name("GESTYP"), SQLDataType.VARCHAR(30).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.LIFNR</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> LIFNR = createField(DSL.name("LIFNR"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.C_START_DATE</code>.
     */
    public final TableField<HmbServiceChargesRecord, LocalDate> C_START_DATE = createField(DSL.name("C_START_DATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.C_END_DATE</code>.
     */
    public final TableField<HmbServiceChargesRecord, LocalDate> C_END_DATE = createField(DSL.name("C_END_DATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.AVG_QTY</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> AVG_QTY = createField(DSL.name("AVG_QTY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.PAYEE</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> PAYEE = createField(DSL.name("PAYEE"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.NO_OF_DAYS</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> NO_OF_DAYS = createField(DSL.name("NO_OF_DAYS"), SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.ACT_NO_OF_DAYS</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> ACT_NO_OF_DAYS = createField(DSL.name("ACT_NO_OF_DAYS"), SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.INC_AMT_INCHARGE</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> INC_AMT_INCHARGE = createField(DSL.name("INC_AMT_INCHARGE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.SAMPLE_MILK_AMT</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> SAMPLE_MILK_AMT = createField(DSL.name("SAMPLE_MILK_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.SMS_AMT</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> SMS_AMT = createField(DSL.name("SMS_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.CENTER_RENT</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> CENTER_RENT = createField(DSL.name("CENTER_RENT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.CENTER_EB</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> CENTER_EB = createField(DSL.name("CENTER_EB"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.QTY_COMM</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> QTY_COMM = createField(DSL.name("QTY_COMM"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.QTY_ASSU</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> QTY_ASSU = createField(DSL.name("QTY_ASSU"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.TS_TALLY</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> TS_TALLY = createField(DSL.name("TS_TALLY"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.TEST_SAMPLE</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> TEST_SAMPLE = createField(DSL.name("TEST_SAMPLE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.TEST_COMM</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> TEST_COMM = createField(DSL.name("TEST_COMM"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.ADLT_COMM</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> ADLT_COMM = createField(DSL.name("ADLT_COMM"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.SPIL_COMM</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> SPIL_COMM = createField(DSL.name("SPIL_COMM"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.TS_COMM</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> TS_COMM = createField(DSL.name("TS_COMM"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.INC_AMT</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> INC_AMT = createField(DSL.name("INC_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.ARREAR_AMT</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> ARREAR_AMT = createField(DSL.name("ARREAR_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.LOAN_INCENTIVE1</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> LOAN_INCENTIVE1 = createField(DSL.name("LOAN_INCENTIVE1"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.FEED_AMT</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> FEED_AMT = createField(DSL.name("FEED_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.FIELD_INCENTIVE</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> FIELD_INCENTIVE = createField(DSL.name("FIELD_INCENTIVE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.TDS_ARREAR</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> TDS_ARREAR = createField(DSL.name("TDS_ARREAR"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.TDS_INCENTIVE</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> TDS_INCENTIVE = createField(DSL.name("TDS_INCENTIVE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.TDS_DED</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> TDS_DED = createField(DSL.name("TDS_DED"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.TOTAL_TDS</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> TOTAL_TDS = createField(DSL.name("TOTAL_TDS"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.TOTAL</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> TOTAL = createField(DSL.name("TOTAL"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.DEDUCTIONS</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> DEDUCTIONS = createField(DSL.name("DEDUCTIONS"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.ACT_DED</code>.
     */
    public final TableField<HmbServiceChargesRecord, BigDecimal> ACT_DED = createField(DSL.name("ACT_DED"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.NET_AMT</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> NET_AMT = createField(DSL.name("NET_AMT"), SQLDataType.VARCHAR(31), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.UOM_KG</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> UOM_KG = createField(DSL.name("UOM_KG"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.LOCAL_CURR</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> LOCAL_CURR = createField(DSL.name("LOCAL_CURR"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.POST_DAT</code>.
     */
    public final TableField<HmbServiceChargesRecord, LocalDate> POST_DAT = createField(DSL.name("POST_DAT"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.POST_BY</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> POST_BY = createField(DSL.name("POST_BY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.DOCNO</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> DOCNO = createField(DSL.name("DOCNO"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.DOCNO_NON_TDS</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> DOCNO_NON_TDS = createField(DSL.name("DOCNO_NON_TDS"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.TRANSFER_DAT</code>.
     */
    public final TableField<HmbServiceChargesRecord, LocalDate> TRANSFER_DAT = createField(DSL.name("TRANSFER_DAT"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.TRANSFER_BY</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> TRANSFER_BY = createField(DSL.name("TRANSFER_BY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.WHT_TYPE</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> WHT_TYPE = createField(DSL.name("WHT_TYPE"), SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.WHT_CODE</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> WHT_CODE = createField(DSL.name("WHT_CODE"), SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.TDS_PERC</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> TDS_PERC = createField(DSL.name("TDS_PERC"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.STATUS</code>.
     */
    public final TableField<HmbServiceChargesRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.CREATED_BY</code>.
     */
    public final TableField<HmbServiceChargesRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.CREATED_ON</code>.
     */
    public final TableField<HmbServiceChargesRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.LAST_CHANGED_BY</code>.
     */
    public final TableField<HmbServiceChargesRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.hmb_service_charges.LAST_CHANGED_ON</code>.
     */
    public final TableField<HmbServiceChargesRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private HmbServiceCharges(Name alias, Table<HmbServiceChargesRecord> aliased) {
        this(alias, aliased, null);
    }

    private HmbServiceCharges(Name alias, Table<HmbServiceChargesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.hmb_service_charges</code> table reference
     */
    public HmbServiceCharges(String alias) {
        this(DSL.name(alias), HMB_SERVICE_CHARGES);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.hmb_service_charges</code> table reference
     */
    public HmbServiceCharges(Name alias) {
        this(alias, HMB_SERVICE_CHARGES);
    }

    /**
     * Create a <code>vendor_portal_pbx.hmb_service_charges</code> table reference
     */
    public HmbServiceCharges() {
        this(DSL.name("hmb_service_charges"), null);
    }

    public <O extends Record> HmbServiceCharges(Table<O> child, ForeignKey<O, HmbServiceChargesRecord> key) {
        super(child, key, HMB_SERVICE_CHARGES);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<HmbServiceChargesRecord> getPrimaryKey() {
        return Keys.KEY_HMB_SERVICE_CHARGES_PRIMARY;
    }

    @Override
    public List<UniqueKey<HmbServiceChargesRecord>> getKeys() {
        return Arrays.<UniqueKey<HmbServiceChargesRecord>>asList(Keys.KEY_HMB_SERVICE_CHARGES_PRIMARY);
    }

    @Override
    public HmbServiceCharges as(String alias) {
        return new HmbServiceCharges(DSL.name(alias), this);
    }

    @Override
    public HmbServiceCharges as(Name alias) {
        return new HmbServiceCharges(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HmbServiceCharges rename(String name) {
        return new HmbServiceCharges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HmbServiceCharges rename(Name name) {
        return new HmbServiceCharges(name, null);
    }
}
