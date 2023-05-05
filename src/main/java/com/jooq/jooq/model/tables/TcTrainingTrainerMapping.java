/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.TcTrainingTrainerMappingRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class TcTrainingTrainerMapping extends TableImpl<TcTrainingTrainerMappingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.TC_TRAINING_TRAINER_MAPPING</code>
     */
    public static final TcTrainingTrainerMapping TC_TRAINING_TRAINER_MAPPING = new TcTrainingTrainerMapping();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TcTrainingTrainerMappingRecord> getRecordType() {
        return TcTrainingTrainerMappingRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.TC_TRAINING_TRAINER_MAPPING.CENTER_CODE</code>.
     */
    public final TableField<TcTrainingTrainerMappingRecord, Integer> CENTER_CODE = createField(DSL.name("CENTER_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRAINING_TRAINER_MAPPING.TRAINING_CODE</code>.
     */
    public final TableField<TcTrainingTrainerMappingRecord, Integer> TRAINING_CODE = createField(DSL.name("TRAINING_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRAINING_TRAINER_MAPPING.EMP_CODE</code>.
     */
    public final TableField<TcTrainingTrainerMappingRecord, String> EMP_CODE = createField(DSL.name("EMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRAINING_TRAINER_MAPPING.STATUS</code>.
     */
    public final TableField<TcTrainingTrainerMappingRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRAINING_TRAINER_MAPPING.CREATED_BY</code>.
     */
    public final TableField<TcTrainingTrainerMappingRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRAINING_TRAINER_MAPPING.CREATED_ON</code>.
     */
    public final TableField<TcTrainingTrainerMappingRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRAINING_TRAINER_MAPPING.LAST_CHANGED_BY</code>.
     */
    public final TableField<TcTrainingTrainerMappingRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRAINING_TRAINER_MAPPING.LAST_CHANGED_ON</code>.
     */
    public final TableField<TcTrainingTrainerMappingRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private TcTrainingTrainerMapping(Name alias, Table<TcTrainingTrainerMappingRecord> aliased) {
        this(alias, aliased, null);
    }

    private TcTrainingTrainerMapping(Name alias, Table<TcTrainingTrainerMappingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_TRAINING_TRAINER_MAPPING</code> table reference
     */
    public TcTrainingTrainerMapping(String alias) {
        this(DSL.name(alias), TC_TRAINING_TRAINER_MAPPING);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_TRAINING_TRAINER_MAPPING</code> table reference
     */
    public TcTrainingTrainerMapping(Name alias) {
        this(alias, TC_TRAINING_TRAINER_MAPPING);
    }

    /**
     * Create a <code>vendor_portal_pbx.TC_TRAINING_TRAINER_MAPPING</code> table reference
     */
    public TcTrainingTrainerMapping() {
        this(DSL.name("TC_TRAINING_TRAINER_MAPPING"), null);
    }

    public <O extends Record> TcTrainingTrainerMapping(Table<O> child, ForeignKey<O, TcTrainingTrainerMappingRecord> key) {
        super(child, key, TC_TRAINING_TRAINER_MAPPING);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<TcTrainingTrainerMappingRecord> getPrimaryKey() {
        return Keys.KEY_TC_TRAINING_TRAINER_MAPPING_PRIMARY;
    }

    @Override
    public List<UniqueKey<TcTrainingTrainerMappingRecord>> getKeys() {
        return Arrays.<UniqueKey<TcTrainingTrainerMappingRecord>>asList(Keys.KEY_TC_TRAINING_TRAINER_MAPPING_PRIMARY);
    }

    @Override
    public TcTrainingTrainerMapping as(String alias) {
        return new TcTrainingTrainerMapping(DSL.name(alias), this);
    }

    @Override
    public TcTrainingTrainerMapping as(Name alias) {
        return new TcTrainingTrainerMapping(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TcTrainingTrainerMapping rename(String name) {
        return new TcTrainingTrainerMapping(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TcTrainingTrainerMapping rename(Name name) {
        return new TcTrainingTrainerMapping(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
