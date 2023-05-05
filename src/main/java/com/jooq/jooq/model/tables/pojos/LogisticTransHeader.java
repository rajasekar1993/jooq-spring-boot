/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogisticTransHeader implements Serializable {

    private static final long serialVersionUID = 1L;

    private String     compCode;
    private String     transporter;
    private String     plant;
    private String     route;
    private String     billNum;
    private LocalDate  billPrdStr;
    private LocalDate  billPrdEnd;
    private LocalDate  paidDat;
    private String     paidBy;
    private String     transporterDesc;
    private String     vehicle;
    private BigDecimal initAmt;
    private BigDecimal arrears;
    private BigDecimal recoveries;
    private BigDecimal grossAmt;
    private BigDecimal deduction;
    private BigDecimal actDed;
    private BigDecimal netAmt;

    public LogisticTransHeader() {}

    public LogisticTransHeader(LogisticTransHeader value) {
        this.compCode = value.compCode;
        this.transporter = value.transporter;
        this.plant = value.plant;
        this.route = value.route;
        this.billNum = value.billNum;
        this.billPrdStr = value.billPrdStr;
        this.billPrdEnd = value.billPrdEnd;
        this.paidDat = value.paidDat;
        this.paidBy = value.paidBy;
        this.transporterDesc = value.transporterDesc;
        this.vehicle = value.vehicle;
        this.initAmt = value.initAmt;
        this.arrears = value.arrears;
        this.recoveries = value.recoveries;
        this.grossAmt = value.grossAmt;
        this.deduction = value.deduction;
        this.actDed = value.actDed;
        this.netAmt = value.netAmt;
    }

    public LogisticTransHeader(
        String     compCode,
        String     transporter,
        String     plant,
        String     route,
        String     billNum,
        LocalDate  billPrdStr,
        LocalDate  billPrdEnd,
        LocalDate  paidDat,
        String     paidBy,
        String     transporterDesc,
        String     vehicle,
        BigDecimal initAmt,
        BigDecimal arrears,
        BigDecimal recoveries,
        BigDecimal grossAmt,
        BigDecimal deduction,
        BigDecimal actDed,
        BigDecimal netAmt
    ) {
        this.compCode = compCode;
        this.transporter = transporter;
        this.plant = plant;
        this.route = route;
        this.billNum = billNum;
        this.billPrdStr = billPrdStr;
        this.billPrdEnd = billPrdEnd;
        this.paidDat = paidDat;
        this.paidBy = paidBy;
        this.transporterDesc = transporterDesc;
        this.vehicle = vehicle;
        this.initAmt = initAmt;
        this.arrears = arrears;
        this.recoveries = recoveries;
        this.grossAmt = grossAmt;
        this.deduction = deduction;
        this.actDed = actDed;
        this.netAmt = netAmt;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.COMP_CODE</code>.
     */
    public LogisticTransHeader setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.TRANSPORTER</code>.
     */
    public String getTransporter() {
        return this.transporter;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.TRANSPORTER</code>.
     */
    public LogisticTransHeader setTransporter(String transporter) {
        this.transporter = transporter;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.PLANT</code>.
     */
    public String getPlant() {
        return this.plant;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.PLANT</code>.
     */
    public LogisticTransHeader setPlant(String plant) {
        this.plant = plant;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.ROUTE</code>.
     */
    public String getRoute() {
        return this.route;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.ROUTE</code>.
     */
    public LogisticTransHeader setRoute(String route) {
        this.route = route;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.BILL_NUM</code>.
     */
    public String getBillNum() {
        return this.billNum;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.BILL_NUM</code>.
     */
    public LogisticTransHeader setBillNum(String billNum) {
        this.billNum = billNum;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.BILL_PRD_STR</code>.
     */
    public LocalDate getBillPrdStr() {
        return this.billPrdStr;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.BILL_PRD_STR</code>.
     */
    public LogisticTransHeader setBillPrdStr(LocalDate billPrdStr) {
        this.billPrdStr = billPrdStr;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.BILL_PRD_END</code>.
     */
    public LocalDate getBillPrdEnd() {
        return this.billPrdEnd;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.BILL_PRD_END</code>.
     */
    public LogisticTransHeader setBillPrdEnd(LocalDate billPrdEnd) {
        this.billPrdEnd = billPrdEnd;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.PAID_DAT</code>.
     */
    public LocalDate getPaidDat() {
        return this.paidDat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.PAID_DAT</code>.
     */
    public LogisticTransHeader setPaidDat(LocalDate paidDat) {
        this.paidDat = paidDat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.PAID_BY</code>.
     */
    public String getPaidBy() {
        return this.paidBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.PAID_BY</code>.
     */
    public LogisticTransHeader setPaidBy(String paidBy) {
        this.paidBy = paidBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.TRANSPORTER_DESC</code>.
     */
    public String getTransporterDesc() {
        return this.transporterDesc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.TRANSPORTER_DESC</code>.
     */
    public LogisticTransHeader setTransporterDesc(String transporterDesc) {
        this.transporterDesc = transporterDesc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.VEHICLE</code>.
     */
    public String getVehicle() {
        return this.vehicle;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.VEHICLE</code>.
     */
    public LogisticTransHeader setVehicle(String vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.INIT_AMT</code>.
     */
    public BigDecimal getInitAmt() {
        return this.initAmt;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.INIT_AMT</code>.
     */
    public LogisticTransHeader setInitAmt(BigDecimal initAmt) {
        this.initAmt = initAmt;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.ARREARS</code>.
     */
    public BigDecimal getArrears() {
        return this.arrears;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.ARREARS</code>.
     */
    public LogisticTransHeader setArrears(BigDecimal arrears) {
        this.arrears = arrears;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.RECOVERIES</code>.
     */
    public BigDecimal getRecoveries() {
        return this.recoveries;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.RECOVERIES</code>.
     */
    public LogisticTransHeader setRecoveries(BigDecimal recoveries) {
        this.recoveries = recoveries;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.GROSS_AMT</code>.
     */
    public BigDecimal getGrossAmt() {
        return this.grossAmt;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.GROSS_AMT</code>.
     */
    public LogisticTransHeader setGrossAmt(BigDecimal grossAmt) {
        this.grossAmt = grossAmt;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.DEDUCTION</code>.
     */
    public BigDecimal getDeduction() {
        return this.deduction;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.DEDUCTION</code>.
     */
    public LogisticTransHeader setDeduction(BigDecimal deduction) {
        this.deduction = deduction;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.ACT_DED</code>.
     */
    public BigDecimal getActDed() {
        return this.actDed;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.ACT_DED</code>.
     */
    public LogisticTransHeader setActDed(BigDecimal actDed) {
        this.actDed = actDed;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_header.NET_AMT</code>.
     */
    public BigDecimal getNetAmt() {
        return this.netAmt;
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_header.NET_AMT</code>.
     */
    public LogisticTransHeader setNetAmt(BigDecimal netAmt) {
        this.netAmt = netAmt;
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
        final LogisticTransHeader other = (LogisticTransHeader) obj;
        if (compCode == null) {
            if (other.compCode != null)
                return false;
        }
        else if (!compCode.equals(other.compCode))
            return false;
        if (transporter == null) {
            if (other.transporter != null)
                return false;
        }
        else if (!transporter.equals(other.transporter))
            return false;
        if (plant == null) {
            if (other.plant != null)
                return false;
        }
        else if (!plant.equals(other.plant))
            return false;
        if (route == null) {
            if (other.route != null)
                return false;
        }
        else if (!route.equals(other.route))
            return false;
        if (billNum == null) {
            if (other.billNum != null)
                return false;
        }
        else if (!billNum.equals(other.billNum))
            return false;
        if (billPrdStr == null) {
            if (other.billPrdStr != null)
                return false;
        }
        else if (!billPrdStr.equals(other.billPrdStr))
            return false;
        if (billPrdEnd == null) {
            if (other.billPrdEnd != null)
                return false;
        }
        else if (!billPrdEnd.equals(other.billPrdEnd))
            return false;
        if (paidDat == null) {
            if (other.paidDat != null)
                return false;
        }
        else if (!paidDat.equals(other.paidDat))
            return false;
        if (paidBy == null) {
            if (other.paidBy != null)
                return false;
        }
        else if (!paidBy.equals(other.paidBy))
            return false;
        if (transporterDesc == null) {
            if (other.transporterDesc != null)
                return false;
        }
        else if (!transporterDesc.equals(other.transporterDesc))
            return false;
        if (vehicle == null) {
            if (other.vehicle != null)
                return false;
        }
        else if (!vehicle.equals(other.vehicle))
            return false;
        if (initAmt == null) {
            if (other.initAmt != null)
                return false;
        }
        else if (!initAmt.equals(other.initAmt))
            return false;
        if (arrears == null) {
            if (other.arrears != null)
                return false;
        }
        else if (!arrears.equals(other.arrears))
            return false;
        if (recoveries == null) {
            if (other.recoveries != null)
                return false;
        }
        else if (!recoveries.equals(other.recoveries))
            return false;
        if (grossAmt == null) {
            if (other.grossAmt != null)
                return false;
        }
        else if (!grossAmt.equals(other.grossAmt))
            return false;
        if (deduction == null) {
            if (other.deduction != null)
                return false;
        }
        else if (!deduction.equals(other.deduction))
            return false;
        if (actDed == null) {
            if (other.actDed != null)
                return false;
        }
        else if (!actDed.equals(other.actDed))
            return false;
        if (netAmt == null) {
            if (other.netAmt != null)
                return false;
        }
        else if (!netAmt.equals(other.netAmt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.transporter == null) ? 0 : this.transporter.hashCode());
        result = prime * result + ((this.plant == null) ? 0 : this.plant.hashCode());
        result = prime * result + ((this.route == null) ? 0 : this.route.hashCode());
        result = prime * result + ((this.billNum == null) ? 0 : this.billNum.hashCode());
        result = prime * result + ((this.billPrdStr == null) ? 0 : this.billPrdStr.hashCode());
        result = prime * result + ((this.billPrdEnd == null) ? 0 : this.billPrdEnd.hashCode());
        result = prime * result + ((this.paidDat == null) ? 0 : this.paidDat.hashCode());
        result = prime * result + ((this.paidBy == null) ? 0 : this.paidBy.hashCode());
        result = prime * result + ((this.transporterDesc == null) ? 0 : this.transporterDesc.hashCode());
        result = prime * result + ((this.vehicle == null) ? 0 : this.vehicle.hashCode());
        result = prime * result + ((this.initAmt == null) ? 0 : this.initAmt.hashCode());
        result = prime * result + ((this.arrears == null) ? 0 : this.arrears.hashCode());
        result = prime * result + ((this.recoveries == null) ? 0 : this.recoveries.hashCode());
        result = prime * result + ((this.grossAmt == null) ? 0 : this.grossAmt.hashCode());
        result = prime * result + ((this.deduction == null) ? 0 : this.deduction.hashCode());
        result = prime * result + ((this.actDed == null) ? 0 : this.actDed.hashCode());
        result = prime * result + ((this.netAmt == null) ? 0 : this.netAmt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LogisticTransHeader (");

        sb.append(compCode);
        sb.append(", ").append(transporter);
        sb.append(", ").append(plant);
        sb.append(", ").append(route);
        sb.append(", ").append(billNum);
        sb.append(", ").append(billPrdStr);
        sb.append(", ").append(billPrdEnd);
        sb.append(", ").append(paidDat);
        sb.append(", ").append(paidBy);
        sb.append(", ").append(transporterDesc);
        sb.append(", ").append(vehicle);
        sb.append(", ").append(initAmt);
        sb.append(", ").append(arrears);
        sb.append(", ").append(recoveries);
        sb.append(", ").append(grossAmt);
        sb.append(", ").append(deduction);
        sb.append(", ").append(actDed);
        sb.append(", ").append(netAmt);

        sb.append(")");
        return sb.toString();
    }
}
