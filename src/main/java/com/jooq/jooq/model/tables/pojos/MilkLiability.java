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
public class MilkLiability implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        werks;
    private String        society;
    private LocalDate     fromDate;
    private LocalDate     toDate;
    private String        name1;
    private String        erfmgLtr;
    private String        erfmg;
    private String        kgfat;
    private String        kgsnf;
    private String        kgts;
    private String        fatN;
    private String        snfN;
    private String        tsN;
    private String        quantity;
    private String        quantityKg;
    private String        kgFat;
    private String        kgSnf;
    private String        kgTs;
    private String        fat;
    private String        snf;
    private String        ts;
    private BigDecimal    amt;
    private BigDecimal    dmbtr2;
    private BigDecimal    amt1;
    private BigDecimal    totamt;
    private BigDecimal    amt2;
    private BigDecimal    netamt;
    private LocalDate     sapDate;
    private String        societyDesc;
    private String        j_1kftbus;
    private String        noOfFarmers;
    private String        recDays;
    private String        recMilk;
    private String        centDays;
    private String        centMilk;
    private String        diffQtyLtr;
    private String        hmbType;
    private LocalDate     hmbMdate;
    private String        status;
    private Integer       createdBy;
    private LocalDateTime createdOn;
    private Integer       lastChangedBy;
    private LocalDateTime lastChangedOn;

    public MilkLiability() {}

    public MilkLiability(MilkLiability value) {
        this.werks = value.werks;
        this.society = value.society;
        this.fromDate = value.fromDate;
        this.toDate = value.toDate;
        this.name1 = value.name1;
        this.erfmgLtr = value.erfmgLtr;
        this.erfmg = value.erfmg;
        this.kgfat = value.kgfat;
        this.kgsnf = value.kgsnf;
        this.kgts = value.kgts;
        this.fatN = value.fatN;
        this.snfN = value.snfN;
        this.tsN = value.tsN;
        this.quantity = value.quantity;
        this.quantityKg = value.quantityKg;
        this.kgFat = value.kgFat;
        this.kgSnf = value.kgSnf;
        this.kgTs = value.kgTs;
        this.fat = value.fat;
        this.snf = value.snf;
        this.ts = value.ts;
        this.amt = value.amt;
        this.dmbtr2 = value.dmbtr2;
        this.amt1 = value.amt1;
        this.totamt = value.totamt;
        this.amt2 = value.amt2;
        this.netamt = value.netamt;
        this.sapDate = value.sapDate;
        this.societyDesc = value.societyDesc;
        this.j_1kftbus = value.j_1kftbus;
        this.noOfFarmers = value.noOfFarmers;
        this.recDays = value.recDays;
        this.recMilk = value.recMilk;
        this.centDays = value.centDays;
        this.centMilk = value.centMilk;
        this.diffQtyLtr = value.diffQtyLtr;
        this.hmbType = value.hmbType;
        this.hmbMdate = value.hmbMdate;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public MilkLiability(
        String        werks,
        String        society,
        LocalDate     fromDate,
        LocalDate     toDate,
        String        name1,
        String        erfmgLtr,
        String        erfmg,
        String        kgfat,
        String        kgsnf,
        String        kgts,
        String        fatN,
        String        snfN,
        String        tsN,
        String        quantity,
        String        quantityKg,
        String        kgFat,
        String        kgSnf,
        String        kgTs,
        String        fat,
        String        snf,
        String        ts,
        BigDecimal    amt,
        BigDecimal    dmbtr2,
        BigDecimal    amt1,
        BigDecimal    totamt,
        BigDecimal    amt2,
        BigDecimal    netamt,
        LocalDate     sapDate,
        String        societyDesc,
        String        j_1kftbus,
        String        noOfFarmers,
        String        recDays,
        String        recMilk,
        String        centDays,
        String        centMilk,
        String        diffQtyLtr,
        String        hmbType,
        LocalDate     hmbMdate,
        String        status,
        Integer       createdBy,
        LocalDateTime createdOn,
        Integer       lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.werks = werks;
        this.society = society;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.name1 = name1;
        this.erfmgLtr = erfmgLtr;
        this.erfmg = erfmg;
        this.kgfat = kgfat;
        this.kgsnf = kgsnf;
        this.kgts = kgts;
        this.fatN = fatN;
        this.snfN = snfN;
        this.tsN = tsN;
        this.quantity = quantity;
        this.quantityKg = quantityKg;
        this.kgFat = kgFat;
        this.kgSnf = kgSnf;
        this.kgTs = kgTs;
        this.fat = fat;
        this.snf = snf;
        this.ts = ts;
        this.amt = amt;
        this.dmbtr2 = dmbtr2;
        this.amt1 = amt1;
        this.totamt = totamt;
        this.amt2 = amt2;
        this.netamt = netamt;
        this.sapDate = sapDate;
        this.societyDesc = societyDesc;
        this.j_1kftbus = j_1kftbus;
        this.noOfFarmers = noOfFarmers;
        this.recDays = recDays;
        this.recMilk = recMilk;
        this.centDays = centDays;
        this.centMilk = centMilk;
        this.diffQtyLtr = diffQtyLtr;
        this.hmbType = hmbType;
        this.hmbMdate = hmbMdate;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.WERKS</code>.
     */
    public String getWerks() {
        return this.werks;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.WERKS</code>.
     */
    public MilkLiability setWerks(String werks) {
        this.werks = werks;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.SOCIETY</code>.
     */
    public String getSociety() {
        return this.society;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.SOCIETY</code>.
     */
    public MilkLiability setSociety(String society) {
        this.society = society;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.FROM_DATE</code>.
     */
    public LocalDate getFromDate() {
        return this.fromDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.FROM_DATE</code>.
     */
    public MilkLiability setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.TO_DATE</code>.
     */
    public LocalDate getToDate() {
        return this.toDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.TO_DATE</code>.
     */
    public MilkLiability setToDate(LocalDate toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.NAME1</code>.
     */
    public String getName1() {
        return this.name1;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.NAME1</code>.
     */
    public MilkLiability setName1(String name1) {
        this.name1 = name1;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.ERFMG_LTR</code>.
     */
    public String getErfmgLtr() {
        return this.erfmgLtr;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.ERFMG_LTR</code>.
     */
    public MilkLiability setErfmgLtr(String erfmgLtr) {
        this.erfmgLtr = erfmgLtr;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.ERFMG</code>.
     */
    public String getErfmg() {
        return this.erfmg;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.ERFMG</code>.
     */
    public MilkLiability setErfmg(String erfmg) {
        this.erfmg = erfmg;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.KGFAT</code>.
     */
    public String getKgfat() {
        return this.kgfat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.KGFAT</code>.
     */
    public MilkLiability setKgfat(String kgfat) {
        this.kgfat = kgfat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.KGSNF</code>.
     */
    public String getKgsnf() {
        return this.kgsnf;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.KGSNF</code>.
     */
    public MilkLiability setKgsnf(String kgsnf) {
        this.kgsnf = kgsnf;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.KGTS</code>.
     */
    public String getKgts() {
        return this.kgts;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.KGTS</code>.
     */
    public MilkLiability setKgts(String kgts) {
        this.kgts = kgts;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.FAT_N</code>.
     */
    public String getFatN() {
        return this.fatN;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.FAT_N</code>.
     */
    public MilkLiability setFatN(String fatN) {
        this.fatN = fatN;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.SNF_N</code>.
     */
    public String getSnfN() {
        return this.snfN;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.SNF_N</code>.
     */
    public MilkLiability setSnfN(String snfN) {
        this.snfN = snfN;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.TS_N</code>.
     */
    public String getTsN() {
        return this.tsN;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.TS_N</code>.
     */
    public MilkLiability setTsN(String tsN) {
        this.tsN = tsN;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.QUANTITY</code>.
     */
    public String getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.QUANTITY</code>.
     */
    public MilkLiability setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.QUANTITY_KG</code>.
     */
    public String getQuantityKg() {
        return this.quantityKg;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.QUANTITY_KG</code>.
     */
    public MilkLiability setQuantityKg(String quantityKg) {
        this.quantityKg = quantityKg;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.KG_FAT</code>.
     */
    public String getKgFat() {
        return this.kgFat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.KG_FAT</code>.
     */
    public MilkLiability setKgFat(String kgFat) {
        this.kgFat = kgFat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.KG_SNF</code>.
     */
    public String getKgSnf() {
        return this.kgSnf;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.KG_SNF</code>.
     */
    public MilkLiability setKgSnf(String kgSnf) {
        this.kgSnf = kgSnf;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.KG_TS</code>.
     */
    public String getKgTs() {
        return this.kgTs;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.KG_TS</code>.
     */
    public MilkLiability setKgTs(String kgTs) {
        this.kgTs = kgTs;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.FAT</code>.
     */
    public String getFat() {
        return this.fat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.FAT</code>.
     */
    public MilkLiability setFat(String fat) {
        this.fat = fat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.SNF</code>.
     */
    public String getSnf() {
        return this.snf;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.SNF</code>.
     */
    public MilkLiability setSnf(String snf) {
        this.snf = snf;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.TS</code>.
     */
    public String getTs() {
        return this.ts;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.TS</code>.
     */
    public MilkLiability setTs(String ts) {
        this.ts = ts;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.AMT</code>.
     */
    public BigDecimal getAmt() {
        return this.amt;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.AMT</code>.
     */
    public MilkLiability setAmt(BigDecimal amt) {
        this.amt = amt;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.DMBTR2</code>.
     */
    public BigDecimal getDmbtr2() {
        return this.dmbtr2;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.DMBTR2</code>.
     */
    public MilkLiability setDmbtr2(BigDecimal dmbtr2) {
        this.dmbtr2 = dmbtr2;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.AMT1</code>.
     */
    public BigDecimal getAmt1() {
        return this.amt1;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.AMT1</code>.
     */
    public MilkLiability setAmt1(BigDecimal amt1) {
        this.amt1 = amt1;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.TOTAMT</code>.
     */
    public BigDecimal getTotamt() {
        return this.totamt;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.TOTAMT</code>.
     */
    public MilkLiability setTotamt(BigDecimal totamt) {
        this.totamt = totamt;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.AMT2</code>.
     */
    public BigDecimal getAmt2() {
        return this.amt2;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.AMT2</code>.
     */
    public MilkLiability setAmt2(BigDecimal amt2) {
        this.amt2 = amt2;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.NETAMT</code>.
     */
    public BigDecimal getNetamt() {
        return this.netamt;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.NETAMT</code>.
     */
    public MilkLiability setNetamt(BigDecimal netamt) {
        this.netamt = netamt;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.SAP_DATE</code>.
     */
    public LocalDate getSapDate() {
        return this.sapDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.SAP_DATE</code>.
     */
    public MilkLiability setSapDate(LocalDate sapDate) {
        this.sapDate = sapDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.SOCIETY_DESC</code>.
     */
    public String getSocietyDesc() {
        return this.societyDesc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.SOCIETY_DESC</code>.
     */
    public MilkLiability setSocietyDesc(String societyDesc) {
        this.societyDesc = societyDesc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.J_1KFTBUS</code>.
     */
    public String getJ_1kftbus() {
        return this.j_1kftbus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.J_1KFTBUS</code>.
     */
    public MilkLiability setJ_1kftbus(String j_1kftbus) {
        this.j_1kftbus = j_1kftbus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.NO_OF_FARMERS</code>.
     */
    public String getNoOfFarmers() {
        return this.noOfFarmers;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.NO_OF_FARMERS</code>.
     */
    public MilkLiability setNoOfFarmers(String noOfFarmers) {
        this.noOfFarmers = noOfFarmers;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.REC_DAYS</code>.
     */
    public String getRecDays() {
        return this.recDays;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.REC_DAYS</code>.
     */
    public MilkLiability setRecDays(String recDays) {
        this.recDays = recDays;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.REC_MILK</code>.
     */
    public String getRecMilk() {
        return this.recMilk;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.REC_MILK</code>.
     */
    public MilkLiability setRecMilk(String recMilk) {
        this.recMilk = recMilk;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.CENT_DAYS</code>.
     */
    public String getCentDays() {
        return this.centDays;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.CENT_DAYS</code>.
     */
    public MilkLiability setCentDays(String centDays) {
        this.centDays = centDays;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.CENT_MILK</code>.
     */
    public String getCentMilk() {
        return this.centMilk;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.CENT_MILK</code>.
     */
    public MilkLiability setCentMilk(String centMilk) {
        this.centMilk = centMilk;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.DIFF_QTY_LTR</code>.
     */
    public String getDiffQtyLtr() {
        return this.diffQtyLtr;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.DIFF_QTY_LTR</code>.
     */
    public MilkLiability setDiffQtyLtr(String diffQtyLtr) {
        this.diffQtyLtr = diffQtyLtr;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.HMB_TYPE</code>.
     */
    public String getHmbType() {
        return this.hmbType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.HMB_TYPE</code>.
     */
    public MilkLiability setHmbType(String hmbType) {
        this.hmbType = hmbType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.HMB_MDATE</code>.
     */
    public LocalDate getHmbMdate() {
        return this.hmbMdate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.HMB_MDATE</code>.
     */
    public MilkLiability setHmbMdate(LocalDate hmbMdate) {
        this.hmbMdate = hmbMdate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.STATUS</code>.
     */
    public MilkLiability setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.CREATED_BY</code>.
     */
    public MilkLiability setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.CREATED_ON</code>.
     */
    public MilkLiability setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.LAST_CHANGED_BY</code>.
     */
    public MilkLiability setLastChangedBy(Integer lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_liability.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_liability.LAST_CHANGED_ON</code>.
     */
    public MilkLiability setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final MilkLiability other = (MilkLiability) obj;
        if (werks == null) {
            if (other.werks != null)
                return false;
        }
        else if (!werks.equals(other.werks))
            return false;
        if (society == null) {
            if (other.society != null)
                return false;
        }
        else if (!society.equals(other.society))
            return false;
        if (fromDate == null) {
            if (other.fromDate != null)
                return false;
        }
        else if (!fromDate.equals(other.fromDate))
            return false;
        if (toDate == null) {
            if (other.toDate != null)
                return false;
        }
        else if (!toDate.equals(other.toDate))
            return false;
        if (name1 == null) {
            if (other.name1 != null)
                return false;
        }
        else if (!name1.equals(other.name1))
            return false;
        if (erfmgLtr == null) {
            if (other.erfmgLtr != null)
                return false;
        }
        else if (!erfmgLtr.equals(other.erfmgLtr))
            return false;
        if (erfmg == null) {
            if (other.erfmg != null)
                return false;
        }
        else if (!erfmg.equals(other.erfmg))
            return false;
        if (kgfat == null) {
            if (other.kgfat != null)
                return false;
        }
        else if (!kgfat.equals(other.kgfat))
            return false;
        if (kgsnf == null) {
            if (other.kgsnf != null)
                return false;
        }
        else if (!kgsnf.equals(other.kgsnf))
            return false;
        if (kgts == null) {
            if (other.kgts != null)
                return false;
        }
        else if (!kgts.equals(other.kgts))
            return false;
        if (fatN == null) {
            if (other.fatN != null)
                return false;
        }
        else if (!fatN.equals(other.fatN))
            return false;
        if (snfN == null) {
            if (other.snfN != null)
                return false;
        }
        else if (!snfN.equals(other.snfN))
            return false;
        if (tsN == null) {
            if (other.tsN != null)
                return false;
        }
        else if (!tsN.equals(other.tsN))
            return false;
        if (quantity == null) {
            if (other.quantity != null)
                return false;
        }
        else if (!quantity.equals(other.quantity))
            return false;
        if (quantityKg == null) {
            if (other.quantityKg != null)
                return false;
        }
        else if (!quantityKg.equals(other.quantityKg))
            return false;
        if (kgFat == null) {
            if (other.kgFat != null)
                return false;
        }
        else if (!kgFat.equals(other.kgFat))
            return false;
        if (kgSnf == null) {
            if (other.kgSnf != null)
                return false;
        }
        else if (!kgSnf.equals(other.kgSnf))
            return false;
        if (kgTs == null) {
            if (other.kgTs != null)
                return false;
        }
        else if (!kgTs.equals(other.kgTs))
            return false;
        if (fat == null) {
            if (other.fat != null)
                return false;
        }
        else if (!fat.equals(other.fat))
            return false;
        if (snf == null) {
            if (other.snf != null)
                return false;
        }
        else if (!snf.equals(other.snf))
            return false;
        if (ts == null) {
            if (other.ts != null)
                return false;
        }
        else if (!ts.equals(other.ts))
            return false;
        if (amt == null) {
            if (other.amt != null)
                return false;
        }
        else if (!amt.equals(other.amt))
            return false;
        if (dmbtr2 == null) {
            if (other.dmbtr2 != null)
                return false;
        }
        else if (!dmbtr2.equals(other.dmbtr2))
            return false;
        if (amt1 == null) {
            if (other.amt1 != null)
                return false;
        }
        else if (!amt1.equals(other.amt1))
            return false;
        if (totamt == null) {
            if (other.totamt != null)
                return false;
        }
        else if (!totamt.equals(other.totamt))
            return false;
        if (amt2 == null) {
            if (other.amt2 != null)
                return false;
        }
        else if (!amt2.equals(other.amt2))
            return false;
        if (netamt == null) {
            if (other.netamt != null)
                return false;
        }
        else if (!netamt.equals(other.netamt))
            return false;
        if (sapDate == null) {
            if (other.sapDate != null)
                return false;
        }
        else if (!sapDate.equals(other.sapDate))
            return false;
        if (societyDesc == null) {
            if (other.societyDesc != null)
                return false;
        }
        else if (!societyDesc.equals(other.societyDesc))
            return false;
        if (j_1kftbus == null) {
            if (other.j_1kftbus != null)
                return false;
        }
        else if (!j_1kftbus.equals(other.j_1kftbus))
            return false;
        if (noOfFarmers == null) {
            if (other.noOfFarmers != null)
                return false;
        }
        else if (!noOfFarmers.equals(other.noOfFarmers))
            return false;
        if (recDays == null) {
            if (other.recDays != null)
                return false;
        }
        else if (!recDays.equals(other.recDays))
            return false;
        if (recMilk == null) {
            if (other.recMilk != null)
                return false;
        }
        else if (!recMilk.equals(other.recMilk))
            return false;
        if (centDays == null) {
            if (other.centDays != null)
                return false;
        }
        else if (!centDays.equals(other.centDays))
            return false;
        if (centMilk == null) {
            if (other.centMilk != null)
                return false;
        }
        else if (!centMilk.equals(other.centMilk))
            return false;
        if (diffQtyLtr == null) {
            if (other.diffQtyLtr != null)
                return false;
        }
        else if (!diffQtyLtr.equals(other.diffQtyLtr))
            return false;
        if (hmbType == null) {
            if (other.hmbType != null)
                return false;
        }
        else if (!hmbType.equals(other.hmbType))
            return false;
        if (hmbMdate == null) {
            if (other.hmbMdate != null)
                return false;
        }
        else if (!hmbMdate.equals(other.hmbMdate))
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
        result = prime * result + ((this.werks == null) ? 0 : this.werks.hashCode());
        result = prime * result + ((this.society == null) ? 0 : this.society.hashCode());
        result = prime * result + ((this.fromDate == null) ? 0 : this.fromDate.hashCode());
        result = prime * result + ((this.toDate == null) ? 0 : this.toDate.hashCode());
        result = prime * result + ((this.name1 == null) ? 0 : this.name1.hashCode());
        result = prime * result + ((this.erfmgLtr == null) ? 0 : this.erfmgLtr.hashCode());
        result = prime * result + ((this.erfmg == null) ? 0 : this.erfmg.hashCode());
        result = prime * result + ((this.kgfat == null) ? 0 : this.kgfat.hashCode());
        result = prime * result + ((this.kgsnf == null) ? 0 : this.kgsnf.hashCode());
        result = prime * result + ((this.kgts == null) ? 0 : this.kgts.hashCode());
        result = prime * result + ((this.fatN == null) ? 0 : this.fatN.hashCode());
        result = prime * result + ((this.snfN == null) ? 0 : this.snfN.hashCode());
        result = prime * result + ((this.tsN == null) ? 0 : this.tsN.hashCode());
        result = prime * result + ((this.quantity == null) ? 0 : this.quantity.hashCode());
        result = prime * result + ((this.quantityKg == null) ? 0 : this.quantityKg.hashCode());
        result = prime * result + ((this.kgFat == null) ? 0 : this.kgFat.hashCode());
        result = prime * result + ((this.kgSnf == null) ? 0 : this.kgSnf.hashCode());
        result = prime * result + ((this.kgTs == null) ? 0 : this.kgTs.hashCode());
        result = prime * result + ((this.fat == null) ? 0 : this.fat.hashCode());
        result = prime * result + ((this.snf == null) ? 0 : this.snf.hashCode());
        result = prime * result + ((this.ts == null) ? 0 : this.ts.hashCode());
        result = prime * result + ((this.amt == null) ? 0 : this.amt.hashCode());
        result = prime * result + ((this.dmbtr2 == null) ? 0 : this.dmbtr2.hashCode());
        result = prime * result + ((this.amt1 == null) ? 0 : this.amt1.hashCode());
        result = prime * result + ((this.totamt == null) ? 0 : this.totamt.hashCode());
        result = prime * result + ((this.amt2 == null) ? 0 : this.amt2.hashCode());
        result = prime * result + ((this.netamt == null) ? 0 : this.netamt.hashCode());
        result = prime * result + ((this.sapDate == null) ? 0 : this.sapDate.hashCode());
        result = prime * result + ((this.societyDesc == null) ? 0 : this.societyDesc.hashCode());
        result = prime * result + ((this.j_1kftbus == null) ? 0 : this.j_1kftbus.hashCode());
        result = prime * result + ((this.noOfFarmers == null) ? 0 : this.noOfFarmers.hashCode());
        result = prime * result + ((this.recDays == null) ? 0 : this.recDays.hashCode());
        result = prime * result + ((this.recMilk == null) ? 0 : this.recMilk.hashCode());
        result = prime * result + ((this.centDays == null) ? 0 : this.centDays.hashCode());
        result = prime * result + ((this.centMilk == null) ? 0 : this.centMilk.hashCode());
        result = prime * result + ((this.diffQtyLtr == null) ? 0 : this.diffQtyLtr.hashCode());
        result = prime * result + ((this.hmbType == null) ? 0 : this.hmbType.hashCode());
        result = prime * result + ((this.hmbMdate == null) ? 0 : this.hmbMdate.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MilkLiability (");

        sb.append(werks);
        sb.append(", ").append(society);
        sb.append(", ").append(fromDate);
        sb.append(", ").append(toDate);
        sb.append(", ").append(name1);
        sb.append(", ").append(erfmgLtr);
        sb.append(", ").append(erfmg);
        sb.append(", ").append(kgfat);
        sb.append(", ").append(kgsnf);
        sb.append(", ").append(kgts);
        sb.append(", ").append(fatN);
        sb.append(", ").append(snfN);
        sb.append(", ").append(tsN);
        sb.append(", ").append(quantity);
        sb.append(", ").append(quantityKg);
        sb.append(", ").append(kgFat);
        sb.append(", ").append(kgSnf);
        sb.append(", ").append(kgTs);
        sb.append(", ").append(fat);
        sb.append(", ").append(snf);
        sb.append(", ").append(ts);
        sb.append(", ").append(amt);
        sb.append(", ").append(dmbtr2);
        sb.append(", ").append(amt1);
        sb.append(", ").append(totamt);
        sb.append(", ").append(amt2);
        sb.append(", ").append(netamt);
        sb.append(", ").append(sapDate);
        sb.append(", ").append(societyDesc);
        sb.append(", ").append(j_1kftbus);
        sb.append(", ").append(noOfFarmers);
        sb.append(", ").append(recDays);
        sb.append(", ").append(recMilk);
        sb.append(", ").append(centDays);
        sb.append(", ").append(centMilk);
        sb.append(", ").append(diffQtyLtr);
        sb.append(", ").append(hmbType);
        sb.append(", ").append(hmbMdate);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
