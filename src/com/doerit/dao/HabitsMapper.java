package com.doerit.dao;

import com.doerit.model.diagnostic.Habits;
import com.doerit.model.diagnostic.HabitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HabitsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_habit
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    long countByExample(HabitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_habit
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    int deleteByExample(HabitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_habit
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_habit
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    int insert(Habits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_habit
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    int insertSelective(Habits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_habit
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    List<Habits> selectByExample(HabitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_habit
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    Habits selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_habit
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    int updateByExampleSelective(@Param("record") Habits record, @Param("example") HabitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_habit
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    int updateByExample(@Param("record") Habits record, @Param("example") HabitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_habit
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    int updateByPrimaryKeySelective(Habits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_habit
     *
     * @mbg.generated Tue Dec 19 03:23:32 IST 2017
     */
    int updateByPrimaryKey(Habits record);
}