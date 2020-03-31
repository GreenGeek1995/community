package com.dj.mapper;

import com.dj.model.Question;
import com.dj.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTION
     *
     * @mbg.generated Sat Mar 28 11:18:50 CST 2020
     */
    int incView(@Param("record") Question record);

    int intCommentCount(@Param("record") Question record);

    List<Question> selectRelated(@Param("record") Question record);
}