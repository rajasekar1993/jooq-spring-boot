/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.ContractPeriod;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContractPeriodRecord extends UpdatableRecordImpl<ContractPeriodRecord> implements Record9<String, String, String, String, LocalDate, LocalDate, String, LocalDate, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.contract_period.COMPANY_CODE</code>.
     */
    public ContractPeriodRecord setCompanyCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_period.COMPANY_CODE</code>.
     */
    public String getCompanyCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_period.VENDOR_CODE</code>.
     */
    public ContractPeriodRecord setVendorCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_period.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_period.CONTRACT</code>.
     */
    public ContractPeriodRecord setContract(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_period.CONTRACT</code>.
     */
    public String getContract() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_period.CONTRACT_NAME</code>.
     */
    public ContractPeriodRecord setContractName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_period.CONTRACT_NAME</code>.
     */
    public String getContractName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_period.CONTRACT_START_DATE</code>.
     */
    public ContractPeriodRecord setContractStartDate(LocalDate value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_period.CONTRACT_START_DATE</code>.
     */
    public LocalDate getContractStartDate() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_period.CONTRACT_END_DATE</code>.
     */
    public ContractPeriodRecord setContractEndDate(LocalDate value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_period.CONTRACT_END_DATE</code>.
     */
    public LocalDate getContractEndDate() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_period.CONTRACT_STATUS</code>.
     */
    public ContractPeriodRecord setContractStatus(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_period.CONTRACT_STATUS</code>.
     */
    public String getContractStatus() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_period.CREATED_ON</code>.
     */
    public ContractPeriodRecord setCreatedOn(LocalDate value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_period.CREATED_ON</code>.
     */
    public LocalDate getCreatedOn() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_period.CREATED_BY</code>.
     */
    public ContractPeriodRecord setCreatedBy(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_period.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, LocalDate, LocalDate, String, LocalDate, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, String, String, String, LocalDate, LocalDate, String, LocalDate, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ContractPeriod.CONTRACT_PERIOD.COMPANY_CODE;
    }

    @Override
    public Field<String> field2() {
        return ContractPeriod.CONTRACT_PERIOD.VENDOR_CODE;
    }

    @Override
    public Field<String> field3() {
        return ContractPeriod.CONTRACT_PERIOD.CONTRACT;
    }

    @Override
    public Field<String> field4() {
        return ContractPeriod.CONTRACT_PERIOD.CONTRACT_NAME;
    }

    @Override
    public Field<LocalDate> field5() {
        return ContractPeriod.CONTRACT_PERIOD.CONTRACT_START_DATE;
    }

    @Override
    public Field<LocalDate> field6() {
        return ContractPeriod.CONTRACT_PERIOD.CONTRACT_END_DATE;
    }

    @Override
    public Field<String> field7() {
        return ContractPeriod.CONTRACT_PERIOD.CONTRACT_STATUS;
    }

    @Override
    public Field<LocalDate> field8() {
        return ContractPeriod.CONTRACT_PERIOD.CREATED_ON;
    }

    @Override
    public Field<String> field9() {
        return ContractPeriod.CONTRACT_PERIOD.CREATED_BY;
    }

    @Override
    public String component1() {
        return getCompanyCode();
    }

    @Override
    public String component2() {
        return getVendorCode();
    }

    @Override
    public String component3() {
        return getContract();
    }

    @Override
    public String component4() {
        return getContractName();
    }

    @Override
    public LocalDate component5() {
        return getContractStartDate();
    }

    @Override
    public LocalDate component6() {
        return getContractEndDate();
    }

    @Override
    public String component7() {
        return getContractStatus();
    }

    @Override
    public LocalDate component8() {
        return getCreatedOn();
    }

    @Override
    public String component9() {
        return getCreatedBy();
    }

    @Override
    public String value1() {
        return getCompanyCode();
    }

    @Override
    public String value2() {
        return getVendorCode();
    }

    @Override
    public String value3() {
        return getContract();
    }

    @Override
    public String value4() {
        return getContractName();
    }

    @Override
    public LocalDate value5() {
        return getContractStartDate();
    }

    @Override
    public LocalDate value6() {
        return getContractEndDate();
    }

    @Override
    public String value7() {
        return getContractStatus();
    }

    @Override
    public LocalDate value8() {
        return getCreatedOn();
    }

    @Override
    public String value9() {
        return getCreatedBy();
    }

    @Override
    public ContractPeriodRecord value1(String value) {
        setCompanyCode(value);
        return this;
    }

    @Override
    public ContractPeriodRecord value2(String value) {
        setVendorCode(value);
        return this;
    }

    @Override
    public ContractPeriodRecord value3(String value) {
        setContract(value);
        return this;
    }

    @Override
    public ContractPeriodRecord value4(String value) {
        setContractName(value);
        return this;
    }

    @Override
    public ContractPeriodRecord value5(LocalDate value) {
        setContractStartDate(value);
        return this;
    }

    @Override
    public ContractPeriodRecord value6(LocalDate value) {
        setContractEndDate(value);
        return this;
    }

    @Override
    public ContractPeriodRecord value7(String value) {
        setContractStatus(value);
        return this;
    }

    @Override
    public ContractPeriodRecord value8(LocalDate value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public ContractPeriodRecord value9(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public ContractPeriodRecord values(String value1, String value2, String value3, String value4, LocalDate value5, LocalDate value6, String value7, LocalDate value8, String value9) {
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
     * Create a detached ContractPeriodRecord
     */
    public ContractPeriodRecord() {
        super(ContractPeriod.CONTRACT_PERIOD);
    }

    /**
     * Create a detached, initialised ContractPeriodRecord
     */
    public ContractPeriodRecord(String companyCode, String vendorCode, String contract, String contractName, LocalDate contractStartDate, LocalDate contractEndDate, String contractStatus, LocalDate createdOn, String createdBy) {
        super(ContractPeriod.CONTRACT_PERIOD);

        setCompanyCode(companyCode);
        setVendorCode(vendorCode);
        setContract(contract);
        setContractName(contractName);
        setContractStartDate(contractStartDate);
        setContractEndDate(contractEndDate);
        setContractStatus(contractStatus);
        setCreatedOn(createdOn);
        setCreatedBy(createdBy);
    }
}
