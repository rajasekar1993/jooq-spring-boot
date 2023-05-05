/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContractAgreement implements Serializable {

    private static final long serialVersionUID = 1L;

    private String    companyCode;
    private String    vendorCode;
    private String    documentId;
    private String    contractCode;
    private String    description;
    private String    documentStatus;
    private String    applicationType;
    private String    storageCat;
    private String    fileName;
    private String    fileString;
    private LocalDate createdOn;
    private String    createdBy;

    public ContractAgreement() {}

    public ContractAgreement(ContractAgreement value) {
        this.companyCode = value.companyCode;
        this.vendorCode = value.vendorCode;
        this.documentId = value.documentId;
        this.contractCode = value.contractCode;
        this.description = value.description;
        this.documentStatus = value.documentStatus;
        this.applicationType = value.applicationType;
        this.storageCat = value.storageCat;
        this.fileName = value.fileName;
        this.fileString = value.fileString;
        this.createdOn = value.createdOn;
        this.createdBy = value.createdBy;
    }

    public ContractAgreement(
        String    companyCode,
        String    vendorCode,
        String    documentId,
        String    contractCode,
        String    description,
        String    documentStatus,
        String    applicationType,
        String    storageCat,
        String    fileName,
        String    fileString,
        LocalDate createdOn,
        String    createdBy
    ) {
        this.companyCode = companyCode;
        this.vendorCode = vendorCode;
        this.documentId = documentId;
        this.contractCode = contractCode;
        this.description = description;
        this.documentStatus = documentStatus;
        this.applicationType = applicationType;
        this.storageCat = storageCat;
        this.fileName = fileName;
        this.fileString = fileString;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_agreement.COMPANY_CODE</code>.
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_agreement.COMPANY_CODE</code>.
     */
    public ContractAgreement setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_agreement.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return this.vendorCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_agreement.VENDOR_CODE</code>.
     */
    public ContractAgreement setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_agreement.DOCUMENT_ID</code>.
     */
    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_agreement.DOCUMENT_ID</code>.
     */
    public ContractAgreement setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_agreement.CONTRACT_CODE</code>.
     */
    public String getContractCode() {
        return this.contractCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_agreement.CONTRACT_CODE</code>.
     */
    public ContractAgreement setContractCode(String contractCode) {
        this.contractCode = contractCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_agreement.DESCRIPTION</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_agreement.DESCRIPTION</code>.
     */
    public ContractAgreement setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_agreement.DOCUMENT_STATUS</code>.
     */
    public String getDocumentStatus() {
        return this.documentStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_agreement.DOCUMENT_STATUS</code>.
     */
    public ContractAgreement setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_agreement.APPLICATION_TYPE</code>.
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_agreement.APPLICATION_TYPE</code>.
     */
    public ContractAgreement setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_agreement.STORAGE_CAT</code>.
     */
    public String getStorageCat() {
        return this.storageCat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_agreement.STORAGE_CAT</code>.
     */
    public ContractAgreement setStorageCat(String storageCat) {
        this.storageCat = storageCat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_agreement.FILE_NAME</code>.
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_agreement.FILE_NAME</code>.
     */
    public ContractAgreement setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_agreement.FILE_STRING</code>.
     */
    public String getFileString() {
        return this.fileString;
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_agreement.FILE_STRING</code>.
     */
    public ContractAgreement setFileString(String fileString) {
        this.fileString = fileString;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_agreement.CREATED_ON</code>.
     */
    public LocalDate getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_agreement.CREATED_ON</code>.
     */
    public ContractAgreement setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.contract_agreement.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.contract_agreement.CREATED_BY</code>.
     */
    public ContractAgreement setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
        final ContractAgreement other = (ContractAgreement) obj;
        if (companyCode == null) {
            if (other.companyCode != null)
                return false;
        }
        else if (!companyCode.equals(other.companyCode))
            return false;
        if (vendorCode == null) {
            if (other.vendorCode != null)
                return false;
        }
        else if (!vendorCode.equals(other.vendorCode))
            return false;
        if (documentId == null) {
            if (other.documentId != null)
                return false;
        }
        else if (!documentId.equals(other.documentId))
            return false;
        if (contractCode == null) {
            if (other.contractCode != null)
                return false;
        }
        else if (!contractCode.equals(other.contractCode))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (documentStatus == null) {
            if (other.documentStatus != null)
                return false;
        }
        else if (!documentStatus.equals(other.documentStatus))
            return false;
        if (applicationType == null) {
            if (other.applicationType != null)
                return false;
        }
        else if (!applicationType.equals(other.applicationType))
            return false;
        if (storageCat == null) {
            if (other.storageCat != null)
                return false;
        }
        else if (!storageCat.equals(other.storageCat))
            return false;
        if (fileName == null) {
            if (other.fileName != null)
                return false;
        }
        else if (!fileName.equals(other.fileName))
            return false;
        if (fileString == null) {
            if (other.fileString != null)
                return false;
        }
        else if (!fileString.equals(other.fileString))
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.companyCode == null) ? 0 : this.companyCode.hashCode());
        result = prime * result + ((this.vendorCode == null) ? 0 : this.vendorCode.hashCode());
        result = prime * result + ((this.documentId == null) ? 0 : this.documentId.hashCode());
        result = prime * result + ((this.contractCode == null) ? 0 : this.contractCode.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.documentStatus == null) ? 0 : this.documentStatus.hashCode());
        result = prime * result + ((this.applicationType == null) ? 0 : this.applicationType.hashCode());
        result = prime * result + ((this.storageCat == null) ? 0 : this.storageCat.hashCode());
        result = prime * result + ((this.fileName == null) ? 0 : this.fileName.hashCode());
        result = prime * result + ((this.fileString == null) ? 0 : this.fileString.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ContractAgreement (");

        sb.append(companyCode);
        sb.append(", ").append(vendorCode);
        sb.append(", ").append(documentId);
        sb.append(", ").append(contractCode);
        sb.append(", ").append(description);
        sb.append(", ").append(documentStatus);
        sb.append(", ").append(applicationType);
        sb.append(", ").append(storageCat);
        sb.append(", ").append(fileName);
        sb.append(", ").append(fileString);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(createdBy);

        sb.append(")");
        return sb.toString();
    }
}
