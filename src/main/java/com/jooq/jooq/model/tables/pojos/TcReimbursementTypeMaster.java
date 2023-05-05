/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TcReimbursementTypeMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String  reimburseTypeName;
    private String  status;

    public TcReimbursementTypeMaster() {}

    public TcReimbursementTypeMaster(TcReimbursementTypeMaster value) {
        this.id = value.id;
        this.reimburseTypeName = value.reimburseTypeName;
        this.status = value.status;
    }

    public TcReimbursementTypeMaster(
        Integer id,
        String  reimburseTypeName,
        String  status
    ) {
        this.id = id;
        this.reimburseTypeName = reimburseTypeName;
        this.status = status;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REIMBURSEMENT_TYPE_MASTER.ID</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REIMBURSEMENT_TYPE_MASTER.ID</code>.
     */
    public TcReimbursementTypeMaster setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REIMBURSEMENT_TYPE_MASTER.REIMBURSE_TYPE_NAME</code>.
     */
    public String getReimburseTypeName() {
        return this.reimburseTypeName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REIMBURSEMENT_TYPE_MASTER.REIMBURSE_TYPE_NAME</code>.
     */
    public TcReimbursementTypeMaster setReimburseTypeName(String reimburseTypeName) {
        this.reimburseTypeName = reimburseTypeName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REIMBURSEMENT_TYPE_MASTER.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REIMBURSEMENT_TYPE_MASTER.STATUS</code>.
     */
    public TcReimbursementTypeMaster setStatus(String status) {
        this.status = status;
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
        final TcReimbursementTypeMaster other = (TcReimbursementTypeMaster) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (reimburseTypeName == null) {
            if (other.reimburseTypeName != null)
                return false;
        }
        else if (!reimburseTypeName.equals(other.reimburseTypeName))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.reimburseTypeName == null) ? 0 : this.reimburseTypeName.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TcReimbursementTypeMaster (");

        sb.append(id);
        sb.append(", ").append(reimburseTypeName);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
