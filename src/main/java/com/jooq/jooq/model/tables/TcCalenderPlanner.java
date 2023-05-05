/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.TcCalenderPlannerRecord;

import java.time.LocalDate;
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
public class TcCalenderPlanner extends TableImpl<TcCalenderPlannerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.TC_CALENDER_PLANNER</code>
     */
    public static final TcCalenderPlanner TC_CALENDER_PLANNER = new TcCalenderPlanner();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TcCalenderPlannerRecord> getRecordType() {
        return TcCalenderPlannerRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.TC_CALENDER_PLANNER.TRAINING_CENTER_CODE</code>.
     */
    public final TableField<TcCalenderPlannerRecord, Integer> TRAINING_CENTER_CODE = createField(DSL.name("TRAINING_CENTER_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_CALENDER_PLANNER.DATE</code>.
     */
    public final TableField<TcCalenderPlannerRecord, LocalDate> DATE = createField(DSL.name("DATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_CALENDER_PLANNER.YEAR</code>.
     */
    public final TableField<TcCalenderPlannerRecord, String> YEAR = createField(DSL.name("YEAR"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_CALENDER_PLANNER.MONTH</code>.
     */
    public final TableField<TcCalenderPlannerRecord, String> MONTH = createField(DSL.name("MONTH"), SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_CALENDER_PLANNER.DAY</code>.
     */
    public final TableField<TcCalenderPlannerRecord, String> DAY = createField(DSL.name("DAY"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_CALENDER_PLANNER.HOLIDAY_FLAG</code>.
     */
    public final TableField<TcCalenderPlannerRecord, String> HOLIDAY_FLAG = createField(DSL.name("HOLIDAY_FLAG"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_CALENDER_PLANNER.BOOKED_FLAG</code>.
     */
    public final TableField<TcCalenderPlannerRecord, String> BOOKED_FLAG = createField(DSL.name("BOOKED_FLAG"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_CALENDER_PLANNER.AVAILABILITY_FLAG</code>.
     */
    public final TableField<TcCalenderPlannerRecord, String> AVAILABILITY_FLAG = createField(DSL.name("AVAILABILITY_FLAG"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_CALENDER_PLANNER.COLOR_CODE</code>.
     */
    public final TableField<TcCalenderPlannerRecord, String> COLOR_CODE = createField(DSL.name("COLOR_CODE"), SQLDataType.VARCHAR(7), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_CALENDER_PLANNER.REMARKS</code>.
     */
    public final TableField<TcCalenderPlannerRecord, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(95), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_CALENDER_PLANNER.UPDATED_ON</code>.
     */
    public final TableField<TcCalenderPlannerRecord, LocalDate> UPDATED_ON = createField(DSL.name("UPDATED_ON"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_CALENDER_PLANNER.UPDATED_BY</code>.
     */
    public final TableField<TcCalenderPlannerRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(45), this, "");

    private TcCalenderPlanner(Name alias, Table<TcCalenderPlannerRecord> aliased) {
        this(alias, aliased, null);
    }

    private TcCalenderPlanner(Name alias, Table<TcCalenderPlannerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_CALENDER_PLANNER</code> table reference
     */
    public TcCalenderPlanner(String alias) {
        this(DSL.name(alias), TC_CALENDER_PLANNER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_CALENDER_PLANNER</code> table reference
     */
    public TcCalenderPlanner(Name alias) {
        this(alias, TC_CALENDER_PLANNER);
    }

    /**
     * Create a <code>vendor_portal_pbx.TC_CALENDER_PLANNER</code> table reference
     */
    public TcCalenderPlanner() {
        this(DSL.name("TC_CALENDER_PLANNER"), null);
    }

    public <O extends Record> TcCalenderPlanner(Table<O> child, ForeignKey<O, TcCalenderPlannerRecord> key) {
        super(child, key, TC_CALENDER_PLANNER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<TcCalenderPlannerRecord> getPrimaryKey() {
        return Keys.KEY_TC_CALENDER_PLANNER_PRIMARY;
    }

    @Override
    public List<UniqueKey<TcCalenderPlannerRecord>> getKeys() {
        return Arrays.<UniqueKey<TcCalenderPlannerRecord>>asList(Keys.KEY_TC_CALENDER_PLANNER_PRIMARY);
    }

    @Override
    public TcCalenderPlanner as(String alias) {
        return new TcCalenderPlanner(DSL.name(alias), this);
    }

    @Override
    public TcCalenderPlanner as(Name alias) {
        return new TcCalenderPlanner(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TcCalenderPlanner rename(String name) {
        return new TcCalenderPlanner(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TcCalenderPlanner rename(Name name) {
        return new TcCalenderPlanner(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, LocalDate, String, String, String, String, String, String, String, String, LocalDate, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
