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
public class CcmsCanteenMaterialMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        plant;
    private String        materialCode;
    private String        strgLocation;
    private String        hsnCode;
    private String        costCenter;
    private String        type;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public CcmsCanteenMaterialMaster() {}

    public CcmsCanteenMaterialMaster(CcmsCanteenMaterialMaster value) {
        this.plant = value.plant;
        this.materialCode = value.materialCode;
        this.strgLocation = value.strgLocation;
        this.hsnCode = value.hsnCode;
        this.costCenter = value.costCenter;
        this.type = value.type;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public CcmsCanteenMaterialMaster(
        String        plant,
        String        materialCode,
        String        strgLocation,
        String        hsnCode,
        String        costCenter,
        String        type,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.plant = plant;
        this.materialCode = materialCode;
        this.strgLocation = strgLocation;
        this.hsnCode = hsnCode;
        this.costCenter = costCenter;
        this.type = type;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_material_master.plant</code>.
     */
    public String getPlant() {
        return this.plant;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_material_master.plant</code>.
     */
    public CcmsCanteenMaterialMaster setPlant(String plant) {
        this.plant = plant;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_material_master.material_code</code>.
     */
    public String getMaterialCode() {
        return this.materialCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_material_master.material_code</code>.
     */
    public CcmsCanteenMaterialMaster setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_material_master.strg_location</code>.
     */
    public String getStrgLocation() {
        return this.strgLocation;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_material_master.strg_location</code>.
     */
    public CcmsCanteenMaterialMaster setStrgLocation(String strgLocation) {
        this.strgLocation = strgLocation;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_material_master.hsn_code</code>.
     */
    public String getHsnCode() {
        return this.hsnCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_material_master.hsn_code</code>.
     */
    public CcmsCanteenMaterialMaster setHsnCode(String hsnCode) {
        this.hsnCode = hsnCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_material_master.cost_center</code>.
     */
    public String getCostCenter() {
        return this.costCenter;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_material_master.cost_center</code>.
     */
    public CcmsCanteenMaterialMaster setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_material_master.type</code>.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_material_master.type</code>.
     */
    public CcmsCanteenMaterialMaster setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_material_master.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_material_master.created_by</code>.
     */
    public CcmsCanteenMaterialMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_material_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_material_master.created_on</code>.
     */
    public CcmsCanteenMaterialMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_material_master.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_material_master.last_changed_by</code>.
     */
    public CcmsCanteenMaterialMaster setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_material_master.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_material_master.last_changed_on</code>.
     */
    public CcmsCanteenMaterialMaster setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final CcmsCanteenMaterialMaster other = (CcmsCanteenMaterialMaster) obj;
        if (plant == null) {
            if (other.plant != null)
                return false;
        }
        else if (!plant.equals(other.plant))
            return false;
        if (materialCode == null) {
            if (other.materialCode != null)
                return false;
        }
        else if (!materialCode.equals(other.materialCode))
            return false;
        if (strgLocation == null) {
            if (other.strgLocation != null)
                return false;
        }
        else if (!strgLocation.equals(other.strgLocation))
            return false;
        if (hsnCode == null) {
            if (other.hsnCode != null)
                return false;
        }
        else if (!hsnCode.equals(other.hsnCode))
            return false;
        if (costCenter == null) {
            if (other.costCenter != null)
                return false;
        }
        else if (!costCenter.equals(other.costCenter))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        }
        else if (!type.equals(other.type))
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
        result = prime * result + ((this.plant == null) ? 0 : this.plant.hashCode());
        result = prime * result + ((this.materialCode == null) ? 0 : this.materialCode.hashCode());
        result = prime * result + ((this.strgLocation == null) ? 0 : this.strgLocation.hashCode());
        result = prime * result + ((this.hsnCode == null) ? 0 : this.hsnCode.hashCode());
        result = prime * result + ((this.costCenter == null) ? 0 : this.costCenter.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsCanteenMaterialMaster (");

        sb.append(plant);
        sb.append(", ").append(materialCode);
        sb.append(", ").append(strgLocation);
        sb.append(", ").append(hsnCode);
        sb.append(", ").append(costCenter);
        sb.append(", ").append(type);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
