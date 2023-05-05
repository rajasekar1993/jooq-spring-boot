/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CfaFreezerFile implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        cfa;
    private String        customerCode;
    private String        gateEntryNo;
    private LocalDate     postingDate;
    private String        description;
    private String        division;
    private String        quantity;
    private String        fileName;
    private String        fileType;
    private String        cfaRemark;
    private LocalDateTime uploadedDateTime;
    private byte[]        file;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        changedBy;
    private LocalDateTime changedOn;
    private String        status;
    private String        fileUrl;

    public CfaFreezerFile() {}

    public CfaFreezerFile(CfaFreezerFile value) {
        this.cfa = value.cfa;
        this.customerCode = value.customerCode;
        this.gateEntryNo = value.gateEntryNo;
        this.postingDate = value.postingDate;
        this.description = value.description;
        this.division = value.division;
        this.quantity = value.quantity;
        this.fileName = value.fileName;
        this.fileType = value.fileType;
        this.cfaRemark = value.cfaRemark;
        this.uploadedDateTime = value.uploadedDateTime;
        this.file = value.file;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.changedBy = value.changedBy;
        this.changedOn = value.changedOn;
        this.status = value.status;
        this.fileUrl = value.fileUrl;
    }

    public CfaFreezerFile(
        String        cfa,
        String        customerCode,
        String        gateEntryNo,
        LocalDate     postingDate,
        String        description,
        String        division,
        String        quantity,
        String        fileName,
        String        fileType,
        String        cfaRemark,
        LocalDateTime uploadedDateTime,
        byte[]        file,
        String        createdBy,
        LocalDateTime createdOn,
        String        changedBy,
        LocalDateTime changedOn,
        String        status,
        String        fileUrl
    ) {
        this.cfa = cfa;
        this.customerCode = customerCode;
        this.gateEntryNo = gateEntryNo;
        this.postingDate = postingDate;
        this.description = description;
        this.division = division;
        this.quantity = quantity;
        this.fileName = fileName;
        this.fileType = fileType;
        this.cfaRemark = cfaRemark;
        this.uploadedDateTime = uploadedDateTime;
        this.file = file;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.changedBy = changedBy;
        this.changedOn = changedOn;
        this.status = status;
        this.fileUrl = fileUrl;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.CFA</code>.
     */
    public String getCfa() {
        return this.cfa;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.CFA</code>.
     */
    public CfaFreezerFile setCfa(String cfa) {
        this.cfa = cfa;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.CUSTOMER_CODE</code>.
     */
    public CfaFreezerFile setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.GATE_ENTRY_NO</code>.
     */
    public String getGateEntryNo() {
        return this.gateEntryNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.GATE_ENTRY_NO</code>.
     */
    public CfaFreezerFile setGateEntryNo(String gateEntryNo) {
        this.gateEntryNo = gateEntryNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.POSTING_DATE</code>.
     */
    public LocalDate getPostingDate() {
        return this.postingDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.POSTING_DATE</code>.
     */
    public CfaFreezerFile setPostingDate(LocalDate postingDate) {
        this.postingDate = postingDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.DESCRIPTION</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.DESCRIPTION</code>.
     */
    public CfaFreezerFile setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.DIVISION</code>.
     */
    public String getDivision() {
        return this.division;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.DIVISION</code>.
     */
    public CfaFreezerFile setDivision(String division) {
        this.division = division;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.QUANTITY</code>.
     */
    public String getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.QUANTITY</code>.
     */
    public CfaFreezerFile setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.FILE_NAME</code>.
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.FILE_NAME</code>.
     */
    public CfaFreezerFile setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.FILE_TYPE</code>.
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.FILE_TYPE</code>.
     */
    public CfaFreezerFile setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.CFA_REMARK</code>.
     */
    public String getCfaRemark() {
        return this.cfaRemark;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.CFA_REMARK</code>.
     */
    public CfaFreezerFile setCfaRemark(String cfaRemark) {
        this.cfaRemark = cfaRemark;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.UPLOADED_DATE_TIME</code>.
     */
    public LocalDateTime getUploadedDateTime() {
        return this.uploadedDateTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.UPLOADED_DATE_TIME</code>.
     */
    public CfaFreezerFile setUploadedDateTime(LocalDateTime uploadedDateTime) {
        this.uploadedDateTime = uploadedDateTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.FILE</code>.
     */
    public byte[] getFile() {
        return this.file;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.FILE</code>.
     */
    public CfaFreezerFile setFile(byte[] file) {
        this.file = file;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.CREATED_BY</code>.
     */
    public CfaFreezerFile setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.CREATED_ON</code>.
     */
    public CfaFreezerFile setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.CHANGED_BY</code>.
     */
    public String getChangedBy() {
        return this.changedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.CHANGED_BY</code>.
     */
    public CfaFreezerFile setChangedBy(String changedBy) {
        this.changedBy = changedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.CHANGED_ON</code>.
     */
    public LocalDateTime getChangedOn() {
        return this.changedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.CHANGED_ON</code>.
     */
    public CfaFreezerFile setChangedOn(LocalDateTime changedOn) {
        this.changedOn = changedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.STATUS</code>.
     */
    public CfaFreezerFile setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.cfa_freezer_file.FILE_URL</code>.
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * Setter for <code>vendor_portal_pbx.cfa_freezer_file.FILE_URL</code>.
     */
    public CfaFreezerFile setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
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
        final CfaFreezerFile other = (CfaFreezerFile) obj;
        if (cfa == null) {
            if (other.cfa != null)
                return false;
        }
        else if (!cfa.equals(other.cfa))
            return false;
        if (customerCode == null) {
            if (other.customerCode != null)
                return false;
        }
        else if (!customerCode.equals(other.customerCode))
            return false;
        if (gateEntryNo == null) {
            if (other.gateEntryNo != null)
                return false;
        }
        else if (!gateEntryNo.equals(other.gateEntryNo))
            return false;
        if (postingDate == null) {
            if (other.postingDate != null)
                return false;
        }
        else if (!postingDate.equals(other.postingDate))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (division == null) {
            if (other.division != null)
                return false;
        }
        else if (!division.equals(other.division))
            return false;
        if (quantity == null) {
            if (other.quantity != null)
                return false;
        }
        else if (!quantity.equals(other.quantity))
            return false;
        if (fileName == null) {
            if (other.fileName != null)
                return false;
        }
        else if (!fileName.equals(other.fileName))
            return false;
        if (fileType == null) {
            if (other.fileType != null)
                return false;
        }
        else if (!fileType.equals(other.fileType))
            return false;
        if (cfaRemark == null) {
            if (other.cfaRemark != null)
                return false;
        }
        else if (!cfaRemark.equals(other.cfaRemark))
            return false;
        if (uploadedDateTime == null) {
            if (other.uploadedDateTime != null)
                return false;
        }
        else if (!uploadedDateTime.equals(other.uploadedDateTime))
            return false;
        if (file == null) {
            if (other.file != null)
                return false;
        }
        else if (!Arrays.equals(file, other.file))
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
        if (changedBy == null) {
            if (other.changedBy != null)
                return false;
        }
        else if (!changedBy.equals(other.changedBy))
            return false;
        if (changedOn == null) {
            if (other.changedOn != null)
                return false;
        }
        else if (!changedOn.equals(other.changedOn))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (fileUrl == null) {
            if (other.fileUrl != null)
                return false;
        }
        else if (!fileUrl.equals(other.fileUrl))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.cfa == null) ? 0 : this.cfa.hashCode());
        result = prime * result + ((this.customerCode == null) ? 0 : this.customerCode.hashCode());
        result = prime * result + ((this.gateEntryNo == null) ? 0 : this.gateEntryNo.hashCode());
        result = prime * result + ((this.postingDate == null) ? 0 : this.postingDate.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.division == null) ? 0 : this.division.hashCode());
        result = prime * result + ((this.quantity == null) ? 0 : this.quantity.hashCode());
        result = prime * result + ((this.fileName == null) ? 0 : this.fileName.hashCode());
        result = prime * result + ((this.fileType == null) ? 0 : this.fileType.hashCode());
        result = prime * result + ((this.cfaRemark == null) ? 0 : this.cfaRemark.hashCode());
        result = prime * result + ((this.uploadedDateTime == null) ? 0 : this.uploadedDateTime.hashCode());
        result = prime * result + ((this.file == null) ? 0 : Arrays.hashCode(this.file));
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.changedBy == null) ? 0 : this.changedBy.hashCode());
        result = prime * result + ((this.changedOn == null) ? 0 : this.changedOn.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.fileUrl == null) ? 0 : this.fileUrl.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CfaFreezerFile (");

        sb.append(cfa);
        sb.append(", ").append(customerCode);
        sb.append(", ").append(gateEntryNo);
        sb.append(", ").append(postingDate);
        sb.append(", ").append(description);
        sb.append(", ").append(division);
        sb.append(", ").append(quantity);
        sb.append(", ").append(fileName);
        sb.append(", ").append(fileType);
        sb.append(", ").append(cfaRemark);
        sb.append(", ").append(uploadedDateTime);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(changedBy);
        sb.append(", ").append(changedOn);
        sb.append(", ").append(status);
        sb.append(", ").append(fileUrl);

        sb.append(")");
        return sb.toString();
    }
}
