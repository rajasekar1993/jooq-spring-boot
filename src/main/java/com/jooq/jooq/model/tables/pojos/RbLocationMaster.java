/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RbLocationMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       rbLocationCode;
    private String        rbLocationName;
    private String        trAddress1;
    private String        trAddress2;
    private String        trAddress3;
    private String        city;
    private String        state;
    private String        country;
    private Integer       pincode;
    private String        phoneNo;
    private String        trLat;
    private String        trLong;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;
    private LocalTime     bufferTime;

    public RbLocationMaster() {}

    public RbLocationMaster(RbLocationMaster value) {
        this.rbLocationCode = value.rbLocationCode;
        this.rbLocationName = value.rbLocationName;
        this.trAddress1 = value.trAddress1;
        this.trAddress2 = value.trAddress2;
        this.trAddress3 = value.trAddress3;
        this.city = value.city;
        this.state = value.state;
        this.country = value.country;
        this.pincode = value.pincode;
        this.phoneNo = value.phoneNo;
        this.trLat = value.trLat;
        this.trLong = value.trLong;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
        this.bufferTime = value.bufferTime;
    }

    public RbLocationMaster(
        Integer       rbLocationCode,
        String        rbLocationName,
        String        trAddress1,
        String        trAddress2,
        String        trAddress3,
        String        city,
        String        state,
        String        country,
        Integer       pincode,
        String        phoneNo,
        String        trLat,
        String        trLong,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn,
        LocalTime     bufferTime
    ) {
        this.rbLocationCode = rbLocationCode;
        this.rbLocationName = rbLocationName;
        this.trAddress1 = trAddress1;
        this.trAddress2 = trAddress2;
        this.trAddress3 = trAddress3;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.phoneNo = phoneNo;
        this.trLat = trLat;
        this.trLong = trLong;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
        this.bufferTime = bufferTime;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.RB_LOCATION_CODE</code>.
     */
    public Integer getRbLocationCode() {
        return this.rbLocationCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.RB_LOCATION_CODE</code>.
     */
    public RbLocationMaster setRbLocationCode(Integer rbLocationCode) {
        this.rbLocationCode = rbLocationCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.RB_LOCATION_NAME</code>.
     */
    public String getRbLocationName() {
        return this.rbLocationName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.RB_LOCATION_NAME</code>.
     */
    public RbLocationMaster setRbLocationName(String rbLocationName) {
        this.rbLocationName = rbLocationName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.TR_ADDRESS1</code>.
     */
    public String getTrAddress1() {
        return this.trAddress1;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.TR_ADDRESS1</code>.
     */
    public RbLocationMaster setTrAddress1(String trAddress1) {
        this.trAddress1 = trAddress1;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.TR_ADDRESS2</code>.
     */
    public String getTrAddress2() {
        return this.trAddress2;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.TR_ADDRESS2</code>.
     */
    public RbLocationMaster setTrAddress2(String trAddress2) {
        this.trAddress2 = trAddress2;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.TR_ADDRESS3</code>.
     */
    public String getTrAddress3() {
        return this.trAddress3;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.TR_ADDRESS3</code>.
     */
    public RbLocationMaster setTrAddress3(String trAddress3) {
        this.trAddress3 = trAddress3;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.CITY</code>.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.CITY</code>.
     */
    public RbLocationMaster setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.STATE</code>.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.STATE</code>.
     */
    public RbLocationMaster setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.COUNTRY</code>.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.COUNTRY</code>.
     */
    public RbLocationMaster setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.PINCODE</code>.
     */
    public Integer getPincode() {
        return this.pincode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.PINCODE</code>.
     */
    public RbLocationMaster setPincode(Integer pincode) {
        this.pincode = pincode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.PHONE_NO</code>.
     */
    public String getPhoneNo() {
        return this.phoneNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.PHONE_NO</code>.
     */
    public RbLocationMaster setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.TR_LAT</code>.
     */
    public String getTrLat() {
        return this.trLat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.TR_LAT</code>.
     */
    public RbLocationMaster setTrLat(String trLat) {
        this.trLat = trLat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.TR_LONG</code>.
     */
    public String getTrLong() {
        return this.trLong;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.TR_LONG</code>.
     */
    public RbLocationMaster setTrLong(String trLong) {
        this.trLong = trLong;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.STATUS</code>.
     */
    public RbLocationMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.CREATED_BY</code>.
     */
    public RbLocationMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.CREATED_ON</code>.
     */
    public RbLocationMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.LAST_CHANGED_BY</code>.
     */
    public RbLocationMaster setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.LAST_CHANGED_ON</code>.
     */
    public RbLocationMaster setLastChangedOn(LocalDateTime lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.BUFFER_TIME</code>.
     */
    public LocalTime getBufferTime() {
        return this.bufferTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_LOCATION_MASTER.BUFFER_TIME</code>.
     */
    public RbLocationMaster setBufferTime(LocalTime bufferTime) {
        this.bufferTime = bufferTime;
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
        final RbLocationMaster other = (RbLocationMaster) obj;
        if (rbLocationCode == null) {
            if (other.rbLocationCode != null)
                return false;
        }
        else if (!rbLocationCode.equals(other.rbLocationCode))
            return false;
        if (rbLocationName == null) {
            if (other.rbLocationName != null)
                return false;
        }
        else if (!rbLocationName.equals(other.rbLocationName))
            return false;
        if (trAddress1 == null) {
            if (other.trAddress1 != null)
                return false;
        }
        else if (!trAddress1.equals(other.trAddress1))
            return false;
        if (trAddress2 == null) {
            if (other.trAddress2 != null)
                return false;
        }
        else if (!trAddress2.equals(other.trAddress2))
            return false;
        if (trAddress3 == null) {
            if (other.trAddress3 != null)
                return false;
        }
        else if (!trAddress3.equals(other.trAddress3))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        }
        else if (!city.equals(other.city))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        }
        else if (!state.equals(other.state))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        }
        else if (!country.equals(other.country))
            return false;
        if (pincode == null) {
            if (other.pincode != null)
                return false;
        }
        else if (!pincode.equals(other.pincode))
            return false;
        if (phoneNo == null) {
            if (other.phoneNo != null)
                return false;
        }
        else if (!phoneNo.equals(other.phoneNo))
            return false;
        if (trLat == null) {
            if (other.trLat != null)
                return false;
        }
        else if (!trLat.equals(other.trLat))
            return false;
        if (trLong == null) {
            if (other.trLong != null)
                return false;
        }
        else if (!trLong.equals(other.trLong))
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
        if (bufferTime == null) {
            if (other.bufferTime != null)
                return false;
        }
        else if (!bufferTime.equals(other.bufferTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.rbLocationCode == null) ? 0 : this.rbLocationCode.hashCode());
        result = prime * result + ((this.rbLocationName == null) ? 0 : this.rbLocationName.hashCode());
        result = prime * result + ((this.trAddress1 == null) ? 0 : this.trAddress1.hashCode());
        result = prime * result + ((this.trAddress2 == null) ? 0 : this.trAddress2.hashCode());
        result = prime * result + ((this.trAddress3 == null) ? 0 : this.trAddress3.hashCode());
        result = prime * result + ((this.city == null) ? 0 : this.city.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.country == null) ? 0 : this.country.hashCode());
        result = prime * result + ((this.pincode == null) ? 0 : this.pincode.hashCode());
        result = prime * result + ((this.phoneNo == null) ? 0 : this.phoneNo.hashCode());
        result = prime * result + ((this.trLat == null) ? 0 : this.trLat.hashCode());
        result = prime * result + ((this.trLong == null) ? 0 : this.trLong.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        result = prime * result + ((this.bufferTime == null) ? 0 : this.bufferTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RbLocationMaster (");

        sb.append(rbLocationCode);
        sb.append(", ").append(rbLocationName);
        sb.append(", ").append(trAddress1);
        sb.append(", ").append(trAddress2);
        sb.append(", ").append(trAddress3);
        sb.append(", ").append(city);
        sb.append(", ").append(state);
        sb.append(", ").append(country);
        sb.append(", ").append(pincode);
        sb.append(", ").append(phoneNo);
        sb.append(", ").append(trLat);
        sb.append(", ").append(trLong);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);
        sb.append(", ").append(bufferTime);

        sb.append(")");
        return sb.toString();
    }
}
