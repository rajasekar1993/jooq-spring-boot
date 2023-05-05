/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.VendorLocationHistoryRecord;

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
public class VendorLocationHistory extends TableImpl<VendorLocationHistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.vendor_location_history</code>
     */
    public static final VendorLocationHistory VENDOR_LOCATION_HISTORY = new VendorLocationHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VendorLocationHistoryRecord> getRecordType() {
        return VendorLocationHistoryRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.VENDOR_CODE</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> VENDOR_CODE = createField(DSL.name("VENDOR_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.SERIAL_NO</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> SERIAL_NO = createField(DSL.name("SERIAL_NO"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.FACTORY_OR_OFFICE</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> FACTORY_OR_OFFICE = createField(DSL.name("FACTORY_OR_OFFICE"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.COMPANY_START_YEAR</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> COMPANY_START_YEAR = createField(DSL.name("COMPANY_START_YEAR"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.CERTIFICATE_TYPE</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> CERTIFICATE_TYPE = createField(DSL.name("CERTIFICATE_TYPE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.OTHER_CERTIFICATE_TYPE</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> OTHER_CERTIFICATE_TYPE = createField(DSL.name("OTHER_CERTIFICATE_TYPE"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.CERTIFICATE_NO</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> CERTIFICATE_NO = createField(DSL.name("CERTIFICATE_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.ISSUED_DATE</code>.
     */
    public final TableField<VendorLocationHistoryRecord, LocalDate> ISSUED_DATE = createField(DSL.name("ISSUED_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.START_DATE</code>.
     */
    public final TableField<VendorLocationHistoryRecord, LocalDate> START_DATE = createField(DSL.name("START_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.END_DATE</code>.
     */
    public final TableField<VendorLocationHistoryRecord, LocalDate> END_DATE = createField(DSL.name("END_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.ATTACHEMENT</code>.
     */
    public final TableField<VendorLocationHistoryRecord, byte[]> ATTACHEMENT = createField(DSL.name("ATTACHEMENT"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.ATTACHMENT_TYPE</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> ATTACHMENT_TYPE = createField(DSL.name("ATTACHMENT_TYPE"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.ATTACHMENT_NAME</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> ATTACHMENT_NAME = createField(DSL.name("ATTACHMENT_NAME"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.LOCATION_NAME</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> LOCATION_NAME = createField(DSL.name("LOCATION_NAME"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.DOOR_NO</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> DOOR_NO = createField(DSL.name("DOOR_NO"), SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.STREET_NAME1</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> STREET_NAME1 = createField(DSL.name("STREET_NAME1"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.STREET_NAME2</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> STREET_NAME2 = createField(DSL.name("STREET_NAME2"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.CITY</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> CITY = createField(DSL.name("CITY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.PINCODE</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> PINCODE = createField(DSL.name("PINCODE"), SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.COUNTRY_CODE</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> COUNTRY_CODE = createField(DSL.name("COUNTRY_CODE"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.REGION_CODE</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> REGION_CODE = createField(DSL.name("REGION_CODE"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.DISTRICT_CODE</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> DISTRICT_CODE = createField(DSL.name("DISTRICT_CODE"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.CREATED_BY</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.CREATED_ON</code>.
     */
    public final TableField<VendorLocationHistoryRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.LAST_CHANGED_BY</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.LAST_CHANGED_ON</code>.
     */
    public final TableField<VendorLocationHistoryRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.LOCATION_DECLARATION_NAME</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> LOCATION_DECLARATION_NAME = createField(DSL.name("LOCATION_DECLARATION_NAME"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.LOCATION_DECLARATION_NO</code>.
     */
    public final TableField<VendorLocationHistoryRecord, String> LOCATION_DECLARATION_NO = createField(DSL.name("LOCATION_DECLARATION_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_location_history.LAST_EDITED_ON</code>.
     */
    public final TableField<VendorLocationHistoryRecord, LocalDateTime> LAST_EDITED_ON = createField(DSL.name("LAST_EDITED_ON"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    private VendorLocationHistory(Name alias, Table<VendorLocationHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private VendorLocationHistory(Name alias, Table<VendorLocationHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.vendor_location_history</code> table reference
     */
    public VendorLocationHistory(String alias) {
        this(DSL.name(alias), VENDOR_LOCATION_HISTORY);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.vendor_location_history</code> table reference
     */
    public VendorLocationHistory(Name alias) {
        this(alias, VENDOR_LOCATION_HISTORY);
    }

    /**
     * Create a <code>vendor_portal_pbx.vendor_location_history</code> table reference
     */
    public VendorLocationHistory() {
        this(DSL.name("vendor_location_history"), null);
    }

    public <O extends Record> VendorLocationHistory(Table<O> child, ForeignKey<O, VendorLocationHistoryRecord> key) {
        super(child, key, VENDOR_LOCATION_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<VendorLocationHistoryRecord> getPrimaryKey() {
        return Keys.KEY_VENDOR_LOCATION_HISTORY_PRIMARY;
    }

    @Override
    public List<UniqueKey<VendorLocationHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<VendorLocationHistoryRecord>>asList(Keys.KEY_VENDOR_LOCATION_HISTORY_PRIMARY);
    }

    @Override
    public VendorLocationHistory as(String alias) {
        return new VendorLocationHistory(DSL.name(alias), this);
    }

    @Override
    public VendorLocationHistory as(Name alias) {
        return new VendorLocationHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VendorLocationHistory rename(String name) {
        return new VendorLocationHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VendorLocationHistory rename(Name name) {
        return new VendorLocationHistory(name, null);
    }
}
