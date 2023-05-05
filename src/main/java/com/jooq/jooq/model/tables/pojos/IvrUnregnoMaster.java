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
public class IvrUnregnoMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        mobileNumber;
    private String        customerName;
    private String        customerCode;
    private LocalDateTime registeredDate;
    private String        registeredBy;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        tollFreeType;

    public IvrUnregnoMaster() {}

    public IvrUnregnoMaster(IvrUnregnoMaster value) {
        this.mobileNumber = value.mobileNumber;
        this.customerName = value.customerName;
        this.customerCode = value.customerCode;
        this.registeredDate = value.registeredDate;
        this.registeredBy = value.registeredBy;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.tollFreeType = value.tollFreeType;
    }

    public IvrUnregnoMaster(
        String        mobileNumber,
        String        customerName,
        String        customerCode,
        LocalDateTime registeredDate,
        String        registeredBy,
        String        createdBy,
        LocalDateTime createdOn,
        String        tollFreeType
    ) {
        this.mobileNumber = mobileNumber;
        this.customerName = customerName;
        this.customerCode = customerCode;
        this.registeredDate = registeredDate;
        this.registeredBy = registeredBy;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.tollFreeType = tollFreeType;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_unregno_master.MOBILE_NUMBER</code>.
     */
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_unregno_master.MOBILE_NUMBER</code>.
     */
    public IvrUnregnoMaster setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_unregno_master.CUSTOMER_NAME</code>.
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_unregno_master.CUSTOMER_NAME</code>.
     */
    public IvrUnregnoMaster setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_unregno_master.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_unregno_master.CUSTOMER_CODE</code>.
     */
    public IvrUnregnoMaster setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_unregno_master.REGISTERED_DATE</code>.
     */
    public LocalDateTime getRegisteredDate() {
        return this.registeredDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_unregno_master.REGISTERED_DATE</code>.
     */
    public IvrUnregnoMaster setRegisteredDate(LocalDateTime registeredDate) {
        this.registeredDate = registeredDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_unregno_master.REGISTERED_BY</code>.
     */
    public String getRegisteredBy() {
        return this.registeredBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_unregno_master.REGISTERED_BY</code>.
     */
    public IvrUnregnoMaster setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_unregno_master.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_unregno_master.CREATED_BY</code>.
     */
    public IvrUnregnoMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_unregno_master.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_unregno_master.CREATED_ON</code>.
     */
    public IvrUnregnoMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_unregno_master.TOLL_FREE_TYPE</code>.
     */
    public String getTollFreeType() {
        return this.tollFreeType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_unregno_master.TOLL_FREE_TYPE</code>.
     */
    public IvrUnregnoMaster setTollFreeType(String tollFreeType) {
        this.tollFreeType = tollFreeType;
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
        final IvrUnregnoMaster other = (IvrUnregnoMaster) obj;
        if (mobileNumber == null) {
            if (other.mobileNumber != null)
                return false;
        }
        else if (!mobileNumber.equals(other.mobileNumber))
            return false;
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        }
        else if (!customerName.equals(other.customerName))
            return false;
        if (customerCode == null) {
            if (other.customerCode != null)
                return false;
        }
        else if (!customerCode.equals(other.customerCode))
            return false;
        if (registeredDate == null) {
            if (other.registeredDate != null)
                return false;
        }
        else if (!registeredDate.equals(other.registeredDate))
            return false;
        if (registeredBy == null) {
            if (other.registeredBy != null)
                return false;
        }
        else if (!registeredBy.equals(other.registeredBy))
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
        if (tollFreeType == null) {
            if (other.tollFreeType != null)
                return false;
        }
        else if (!tollFreeType.equals(other.tollFreeType))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.mobileNumber == null) ? 0 : this.mobileNumber.hashCode());
        result = prime * result + ((this.customerName == null) ? 0 : this.customerName.hashCode());
        result = prime * result + ((this.customerCode == null) ? 0 : this.customerCode.hashCode());
        result = prime * result + ((this.registeredDate == null) ? 0 : this.registeredDate.hashCode());
        result = prime * result + ((this.registeredBy == null) ? 0 : this.registeredBy.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.tollFreeType == null) ? 0 : this.tollFreeType.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IvrUnregnoMaster (");

        sb.append(mobileNumber);
        sb.append(", ").append(customerName);
        sb.append(", ").append(customerCode);
        sb.append(", ").append(registeredDate);
        sb.append(", ").append(registeredBy);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(tollFreeType);

        sb.append(")");
        return sb.toString();
    }
}
