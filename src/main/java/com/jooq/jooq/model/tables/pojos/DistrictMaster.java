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
public class DistrictMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        districtCode;
    private String        regionCode;
    private String        countryCode;
    private String        districtName;
    private String        status;
    private String        stateCode;
    private Integer       createdBy;
    private LocalDateTime createdOn;
    private Integer       lastChangedBy;
    private LocalDateTime lastChangedOn;

    public DistrictMaster() {}

    public DistrictMaster(DistrictMaster value) {
        this.districtCode = value.districtCode;
        this.regionCode = value.regionCode;
        this.countryCode = value.countryCode;
        this.districtName = value.districtName;
        this.status = value.status;
        this.stateCode = value.stateCode;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public DistrictMaster(
        String        districtCode,
        String        regionCode,
        String        countryCode,
        String        districtName,
        String        status,
        String        stateCode,
        Integer       createdBy,
        LocalDateTime createdOn,
        Integer       lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.districtCode = districtCode;
        this.regionCode = regionCode;
        this.countryCode = countryCode;
        this.districtName = districtName;
        this.status = status;
        this.stateCode = stateCode;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.district_master.DISTRICT_CODE</code>.
     */
    public String getDistrictCode() {
        return this.districtCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.district_master.DISTRICT_CODE</code>.
     */
    public DistrictMaster setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.district_master.REGION_CODE</code>.
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.district_master.REGION_CODE</code>.
     */
    public DistrictMaster setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.district_master.COUNTRY_CODE</code>.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.district_master.COUNTRY_CODE</code>.
     */
    public DistrictMaster setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.district_master.DISTRICT_NAME</code>.
     */
    public String getDistrictName() {
        return this.districtName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.district_master.DISTRICT_NAME</code>.
     */
    public DistrictMaster setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.district_master.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.district_master.STATUS</code>.
     */
    public DistrictMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.district_master.STATE_CODE</code>.
     */
    public String getStateCode() {
        return this.stateCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.district_master.STATE_CODE</code>.
     */
    public DistrictMaster setStateCode(String stateCode) {
        this.stateCode = stateCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.district_master.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.district_master.CREATED_BY</code>.
     */
    public DistrictMaster setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.district_master.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.district_master.CREATED_ON</code>.
     */
    public DistrictMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.district_master.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.district_master.LAST_CHANGED_BY</code>.
     */
    public DistrictMaster setLastChangedBy(Integer lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.district_master.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.district_master.LAST_CHANGED_ON</code>.
     */
    public DistrictMaster setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final DistrictMaster other = (DistrictMaster) obj;
        if (districtCode == null) {
            if (other.districtCode != null)
                return false;
        }
        else if (!districtCode.equals(other.districtCode))
            return false;
        if (regionCode == null) {
            if (other.regionCode != null)
                return false;
        }
        else if (!regionCode.equals(other.regionCode))
            return false;
        if (countryCode == null) {
            if (other.countryCode != null)
                return false;
        }
        else if (!countryCode.equals(other.countryCode))
            return false;
        if (districtName == null) {
            if (other.districtName != null)
                return false;
        }
        else if (!districtName.equals(other.districtName))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (stateCode == null) {
            if (other.stateCode != null)
                return false;
        }
        else if (!stateCode.equals(other.stateCode))
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
        result = prime * result + ((this.districtCode == null) ? 0 : this.districtCode.hashCode());
        result = prime * result + ((this.regionCode == null) ? 0 : this.regionCode.hashCode());
        result = prime * result + ((this.countryCode == null) ? 0 : this.countryCode.hashCode());
        result = prime * result + ((this.districtName == null) ? 0 : this.districtName.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.stateCode == null) ? 0 : this.stateCode.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DistrictMaster (");

        sb.append(districtCode);
        sb.append(", ").append(regionCode);
        sb.append(", ").append(countryCode);
        sb.append(", ").append(districtName);
        sb.append(", ").append(status);
        sb.append(", ").append(stateCode);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
