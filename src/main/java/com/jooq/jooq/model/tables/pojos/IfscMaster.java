/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IfscMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ifscCode;
    private String bankName;
    private String branchName;

    public IfscMaster() {}

    public IfscMaster(IfscMaster value) {
        this.ifscCode = value.ifscCode;
        this.bankName = value.bankName;
        this.branchName = value.branchName;
    }

    public IfscMaster(
        String ifscCode,
        String bankName,
        String branchName
    ) {
        this.ifscCode = ifscCode;
        this.bankName = bankName;
        this.branchName = branchName;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ifsc_master.IFSC_CODE</code>.
     */
    public String getIfscCode() {
        return this.ifscCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ifsc_master.IFSC_CODE</code>.
     */
    public IfscMaster setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ifsc_master.BANK_NAME</code>.
     */
    public String getBankName() {
        return this.bankName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ifsc_master.BANK_NAME</code>.
     */
    public IfscMaster setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ifsc_master.BRANCH_NAME</code>.
     */
    public String getBranchName() {
        return this.branchName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ifsc_master.BRANCH_NAME</code>.
     */
    public IfscMaster setBranchName(String branchName) {
        this.branchName = branchName;
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
        final IfscMaster other = (IfscMaster) obj;
        if (ifscCode == null) {
            if (other.ifscCode != null)
                return false;
        }
        else if (!ifscCode.equals(other.ifscCode))
            return false;
        if (bankName == null) {
            if (other.bankName != null)
                return false;
        }
        else if (!bankName.equals(other.bankName))
            return false;
        if (branchName == null) {
            if (other.branchName != null)
                return false;
        }
        else if (!branchName.equals(other.branchName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.ifscCode == null) ? 0 : this.ifscCode.hashCode());
        result = prime * result + ((this.bankName == null) ? 0 : this.bankName.hashCode());
        result = prime * result + ((this.branchName == null) ? 0 : this.branchName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IfscMaster (");

        sb.append(ifscCode);
        sb.append(", ").append(bankName);
        sb.append(", ").append(branchName);

        sb.append(")");
        return sb.toString();
    }
}
