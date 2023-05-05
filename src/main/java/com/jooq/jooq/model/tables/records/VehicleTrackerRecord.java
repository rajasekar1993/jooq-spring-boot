/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.VehicleTracker;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VehicleTrackerRecord extends UpdatableRecordImpl<VehicleTrackerRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_tracker.SOCIETY</code>.
     */
    public VehicleTrackerRecord setSociety(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_tracker.SOCIETY</code>.
     */
    public String getSociety() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_tracker.VEHICLE_NO</code>.
     */
    public VehicleTrackerRecord setVehicleNo(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_tracker.VEHICLE_NO</code>.
     */
    public String getVehicleNo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_tracker.SHIPMENT_NO</code>.
     */
    public VehicleTrackerRecord setShipmentNo(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_tracker.SHIPMENT_NO</code>.
     */
    public String getShipmentNo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_tracker.LIVE_URL</code>.
     */
    public VehicleTrackerRecord setLiveUrl(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_tracker.LIVE_URL</code>.
     */
    public String getLiveUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_tracker.CREATED_ON</code>.
     */
    public VehicleTrackerRecord setCreatedOn(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_tracker.CREATED_ON</code>.
     */
    public String getCreatedOn() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return VehicleTracker.VEHICLE_TRACKER.SOCIETY;
    }

    @Override
    public Field<String> field2() {
        return VehicleTracker.VEHICLE_TRACKER.VEHICLE_NO;
    }

    @Override
    public Field<String> field3() {
        return VehicleTracker.VEHICLE_TRACKER.SHIPMENT_NO;
    }

    @Override
    public Field<String> field4() {
        return VehicleTracker.VEHICLE_TRACKER.LIVE_URL;
    }

    @Override
    public Field<String> field5() {
        return VehicleTracker.VEHICLE_TRACKER.CREATED_ON;
    }

    @Override
    public String component1() {
        return getSociety();
    }

    @Override
    public String component2() {
        return getVehicleNo();
    }

    @Override
    public String component3() {
        return getShipmentNo();
    }

    @Override
    public String component4() {
        return getLiveUrl();
    }

    @Override
    public String component5() {
        return getCreatedOn();
    }

    @Override
    public String value1() {
        return getSociety();
    }

    @Override
    public String value2() {
        return getVehicleNo();
    }

    @Override
    public String value3() {
        return getShipmentNo();
    }

    @Override
    public String value4() {
        return getLiveUrl();
    }

    @Override
    public String value5() {
        return getCreatedOn();
    }

    @Override
    public VehicleTrackerRecord value1(String value) {
        setSociety(value);
        return this;
    }

    @Override
    public VehicleTrackerRecord value2(String value) {
        setVehicleNo(value);
        return this;
    }

    @Override
    public VehicleTrackerRecord value3(String value) {
        setShipmentNo(value);
        return this;
    }

    @Override
    public VehicleTrackerRecord value4(String value) {
        setLiveUrl(value);
        return this;
    }

    @Override
    public VehicleTrackerRecord value5(String value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public VehicleTrackerRecord values(String value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VehicleTrackerRecord
     */
    public VehicleTrackerRecord() {
        super(VehicleTracker.VEHICLE_TRACKER);
    }

    /**
     * Create a detached, initialised VehicleTrackerRecord
     */
    public VehicleTrackerRecord(String society, String vehicleNo, String shipmentNo, String liveUrl, String createdOn) {
        super(VehicleTracker.VEHICLE_TRACKER);

        setSociety(society);
        setVehicleNo(vehicleNo);
        setShipmentNo(shipmentNo);
        setLiveUrl(liveUrl);
        setCreatedOn(createdOn);
    }
}
