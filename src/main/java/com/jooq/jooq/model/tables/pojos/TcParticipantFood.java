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
public class TcParticipantFood implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       lineId;
    private String        requestId;
    private LocalDate     trainingDate;
    private String        breakfastMealType;
    private String        lunchMealType;
    private String        dinnerMealType;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastModifiedBy;
    private LocalDateTime lastModifiedOn;

    public TcParticipantFood() {}

    public TcParticipantFood(TcParticipantFood value) {
        this.lineId = value.lineId;
        this.requestId = value.requestId;
        this.trainingDate = value.trainingDate;
        this.breakfastMealType = value.breakfastMealType;
        this.lunchMealType = value.lunchMealType;
        this.dinnerMealType = value.dinnerMealType;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastModifiedBy = value.lastModifiedBy;
        this.lastModifiedOn = value.lastModifiedOn;
    }

    public TcParticipantFood(
        Integer       lineId,
        String        requestId,
        LocalDate     trainingDate,
        String        breakfastMealType,
        String        lunchMealType,
        String        dinnerMealType,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastModifiedBy,
        LocalDateTime lastModifiedOn
    ) {
        this.lineId = lineId;
        this.requestId = requestId;
        this.trainingDate = trainingDate;
        this.breakfastMealType = breakfastMealType;
        this.lunchMealType = lunchMealType;
        this.dinnerMealType = dinnerMealType;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.LINE_ID</code>.
     */
    public Integer getLineId() {
        return this.lineId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.LINE_ID</code>.
     */
    public TcParticipantFood setLineId(Integer lineId) {
        this.lineId = lineId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.REQUEST_ID</code>.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.REQUEST_ID</code>.
     */
    public TcParticipantFood setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.TRAINING_DATE</code>.
     */
    public LocalDate getTrainingDate() {
        return this.trainingDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.TRAINING_DATE</code>.
     */
    public TcParticipantFood setTrainingDate(LocalDate trainingDate) {
        this.trainingDate = trainingDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.BREAKFAST_MEAL_TYPE</code>.
     */
    public String getBreakfastMealType() {
        return this.breakfastMealType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.BREAKFAST_MEAL_TYPE</code>.
     */
    public TcParticipantFood setBreakfastMealType(String breakfastMealType) {
        this.breakfastMealType = breakfastMealType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.LUNCH_MEAL_TYPE</code>.
     */
    public String getLunchMealType() {
        return this.lunchMealType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.LUNCH_MEAL_TYPE</code>.
     */
    public TcParticipantFood setLunchMealType(String lunchMealType) {
        this.lunchMealType = lunchMealType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.DINNER_MEAL_TYPE</code>.
     */
    public String getDinnerMealType() {
        return this.dinnerMealType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.DINNER_MEAL_TYPE</code>.
     */
    public TcParticipantFood setDinnerMealType(String dinnerMealType) {
        this.dinnerMealType = dinnerMealType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.CREATED_BY</code>.
     */
    public TcParticipantFood setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.CREATED_ON</code>.
     */
    public TcParticipantFood setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.LAST_MODIFIED_BY</code>.
     */
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.LAST_MODIFIED_BY</code>.
     */
    public TcParticipantFood setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.LAST_MODIFIED_ON</code>.
     */
    public LocalDateTime getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_FOOD.LAST_MODIFIED_ON</code>.
     */
    public TcParticipantFood setLastModifiedOn(LocalDateTime lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
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
        final TcParticipantFood other = (TcParticipantFood) obj;
        if (lineId == null) {
            if (other.lineId != null)
                return false;
        }
        else if (!lineId.equals(other.lineId))
            return false;
        if (requestId == null) {
            if (other.requestId != null)
                return false;
        }
        else if (!requestId.equals(other.requestId))
            return false;
        if (trainingDate == null) {
            if (other.trainingDate != null)
                return false;
        }
        else if (!trainingDate.equals(other.trainingDate))
            return false;
        if (breakfastMealType == null) {
            if (other.breakfastMealType != null)
                return false;
        }
        else if (!breakfastMealType.equals(other.breakfastMealType))
            return false;
        if (lunchMealType == null) {
            if (other.lunchMealType != null)
                return false;
        }
        else if (!lunchMealType.equals(other.lunchMealType))
            return false;
        if (dinnerMealType == null) {
            if (other.dinnerMealType != null)
                return false;
        }
        else if (!dinnerMealType.equals(other.dinnerMealType))
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
        if (lastModifiedBy == null) {
            if (other.lastModifiedBy != null)
                return false;
        }
        else if (!lastModifiedBy.equals(other.lastModifiedBy))
            return false;
        if (lastModifiedOn == null) {
            if (other.lastModifiedOn != null)
                return false;
        }
        else if (!lastModifiedOn.equals(other.lastModifiedOn))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.lineId == null) ? 0 : this.lineId.hashCode());
        result = prime * result + ((this.requestId == null) ? 0 : this.requestId.hashCode());
        result = prime * result + ((this.trainingDate == null) ? 0 : this.trainingDate.hashCode());
        result = prime * result + ((this.breakfastMealType == null) ? 0 : this.breakfastMealType.hashCode());
        result = prime * result + ((this.lunchMealType == null) ? 0 : this.lunchMealType.hashCode());
        result = prime * result + ((this.dinnerMealType == null) ? 0 : this.dinnerMealType.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastModifiedBy == null) ? 0 : this.lastModifiedBy.hashCode());
        result = prime * result + ((this.lastModifiedOn == null) ? 0 : this.lastModifiedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TcParticipantFood (");

        sb.append(lineId);
        sb.append(", ").append(requestId);
        sb.append(", ").append(trainingDate);
        sb.append(", ").append(breakfastMealType);
        sb.append(", ").append(lunchMealType);
        sb.append(", ").append(dinnerMealType);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastModifiedBy);
        sb.append(", ").append(lastModifiedOn);

        sb.append(")");
        return sb.toString();
    }
}
