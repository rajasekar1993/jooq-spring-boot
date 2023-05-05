/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TcFloorMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       floorCode;
    private Integer       buildingCode;
    private String        floorName;
    private LocalDate     fromDate;
    private LocalDate     toDate;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public TcFloorMaster() {}

    public TcFloorMaster(TcFloorMaster value) {
        this.floorCode = value.floorCode;
        this.buildingCode = value.buildingCode;
        this.floorName = value.floorName;
        this.fromDate = value.fromDate;
        this.toDate = value.toDate;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public TcFloorMaster(
        Integer       floorCode,
        Integer       buildingCode,
        String        floorName,
        LocalDate     fromDate,
        LocalDate     toDate,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.floorCode = floorCode;
        this.buildingCode = buildingCode;
        this.floorName = floorName;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.FLOOR_CODE</code>.
     */
    public Integer getFloorCode() {
        return this.floorCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.FLOOR_CODE</code>.
     */
    public TcFloorMaster setFloorCode(Integer floorCode) {
        this.floorCode = floorCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.BUILDING_CODE</code>.
     */
    public Integer getBuildingCode() {
        return this.buildingCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.BUILDING_CODE</code>.
     */
    public TcFloorMaster setBuildingCode(Integer buildingCode) {
        this.buildingCode = buildingCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.FLOOR_NAME</code>.
     */
    public String getFloorName() {
        return this.floorName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.FLOOR_NAME</code>.
     */
    public TcFloorMaster setFloorName(String floorName) {
        this.floorName = floorName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.FROM_DATE</code>.
     */
    public LocalDate getFromDate() {
        return this.fromDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.FROM_DATE</code>.
     */
    public TcFloorMaster setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.TO_DATE</code>.
     */
    public LocalDate getToDate() {
        return this.toDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.TO_DATE</code>.
     */
    public TcFloorMaster setToDate(LocalDate toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.STATUS</code>.
     */
    public TcFloorMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.CREATED_BY</code>.
     */
    public TcFloorMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.CREATED_ON</code>.
     */
    public TcFloorMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.LAST_CHANGED_BY</code>.
     */
    public TcFloorMaster setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_FLOOR_MASTER.LAST_CHANGED_ON</code>.
     */
    public TcFloorMaster setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final TcFloorMaster other = (TcFloorMaster) obj;
        if (floorCode == null) {
            if (other.floorCode != null)
                return false;
        }
        else if (!floorCode.equals(other.floorCode))
            return false;
        if (buildingCode == null) {
            if (other.buildingCode != null)
                return false;
        }
        else if (!buildingCode.equals(other.buildingCode))
            return false;
        if (floorName == null) {
            if (other.floorName != null)
                return false;
        }
        else if (!floorName.equals(other.floorName))
            return false;
        if (fromDate == null) {
            if (other.fromDate != null)
                return false;
        }
        else if (!fromDate.equals(other.fromDate))
            return false;
        if (toDate == null) {
            if (other.toDate != null)
                return false;
        }
        else if (!toDate.equals(other.toDate))
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
        result = prime * result + ((this.floorCode == null) ? 0 : this.floorCode.hashCode());
        result = prime * result + ((this.buildingCode == null) ? 0 : this.buildingCode.hashCode());
        result = prime * result + ((this.floorName == null) ? 0 : this.floorName.hashCode());
        result = prime * result + ((this.fromDate == null) ? 0 : this.fromDate.hashCode());
        result = prime * result + ((this.toDate == null) ? 0 : this.toDate.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TcFloorMaster (");

        sb.append(floorCode);
        sb.append(", ").append(buildingCode);
        sb.append(", ").append(floorName);
        sb.append(", ").append(fromDate);
        sb.append(", ").append(toDate);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
