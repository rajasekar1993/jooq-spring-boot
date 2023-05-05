/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VisitorRegister implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        compCode;
    private String        customerCode;
    private String        customerName;
    private String        employeeCode;
    private String        employeeName;
    private LocalDateTime entryDate;
    private String        visitorCategory;
    private String        phoneNo;
    private String        purposeOfVisit;
    private String        remarks;

    public VisitorRegister() {}

    public VisitorRegister(VisitorRegister value) {
        this.compCode = value.compCode;
        this.customerCode = value.customerCode;
        this.customerName = value.customerName;
        this.employeeCode = value.employeeCode;
        this.employeeName = value.employeeName;
        this.entryDate = value.entryDate;
        this.visitorCategory = value.visitorCategory;
        this.phoneNo = value.phoneNo;
        this.purposeOfVisit = value.purposeOfVisit;
        this.remarks = value.remarks;
    }

    public VisitorRegister(
        String        compCode,
        String        customerCode,
        String        customerName,
        String        employeeCode,
        String        employeeName,
        LocalDateTime entryDate,
        String        visitorCategory,
        String        phoneNo,
        String        purposeOfVisit,
        String        remarks
    ) {
        this.compCode = compCode;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.entryDate = entryDate;
        this.visitorCategory = visitorCategory;
        this.phoneNo = phoneNo;
        this.purposeOfVisit = purposeOfVisit;
        this.remarks = remarks;
    }

    /**
     * Getter for <code>vendor_portal_pbx.visitor_register.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.visitor_register.COMP_CODE</code>.
     */
    public VisitorRegister setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.visitor_register.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.visitor_register.CUSTOMER_CODE</code>.
     */
    public VisitorRegister setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.visitor_register.CUSTOMER_NAME</code>.
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.visitor_register.CUSTOMER_NAME</code>.
     */
    public VisitorRegister setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.visitor_register.EMPLOYEE_CODE</code>.
     */
    public String getEmployeeCode() {
        return this.employeeCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.visitor_register.EMPLOYEE_CODE</code>.
     */
    public VisitorRegister setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.visitor_register.EMPLOYEE_NAME</code>.
     */
    public String getEmployeeName() {
        return this.employeeName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.visitor_register.EMPLOYEE_NAME</code>.
     */
    public VisitorRegister setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.visitor_register.ENTRY_DATE</code>.
     */
    public LocalDateTime getEntryDate() {
        return this.entryDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.visitor_register.ENTRY_DATE</code>.
     */
    public VisitorRegister setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.visitor_register.VISITOR_CATEGORY</code>.
     */
    public String getVisitorCategory() {
        return this.visitorCategory;
    }

    /**
     * Setter for <code>vendor_portal_pbx.visitor_register.VISITOR_CATEGORY</code>.
     */
    public VisitorRegister setVisitorCategory(String visitorCategory) {
        this.visitorCategory = visitorCategory;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.visitor_register.PHONE_NO</code>.
     */
    public String getPhoneNo() {
        return this.phoneNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.visitor_register.PHONE_NO</code>.
     */
    public VisitorRegister setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.visitor_register.PURPOSE_OF_VISIT</code>.
     */
    public String getPurposeOfVisit() {
        return this.purposeOfVisit;
    }

    /**
     * Setter for <code>vendor_portal_pbx.visitor_register.PURPOSE_OF_VISIT</code>.
     */
    public VisitorRegister setPurposeOfVisit(String purposeOfVisit) {
        this.purposeOfVisit = purposeOfVisit;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.visitor_register.REMARKS</code>.
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Setter for <code>vendor_portal_pbx.visitor_register.REMARKS</code>.
     */
    public VisitorRegister setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final VisitorRegister other = (VisitorRegister) obj;
        if (compCode == null) {
            if (other.compCode != null)
                return false;
        }
        else if (!compCode.equals(other.compCode))
            return false;
        if (customerCode == null) {
            if (other.customerCode != null)
                return false;
        }
        else if (!customerCode.equals(other.customerCode))
            return false;
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        }
        else if (!customerName.equals(other.customerName))
            return false;
        if (employeeCode == null) {
            if (other.employeeCode != null)
                return false;
        }
        else if (!employeeCode.equals(other.employeeCode))
            return false;
        if (employeeName == null) {
            if (other.employeeName != null)
                return false;
        }
        else if (!employeeName.equals(other.employeeName))
            return false;
        if (entryDate == null) {
            if (other.entryDate != null)
                return false;
        }
        else if (!entryDate.equals(other.entryDate))
            return false;
        if (visitorCategory == null) {
            if (other.visitorCategory != null)
                return false;
        }
        else if (!visitorCategory.equals(other.visitorCategory))
            return false;
        if (phoneNo == null) {
            if (other.phoneNo != null)
                return false;
        }
        else if (!phoneNo.equals(other.phoneNo))
            return false;
        if (purposeOfVisit == null) {
            if (other.purposeOfVisit != null)
                return false;
        }
        else if (!purposeOfVisit.equals(other.purposeOfVisit))
            return false;
        if (remarks == null) {
            if (other.remarks != null)
                return false;
        }
        else if (!remarks.equals(other.remarks))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.customerCode == null) ? 0 : this.customerCode.hashCode());
        result = prime * result + ((this.customerName == null) ? 0 : this.customerName.hashCode());
        result = prime * result + ((this.employeeCode == null) ? 0 : this.employeeCode.hashCode());
        result = prime * result + ((this.employeeName == null) ? 0 : this.employeeName.hashCode());
        result = prime * result + ((this.entryDate == null) ? 0 : this.entryDate.hashCode());
        result = prime * result + ((this.visitorCategory == null) ? 0 : this.visitorCategory.hashCode());
        result = prime * result + ((this.phoneNo == null) ? 0 : this.phoneNo.hashCode());
        result = prime * result + ((this.purposeOfVisit == null) ? 0 : this.purposeOfVisit.hashCode());
        result = prime * result + ((this.remarks == null) ? 0 : this.remarks.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VisitorRegister (");

        sb.append(compCode);
        sb.append(", ").append(customerCode);
        sb.append(", ").append(customerName);
        sb.append(", ").append(employeeCode);
        sb.append(", ").append(employeeName);
        sb.append(", ").append(entryDate);
        sb.append(", ").append(visitorCategory);
        sb.append(", ").append(phoneNo);
        sb.append(", ").append(purposeOfVisit);
        sb.append(", ").append(remarks);

        sb.append(")");
        return sb.toString();
    }
}
