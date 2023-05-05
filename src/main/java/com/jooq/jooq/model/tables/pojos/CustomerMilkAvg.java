/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerMilkAvg implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        compCode;
    private String        customerCode;
    private String        spyear;
    private String        spmon;
    private String        purGrp;
    private String        matGrp1;
    private String        matGrp2;
    private String        matGrp3;
    private String        matGrp4;
    private String        matnr;
    private BigDecimal    quantity;
    private String        status;
    private Integer       createdBy;
    private LocalDateTime createdOn;
    private Integer       lastChangedBy;
    private LocalDateTime lastChangedOn;
    private String        vkbur;
    private String        werks;

    public CustomerMilkAvg() {}

    public CustomerMilkAvg(CustomerMilkAvg value) {
        this.compCode = value.compCode;
        this.customerCode = value.customerCode;
        this.spyear = value.spyear;
        this.spmon = value.spmon;
        this.purGrp = value.purGrp;
        this.matGrp1 = value.matGrp1;
        this.matGrp2 = value.matGrp2;
        this.matGrp3 = value.matGrp3;
        this.matGrp4 = value.matGrp4;
        this.matnr = value.matnr;
        this.quantity = value.quantity;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
        this.vkbur = value.vkbur;
        this.werks = value.werks;
    }

    public CustomerMilkAvg(
        String        compCode,
        String        customerCode,
        String        spyear,
        String        spmon,
        String        purGrp,
        String        matGrp1,
        String        matGrp2,
        String        matGrp3,
        String        matGrp4,
        String        matnr,
        BigDecimal    quantity,
        String        status,
        Integer       createdBy,
        LocalDateTime createdOn,
        Integer       lastChangedBy,
        LocalDateTime lastChangedOn,
        String        vkbur,
        String        werks
    ) {
        this.compCode = compCode;
        this.customerCode = customerCode;
        this.spyear = spyear;
        this.spmon = spmon;
        this.purGrp = purGrp;
        this.matGrp1 = matGrp1;
        this.matGrp2 = matGrp2;
        this.matGrp3 = matGrp3;
        this.matGrp4 = matGrp4;
        this.matnr = matnr;
        this.quantity = quantity;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
        this.vkbur = vkbur;
        this.werks = werks;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.COMP_CODE</code>.
     */
    public CustomerMilkAvg setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.CUSTOMER_CODE</code>.
     */
    public CustomerMilkAvg setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.SPYEAR</code>.
     */
    public String getSpyear() {
        return this.spyear;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.SPYEAR</code>.
     */
    public CustomerMilkAvg setSpyear(String spyear) {
        this.spyear = spyear;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.SPMON</code>.
     */
    public String getSpmon() {
        return this.spmon;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.SPMON</code>.
     */
    public CustomerMilkAvg setSpmon(String spmon) {
        this.spmon = spmon;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.PUR_GRP</code>.
     */
    public String getPurGrp() {
        return this.purGrp;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.PUR_GRP</code>.
     */
    public CustomerMilkAvg setPurGrp(String purGrp) {
        this.purGrp = purGrp;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP1</code>.
     */
    public String getMatGrp1() {
        return this.matGrp1;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP1</code>.
     */
    public CustomerMilkAvg setMatGrp1(String matGrp1) {
        this.matGrp1 = matGrp1;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP2</code>.
     */
    public String getMatGrp2() {
        return this.matGrp2;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP2</code>.
     */
    public CustomerMilkAvg setMatGrp2(String matGrp2) {
        this.matGrp2 = matGrp2;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP3</code>.
     */
    public String getMatGrp3() {
        return this.matGrp3;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP3</code>.
     */
    public CustomerMilkAvg setMatGrp3(String matGrp3) {
        this.matGrp3 = matGrp3;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP4</code>.
     */
    public String getMatGrp4() {
        return this.matGrp4;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP4</code>.
     */
    public CustomerMilkAvg setMatGrp4(String matGrp4) {
        this.matGrp4 = matGrp4;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.MATNR</code>.
     */
    public String getMatnr() {
        return this.matnr;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.MATNR</code>.
     */
    public CustomerMilkAvg setMatnr(String matnr) {
        this.matnr = matnr;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.QUANTITY</code>.
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.QUANTITY</code>.
     */
    public CustomerMilkAvg setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.STATUS</code>.
     */
    public CustomerMilkAvg setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.CREATED_BY</code>.
     */
    public CustomerMilkAvg setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.CREATED_ON</code>.
     */
    public CustomerMilkAvg setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.LAST_CHANGED_BY</code>.
     */
    public CustomerMilkAvg setLastChangedBy(Integer lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.LAST_CHANGED_ON</code>.
     */
    public CustomerMilkAvg setLastChangedOn(LocalDateTime lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.VKBUR</code>.
     */
    public String getVkbur() {
        return this.vkbur;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.VKBUR</code>.
     */
    public CustomerMilkAvg setVkbur(String vkbur) {
        this.vkbur = vkbur;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.WERKS</code>.
     */
    public String getWerks() {
        return this.werks;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.WERKS</code>.
     */
    public CustomerMilkAvg setWerks(String werks) {
        this.werks = werks;
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
        final CustomerMilkAvg other = (CustomerMilkAvg) obj;
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
        if (spyear == null) {
            if (other.spyear != null)
                return false;
        }
        else if (!spyear.equals(other.spyear))
            return false;
        if (spmon == null) {
            if (other.spmon != null)
                return false;
        }
        else if (!spmon.equals(other.spmon))
            return false;
        if (purGrp == null) {
            if (other.purGrp != null)
                return false;
        }
        else if (!purGrp.equals(other.purGrp))
            return false;
        if (matGrp1 == null) {
            if (other.matGrp1 != null)
                return false;
        }
        else if (!matGrp1.equals(other.matGrp1))
            return false;
        if (matGrp2 == null) {
            if (other.matGrp2 != null)
                return false;
        }
        else if (!matGrp2.equals(other.matGrp2))
            return false;
        if (matGrp3 == null) {
            if (other.matGrp3 != null)
                return false;
        }
        else if (!matGrp3.equals(other.matGrp3))
            return false;
        if (matGrp4 == null) {
            if (other.matGrp4 != null)
                return false;
        }
        else if (!matGrp4.equals(other.matGrp4))
            return false;
        if (matnr == null) {
            if (other.matnr != null)
                return false;
        }
        else if (!matnr.equals(other.matnr))
            return false;
        if (quantity == null) {
            if (other.quantity != null)
                return false;
        }
        else if (!quantity.equals(other.quantity))
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
        if (vkbur == null) {
            if (other.vkbur != null)
                return false;
        }
        else if (!vkbur.equals(other.vkbur))
            return false;
        if (werks == null) {
            if (other.werks != null)
                return false;
        }
        else if (!werks.equals(other.werks))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.customerCode == null) ? 0 : this.customerCode.hashCode());
        result = prime * result + ((this.spyear == null) ? 0 : this.spyear.hashCode());
        result = prime * result + ((this.spmon == null) ? 0 : this.spmon.hashCode());
        result = prime * result + ((this.purGrp == null) ? 0 : this.purGrp.hashCode());
        result = prime * result + ((this.matGrp1 == null) ? 0 : this.matGrp1.hashCode());
        result = prime * result + ((this.matGrp2 == null) ? 0 : this.matGrp2.hashCode());
        result = prime * result + ((this.matGrp3 == null) ? 0 : this.matGrp3.hashCode());
        result = prime * result + ((this.matGrp4 == null) ? 0 : this.matGrp4.hashCode());
        result = prime * result + ((this.matnr == null) ? 0 : this.matnr.hashCode());
        result = prime * result + ((this.quantity == null) ? 0 : this.quantity.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        result = prime * result + ((this.vkbur == null) ? 0 : this.vkbur.hashCode());
        result = prime * result + ((this.werks == null) ? 0 : this.werks.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CustomerMilkAvg (");

        sb.append(compCode);
        sb.append(", ").append(customerCode);
        sb.append(", ").append(spyear);
        sb.append(", ").append(spmon);
        sb.append(", ").append(purGrp);
        sb.append(", ").append(matGrp1);
        sb.append(", ").append(matGrp2);
        sb.append(", ").append(matGrp3);
        sb.append(", ").append(matGrp4);
        sb.append(", ").append(matnr);
        sb.append(", ").append(quantity);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);
        sb.append(", ").append(vkbur);
        sb.append(", ").append(werks);

        sb.append(")");
        return sb.toString();
    }
}
