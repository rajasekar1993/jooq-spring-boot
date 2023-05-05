/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.StockAuditUserLock;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StockAuditUserLockRecord extends UpdatableRecordImpl<StockAuditUserLockRecord> implements Record7<String, String, String, String, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.stock_audit_user_lock.USER_ID</code>.
     */
    public StockAuditUserLockRecord setUserId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stock_audit_user_lock.USER_ID</code>.
     */
    public String getUserId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stock_audit_user_lock.PLANT_CODE</code>.
     */
    public StockAuditUserLockRecord setPlantCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stock_audit_user_lock.PLANT_CODE</code>.
     */
    public String getPlantCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stock_audit_user_lock.STORAGE_LOCATION</code>.
     */
    public StockAuditUserLockRecord setStorageLocation(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stock_audit_user_lock.STORAGE_LOCATION</code>.
     */
    public String getStorageLocation() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stock_audit_user_lock.STATUS</code>.
     */
    public StockAuditUserLockRecord setStatus(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stock_audit_user_lock.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stock_audit_user_lock.DOWNLOADED_DATE</code>.
     */
    public StockAuditUserLockRecord setDownloadedDate(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stock_audit_user_lock.DOWNLOADED_DATE</code>.
     */
    public LocalDateTime getDownloadedDate() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stock_audit_user_lock.DOWNLOADED_BY</code>.
     */
    public StockAuditUserLockRecord setDownloadedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stock_audit_user_lock.DOWNLOADED_BY</code>.
     */
    public String getDownloadedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stock_audit_user_lock.FLAG</code>.
     */
    public StockAuditUserLockRecord setFlag(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stock_audit_user_lock.FLAG</code>.
     */
    public String getFlag() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, LocalDateTime, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, LocalDateTime, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return StockAuditUserLock.STOCK_AUDIT_USER_LOCK.USER_ID;
    }

    @Override
    public Field<String> field2() {
        return StockAuditUserLock.STOCK_AUDIT_USER_LOCK.PLANT_CODE;
    }

    @Override
    public Field<String> field3() {
        return StockAuditUserLock.STOCK_AUDIT_USER_LOCK.STORAGE_LOCATION;
    }

    @Override
    public Field<String> field4() {
        return StockAuditUserLock.STOCK_AUDIT_USER_LOCK.STATUS;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return StockAuditUserLock.STOCK_AUDIT_USER_LOCK.DOWNLOADED_DATE;
    }

    @Override
    public Field<String> field6() {
        return StockAuditUserLock.STOCK_AUDIT_USER_LOCK.DOWNLOADED_BY;
    }

    @Override
    public Field<String> field7() {
        return StockAuditUserLock.STOCK_AUDIT_USER_LOCK.FLAG;
    }

    @Override
    public String component1() {
        return getUserId();
    }

    @Override
    public String component2() {
        return getPlantCode();
    }

    @Override
    public String component3() {
        return getStorageLocation();
    }

    @Override
    public String component4() {
        return getStatus();
    }

    @Override
    public LocalDateTime component5() {
        return getDownloadedDate();
    }

    @Override
    public String component6() {
        return getDownloadedBy();
    }

    @Override
    public String component7() {
        return getFlag();
    }

    @Override
    public String value1() {
        return getUserId();
    }

    @Override
    public String value2() {
        return getPlantCode();
    }

    @Override
    public String value3() {
        return getStorageLocation();
    }

    @Override
    public String value4() {
        return getStatus();
    }

    @Override
    public LocalDateTime value5() {
        return getDownloadedDate();
    }

    @Override
    public String value6() {
        return getDownloadedBy();
    }

    @Override
    public String value7() {
        return getFlag();
    }

    @Override
    public StockAuditUserLockRecord value1(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public StockAuditUserLockRecord value2(String value) {
        setPlantCode(value);
        return this;
    }

    @Override
    public StockAuditUserLockRecord value3(String value) {
        setStorageLocation(value);
        return this;
    }

    @Override
    public StockAuditUserLockRecord value4(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public StockAuditUserLockRecord value5(LocalDateTime value) {
        setDownloadedDate(value);
        return this;
    }

    @Override
    public StockAuditUserLockRecord value6(String value) {
        setDownloadedBy(value);
        return this;
    }

    @Override
    public StockAuditUserLockRecord value7(String value) {
        setFlag(value);
        return this;
    }

    @Override
    public StockAuditUserLockRecord values(String value1, String value2, String value3, String value4, LocalDateTime value5, String value6, String value7) {
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
     * Create a detached StockAuditUserLockRecord
     */
    public StockAuditUserLockRecord() {
        super(StockAuditUserLock.STOCK_AUDIT_USER_LOCK);
    }

    /**
     * Create a detached, initialised StockAuditUserLockRecord
     */
    public StockAuditUserLockRecord(String userId, String plantCode, String storageLocation, String status, LocalDateTime downloadedDate, String downloadedBy, String flag) {
        super(StockAuditUserLock.STOCK_AUDIT_USER_LOCK);

        setUserId(userId);
        setPlantCode(plantCode);
        setStorageLocation(storageLocation);
        setStatus(status);
        setDownloadedDate(downloadedDate);
        setDownloadedBy(downloadedBy);
        setFlag(flag);
    }
}
