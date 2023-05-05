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
public class PurchaseVendorOtpHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        compCode;
    private Integer       userId;
    private LocalDateTime otpGenTime;
    private LocalDateTime otpValidTime;
    private String        otpCode;
    private String        otpMobileNo;
    private Integer       createdBy;
    private LocalDateTime createdOn;
    private Integer       lastChangedBy;
    private LocalDateTime lastChangedOn;

    public PurchaseVendorOtpHistory() {}

    public PurchaseVendorOtpHistory(PurchaseVendorOtpHistory value) {
        this.compCode = value.compCode;
        this.userId = value.userId;
        this.otpGenTime = value.otpGenTime;
        this.otpValidTime = value.otpValidTime;
        this.otpCode = value.otpCode;
        this.otpMobileNo = value.otpMobileNo;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public PurchaseVendorOtpHistory(
        String        compCode,
        Integer       userId,
        LocalDateTime otpGenTime,
        LocalDateTime otpValidTime,
        String        otpCode,
        String        otpMobileNo,
        Integer       createdBy,
        LocalDateTime createdOn,
        Integer       lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.compCode = compCode;
        this.userId = userId;
        this.otpGenTime = otpGenTime;
        this.otpValidTime = otpValidTime;
        this.otpCode = otpCode;
        this.otpMobileNo = otpMobileNo;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_vendor_otp_history.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_vendor_otp_history.COMP_CODE</code>.
     */
    public PurchaseVendorOtpHistory setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_vendor_otp_history.USER_ID</code>.
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_vendor_otp_history.USER_ID</code>.
     */
    public PurchaseVendorOtpHistory setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_vendor_otp_history.OTP_GEN_TIME</code>.
     */
    public LocalDateTime getOtpGenTime() {
        return this.otpGenTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_vendor_otp_history.OTP_GEN_TIME</code>.
     */
    public PurchaseVendorOtpHistory setOtpGenTime(LocalDateTime otpGenTime) {
        this.otpGenTime = otpGenTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_vendor_otp_history.OTP_VALID_TIME</code>.
     */
    public LocalDateTime getOtpValidTime() {
        return this.otpValidTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_vendor_otp_history.OTP_VALID_TIME</code>.
     */
    public PurchaseVendorOtpHistory setOtpValidTime(LocalDateTime otpValidTime) {
        this.otpValidTime = otpValidTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_vendor_otp_history.OTP_CODE</code>.
     */
    public String getOtpCode() {
        return this.otpCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_vendor_otp_history.OTP_CODE</code>.
     */
    public PurchaseVendorOtpHistory setOtpCode(String otpCode) {
        this.otpCode = otpCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_vendor_otp_history.OTP_MOBILE_NO</code>.
     */
    public String getOtpMobileNo() {
        return this.otpMobileNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_vendor_otp_history.OTP_MOBILE_NO</code>.
     */
    public PurchaseVendorOtpHistory setOtpMobileNo(String otpMobileNo) {
        this.otpMobileNo = otpMobileNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_vendor_otp_history.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_vendor_otp_history.CREATED_BY</code>.
     */
    public PurchaseVendorOtpHistory setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_vendor_otp_history.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_vendor_otp_history.CREATED_ON</code>.
     */
    public PurchaseVendorOtpHistory setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_vendor_otp_history.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_vendor_otp_history.LAST_CHANGED_BY</code>.
     */
    public PurchaseVendorOtpHistory setLastChangedBy(Integer lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_vendor_otp_history.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_vendor_otp_history.LAST_CHANGED_ON</code>.
     */
    public PurchaseVendorOtpHistory setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final PurchaseVendorOtpHistory other = (PurchaseVendorOtpHistory) obj;
        if (compCode == null) {
            if (other.compCode != null)
                return false;
        }
        else if (!compCode.equals(other.compCode))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
            return false;
        if (otpGenTime == null) {
            if (other.otpGenTime != null)
                return false;
        }
        else if (!otpGenTime.equals(other.otpGenTime))
            return false;
        if (otpValidTime == null) {
            if (other.otpValidTime != null)
                return false;
        }
        else if (!otpValidTime.equals(other.otpValidTime))
            return false;
        if (otpCode == null) {
            if (other.otpCode != null)
                return false;
        }
        else if (!otpCode.equals(other.otpCode))
            return false;
        if (otpMobileNo == null) {
            if (other.otpMobileNo != null)
                return false;
        }
        else if (!otpMobileNo.equals(other.otpMobileNo))
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
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.otpGenTime == null) ? 0 : this.otpGenTime.hashCode());
        result = prime * result + ((this.otpValidTime == null) ? 0 : this.otpValidTime.hashCode());
        result = prime * result + ((this.otpCode == null) ? 0 : this.otpCode.hashCode());
        result = prime * result + ((this.otpMobileNo == null) ? 0 : this.otpMobileNo.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PurchaseVendorOtpHistory (");

        sb.append(compCode);
        sb.append(", ").append(userId);
        sb.append(", ").append(otpGenTime);
        sb.append(", ").append(otpValidTime);
        sb.append(", ").append(otpCode);
        sb.append(", ").append(otpMobileNo);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
