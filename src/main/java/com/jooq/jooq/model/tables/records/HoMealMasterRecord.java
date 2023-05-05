/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.HoMealMaster;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HoMealMasterRecord extends UpdatableRecordImpl<HoMealMasterRecord> implements Record9<Integer, String, BigDecimal, String, String, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ho_meal_master.meal_type_id</code>.
     */
    public HoMealMasterRecord setMealTypeId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ho_meal_master.meal_type_id</code>.
     */
    public Integer getMealTypeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ho_meal_master.meal_type_name</code>.
     */
    public HoMealMasterRecord setMealTypeName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ho_meal_master.meal_type_name</code>.
     */
    public String getMealTypeName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ho_meal_master.meal_price</code>.
     */
    public HoMealMasterRecord setMealPrice(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ho_meal_master.meal_price</code>.
     */
    public BigDecimal getMealPrice() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ho_meal_master.image_url</code>.
     */
    public HoMealMasterRecord setImageUrl(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ho_meal_master.image_url</code>.
     */
    public String getImageUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ho_meal_master.active</code>.
     */
    public HoMealMasterRecord setActive(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ho_meal_master.active</code>.
     */
    public String getActive() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ho_meal_master.created_by</code>.
     */
    public HoMealMasterRecord setCreatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ho_meal_master.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ho_meal_master.created_on</code>.
     */
    public HoMealMasterRecord setCreatedOn(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ho_meal_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ho_meal_master.last_changed_by</code>.
     */
    public HoMealMasterRecord setLastChangedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ho_meal_master.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ho_meal_master.last_changed_on</code>.
     */
    public HoMealMasterRecord setLastChangedOn(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ho_meal_master.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, BigDecimal, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, BigDecimal, String, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return HoMealMaster.HO_MEAL_MASTER.MEAL_TYPE_ID;
    }

    @Override
    public Field<String> field2() {
        return HoMealMaster.HO_MEAL_MASTER.MEAL_TYPE_NAME;
    }

    @Override
    public Field<BigDecimal> field3() {
        return HoMealMaster.HO_MEAL_MASTER.MEAL_PRICE;
    }

    @Override
    public Field<String> field4() {
        return HoMealMaster.HO_MEAL_MASTER.IMAGE_URL;
    }

    @Override
    public Field<String> field5() {
        return HoMealMaster.HO_MEAL_MASTER.ACTIVE;
    }

    @Override
    public Field<String> field6() {
        return HoMealMaster.HO_MEAL_MASTER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return HoMealMaster.HO_MEAL_MASTER.CREATED_ON;
    }

    @Override
    public Field<String> field8() {
        return HoMealMaster.HO_MEAL_MASTER.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return HoMealMaster.HO_MEAL_MASTER.LAST_CHANGED_ON;
    }

    @Override
    public Integer component1() {
        return getMealTypeId();
    }

    @Override
    public String component2() {
        return getMealTypeName();
    }

    @Override
    public BigDecimal component3() {
        return getMealPrice();
    }

    @Override
    public String component4() {
        return getImageUrl();
    }

    @Override
    public String component5() {
        return getActive();
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
    public String component8() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component9() {
        return getLastChangedOn();
    }

    @Override
    public Integer value1() {
        return getMealTypeId();
    }

    @Override
    public String value2() {
        return getMealTypeName();
    }

    @Override
    public BigDecimal value3() {
        return getMealPrice();
    }

    @Override
    public String value4() {
        return getImageUrl();
    }

    @Override
    public String value5() {
        return getActive();
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
    public String value8() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value9() {
        return getLastChangedOn();
    }

    @Override
    public HoMealMasterRecord value1(Integer value) {
        setMealTypeId(value);
        return this;
    }

    @Override
    public HoMealMasterRecord value2(String value) {
        setMealTypeName(value);
        return this;
    }

    @Override
    public HoMealMasterRecord value3(BigDecimal value) {
        setMealPrice(value);
        return this;
    }

    @Override
    public HoMealMasterRecord value4(String value) {
        setImageUrl(value);
        return this;
    }

    @Override
    public HoMealMasterRecord value5(String value) {
        setActive(value);
        return this;
    }

    @Override
    public HoMealMasterRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public HoMealMasterRecord value7(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public HoMealMasterRecord value8(String value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public HoMealMasterRecord value9(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public HoMealMasterRecord values(Integer value1, String value2, BigDecimal value3, String value4, String value5, String value6, LocalDateTime value7, String value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HoMealMasterRecord
     */
    public HoMealMasterRecord() {
        super(HoMealMaster.HO_MEAL_MASTER);
    }

    /**
     * Create a detached, initialised HoMealMasterRecord
     */
    public HoMealMasterRecord(Integer mealTypeId, String mealTypeName, BigDecimal mealPrice, String imageUrl, String active, String createdBy, LocalDateTime createdOn, String lastChangedBy, LocalDateTime lastChangedOn) {
        super(HoMealMaster.HO_MEAL_MASTER);

        setMealTypeId(mealTypeId);
        setMealTypeName(mealTypeName);
        setMealPrice(mealPrice);
        setImageUrl(imageUrl);
        setActive(active);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}
