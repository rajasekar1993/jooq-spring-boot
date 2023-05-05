/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.DepartmentAccess;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DepartmentAccessRecord extends UpdatableRecordImpl<DepartmentAccessRecord> implements Record5<String, Integer, Integer, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.department_access.COMP_CODE</code>.
     */
    public DepartmentAccessRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.department_access.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.department_access.ROLE_ID</code>.
     */
    public DepartmentAccessRecord setRoleId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.department_access.ROLE_ID</code>.
     */
    public Integer getRoleId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.department_access.MENU_ID</code>.
     */
    public DepartmentAccessRecord setMenuId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.department_access.MENU_ID</code>.
     */
    public Integer getMenuId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.department_access.DEPARTMNET_ID</code>.
     */
    public DepartmentAccessRecord setDepartmnetId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.department_access.DEPARTMNET_ID</code>.
     */
    public Integer getDepartmnetId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.department_access.BLOCK</code>.
     */
    public DepartmentAccessRecord setBlock(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.department_access.BLOCK</code>.
     */
    public String getBlock() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<String, Integer, Integer, Integer> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, Integer, Integer, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, Integer, Integer, Integer, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return DepartmentAccess.DEPARTMENT_ACCESS.COMP_CODE;
    }

    @Override
    public Field<Integer> field2() {
        return DepartmentAccess.DEPARTMENT_ACCESS.ROLE_ID;
    }

    @Override
    public Field<Integer> field3() {
        return DepartmentAccess.DEPARTMENT_ACCESS.MENU_ID;
    }

    @Override
    public Field<Integer> field4() {
        return DepartmentAccess.DEPARTMENT_ACCESS.DEPARTMNET_ID;
    }

    @Override
    public Field<String> field5() {
        return DepartmentAccess.DEPARTMENT_ACCESS.BLOCK;
    }

    @Override
    public String component1() {
        return getCompCode();
    }

    @Override
    public Integer component2() {
        return getRoleId();
    }

    @Override
    public Integer component3() {
        return getMenuId();
    }

    @Override
    public Integer component4() {
        return getDepartmnetId();
    }

    @Override
    public String component5() {
        return getBlock();
    }

    @Override
    public String value1() {
        return getCompCode();
    }

    @Override
    public Integer value2() {
        return getRoleId();
    }

    @Override
    public Integer value3() {
        return getMenuId();
    }

    @Override
    public Integer value4() {
        return getDepartmnetId();
    }

    @Override
    public String value5() {
        return getBlock();
    }

    @Override
    public DepartmentAccessRecord value1(String value) {
        setCompCode(value);
        return this;
    }

    @Override
    public DepartmentAccessRecord value2(Integer value) {
        setRoleId(value);
        return this;
    }

    @Override
    public DepartmentAccessRecord value3(Integer value) {
        setMenuId(value);
        return this;
    }

    @Override
    public DepartmentAccessRecord value4(Integer value) {
        setDepartmnetId(value);
        return this;
    }

    @Override
    public DepartmentAccessRecord value5(String value) {
        setBlock(value);
        return this;
    }

    @Override
    public DepartmentAccessRecord values(String value1, Integer value2, Integer value3, Integer value4, String value5) {
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
     * Create a detached DepartmentAccessRecord
     */
    public DepartmentAccessRecord() {
        super(DepartmentAccess.DEPARTMENT_ACCESS);
    }

    /**
     * Create a detached, initialised DepartmentAccessRecord
     */
    public DepartmentAccessRecord(String compCode, Integer roleId, Integer menuId, Integer departmnetId, String block) {
        super(DepartmentAccess.DEPARTMENT_ACCESS);

        setCompCode(compCode);
        setRoleId(roleId);
        setMenuId(menuId);
        setDepartmnetId(departmnetId);
        setBlock(block);
    }
}
