package com.dj.mapper;

import com.dj.model.Comment;
import com.dj.model.CommentExample;
import com.dj.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int intCommentCount(@Param("record") Comment record);
}