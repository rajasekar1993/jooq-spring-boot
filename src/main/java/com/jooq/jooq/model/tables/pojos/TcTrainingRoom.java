/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TcTrainingRoom implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        requestId;
    private Integer       roomTypeCode;
    private Integer       roomCode;
    private LocalDate     fromDate;
    private LocalDate     toDate;
    private LocalTime     fromTime;
    private LocalTime     toTime;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public TcTrainingRoom() {}

    public TcTrainingRoom(TcTrainingRoom value) {
        this.requestId = value.requestId;
        this.roomTypeCode = value.roomTypeCode;
        this.roomCode = value.roomCode;
        this.fromDate = value.fromDate;
        this.toDate = value.toDate;
        this.fromTime = value.fromTime;
        this.toTime = value.toTime;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public TcTrainingRoom(
        String        requestId,
        Integer       roomTypeCode,
        Integer       roomCode,
        LocalDate     fromDate,
        LocalDate     toDate,
        LocalTime     fromTime,
        LocalTime     toTime,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.requestId = requestId;
        this.roomTypeCode = roomTypeCode;
        this.roomCode = roomCode;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.REQUEST_ID</code>.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.REQUEST_ID</code>.
     */
    public TcTrainingRoom setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.ROOM_TYPE_CODE</code>.
     */
    public Integer getRoomTypeCode() {
        return this.roomTypeCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.ROOM_TYPE_CODE</code>.
     */
    public TcTrainingRoom setRoomTypeCode(Integer roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.ROOM_CODE</code>.
     */
    public Integer getRoomCode() {
        return this.roomCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.ROOM_CODE</code>.
     */
    public TcTrainingRoom setRoomCode(Integer roomCode) {
        this.roomCode = roomCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.FROM_DATE</code>.
     */
    public LocalDate getFromDate() {
        return this.fromDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.FROM_DATE</code>.
     */
    public TcTrainingRoom setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.TO_DATE</code>.
     */
    public LocalDate getToDate() {
        return this.toDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.TO_DATE</code>.
     */
    public TcTrainingRoom setToDate(LocalDate toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.FROM_TIME</code>.
     */
    public LocalTime getFromTime() {
        return this.fromTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.FROM_TIME</code>.
     */
    public TcTrainingRoom setFromTime(LocalTime fromTime) {
        this.fromTime = fromTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.TO_TIME</code>.
     */
    public LocalTime getToTime() {
        return this.toTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.TO_TIME</code>.
     */
    public TcTrainingRoom setToTime(LocalTime toTime) {
        this.toTime = toTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.CREATED_BY</code>.
     */
    public TcTrainingRoom setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.CREATED_ON</code>.
     */
    public TcTrainingRoom setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.LAST_CHANGED_BY</code>.
     */
    public TcTrainingRoom setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_ROOM.LAST_CHANGED_ON</code>.
     */
    public TcTrainingRoom setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final TcTrainingRoom other = (TcTrainingRoom) obj;
        if (requestId == null) {
            if (other.requestId != null)
                return false;
        }
        else if (!requestId.equals(other.requestId))
            return false;
        if (roomTypeCode == null) {
            if (other.roomTypeCode != null)
                return false;
        }
        else if (!roomTypeCode.equals(other.roomTypeCode))
            return false;
        if (roomCode == null) {
            if (other.roomCode != null)
                return false;
        }
        else if (!roomCode.equals(other.roomCode))
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
        if (fromTime == null) {
            if (other.fromTime != null)
                return false;
        }
        else if (!fromTime.equals(other.fromTime))
            return false;
        if (toTime == null) {
            if (other.toTime != null)
                return false;
        }
        else if (!toTime.equals(other.toTime))
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
        result = prime * result + ((this.requestId == null) ? 0 : this.requestId.hashCode());
        result = prime * result + ((this.roomTypeCode == null) ? 0 : this.roomTypeCode.hashCode());
        result = prime * result + ((this.roomCode == null) ? 0 : this.roomCode.hashCode());
        result = prime * result + ((this.fromDate == null) ? 0 : this.fromDate.hashCode());
        result = prime * result + ((this.toDate == null) ? 0 : this.toDate.hashCode());
        result = prime * result + ((this.fromTime == null) ? 0 : this.fromTime.hashCode());
        result = prime * result + ((this.toTime == null) ? 0 : this.toTime.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TcTrainingRoom (");

        sb.append(requestId);
        sb.append(", ").append(roomTypeCode);
        sb.append(", ").append(roomCode);
        sb.append(", ").append(fromDate);
        sb.append(", ").append(toDate);
        sb.append(", ").append(fromTime);
        sb.append(", ").append(toTime);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
