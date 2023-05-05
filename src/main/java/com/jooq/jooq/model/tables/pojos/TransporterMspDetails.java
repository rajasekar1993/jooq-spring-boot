/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransporterMspDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    private String vendorCode;
    private String plantCode;
    private String plantName;
    private String logisticTlName;
    private String logisticTlMobile;
    private String logisticTlEmail;

    public TransporterMspDetails() {}

    public TransporterMspDetails(TransporterMspDetails value) {
        this.vendorCode = value.vendorCode;
        this.plantCode = value.plantCode;
        this.plantName = value.plantName;
        this.logisticTlName = value.logisticTlName;
        this.logisticTlMobile = value.logisticTlMobile;
        this.logisticTlEmail = value.logisticTlEmail;
    }

    public TransporterMspDetails(
        String vendorCode,
        String plantCode,
        String plantName,
        String logisticTlName,
        String logisticTlMobile,
        String logisticTlEmail
    ) {
        this.vendorCode = vendorCode;
        this.plantCode = plantCode;
        this.plantName = plantName;
        this.logisticTlName = logisticTlName;
        this.logisticTlMobile = logisticTlMobile;
        this.logisticTlEmail = logisticTlEmail;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_msp_details.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return this.vendorCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_msp_details.VENDOR_CODE</code>.
     */
    public TransporterMspDetails setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_msp_details.PLANT_CODE</code>.
     */
    public String getPlantCode() {
        return this.plantCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_msp_details.PLANT_CODE</code>.
     */
    public TransporterMspDetails setPlantCode(String plantCode) {
        this.plantCode = plantCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_msp_details.PLANT_NAME</code>.
     */
    public String getPlantName() {
        return this.plantName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_msp_details.PLANT_NAME</code>.
     */
    public TransporterMspDetails setPlantName(String plantName) {
        this.plantName = plantName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_msp_details.LOGISTIC_TL_NAME</code>.
     */
    public String getLogisticTlName() {
        return this.logisticTlName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_msp_details.LOGISTIC_TL_NAME</code>.
     */
    public TransporterMspDetails setLogisticTlName(String logisticTlName) {
        this.logisticTlName = logisticTlName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_msp_details.LOGISTIC_TL_MOBILE</code>.
     */
    public String getLogisticTlMobile() {
        return this.logisticTlMobile;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_msp_details.LOGISTIC_TL_MOBILE</code>.
     */
    public TransporterMspDetails setLogisticTlMobile(String logisticTlMobile) {
        this.logisticTlMobile = logisticTlMobile;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_msp_details.LOGISTIC_TL_EMAIL</code>.
     */
    public String getLogisticTlEmail() {
        return this.logisticTlEmail;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_msp_details.LOGISTIC_TL_EMAIL</code>.
     */
    public TransporterMspDetails setLogisticTlEmail(String logisticTlEmail) {
        this.logisticTlEmail = logisticTlEmail;
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
        final TransporterMspDetails other = (TransporterMspDetails) obj;
        if (vendorCode == null) {
            if (other.vendorCode != null)
                return false;
        }
        else if (!vendorCode.equals(other.vendorCode))
            return false;
        if (plantCode == null) {
            if (other.plantCode != null)
                return false;
        }
        else if (!plantCode.equals(other.plantCode))
            return false;
        if (plantName == null) {
            if (other.plantName != null)
                return false;
        }
        else if (!plantName.equals(other.plantName))
            return false;
        if (logisticTlName == null) {
            if (other.logisticTlName != null)
                return false;
        }
        else if (!logisticTlName.equals(other.logisticTlName))
            return false;
        if (logisticTlMobile == null) {
            if (other.logisticTlMobile != null)
                return false;
        }
        else if (!logisticTlMobile.equals(other.logisticTlMobile))
            return false;
        if (logisticTlEmail == null) {
            if (other.logisticTlEmail != null)
                return false;
        }
        else if (!logisticTlEmail.equals(other.logisticTlEmail))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.vendorCode == null) ? 0 : this.vendorCode.hashCode());
        result = prime * result + ((this.plantCode == null) ? 0 : this.plantCode.hashCode());
        result = prime * result + ((this.plantName == null) ? 0 : this.plantName.hashCode());
        result = prime * result + ((this.logisticTlName == null) ? 0 : this.logisticTlName.hashCode());
        result = prime * result + ((this.logisticTlMobile == null) ? 0 : this.logisticTlMobile.hashCode());
        result = prime * result + ((this.logisticTlEmail == null) ? 0 : this.logisticTlEmail.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TransporterMspDetails (");

        sb.append(vendorCode);
        sb.append(", ").append(plantCode);
        sb.append(", ").append(plantName);
        sb.append(", ").append(logisticTlName);
        sb.append(", ").append(logisticTlMobile);
        sb.append(", ").append(logisticTlEmail);

        sb.append(")");
        return sb.toString();
    }
}
