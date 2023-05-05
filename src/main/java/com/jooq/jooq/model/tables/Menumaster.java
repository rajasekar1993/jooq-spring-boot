/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.MenumasterRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class Menumaster extends TableImpl<MenumasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.menumaster</code>
     */
    public static final Menumaster MENUMASTER = new Menumaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MenumasterRecord> getRecordType() {
        return MenumasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.menumaster.MENU_ID</code>.
     */
    public final TableField<MenumasterRecord, Integer> MENU_ID = createField(DSL.name("MENU_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.menumaster.MENU_DESC</code>.
     */
    public final TableField<MenumasterRecord, String> MENU_DESC = createField(DSL.name("MENU_DESC"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.menumaster.MENU_VALUE</code>.
     */
    public final TableField<MenumasterRecord, String> MENU_VALUE = createField(DSL.name("MENU_VALUE"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.menumaster.STATUS</code>.
     */
    public final TableField<MenumasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(45), this, "");

    private Menumaster(Name alias, Table<MenumasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private Menumaster(Name alias, Table<MenumasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.menumaster</code> table reference
     */
    public Menumaster(String alias) {
        this(DSL.name(alias), MENUMASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.menumaster</code> table reference
     */
    public Menumaster(Name alias) {
        this(alias, MENUMASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.menumaster</code> table reference
     */
    public Menumaster() {
        this(DSL.name("menumaster"), null);
    }

    public <O extends Record> Menumaster(Table<O> child, ForeignKey<O, MenumasterRecord> key) {
        super(child, key, MENUMASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<MenumasterRecord> getPrimaryKey() {
        return Keys.KEY_MENUMASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<MenumasterRecord>> getKeys() {
        return Arrays.<UniqueKey<MenumasterRecord>>asList(Keys.KEY_MENUMASTER_PRIMARY);
    }

    @Override
    public Menumaster as(String alias) {
        return new Menumaster(DSL.name(alias), this);
    }

    @Override
    public Menumaster as(Name alias) {
        return new Menumaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Menumaster rename(String name) {
        return new Menumaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Menumaster rename(Name name) {
        return new Menumaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
