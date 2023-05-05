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
public class CcmsCanteenItemTypeMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private String        typeDesc;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public CcmsCanteenItemTypeMaster() {}

    public CcmsCanteenItemTypeMaster(CcmsCanteenItemTypeMaster value) {
        this.id = value.id;
        this.typeDesc = value.typeDesc;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public CcmsCanteenItemTypeMaster(
        Integer       id,
        String        typeDesc,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.id = id;
        this.typeDesc = typeDesc;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.id</code>.
     */
    public CcmsCanteenItemTypeMaster setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.type_desc</code>.
     */
    public String getTypeDesc() {
        return this.typeDesc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.type_desc</code>.
     */
    public CcmsCanteenItemTypeMaster setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.status</code>.
     */
    public CcmsCanteenItemTypeMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.created_by</code>.
     */
    public CcmsCanteenItemTypeMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.created_on</code>.
     */
    public CcmsCanteenItemTypeMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.last_changed_by</code>.
     */
    public CcmsCanteenItemTypeMaster setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_item_type_master.last_changed_on</code>.
     */
    public CcmsCanteenItemTypeMaster setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final CcmsCanteenItemTypeMaster other = (CcmsCanteenItemTypeMaster) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (typeDesc == null) {
            if (other.typeDesc != null)
                return false;
        }
        else if (!typeDesc.equals(other.typeDesc))
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
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.typeDesc == null) ? 0 : this.typeDesc.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsCanteenItemTypeMaster (");

        sb.append(id);
        sb.append(", ").append(typeDesc);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
