/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.ExpenseMasterRecord;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExpenseMaster extends TableImpl<ExpenseMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.expense_master</code>
     */
    public static final ExpenseMaster EXPENSE_MASTER = new ExpenseMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExpenseMasterRecord> getRecordType() {
        return ExpenseMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.expense_master.SERIAL_NO</code>.
     */
    public final TableField<ExpenseMasterRecord, Integer> SERIAL_NO = createField(DSL.name("SERIAL_NO"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.expense_master.PROVISION_DESC</code>.
     */
    public final TableField<ExpenseMasterRecord, Integer> PROVISION_DESC = createField(DSL.name("PROVISION_DESC"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.expense_master.GL_ACC_NO</code>.
     */
    public final TableField<ExpenseMasterRecord, Integer> GL_ACC_NO = createField(DSL.name("GL_ACC_NO"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.expense_master.GL_ACC_NAME</code>.
     */
    public final TableField<ExpenseMasterRecord, String> GL_ACC_NAME = createField(DSL.name("GL_ACC_NAME"), SQLDataType.VARCHAR(38), this, "");

    /**
     * The column <code>vendor_portal_pbx.expense_master.PROVISIONAL_GL</code>.
     */
    public final TableField<ExpenseMasterRecord, Integer> PROVISIONAL_GL = createField(DSL.name("PROVISIONAL_GL"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.expense_master.PROVISIONAL_GL_NAME</code>.
     */
    public final TableField<ExpenseMasterRecord, String> PROVISIONAL_GL_NAME = createField(DSL.name("PROVISIONAL_GL_NAME"), SQLDataType.VARCHAR(33), this, "");

    /**
     * The column <code>vendor_portal_pbx.expense_master.CREATED_ON</code>.
     */
    public final TableField<ExpenseMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.expense_master.CREATED_BY</code>.
     */
    public final TableField<ExpenseMasterRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(4), this, "");

    private ExpenseMaster(Name alias, Table<ExpenseMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExpenseMaster(Name alias, Table<ExpenseMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.expense_master</code> table reference
     */
    public ExpenseMaster(String alias) {
        this(DSL.name(alias), EXPENSE_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.expense_master</code> table reference
     */
    public ExpenseMaster(Name alias) {
        this(alias, EXPENSE_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.expense_master</code> table reference
     */
    public ExpenseMaster() {
        this(DSL.name("expense_master"), null);
    }

    public <O extends Record> ExpenseMaster(Table<O> child, ForeignKey<O, ExpenseMasterRecord> key) {
        super(child, key, EXPENSE_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public ExpenseMaster as(String alias) {
        return new ExpenseMaster(DSL.name(alias), this);
    }

    @Override
    public ExpenseMaster as(Name alias) {
        return new ExpenseMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExpenseMaster rename(String name) {
        return new ExpenseMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExpenseMaster rename(Name name) {
        return new ExpenseMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Integer, String, Integer, String, LocalDateTime, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
