/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.VendorProfileHistoryRecord;

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
public class VendorProfileHistory extends TableImpl<VendorProfileHistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.vendor_profile_history</code>
     */
    public static final VendorProfileHistory VENDOR_PROFILE_HISTORY = new VendorProfileHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VendorProfileHistoryRecord> getRecordType() {
        return VendorProfileHistoryRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.VENDOR_CODE</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> VENDOR_CODE = createField(DSL.name("VENDOR_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.VENDOR_NAME</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> VENDOR_NAME = createField(DSL.name("VENDOR_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.DOOR_NO</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> DOOR_NO = createField(DSL.name("DOOR_NO"), SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.STREET1</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> STREET1 = createField(DSL.name("STREET1"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.STREET2</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> STREET2 = createField(DSL.name("STREET2"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.STREET3</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> STREET3 = createField(DSL.name("STREET3"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.STREET4</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> STREET4 = createField(DSL.name("STREET4"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.STREET5</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> STREET5 = createField(DSL.name("STREET5"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.CITY</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> CITY = createField(DSL.name("CITY"), SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.DISTRICT</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> DISTRICT = createField(DSL.name("DISTRICT"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.REGION_CODE</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> REGION_CODE = createField(DSL.name("REGION_CODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.COUNTRY_CODE</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> COUNTRY_CODE = createField(DSL.name("COUNTRY_CODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.PINCODE</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> PINCODE = createField(DSL.name("PINCODE"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.GSTIN</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> GSTIN = createField(DSL.name("GSTIN"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.GST_STATUS</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> GST_STATUS = createField(DSL.name("GST_STATUS"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.GST_REGISTRATION_DATE</code>.
     */
    public final TableField<VendorProfileHistoryRecord, LocalDate> GST_REGISTRATION_DATE = createField(DSL.name("GST_REGISTRATION_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.EMAIL_ID</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> EMAIL_ID = createField(DSL.name("EMAIL_ID"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.WEBSITE</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> WEBSITE = createField(DSL.name("WEBSITE"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.TELEPHONE_NO</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> TELEPHONE_NO = createField(DSL.name("TELEPHONE_NO"), SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.MOBILE_NO_1</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> MOBILE_NO_1 = createField(DSL.name("MOBILE_NO_1"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.MOBILE_NO_2</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> MOBILE_NO_2 = createField(DSL.name("MOBILE_NO_2"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.PAN_NO</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> PAN_NO = createField(DSL.name("PAN_NO"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.NATURE_OF_BUSINESS</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> NATURE_OF_BUSINESS = createField(DSL.name("NATURE_OF_BUSINESS"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.NATURE_OF_FIRM</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> NATURE_OF_FIRM = createField(DSL.name("NATURE_OF_FIRM"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.FATHER_HUSBAN_NAME</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> FATHER_HUSBAN_NAME = createField(DSL.name("FATHER_HUSBAN_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.AGE</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> AGE = createField(DSL.name("AGE"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.CREATED_BY</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.CREATED_ON</code>.
     */
    public final TableField<VendorProfileHistoryRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.LAST_CHANGED_BY</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.LAST_CHANGED_ON</code>.
     */
    public final TableField<VendorProfileHistoryRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.PAN_ATTACHMENT</code>.
     */
    public final TableField<VendorProfileHistoryRecord, byte[]> PAN_ATTACHMENT = createField(DSL.name("PAN_ATTACHMENT"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.PAN_ATTACHMENT_TYPE</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> PAN_ATTACHMENT_TYPE = createField(DSL.name("PAN_ATTACHMENT_TYPE"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.PAN_ATTACHMENT_NAME</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> PAN_ATTACHMENT_NAME = createField(DSL.name("PAN_ATTACHMENT_NAME"), SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.GST_ATTACHMENT</code>.
     */
    public final TableField<VendorProfileHistoryRecord, byte[]> GST_ATTACHMENT = createField(DSL.name("GST_ATTACHMENT"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.GST_ATTACHMENT_TYPE</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> GST_ATTACHMENT_TYPE = createField(DSL.name("GST_ATTACHMENT_TYPE"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.GST_ATTACHMENT_NAME</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> GST_ATTACHMENT_NAME = createField(DSL.name("GST_ATTACHMENT_NAME"), SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.DECLARATION_NAME</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> DECLARATION_NAME = createField(DSL.name("DECLARATION_NAME"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.DECLARATION_CONTACT_NO</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> DECLARATION_CONTACT_NO = createField(DSL.name("DECLARATION_CONTACT_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.STD_CODE</code>.
     */
    public final TableField<VendorProfileHistoryRecord, String> STD_CODE = createField(DSL.name("STD_CODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile_history.LAST_EDITED_ON</code>.
     */
    public final TableField<VendorProfileHistoryRecord, LocalDateTime> LAST_EDITED_ON = createField(DSL.name("LAST_EDITED_ON"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    private VendorProfileHistory(Name alias, Table<VendorProfileHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private VendorProfileHistory(Name alias, Table<VendorProfileHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.vendor_profile_history</code> table reference
     */
    public VendorProfileHistory(String alias) {
        this(DSL.name(alias), VENDOR_PROFILE_HISTORY);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.vendor_profile_history</code> table reference
     */
    public VendorProfileHistory(Name alias) {
        this(alias, VENDOR_PROFILE_HISTORY);
    }

    /**
     * Create a <code>vendor_portal_pbx.vendor_profile_history</code> table reference
     */
    public VendorProfileHistory() {
        this(DSL.name("vendor_profile_history"), null);
    }

    public <O extends Record> VendorProfileHistory(Table<O> child, ForeignKey<O, VendorProfileHistoryRecord> key) {
        super(child, key, VENDOR_PROFILE_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<VendorProfileHistoryRecord> getPrimaryKey() {
        return Keys.KEY_VENDOR_PROFILE_HISTORY_PRIMARY;
    }

    @Override
    public List<UniqueKey<VendorProfileHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<VendorProfileHistoryRecord>>asList(Keys.KEY_VENDOR_PROFILE_HISTORY_PRIMARY);
    }

    @Override
    public VendorProfileHistory as(String alias) {
        return new VendorProfileHistory(DSL.name(alias), this);
    }

    @Override
    public VendorProfileHistory as(Name alias) {
        return new VendorProfileHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VendorProfileHistory rename(String name) {
        return new VendorProfileHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VendorProfileHistory rename(Name name) {
        return new VendorProfileHistory(name, null);
    }
}
