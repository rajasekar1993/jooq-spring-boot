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
public class CcmsContractorPfMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        name;
    private String        esi;
    private String        pf;
    private String        effectiveFrom;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public CcmsContractorPfMaster() {}

    public CcmsContractorPfMaster(CcmsContractorPfMaster value) {
        this.name = value.name;
        this.esi = value.esi;
        this.pf = value.pf;
        this.effectiveFrom = value.effectiveFrom;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public CcmsContractorPfMaster(
        String        name,
        String        esi,
        String        pf,
        String        effectiveFrom,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.name = name;
        this.esi = esi;
        this.pf = pf;
        this.effectiveFrom = effectiveFrom;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_contractor_pf_master.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_contractor_pf_master.name</code>.
     */
    public CcmsContractorPfMaster setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_contractor_pf_master.esi</code>.
     */
    public String getEsi() {
        return this.esi;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_contractor_pf_master.esi</code>.
     */
    public CcmsContractorPfMaster setEsi(String esi) {
        this.esi = esi;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_contractor_pf_master.pf</code>.
     */
    public String getPf() {
        return this.pf;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_contractor_pf_master.pf</code>.
     */
    public CcmsContractorPfMaster setPf(String pf) {
        this.pf = pf;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_contractor_pf_master.effective_from</code>.
     */
    public String getEffectiveFrom() {
        return this.effectiveFrom;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_contractor_pf_master.effective_from</code>.
     */
    public CcmsContractorPfMaster setEffectiveFrom(String effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_contractor_pf_master.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_contractor_pf_master.status</code>.
     */
    public CcmsContractorPfMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_contractor_pf_master.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_contractor_pf_master.created_by</code>.
     */
    public CcmsContractorPfMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_contractor_pf_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_contractor_pf_master.created_on</code>.
     */
    public CcmsContractorPfMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_contractor_pf_master.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_contractor_pf_master.last_changed_by</code>.
     */
    public CcmsContractorPfMaster setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_contractor_pf_master.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_contractor_pf_master.last_changed_on</code>.
     */
    public CcmsContractorPfMaster setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final CcmsContractorPfMaster other = (CcmsContractorPfMaster) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (esi == null) {
            if (other.esi != null)
                return false;
        }
        else if (!esi.equals(other.esi))
            return false;
        if (pf == null) {
            if (other.pf != null)
                return false;
        }
        else if (!pf.equals(other.pf))
            return false;
        if (effectiveFrom == null) {
            if (other.effectiveFrom != null)
                return false;
        }
        else if (!effectiveFrom.equals(other.effectiveFrom))
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
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.esi == null) ? 0 : this.esi.hashCode());
        result = prime * result + ((this.pf == null) ? 0 : this.pf.hashCode());
        result = prime * result + ((this.effectiveFrom == null) ? 0 : this.effectiveFrom.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsContractorPfMaster (");

        sb.append(name);
        sb.append(", ").append(esi);
        sb.append(", ").append(pf);
        sb.append(", ").append(effectiveFrom);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
