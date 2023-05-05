/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SkuTargetUpload implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        customerCode;
    private LocalDate     fromDate;
    private LocalDate     toDate;
    private String        customerName;
    private String        state;
    private String        area;
    private String        headerJson;
    private String        dataJson;
    private String        status;
    private String        type_1;
    private String        type_2;
    private String        type_3;
    private String        type_4;
    private String        type_5;
    private String        type_6;
    private LocalDateTime createdOn;
    private String        createdBy;

    public SkuTargetUpload() {}

    public SkuTargetUpload(SkuTargetUpload value) {
        this.customerCode = value.customerCode;
        this.fromDate = value.fromDate;
        this.toDate = value.toDate;
        this.customerName = value.customerName;
        this.state = value.state;
        this.area = value.area;
        this.headerJson = value.headerJson;
        this.dataJson = value.dataJson;
        this.status = value.status;
        this.type_1 = value.type_1;
        this.type_2 = value.type_2;
        this.type_3 = value.type_3;
        this.type_4 = value.type_4;
        this.type_5 = value.type_5;
        this.type_6 = value.type_6;
        this.createdOn = value.createdOn;
        this.createdBy = value.createdBy;
    }

    public SkuTargetUpload(
        String        customerCode,
        LocalDate     fromDate,
        LocalDate     toDate,
        String        customerName,
        String        state,
        String        area,
        String        headerJson,
        String        dataJson,
        String        status,
        String        type_1,
        String        type_2,
        String        type_3,
        String        type_4,
        String        type_5,
        String        type_6,
        LocalDateTime createdOn,
        String        createdBy
    ) {
        this.customerCode = customerCode;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.customerName = customerName;
        this.state = state;
        this.area = area;
        this.headerJson = headerJson;
        this.dataJson = dataJson;
        this.status = status;
        this.type_1 = type_1;
        this.type_2 = type_2;
        this.type_3 = type_3;
        this.type_4 = type_4;
        this.type_5 = type_5;
        this.type_6 = type_6;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.CUSTOMER_CODE</code>.
     */
    public SkuTargetUpload setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.FROM_DATE</code>.
     */
    public LocalDate getFromDate() {
        return this.fromDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.FROM_DATE</code>.
     */
    public SkuTargetUpload setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.TO_DATE</code>.
     */
    public LocalDate getToDate() {
        return this.toDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.TO_DATE</code>.
     */
    public SkuTargetUpload setToDate(LocalDate toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.CUSTOMER_NAME</code>.
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.CUSTOMER_NAME</code>.
     */
    public SkuTargetUpload setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.STATE</code>.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.STATE</code>.
     */
    public SkuTargetUpload setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.AREA</code>.
     */
    public String getArea() {
        return this.area;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.AREA</code>.
     */
    public SkuTargetUpload setArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.HEADER_JSON</code>.
     */
    public String getHeaderJson() {
        return this.headerJson;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.HEADER_JSON</code>.
     */
    public SkuTargetUpload setHeaderJson(String headerJson) {
        this.headerJson = headerJson;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.DATA_JSON</code>.
     */
    public String getDataJson() {
        return this.dataJson;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.DATA_JSON</code>.
     */
    public SkuTargetUpload setDataJson(String dataJson) {
        this.dataJson = dataJson;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.STATUS</code>.
     */
    public SkuTargetUpload setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.TYPE_1</code>.
     */
    public String getType_1() {
        return this.type_1;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.TYPE_1</code>.
     */
    public SkuTargetUpload setType_1(String type_1) {
        this.type_1 = type_1;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.TYPE_2</code>.
     */
    public String getType_2() {
        return this.type_2;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.TYPE_2</code>.
     */
    public SkuTargetUpload setType_2(String type_2) {
        this.type_2 = type_2;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.TYPE_3</code>.
     */
    public String getType_3() {
        return this.type_3;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.TYPE_3</code>.
     */
    public SkuTargetUpload setType_3(String type_3) {
        this.type_3 = type_3;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.TYPE_4</code>.
     */
    public String getType_4() {
        return this.type_4;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.TYPE_4</code>.
     */
    public SkuTargetUpload setType_4(String type_4) {
        this.type_4 = type_4;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.TYPE_5</code>.
     */
    public String getType_5() {
        return this.type_5;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.TYPE_5</code>.
     */
    public SkuTargetUpload setType_5(String type_5) {
        this.type_5 = type_5;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.TYPE_6</code>.
     */
    public String getType_6() {
        return this.type_6;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.TYPE_6</code>.
     */
    public SkuTargetUpload setType_6(String type_6) {
        this.type_6 = type_6;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.CREATED_ON</code>.
     */
    public SkuTargetUpload setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.sku_target_upload.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.sku_target_upload.CREATED_BY</code>.
     */
    public SkuTargetUpload setCreatedBy(String createdBy) {
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
        final SkuTargetUpload other = (SkuTargetUpload) obj;
        if (customerCode == null) {
            if (other.customerCode != null)
                return false;
        }
        else if (!customerCode.equals(other.customerCode))
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
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        }
        else if (!customerName.equals(other.customerName))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        }
        else if (!state.equals(other.state))
            return false;
        if (area == null) {
            if (other.area != null)
                return false;
        }
        else if (!area.equals(other.area))
            return false;
        if (headerJson == null) {
            if (other.headerJson != null)
                return false;
        }
        else if (!headerJson.equals(other.headerJson))
            return false;
        if (dataJson == null) {
            if (other.dataJson != null)
                return false;
        }
        else if (!dataJson.equals(other.dataJson))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (type_1 == null) {
            if (other.type_1 != null)
                return false;
        }
        else if (!type_1.equals(other.type_1))
            return false;
        if (type_2 == null) {
            if (other.type_2 != null)
                return false;
        }
        else if (!type_2.equals(other.type_2))
            return false;
        if (type_3 == null) {
            if (other.type_3 != null)
                return false;
        }
        else if (!type_3.equals(other.type_3))
            return false;
        if (type_4 == null) {
            if (other.type_4 != null)
                return false;
        }
        else if (!type_4.equals(other.type_4))
            return false;
        if (type_5 == null) {
            if (other.type_5 != null)
                return false;
        }
        else if (!type_5.equals(other.type_5))
            return false;
        if (type_6 == null) {
            if (other.type_6 != null)
                return false;
        }
        else if (!type_6.equals(other.type_6))
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
        result = prime * result + ((this.customerCode == null) ? 0 : this.customerCode.hashCode());
        result = prime * result + ((this.fromDate == null) ? 0 : this.fromDate.hashCode());
        result = prime * result + ((this.toDate == null) ? 0 : this.toDate.hashCode());
        result = prime * result + ((this.customerName == null) ? 0 : this.customerName.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.area == null) ? 0 : this.area.hashCode());
        result = prime * result + ((this.headerJson == null) ? 0 : this.headerJson.hashCode());
        result = prime * result + ((this.dataJson == null) ? 0 : this.dataJson.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.type_1 == null) ? 0 : this.type_1.hashCode());
        result = prime * result + ((this.type_2 == null) ? 0 : this.type_2.hashCode());
        result = prime * result + ((this.type_3 == null) ? 0 : this.type_3.hashCode());
        result = prime * result + ((this.type_4 == null) ? 0 : this.type_4.hashCode());
        result = prime * result + ((this.type_5 == null) ? 0 : this.type_5.hashCode());
        result = prime * result + ((this.type_6 == null) ? 0 : this.type_6.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SkuTargetUpload (");

        sb.append(customerCode);
        sb.append(", ").append(fromDate);
        sb.append(", ").append(toDate);
        sb.append(", ").append(customerName);
        sb.append(", ").append(state);
        sb.append(", ").append(area);
        sb.append(", ").append(headerJson);
        sb.append(", ").append(dataJson);
        sb.append(", ").append(status);
        sb.append(", ").append(type_1);
        sb.append(", ").append(type_2);
        sb.append(", ").append(type_3);
        sb.append(", ").append(type_4);
        sb.append(", ").append(type_5);
        sb.append(", ").append(type_6);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(createdBy);

        sb.append(")");
        return sb.toString();
    }
}
