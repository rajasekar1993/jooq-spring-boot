/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IbacoStock implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       compCode;
    private String        plantCode;
    private String        materialCode;
    private String        kunnr;
    private String        charg;
    private String        name;
    private String        materialDesc;
    private String        uom;
    private BigDecimal    labst;
    private LocalDate     hsdat;
    private LocalDate     vfdat;
    private BigDecimal    remdat;
    private LocalDate     createdOn;
    private LocalDateTime createdTime;

    public IbacoStock() {}

    public IbacoStock(IbacoStock value) {
        this.compCode = value.compCode;
        this.plantCode = value.plantCode;
        this.materialCode = value.materialCode;
        this.kunnr = value.kunnr;
        this.charg = value.charg;
        this.name = value.name;
        this.materialDesc = value.materialDesc;
        this.uom = value.uom;
        this.labst = value.labst;
        this.hsdat = value.hsdat;
        this.vfdat = value.vfdat;
        this.remdat = value.remdat;
        this.createdOn = value.createdOn;
        this.createdTime = value.createdTime;
    }

    public IbacoStock(
        Integer       compCode,
        String        plantCode,
        String        materialCode,
        String        kunnr,
        String        charg,
        String        name,
        String        materialDesc,
        String        uom,
        BigDecimal    labst,
        LocalDate     hsdat,
        LocalDate     vfdat,
        BigDecimal    remdat,
        LocalDate     createdOn,
        LocalDateTime createdTime
    ) {
        this.compCode = compCode;
        this.plantCode = plantCode;
        this.materialCode = materialCode;
        this.kunnr = kunnr;
        this.charg = charg;
        this.name = name;
        this.materialDesc = materialDesc;
        this.uom = uom;
        this.labst = labst;
        this.hsdat = hsdat;
        this.vfdat = vfdat;
        this.remdat = remdat;
        this.createdOn = createdOn;
        this.createdTime = createdTime;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.COMP_CODE</code>.
     */
    public Integer getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.COMP_CODE</code>.
     */
    public IbacoStock setCompCode(Integer compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.PLANT_CODE</code>.
     */
    public String getPlantCode() {
        return this.plantCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.PLANT_CODE</code>.
     */
    public IbacoStock setPlantCode(String plantCode) {
        this.plantCode = plantCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.MATERIAL_CODE</code>.
     */
    public String getMaterialCode() {
        return this.materialCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.MATERIAL_CODE</code>.
     */
    public IbacoStock setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.KUNNR</code>.
     */
    public String getKunnr() {
        return this.kunnr;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.KUNNR</code>.
     */
    public IbacoStock setKunnr(String kunnr) {
        this.kunnr = kunnr;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.CHARG</code>.
     */
    public String getCharg() {
        return this.charg;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.CHARG</code>.
     */
    public IbacoStock setCharg(String charg) {
        this.charg = charg;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.NAME</code>.
     */
    public IbacoStock setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.MATERIAL_DESC</code>.
     */
    public String getMaterialDesc() {
        return this.materialDesc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.MATERIAL_DESC</code>.
     */
    public IbacoStock setMaterialDesc(String materialDesc) {
        this.materialDesc = materialDesc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.UOM</code>.
     */
    public String getUom() {
        return this.uom;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.UOM</code>.
     */
    public IbacoStock setUom(String uom) {
        this.uom = uom;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.LABST</code>.
     */
    public BigDecimal getLabst() {
        return this.labst;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.LABST</code>.
     */
    public IbacoStock setLabst(BigDecimal labst) {
        this.labst = labst;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.HSDAT</code>.
     */
    public LocalDate getHsdat() {
        return this.hsdat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.HSDAT</code>.
     */
    public IbacoStock setHsdat(LocalDate hsdat) {
        this.hsdat = hsdat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.VFDAT</code>.
     */
    public LocalDate getVfdat() {
        return this.vfdat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.VFDAT</code>.
     */
    public IbacoStock setVfdat(LocalDate vfdat) {
        this.vfdat = vfdat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.REMDAT</code>.
     */
    public BigDecimal getRemdat() {
        return this.remdat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.REMDAT</code>.
     */
    public IbacoStock setRemdat(BigDecimal remdat) {
        this.remdat = remdat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.CREATED_ON</code>.
     */
    public LocalDate getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.CREATED_ON</code>.
     */
    public IbacoStock setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.CREATED_TIME</code>.
     */
    public LocalDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.CREATED_TIME</code>.
     */
    public IbacoStock setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
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
        final IbacoStock other = (IbacoStock) obj;
        if (compCode == null) {
            if (other.compCode != null)
                return false;
        }
        else if (!compCode.equals(other.compCode))
            return false;
        if (plantCode == null) {
            if (other.plantCode != null)
                return false;
        }
        else if (!plantCode.equals(other.plantCode))
            return false;
        if (materialCode == null) {
            if (other.materialCode != null)
                return false;
        }
        else if (!materialCode.equals(other.materialCode))
            return false;
        if (kunnr == null) {
            if (other.kunnr != null)
                return false;
        }
        else if (!kunnr.equals(other.kunnr))
            return false;
        if (charg == null) {
            if (other.charg != null)
                return false;
        }
        else if (!charg.equals(other.charg))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (materialDesc == null) {
            if (other.materialDesc != null)
                return false;
        }
        else if (!materialDesc.equals(other.materialDesc))
            return false;
        if (uom == null) {
            if (other.uom != null)
                return false;
        }
        else if (!uom.equals(other.uom))
            return false;
        if (labst == null) {
            if (other.labst != null)
                return false;
        }
        else if (!labst.equals(other.labst))
            return false;
        if (hsdat == null) {
            if (other.hsdat != null)
                return false;
        }
        else if (!hsdat.equals(other.hsdat))
            return false;
        if (vfdat == null) {
            if (other.vfdat != null)
                return false;
        }
        else if (!vfdat.equals(other.vfdat))
            return false;
        if (remdat == null) {
            if (other.remdat != null)
                return false;
        }
        else if (!remdat.equals(other.remdat))
            return false;
        if (createdOn == null) {
            if (other.createdOn != null)
                return false;
        }
        else if (!createdOn.equals(other.createdOn))
            return false;
        if (createdTime == null) {
            if (other.createdTime != null)
                return false;
        }
        else if (!createdTime.equals(other.createdTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.plantCode == null) ? 0 : this.plantCode.hashCode());
        result = prime * result + ((this.materialCode == null) ? 0 : this.materialCode.hashCode());
        result = prime * result + ((this.kunnr == null) ? 0 : this.kunnr.hashCode());
        result = prime * result + ((this.charg == null) ? 0 : this.charg.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.materialDesc == null) ? 0 : this.materialDesc.hashCode());
        result = prime * result + ((this.uom == null) ? 0 : this.uom.hashCode());
        result = prime * result + ((this.labst == null) ? 0 : this.labst.hashCode());
        result = prime * result + ((this.hsdat == null) ? 0 : this.hsdat.hashCode());
        result = prime * result + ((this.vfdat == null) ? 0 : this.vfdat.hashCode());
        result = prime * result + ((this.remdat == null) ? 0 : this.remdat.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.createdTime == null) ? 0 : this.createdTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IbacoStock (");

        sb.append(compCode);
        sb.append(", ").append(plantCode);
        sb.append(", ").append(materialCode);
        sb.append(", ").append(kunnr);
        sb.append(", ").append(charg);
        sb.append(", ").append(name);
        sb.append(", ").append(materialDesc);
        sb.append(", ").append(uom);
        sb.append(", ").append(labst);
        sb.append(", ").append(hsdat);
        sb.append(", ").append(vfdat);
        sb.append(", ").append(remdat);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(createdTime);

        sb.append(")");
        return sb.toString();
    }
}
