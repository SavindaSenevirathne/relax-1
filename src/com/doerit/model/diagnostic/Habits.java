package com.doerit.model.diagnostic;

import java.util.Date;

public class Habits {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_habit.ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_habit.NAME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_habit.CATEGORY
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_habit.COMMENT
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_habit.STATUS
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_habit.SORT_ORDER
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private Integer sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_habit.INSERT_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String insertUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_habit.INSERT_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private Date insertDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_habit.UPDATE_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private String updateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_habit.UPDATE_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    private Date updateDatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_habit.ID
     *
     * @return the value of tbl_habit.ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_habit.ID
     *
     * @param id the value for tbl_habit.ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_habit.NAME
     *
     * @return the value of tbl_habit.NAME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_habit.NAME
     *
     * @param name the value for tbl_habit.NAME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_habit.CATEGORY
     *
     * @return the value of tbl_habit.CATEGORY
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_habit.CATEGORY
     *
     * @param category the value for tbl_habit.CATEGORY
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_habit.COMMENT
     *
     * @return the value of tbl_habit.COMMENT
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_habit.COMMENT
     *
     * @param comment the value for tbl_habit.COMMENT
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_habit.STATUS
     *
     * @return the value of tbl_habit.STATUS
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_habit.STATUS
     *
     * @param status the value for tbl_habit.STATUS
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_habit.SORT_ORDER
     *
     * @return the value of tbl_habit.SORT_ORDER
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_habit.SORT_ORDER
     *
     * @param sortOrder the value for tbl_habit.SORT_ORDER
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_habit.INSERT_USER_ID
     *
     * @return the value of tbl_habit.INSERT_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getInsertUserId() {
        return insertUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_habit.INSERT_USER_ID
     *
     * @param insertUserId the value for tbl_habit.INSERT_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setInsertUserId(String insertUserId) {
        this.insertUserId = insertUserId == null ? null : insertUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_habit.INSERT_DATETIME
     *
     * @return the value of tbl_habit.INSERT_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public Date getInsertDatetime() {
        return insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_habit.INSERT_DATETIME
     *
     * @param insertDatetime the value for tbl_habit.INSERT_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setInsertDatetime(Date insertDatetime) {
        this.insertDatetime = insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_habit.UPDATE_USER_ID
     *
     * @return the value of tbl_habit.UPDATE_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_habit.UPDATE_USER_ID
     *
     * @param updateUserId the value for tbl_habit.UPDATE_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_habit.UPDATE_DATETIME
     *
     * @return the value of tbl_habit.UPDATE_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_habit.UPDATE_DATETIME
     *
     * @param updateDatetime the value for tbl_habit.UPDATE_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}