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
public class TcParticipantRoom implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       lineId;
    private String        requestId;
    private Integer       roomCode;
    private String        bedCode;
    private LocalDate     fromDate;
    private LocalDate     toDate;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public TcParticipantRoom() {}

    public TcParticipantRoom(TcParticipantRoom value) {
        this.lineId = value.lineId;
        this.requestId = value.requestId;
        this.roomCode = value.roomCode;
        this.bedCode = value.bedCode;
        this.fromDate = value.fromDate;
        this.toDate = value.toDate;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public TcParticipantRoom(
        Integer       lineId,
        String        requestId,
        Integer       roomCode,
        String        bedCode,
        LocalDate     fromDate,
        LocalDate     toDate,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.lineId = lineId;
        this.requestId = requestId;
        this.roomCode = roomCode;
        this.bedCode = bedCode;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.LINE_ID</code>.
     */
    public Integer getLineId() {
        return this.lineId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.LINE_ID</code>.
     */
    public TcParticipantRoom setLineId(Integer lineId) {
        this.lineId = lineId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.REQUEST_ID</code>.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.REQUEST_ID</code>.
     */
    public TcParticipantRoom setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.ROOM_CODE</code>.
     */
    public Integer getRoomCode() {
        return this.roomCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.ROOM_CODE</code>.
     */
    public TcParticipantRoom setRoomCode(Integer roomCode) {
        this.roomCode = roomCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.BED_CODE</code>.
     */
    public String getBedCode() {
        return this.bedCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.BED_CODE</code>.
     */
    public TcParticipantRoom setBedCode(String bedCode) {
        this.bedCode = bedCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.FROM_DATE</code>.
     */
    public LocalDate getFromDate() {
        return this.fromDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.FROM_DATE</code>.
     */
    public TcParticipantRoom setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.TO_DATE</code>.
     */
    public LocalDate getToDate() {
        return this.toDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.TO_DATE</code>.
     */
    public TcParticipantRoom setToDate(LocalDate toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.CREATED_BY</code>.
     */
    public TcParticipantRoom setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.CREATED_ON</code>.
     */
    public TcParticipantRoom setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.LAST_CHANGED_BY</code>.
     */
    public TcParticipantRoom setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.LAST_CHANGED_ON</code>.
     */
    public TcParticipantRoom setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final TcParticipantRoom other = (TcParticipantRoom) obj;
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
        if (roomCode == null) {
            if (other.roomCode != null)
                return false;
        }
        else if (!roomCode.equals(other.roomCode))
            return false;
        if (bedCode == null) {
            if (other.bedCode != null)
                return false;
        }
        else if (!bedCode.equals(other.bedCode))
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
        result = prime * result + ((this.lineId == null) ? 0 : this.lineId.hashCode());
        result = prime * result + ((this.requestId == null) ? 0 : this.requestId.hashCode());
        result = prime * result + ((this.roomCode == null) ? 0 : this.roomCode.hashCode());
        result = prime * result + ((this.bedCode == null) ? 0 : this.bedCode.hashCode());
        result = prime * result + ((this.fromDate == null) ? 0 : this.fromDate.hashCode());
        result = prime * result + ((this.toDate == null) ? 0 : this.toDate.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TcParticipantRoom (");

        sb.append(lineId);
        sb.append(", ").append(requestId);
        sb.append(", ").append(roomCode);
        sb.append(", ").append(bedCode);
        sb.append(", ").append(fromDate);
        sb.append(", ").append(toDate);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
