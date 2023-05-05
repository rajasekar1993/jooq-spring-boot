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
public class CcmsEmployeeDesignationMapping implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        type;
    private String        designation;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public CcmsEmployeeDesignationMapping() {}

    public CcmsEmployeeDesignationMapping(CcmsEmployeeDesignationMapping value) {
        this.type = value.type;
        this.designation = value.designation;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public CcmsEmployeeDesignationMapping(
        String        type,
        String        designation,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.type = type;
        this.designation = designation;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.type</code>.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.type</code>.
     */
    public CcmsEmployeeDesignationMapping setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.designation</code>.
     */
    public String getDesignation() {
        return this.designation;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.designation</code>.
     */
    public CcmsEmployeeDesignationMapping setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.status</code>.
     */
    public CcmsEmployeeDesignationMapping setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.created_by</code>.
     */
    public CcmsEmployeeDesignationMapping setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.created_on</code>.
     */
    public CcmsEmployeeDesignationMapping setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.last_changed_by</code>.
     */
    public CcmsEmployeeDesignationMapping setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_employee_designation_mapping.last_changed_on</code>.
     */
    public CcmsEmployeeDesignationMapping setLastChangedOn(LocalDateTime lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
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
        final CcmsEmployeeDesignationMapping other = (CcmsEmployeeDesignationMapping) obj;
        if (type == null) {
            if (other.type != null)
                return false;
        }
        else if (!type.equals(other.type))
            return false;
        if (designation == null) {
            if (other.designation != null)
                return false;
        }
        else if (!designation.equals(other.designation))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!createdBy.equals(other.createdBy))
            return false;
        if (createdOn == null) {
            if (other.createdOn != null)
                return false;
        }
        else if (!createdOn.equals(other.createdOn))
            return false;
        if (lastChangedBy == null) {
            if (other.lastChangedBy != null)
                return false;
        }
        else if (!lastChangedBy.equals(other.lastChangedBy))
            return false;
        if (lastChangedOn == null) {
            if (other.lastChangedOn != null)
                return false;
        }
        else if (!lastChangedOn.equals(other.lastChangedOn))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.designation == null) ? 0 : this.designation.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsEmployeeDesignationMapping (");

        sb.append(type);
        sb.append(", ").append(designation);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
