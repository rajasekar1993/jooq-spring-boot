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
public class CustomerKyc implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        compCode;
    private String        customerCode;
    private String        customerName;
    private String        serialNo;
    private String        rsmId;
    private String        rsmName;
    private String        sdmId;
    private String        sdmName;
    private String        sdeId;
    private String        sdeName;
    private LocalDate     validFrom;
    private LocalDate     validTo;
    private String        kycType;
    private String        otherKycType;
    private LocalDateTime attachedDatetime;
    private String        flag;
    private String        status;
    private LocalDateTime createdOn;
    private String        createdBy;
    private LocalDateTime changedOn;
    private String        changedBy;
    private String        attachmentName;
    private String        uploadType;

    public CustomerKyc() {}

    public CustomerKyc(CustomerKyc value) {
        this.compCode = value.compCode;
        this.customerCode = value.customerCode;
        this.customerName = value.customerName;
        this.serialNo = value.serialNo;
        this.rsmId = value.rsmId;
        this.rsmName = value.rsmName;
        this.sdmId = value.sdmId;
        this.sdmName = value.sdmName;
        this.sdeId = value.sdeId;
        this.sdeName = value.sdeName;
        this.validFrom = value.validFrom;
        this.validTo = value.validTo;
        this.kycType = value.kycType;
        this.otherKycType = value.otherKycType;
        this.attachedDatetime = value.attachedDatetime;
        this.flag = value.flag;
        this.status = value.status;
        this.createdOn = value.createdOn;
        this.createdBy = value.createdBy;
        this.changedOn = value.changedOn;
        this.changedBy = value.changedBy;
        this.attachmentName = value.attachmentName;
        this.uploadType = value.uploadType;
    }

    public CustomerKyc(
        String        compCode,
        String        customerCode,
        String        customerName,
        String        serialNo,
        String        rsmId,
        String        rsmName,
        String        sdmId,
        String        sdmName,
        String        sdeId,
        String        sdeName,
        LocalDate     validFrom,
        LocalDate     validTo,
        String        kycType,
        String        otherKycType,
        LocalDateTime attachedDatetime,
        String        flag,
        String        status,
        LocalDateTime createdOn,
        String        createdBy,
        LocalDateTime changedOn,
        String        changedBy,
        String        attachmentName,
        String        uploadType
    ) {
        this.compCode = compCode;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.serialNo = serialNo;
        this.rsmId = rsmId;
        this.rsmName = rsmName;
        this.sdmId = sdmId;
        this.sdmName = sdmName;
        this.sdeId = sdeId;
        this.sdeName = sdeName;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.kycType = kycType;
        this.otherKycType = otherKycType;
        this.attachedDatetime = attachedDatetime;
        this.flag = flag;
        this.status = status;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.changedOn = changedOn;
        this.changedBy = changedBy;
        this.attachmentName = attachmentName;
        this.uploadType = uploadType;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.COMP_CODE</code>.
     */
    public CustomerKyc setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.CUSTOMER_CODE</code>.
     */
    public CustomerKyc setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.CUSTOMER_NAME</code>.
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.CUSTOMER_NAME</code>.
     */
    public CustomerKyc setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.SERIAL_NO</code>.
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.SERIAL_NO</code>.
     */
    public CustomerKyc setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.RSM_ID</code>.
     */
    public String getRsmId() {
        return this.rsmId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.RSM_ID</code>.
     */
    public CustomerKyc setRsmId(String rsmId) {
        this.rsmId = rsmId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.RSM_NAME</code>.
     */
    public String getRsmName() {
        return this.rsmName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.RSM_NAME</code>.
     */
    public CustomerKyc setRsmName(String rsmName) {
        this.rsmName = rsmName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.SDM_ID</code>.
     */
    public String getSdmId() {
        return this.sdmId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.SDM_ID</code>.
     */
    public CustomerKyc setSdmId(String sdmId) {
        this.sdmId = sdmId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.SDM_NAME</code>.
     */
    public String getSdmName() {
        return this.sdmName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.SDM_NAME</code>.
     */
    public CustomerKyc setSdmName(String sdmName) {
        this.sdmName = sdmName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.SDE_ID</code>.
     */
    public String getSdeId() {
        return this.sdeId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.SDE_ID</code>.
     */
    public CustomerKyc setSdeId(String sdeId) {
        this.sdeId = sdeId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.SDE_NAME</code>.
     */
    public String getSdeName() {
        return this.sdeName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.SDE_NAME</code>.
     */
    public CustomerKyc setSdeName(String sdeName) {
        this.sdeName = sdeName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.VALID_FROM</code>.
     */
    public LocalDate getValidFrom() {
        return this.validFrom;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.VALID_FROM</code>.
     */
    public CustomerKyc setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.VALID_TO</code>.
     */
    public LocalDate getValidTo() {
        return this.validTo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.VALID_TO</code>.
     */
    public CustomerKyc setValidTo(LocalDate validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.KYC_TYPE</code>.
     */
    public String getKycType() {
        return this.kycType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.KYC_TYPE</code>.
     */
    public CustomerKyc setKycType(String kycType) {
        this.kycType = kycType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.OTHER_KYC_TYPE</code>.
     */
    public String getOtherKycType() {
        return this.otherKycType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.OTHER_KYC_TYPE</code>.
     */
    public CustomerKyc setOtherKycType(String otherKycType) {
        this.otherKycType = otherKycType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.ATTACHED_DATETIME</code>.
     */
    public LocalDateTime getAttachedDatetime() {
        return this.attachedDatetime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.ATTACHED_DATETIME</code>.
     */
    public CustomerKyc setAttachedDatetime(LocalDateTime attachedDatetime) {
        this.attachedDatetime = attachedDatetime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.FLAG</code>.
     */
    public String getFlag() {
        return this.flag;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.FLAG</code>.
     */
    public CustomerKyc setFlag(String flag) {
        this.flag = flag;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.STATUS</code>.
     */
    public CustomerKyc setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.CREATED_ON</code>.
     */
    public CustomerKyc setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.CREATED_BY</code>.
     */
    public CustomerKyc setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.CHANGED_ON</code>.
     */
    public LocalDateTime getChangedOn() {
        return this.changedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.CHANGED_ON</code>.
     */
    public CustomerKyc setChangedOn(LocalDateTime changedOn) {
        this.changedOn = changedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.CHANGED_BY</code>.
     */
    public String getChangedBy() {
        return this.changedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.CHANGED_BY</code>.
     */
    public CustomerKyc setChangedBy(String changedBy) {
        this.changedBy = changedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.ATTACHMENT_NAME</code>.
     */
    public String getAttachmentName() {
        return this.attachmentName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.ATTACHMENT_NAME</code>.
     */
    public CustomerKyc setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_kyc.UPLOAD_TYPE</code>.
     */
    public String getUploadType() {
        return this.uploadType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_kyc.UPLOAD_TYPE</code>.
     */
    public CustomerKyc setUploadType(String uploadType) {
        this.uploadType = uploadType;
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
        final CustomerKyc other = (CustomerKyc) obj;
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
        if (serialNo == null) {
            if (other.serialNo != null)
                return false;
        }
        else if (!serialNo.equals(other.serialNo))
            return false;
        if (rsmId == null) {
            if (other.rsmId != null)
                return false;
        }
        else if (!rsmId.equals(other.rsmId))
            return false;
        if (rsmName == null) {
            if (other.rsmName != null)
                return false;
        }
        else if (!rsmName.equals(other.rsmName))
            return false;
        if (sdmId == null) {
            if (other.sdmId != null)
                return false;
        }
        else if (!sdmId.equals(other.sdmId))
            return false;
        if (sdmName == null) {
            if (other.sdmName != null)
                return false;
        }
        else if (!sdmName.equals(other.sdmName))
            return false;
        if (sdeId == null) {
            if (other.sdeId != null)
                return false;
        }
        else if (!sdeId.equals(other.sdeId))
            return false;
        if (sdeName == null) {
            if (other.sdeName != null)
                return false;
        }
        else if (!sdeName.equals(other.sdeName))
            return false;
        if (validFrom == null) {
            if (other.validFrom != null)
                return false;
        }
        else if (!validFrom.equals(other.validFrom))
            return false;
        if (validTo == null) {
            if (other.validTo != null)
                return false;
        }
        else if (!validTo.equals(other.validTo))
            return false;
        if (kycType == null) {
            if (other.kycType != null)
                return false;
        }
        else if (!kycType.equals(other.kycType))
            return false;
        if (otherKycType == null) {
            if (other.otherKycType != null)
                return false;
        }
        else if (!otherKycType.equals(other.otherKycType))
            return false;
        if (attachedDatetime == null) {
            if (other.attachedDatetime != null)
                return false;
        }
        else if (!attachedDatetime.equals(other.attachedDatetime))
            return false;
        if (flag == null) {
            if (other.flag != null)
                return false;
        }
        else if (!flag.equals(other.flag))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (createdOn == null) {
            if (other.createdOn != null)
                return false;
        }
        else if (!createdOn.equals(other.createdOn))
            return false;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!createdBy.equals(other.createdBy))
            return false;
        if (changedOn == null) {
            if (other.changedOn != null)
                return false;
        }
        else if (!changedOn.equals(other.changedOn))
            return false;
        if (changedBy == null) {
            if (other.changedBy != null)
                return false;
        }
        else if (!changedBy.equals(other.changedBy))
            return false;
        if (attachmentName == null) {
            if (other.attachmentName != null)
                return false;
        }
        else if (!attachmentName.equals(other.attachmentName))
            return false;
        if (uploadType == null) {
            if (other.uploadType != null)
                return false;
        }
        else if (!uploadType.equals(other.uploadType))
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
        result = prime * result + ((this.serialNo == null) ? 0 : this.serialNo.hashCode());
        result = prime * result + ((this.rsmId == null) ? 0 : this.rsmId.hashCode());
        result = prime * result + ((this.rsmName == null) ? 0 : this.rsmName.hashCode());
        result = prime * result + ((this.sdmId == null) ? 0 : this.sdmId.hashCode());
        result = prime * result + ((this.sdmName == null) ? 0 : this.sdmName.hashCode());
        result = prime * result + ((this.sdeId == null) ? 0 : this.sdeId.hashCode());
        result = prime * result + ((this.sdeName == null) ? 0 : this.sdeName.hashCode());
        result = prime * result + ((this.validFrom == null) ? 0 : this.validFrom.hashCode());
        result = prime * result + ((this.validTo == null) ? 0 : this.validTo.hashCode());
        result = prime * result + ((this.kycType == null) ? 0 : this.kycType.hashCode());
        result = prime * result + ((this.otherKycType == null) ? 0 : this.otherKycType.hashCode());
        result = prime * result + ((this.attachedDatetime == null) ? 0 : this.attachedDatetime.hashCode());
        result = prime * result + ((this.flag == null) ? 0 : this.flag.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.changedOn == null) ? 0 : this.changedOn.hashCode());
        result = prime * result + ((this.changedBy == null) ? 0 : this.changedBy.hashCode());
        result = prime * result + ((this.attachmentName == null) ? 0 : this.attachmentName.hashCode());
        result = prime * result + ((this.uploadType == null) ? 0 : this.uploadType.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CustomerKyc (");

        sb.append(compCode);
        sb.append(", ").append(customerCode);
        sb.append(", ").append(customerName);
        sb.append(", ").append(serialNo);
        sb.append(", ").append(rsmId);
        sb.append(", ").append(rsmName);
        sb.append(", ").append(sdmId);
        sb.append(", ").append(sdmName);
        sb.append(", ").append(sdeId);
        sb.append(", ").append(sdeName);
        sb.append(", ").append(validFrom);
        sb.append(", ").append(validTo);
        sb.append(", ").append(kycType);
        sb.append(", ").append(otherKycType);
        sb.append(", ").append(attachedDatetime);
        sb.append(", ").append(flag);
        sb.append(", ").append(status);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(changedOn);
        sb.append(", ").append(changedBy);
        sb.append(", ").append(attachmentName);
        sb.append(", ").append(uploadType);

        sb.append(")");
        return sb.toString();
    }
}
