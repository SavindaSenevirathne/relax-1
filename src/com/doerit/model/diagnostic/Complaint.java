package com.doerit.model.diagnostic;

import java.util.Date;

public class Complaint {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_complaint.ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_complaint.COMPLAINT
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String complaint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_complaint.TYPE
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_complaint.COMPLAINT_HISTORY
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String complaintHistory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_complaint.APPROVED_BY
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String approvedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_complaint.COMMENT
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_complaint.STATUS
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_complaint.SORT_ORDER
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private Integer sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_complaint.INSERT_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String insertUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_complaint.INSERT_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private Date insertDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_complaint.UPDATE_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String updateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_complaint.UPDATE_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private Date updateDatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_complaint.ID
     *
     * @return the value of tbl_complaint.ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_complaint.ID
     *
     * @param id the value for tbl_complaint.ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_complaint.COMPLAINT
     *
     * @return the value of tbl_complaint.COMPLAINT
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getComplaint() {
        return complaint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_complaint.COMPLAINT
     *
     * @param complaint the value for tbl_complaint.COMPLAINT
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setComplaint(String complaint) {
        this.complaint = complaint == null ? null : complaint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_complaint.TYPE
     *
     * @return the value of tbl_complaint.TYPE
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_complaint.TYPE
     *
     * @param type the value for tbl_complaint.TYPE
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_complaint.COMPLAINT_HISTORY
     *
     * @return the value of tbl_complaint.COMPLAINT_HISTORY
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getComplaintHistory() {
        return complaintHistory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_complaint.COMPLAINT_HISTORY
     *
     * @param complaintHistory the value for tbl_complaint.COMPLAINT_HISTORY
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setComplaintHistory(String complaintHistory) {
        this.complaintHistory = complaintHistory == null ? null : complaintHistory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_complaint.APPROVED_BY
     *
     * @return the value of tbl_complaint.APPROVED_BY
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getApprovedBy() {
        return approvedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_complaint.APPROVED_BY
     *
     * @param approvedBy the value for tbl_complaint.APPROVED_BY
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy == null ? null : approvedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_complaint.COMMENT
     *
     * @return the value of tbl_complaint.COMMENT
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_complaint.COMMENT
     *
     * @param comment the value for tbl_complaint.COMMENT
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_complaint.STATUS
     *
     * @return the value of tbl_complaint.STATUS
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_complaint.STATUS
     *
     * @param status the value for tbl_complaint.STATUS
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_complaint.SORT_ORDER
     *
     * @return the value of tbl_complaint.SORT_ORDER
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_complaint.SORT_ORDER
     *
     * @param sortOrder the value for tbl_complaint.SORT_ORDER
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_complaint.INSERT_USER_ID
     *
     * @return the value of tbl_complaint.INSERT_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getInsertUserId() {
        return insertUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_complaint.INSERT_USER_ID
     *
     * @param insertUserId the value for tbl_complaint.INSERT_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setInsertUserId(String insertUserId) {
        this.insertUserId = insertUserId == null ? null : insertUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_complaint.INSERT_DATETIME
     *
     * @return the value of tbl_complaint.INSERT_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public Date getInsertDatetime() {
        return insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_complaint.INSERT_DATETIME
     *
     * @param insertDatetime the value for tbl_complaint.INSERT_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setInsertDatetime(Date insertDatetime) {
        this.insertDatetime = insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_complaint.UPDATE_USER_ID
     *
     * @return the value of tbl_complaint.UPDATE_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_complaint.UPDATE_USER_ID
     *
     * @param updateUserId the value for tbl_complaint.UPDATE_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_complaint.UPDATE_DATETIME
     *
     * @return the value of tbl_complaint.UPDATE_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_complaint.UPDATE_DATETIME
     *
     * @param updateDatetime the value for tbl_complaint.UPDATE_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}