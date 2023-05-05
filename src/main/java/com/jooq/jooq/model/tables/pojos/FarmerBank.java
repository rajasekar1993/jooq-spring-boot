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
public class FarmerBank implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        plantCode;
    private String        hmbCode;
    private String        pid;
    private String        vendorCode;
    private String        hmbName;
    private String        plantName;
    private String        farmerName;
    private String        mobileNo;
    private String        accountNo;
    private String        bank;
    private String        branch;
    private String        ifsc;
    private String        address;
    private String        village;
    private String        state;
    private String        district;
    private String        taluk;
    private String        pinCode;
    private String        doorNo;
    private String        street;
    private String        netWork;
    private String        mobileType;
    private String        aadharNo;
    private String        familyNo;
    private String        voterNo;
    private String        bankFrontPageUrl;
    private String        bankBackPageUrl;
    private String        aadharFrontPageUrl;
    private String        aadharBackPageUrl;
    private String        familyFrontPageUrl;
    private String        familyBackPageUrl;
    private String        voterFrontPageUrl;
    private String        voterBackPageUrl;
    private LocalDateTime createdDate;

    public FarmerBank() {}

    public FarmerBank(FarmerBank value) {
        this.plantCode = value.plantCode;
        this.hmbCode = value.hmbCode;
        this.pid = value.pid;
        this.vendorCode = value.vendorCode;
        this.hmbName = value.hmbName;
        this.plantName = value.plantName;
        this.farmerName = value.farmerName;
        this.mobileNo = value.mobileNo;
        this.accountNo = value.accountNo;
        this.bank = value.bank;
        this.branch = value.branch;
        this.ifsc = value.ifsc;
        this.address = value.address;
        this.village = value.village;
        this.state = value.state;
        this.district = value.district;
        this.taluk = value.taluk;
        this.pinCode = value.pinCode;
        this.doorNo = value.doorNo;
        this.street = value.street;
        this.netWork = value.netWork;
        this.mobileType = value.mobileType;
        this.aadharNo = value.aadharNo;
        this.familyNo = value.familyNo;
        this.voterNo = value.voterNo;
        this.bankFrontPageUrl = value.bankFrontPageUrl;
        this.bankBackPageUrl = value.bankBackPageUrl;
        this.aadharFrontPageUrl = value.aadharFrontPageUrl;
        this.aadharBackPageUrl = value.aadharBackPageUrl;
        this.familyFrontPageUrl = value.familyFrontPageUrl;
        this.familyBackPageUrl = value.familyBackPageUrl;
        this.voterFrontPageUrl = value.voterFrontPageUrl;
        this.voterBackPageUrl = value.voterBackPageUrl;
        this.createdDate = value.createdDate;
    }

    public FarmerBank(
        String        plantCode,
        String        hmbCode,
        String        pid,
        String        vendorCode,
        String        hmbName,
        String        plantName,
        String        farmerName,
        String        mobileNo,
        String        accountNo,
        String        bank,
        String        branch,
        String        ifsc,
        String        address,
        String        village,
        String        state,
        String        district,
        String        taluk,
        String        pinCode,
        String        doorNo,
        String        street,
        String        netWork,
        String        mobileType,
        String        aadharNo,
        String        familyNo,
        String        voterNo,
        String        bankFrontPageUrl,
        String        bankBackPageUrl,
        String        aadharFrontPageUrl,
        String        aadharBackPageUrl,
        String        familyFrontPageUrl,
        String        familyBackPageUrl,
        String        voterFrontPageUrl,
        String        voterBackPageUrl,
        LocalDateTime createdDate
    ) {
        this.plantCode = plantCode;
        this.hmbCode = hmbCode;
        this.pid = pid;
        this.vendorCode = vendorCode;
        this.hmbName = hmbName;
        this.plantName = plantName;
        this.farmerName = farmerName;
        this.mobileNo = mobileNo;
        this.accountNo = accountNo;
        this.bank = bank;
        this.branch = branch;
        this.ifsc = ifsc;
        this.address = address;
        this.village = village;
        this.state = state;
        this.district = district;
        this.taluk = taluk;
        this.pinCode = pinCode;
        this.doorNo = doorNo;
        this.street = street;
        this.netWork = netWork;
        this.mobileType = mobileType;
        this.aadharNo = aadharNo;
        this.familyNo = familyNo;
        this.voterNo = voterNo;
        this.bankFrontPageUrl = bankFrontPageUrl;
        this.bankBackPageUrl = bankBackPageUrl;
        this.aadharFrontPageUrl = aadharFrontPageUrl;
        this.aadharBackPageUrl = aadharBackPageUrl;
        this.familyFrontPageUrl = familyFrontPageUrl;
        this.familyBackPageUrl = familyBackPageUrl;
        this.voterFrontPageUrl = voterFrontPageUrl;
        this.voterBackPageUrl = voterBackPageUrl;
        this.createdDate = createdDate;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.PLANT_CODE</code>.
     */
    public String getPlantCode() {
        return this.plantCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.PLANT_CODE</code>.
     */
    public FarmerBank setPlantCode(String plantCode) {
        this.plantCode = plantCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.HMB_CODE</code>.
     */
    public String getHmbCode() {
        return this.hmbCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.HMB_CODE</code>.
     */
    public FarmerBank setHmbCode(String hmbCode) {
        this.hmbCode = hmbCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.PID</code>.
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.PID</code>.
     */
    public FarmerBank setPid(String pid) {
        this.pid = pid;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return this.vendorCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.VENDOR_CODE</code>.
     */
    public FarmerBank setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.HMB_NAME</code>.
     */
    public String getHmbName() {
        return this.hmbName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.HMB_NAME</code>.
     */
    public FarmerBank setHmbName(String hmbName) {
        this.hmbName = hmbName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.PLANT_NAME</code>.
     */
    public String getPlantName() {
        return this.plantName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.PLANT_NAME</code>.
     */
    public FarmerBank setPlantName(String plantName) {
        this.plantName = plantName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.FARMER_NAME</code>.
     */
    public String getFarmerName() {
        return this.farmerName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.FARMER_NAME</code>.
     */
    public FarmerBank setFarmerName(String farmerName) {
        this.farmerName = farmerName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.MOBILE_NO</code>.
     */
    public String getMobileNo() {
        return this.mobileNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.MOBILE_NO</code>.
     */
    public FarmerBank setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.ACCOUNT_NO</code>.
     */
    public String getAccountNo() {
        return this.accountNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.ACCOUNT_NO</code>.
     */
    public FarmerBank setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.BANK</code>.
     */
    public String getBank() {
        return this.bank;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.BANK</code>.
     */
    public FarmerBank setBank(String bank) {
        this.bank = bank;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.BRANCH</code>.
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.BRANCH</code>.
     */
    public FarmerBank setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.IFSC</code>.
     */
    public String getIfsc() {
        return this.ifsc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.IFSC</code>.
     */
    public FarmerBank setIfsc(String ifsc) {
        this.ifsc = ifsc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.ADDRESS</code>.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.ADDRESS</code>.
     */
    public FarmerBank setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.VILLAGE</code>.
     */
    public String getVillage() {
        return this.village;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.VILLAGE</code>.
     */
    public FarmerBank setVillage(String village) {
        this.village = village;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.STATE</code>.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.STATE</code>.
     */
    public FarmerBank setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.DISTRICT</code>.
     */
    public String getDistrict() {
        return this.district;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.DISTRICT</code>.
     */
    public FarmerBank setDistrict(String district) {
        this.district = district;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.TALUK</code>.
     */
    public String getTaluk() {
        return this.taluk;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.TALUK</code>.
     */
    public FarmerBank setTaluk(String taluk) {
        this.taluk = taluk;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.PIN_CODE</code>.
     */
    public String getPinCode() {
        return this.pinCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.PIN_CODE</code>.
     */
    public FarmerBank setPinCode(String pinCode) {
        this.pinCode = pinCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.DOOR_NO</code>.
     */
    public String getDoorNo() {
        return this.doorNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.DOOR_NO</code>.
     */
    public FarmerBank setDoorNo(String doorNo) {
        this.doorNo = doorNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.STREET</code>.
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.STREET</code>.
     */
    public FarmerBank setStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.NET_WORK</code>.
     */
    public String getNetWork() {
        return this.netWork;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.NET_WORK</code>.
     */
    public FarmerBank setNetWork(String netWork) {
        this.netWork = netWork;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.MOBILE_TYPE</code>.
     */
    public String getMobileType() {
        return this.mobileType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.MOBILE_TYPE</code>.
     */
    public FarmerBank setMobileType(String mobileType) {
        this.mobileType = mobileType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.AADHAR_NO</code>.
     */
    public String getAadharNo() {
        return this.aadharNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.AADHAR_NO</code>.
     */
    public FarmerBank setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.FAMILY_NO</code>.
     */
    public String getFamilyNo() {
        return this.familyNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.FAMILY_NO</code>.
     */
    public FarmerBank setFamilyNo(String familyNo) {
        this.familyNo = familyNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.VOTER_NO</code>.
     */
    public String getVoterNo() {
        return this.voterNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.VOTER_NO</code>.
     */
    public FarmerBank setVoterNo(String voterNo) {
        this.voterNo = voterNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.BANK_FRONT_PAGE_URL</code>.
     */
    public String getBankFrontPageUrl() {
        return this.bankFrontPageUrl;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.BANK_FRONT_PAGE_URL</code>.
     */
    public FarmerBank setBankFrontPageUrl(String bankFrontPageUrl) {
        this.bankFrontPageUrl = bankFrontPageUrl;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.BANK_BACK_PAGE_URL</code>.
     */
    public String getBankBackPageUrl() {
        return this.bankBackPageUrl;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.BANK_BACK_PAGE_URL</code>.
     */
    public FarmerBank setBankBackPageUrl(String bankBackPageUrl) {
        this.bankBackPageUrl = bankBackPageUrl;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.AADHAR_FRONT_PAGE_URL</code>.
     */
    public String getAadharFrontPageUrl() {
        return this.aadharFrontPageUrl;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.AADHAR_FRONT_PAGE_URL</code>.
     */
    public FarmerBank setAadharFrontPageUrl(String aadharFrontPageUrl) {
        this.aadharFrontPageUrl = aadharFrontPageUrl;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.AADHAR_BACK_PAGE_URL</code>.
     */
    public String getAadharBackPageUrl() {
        return this.aadharBackPageUrl;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.AADHAR_BACK_PAGE_URL</code>.
     */
    public FarmerBank setAadharBackPageUrl(String aadharBackPageUrl) {
        this.aadharBackPageUrl = aadharBackPageUrl;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.FAMILY_FRONT_PAGE_URL</code>.
     */
    public String getFamilyFrontPageUrl() {
        return this.familyFrontPageUrl;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.FAMILY_FRONT_PAGE_URL</code>.
     */
    public FarmerBank setFamilyFrontPageUrl(String familyFrontPageUrl) {
        this.familyFrontPageUrl = familyFrontPageUrl;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.FAMILY_BACK_PAGE_URL</code>.
     */
    public String getFamilyBackPageUrl() {
        return this.familyBackPageUrl;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.FAMILY_BACK_PAGE_URL</code>.
     */
    public FarmerBank setFamilyBackPageUrl(String familyBackPageUrl) {
        this.familyBackPageUrl = familyBackPageUrl;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.VOTER_FRONT_PAGE_URL</code>.
     */
    public String getVoterFrontPageUrl() {
        return this.voterFrontPageUrl;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.VOTER_FRONT_PAGE_URL</code>.
     */
    public FarmerBank setVoterFrontPageUrl(String voterFrontPageUrl) {
        this.voterFrontPageUrl = voterFrontPageUrl;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.VOTER_BACK_PAGE_URL</code>.
     */
    public String getVoterBackPageUrl() {
        return this.voterBackPageUrl;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.VOTER_BACK_PAGE_URL</code>.
     */
    public FarmerBank setVoterBackPageUrl(String voterBackPageUrl) {
        this.voterBackPageUrl = voterBackPageUrl;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_bank.CREATED_DATE</code>.
     */
    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_bank.CREATED_DATE</code>.
     */
    public FarmerBank setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
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
        final FarmerBank other = (FarmerBank) obj;
        if (plantCode == null) {
            if (other.plantCode != null)
                return false;
        }
        else if (!plantCode.equals(other.plantCode))
            return false;
        if (hmbCode == null) {
            if (other.hmbCode != null)
                return false;
        }
        else if (!hmbCode.equals(other.hmbCode))
            return false;
        if (pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!pid.equals(other.pid))
            return false;
        if (vendorCode == null) {
            if (other.vendorCode != null)
                return false;
        }
        else if (!vendorCode.equals(other.vendorCode))
            return false;
        if (hmbName == null) {
            if (other.hmbName != null)
                return false;
        }
        else if (!hmbName.equals(other.hmbName))
            return false;
        if (plantName == null) {
            if (other.plantName != null)
                return false;
        }
        else if (!plantName.equals(other.plantName))
            return false;
        if (farmerName == null) {
            if (other.farmerName != null)
                return false;
        }
        else if (!farmerName.equals(other.farmerName))
            return false;
        if (mobileNo == null) {
            if (other.mobileNo != null)
                return false;
        }
        else if (!mobileNo.equals(other.mobileNo))
            return false;
        if (accountNo == null) {
            if (other.accountNo != null)
                return false;
        }
        else if (!accountNo.equals(other.accountNo))
            return false;
        if (bank == null) {
            if (other.bank != null)
                return false;
        }
        else if (!bank.equals(other.bank))
            return false;
        if (branch == null) {
            if (other.branch != null)
                return false;
        }
        else if (!branch.equals(other.branch))
            return false;
        if (ifsc == null) {
            if (other.ifsc != null)
                return false;
        }
        else if (!ifsc.equals(other.ifsc))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        }
        else if (!address.equals(other.address))
            return false;
        if (village == null) {
            if (other.village != null)
                return false;
        }
        else if (!village.equals(other.village))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        }
        else if (!state.equals(other.state))
            return false;
        if (district == null) {
            if (other.district != null)
                return false;
        }
        else if (!district.equals(other.district))
            return false;
        if (taluk == null) {
            if (other.taluk != null)
                return false;
        }
        else if (!taluk.equals(other.taluk))
            return false;
        if (pinCode == null) {
            if (other.pinCode != null)
                return false;
        }
        else if (!pinCode.equals(other.pinCode))
            return false;
        if (doorNo == null) {
            if (other.doorNo != null)
                return false;
        }
        else if (!doorNo.equals(other.doorNo))
            return false;
        if (street == null) {
            if (other.street != null)
                return false;
        }
        else if (!street.equals(other.street))
            return false;
        if (netWork == null) {
            if (other.netWork != null)
                return false;
        }
        else if (!netWork.equals(other.netWork))
            return false;
        if (mobileType == null) {
            if (other.mobileType != null)
                return false;
        }
        else if (!mobileType.equals(other.mobileType))
            return false;
        if (aadharNo == null) {
            if (other.aadharNo != null)
                return false;
        }
        else if (!aadharNo.equals(other.aadharNo))
            return false;
        if (familyNo == null) {
            if (other.familyNo != null)
                return false;
        }
        else if (!familyNo.equals(other.familyNo))
            return false;
        if (voterNo == null) {
            if (other.voterNo != null)
                return false;
        }
        else if (!voterNo.equals(other.voterNo))
            return false;
        if (bankFrontPageUrl == null) {
            if (other.bankFrontPageUrl != null)
                return false;
        }
        else if (!bankFrontPageUrl.equals(other.bankFrontPageUrl))
            return false;
        if (bankBackPageUrl == null) {
            if (other.bankBackPageUrl != null)
                return false;
        }
        else if (!bankBackPageUrl.equals(other.bankBackPageUrl))
            return false;
        if (aadharFrontPageUrl == null) {
            if (other.aadharFrontPageUrl != null)
                return false;
        }
        else if (!aadharFrontPageUrl.equals(other.aadharFrontPageUrl))
            return false;
        if (aadharBackPageUrl == null) {
            if (other.aadharBackPageUrl != null)
                return false;
        }
        else if (!aadharBackPageUrl.equals(other.aadharBackPageUrl))
            return false;
        if (familyFrontPageUrl == null) {
            if (other.familyFrontPageUrl != null)
                return false;
        }
        else if (!familyFrontPageUrl.equals(other.familyFrontPageUrl))
            return false;
        if (familyBackPageUrl == null) {
            if (other.familyBackPageUrl != null)
                return false;
        }
        else if (!familyBackPageUrl.equals(other.familyBackPageUrl))
            return false;
        if (voterFrontPageUrl == null) {
            if (other.voterFrontPageUrl != null)
                return false;
        }
        else if (!voterFrontPageUrl.equals(other.voterFrontPageUrl))
            return false;
        if (voterBackPageUrl == null) {
            if (other.voterBackPageUrl != null)
                return false;
        }
        else if (!voterBackPageUrl.equals(other.voterBackPageUrl))
            return false;
        if (createdDate == null) {
            if (other.createdDate != null)
                return false;
        }
        else if (!createdDate.equals(other.createdDate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.plantCode == null) ? 0 : this.plantCode.hashCode());
        result = prime * result + ((this.hmbCode == null) ? 0 : this.hmbCode.hashCode());
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.vendorCode == null) ? 0 : this.vendorCode.hashCode());
        result = prime * result + ((this.hmbName == null) ? 0 : this.hmbName.hashCode());
        result = prime * result + ((this.plantName == null) ? 0 : this.plantName.hashCode());
        result = prime * result + ((this.farmerName == null) ? 0 : this.farmerName.hashCode());
        result = prime * result + ((this.mobileNo == null) ? 0 : this.mobileNo.hashCode());
        result = prime * result + ((this.accountNo == null) ? 0 : this.accountNo.hashCode());
        result = prime * result + ((this.bank == null) ? 0 : this.bank.hashCode());
        result = prime * result + ((this.branch == null) ? 0 : this.branch.hashCode());
        result = prime * result + ((this.ifsc == null) ? 0 : this.ifsc.hashCode());
        result = prime * result + ((this.address == null) ? 0 : this.address.hashCode());
        result = prime * result + ((this.village == null) ? 0 : this.village.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.district == null) ? 0 : this.district.hashCode());
        result = prime * result + ((this.taluk == null) ? 0 : this.taluk.hashCode());
        result = prime * result + ((this.pinCode == null) ? 0 : this.pinCode.hashCode());
        result = prime * result + ((this.doorNo == null) ? 0 : this.doorNo.hashCode());
        result = prime * result + ((this.street == null) ? 0 : this.street.hashCode());
        result = prime * result + ((this.netWork == null) ? 0 : this.netWork.hashCode());
        result = prime * result + ((this.mobileType == null) ? 0 : this.mobileType.hashCode());
        result = prime * result + ((this.aadharNo == null) ? 0 : this.aadharNo.hashCode());
        result = prime * result + ((this.familyNo == null) ? 0 : this.familyNo.hashCode());
        result = prime * result + ((this.voterNo == null) ? 0 : this.voterNo.hashCode());
        result = prime * result + ((this.bankFrontPageUrl == null) ? 0 : this.bankFrontPageUrl.hashCode());
        result = prime * result + ((this.bankBackPageUrl == null) ? 0 : this.bankBackPageUrl.hashCode());
        result = prime * result + ((this.aadharFrontPageUrl == null) ? 0 : this.aadharFrontPageUrl.hashCode());
        result = prime * result + ((this.aadharBackPageUrl == null) ? 0 : this.aadharBackPageUrl.hashCode());
        result = prime * result + ((this.familyFrontPageUrl == null) ? 0 : this.familyFrontPageUrl.hashCode());
        result = prime * result + ((this.familyBackPageUrl == null) ? 0 : this.familyBackPageUrl.hashCode());
        result = prime * result + ((this.voterFrontPageUrl == null) ? 0 : this.voterFrontPageUrl.hashCode());
        result = prime * result + ((this.voterBackPageUrl == null) ? 0 : this.voterBackPageUrl.hashCode());
        result = prime * result + ((this.createdDate == null) ? 0 : this.createdDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FarmerBank (");

        sb.append(plantCode);
        sb.append(", ").append(hmbCode);
        sb.append(", ").append(pid);
        sb.append(", ").append(vendorCode);
        sb.append(", ").append(hmbName);
        sb.append(", ").append(plantName);
        sb.append(", ").append(farmerName);
        sb.append(", ").append(mobileNo);
        sb.append(", ").append(accountNo);
        sb.append(", ").append(bank);
        sb.append(", ").append(branch);
        sb.append(", ").append(ifsc);
        sb.append(", ").append(address);
        sb.append(", ").append(village);
        sb.append(", ").append(state);
        sb.append(", ").append(district);
        sb.append(", ").append(taluk);
        sb.append(", ").append(pinCode);
        sb.append(", ").append(doorNo);
        sb.append(", ").append(street);
        sb.append(", ").append(netWork);
        sb.append(", ").append(mobileType);
        sb.append(", ").append(aadharNo);
        sb.append(", ").append(familyNo);
        sb.append(", ").append(voterNo);
        sb.append(", ").append(bankFrontPageUrl);
        sb.append(", ").append(bankBackPageUrl);
        sb.append(", ").append(aadharFrontPageUrl);
        sb.append(", ").append(aadharBackPageUrl);
        sb.append(", ").append(familyFrontPageUrl);
        sb.append(", ").append(familyBackPageUrl);
        sb.append(", ").append(voterFrontPageUrl);
        sb.append(", ").append(voterBackPageUrl);
        sb.append(", ").append(createdDate);

        sb.append(")");
        return sb.toString();
    }
}
