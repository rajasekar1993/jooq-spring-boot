/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CountryMaster;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(
    name = "country_master",
    schema = "jooq_demo",
    uniqueConstraints = {
        @UniqueConstraint(name = "KEY_country_master_PRIMARY", columnNames = { "ID" })
    }
)
public class CountryMasterRecord extends UpdatableRecordImpl<CountryMasterRecord> implements Record7<Integer, String, String, Integer, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>jooq_demo.country_master.ID</code>.
     */
    public CountryMasterRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jooq_demo.country_master.ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, precision = 10)
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jooq_demo.country_master.SORT_NAME</code>.
     */
    public CountryMasterRecord setSortName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jooq_demo.country_master.SORT_NAME</code>.
     */
    @Column(name = "SORT_NAME", nullable = false, length = 3)
    @NotNull
    @Size(max = 3)
    public String getSortName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jooq_demo.country_master.NAME</code>.
     */
    public CountryMasterRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jooq_demo.country_master.NAME</code>.
     */
    @Column(name = "NAME", nullable = false, length = 150)
    @NotNull
    @Size(max = 150)
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jooq_demo.country_master.PHONE_CODE</code>.
     */
    public CountryMasterRecord setPhoneCode(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jooq_demo.country_master.PHONE_CODE</code>.
     */
    @Column(name = "PHONE_CODE", nullable = false, precision = 10)
    @NotNull
    public Integer getPhoneCode() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>jooq_demo.country_master.STATUS</code>.
     */
    public CountryMasterRecord setStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jooq_demo.country_master.STATUS</code>.
     */
    @Column(name = "STATUS", length = 1)
    @Size(max = 1)
    public String getStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jooq_demo.country_master.CREATED_BY</code>.
     */
    public CountryMasterRecord setCreatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>jooq_demo.country_master.CREATED_BY</code>.
     */
    @Column(name = "CREATED_BY", length = 45)
    @Size(max = 45)
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>jooq_demo.country_master.CREATED_ON</code>.
     */
    public CountryMasterRecord setCreatedOn(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>jooq_demo.country_master.CREATED_ON</code>.
     */
    @Column(name = "CREATED_ON")
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, String, String, Integer, String, String, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return CountryMaster.COUNTRY_MASTER.ID;
    }

    @Override
    public Field<String> field2() {
        return CountryMaster.COUNTRY_MASTER.SORT_NAME;
    }

    @Override
    public Field<String> field3() {
        return CountryMaster.COUNTRY_MASTER.NAME;
    }

    @Override
    public Field<Integer> field4() {
        return CountryMaster.COUNTRY_MASTER.PHONE_CODE;
    }

    @Override
    public Field<String> field5() {
        return CountryMaster.COUNTRY_MASTER.STATUS;
    }

    @Override
    public Field<String> field6() {
        return CountryMaster.COUNTRY_MASTER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return CountryMaster.COUNTRY_MASTER.CREATED_ON;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getSortName();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public Integer component4() {
        return getPhoneCode();
    }

    @Override
    public String component5() {
        return getStatus();
    }

    @Override
    public String component6() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component7() {
        return getCreatedOn();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getSortName();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public Integer value4() {
        return getPhoneCode();
    }

    @Override
    public String value5() {
        return getStatus();
    }

    @Override
    public String value6() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value7() {
        return getCreatedOn();
    }

    @Override
    public CountryMasterRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public CountryMasterRecord value2(String value) {
        setSortName(value);
        return this;
    }

    @Override
    public CountryMasterRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public CountryMasterRecord value4(Integer value) {
        setPhoneCode(value);
        return this;
    }

    @Override
    public CountryMasterRecord value5(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public CountryMasterRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CountryMasterRecord value7(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public CountryMasterRecord values(Integer value1, String value2, String value3, Integer value4, String value5, String value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CountryMasterRecord
     */
    public CountryMasterRecord() {
        super(CountryMaster.COUNTRY_MASTER);
    }

    /**
     * Create a detached, initialised CountryMasterRecord
     */
    public CountryMasterRecord(Integer id, String sortName, String name, Integer phoneCode, String status, String createdBy, LocalDateTime createdOn) {
        super(CountryMaster.COUNTRY_MASTER);

        setId(id);
        setSortName(sortName);
        setName(name);
        setPhoneCode(phoneCode);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
    }
}
