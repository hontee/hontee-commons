package com.hontee.commons.db.dao;

import com.hontee.commons.db.entity.FollowPost;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowPostMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("postId") Long postId);

    int insert(FollowPost record);

    FollowPost selectByPrimaryKey(@Param("userId") Long userId, @Param("postId") Long postId);

    List<FollowPost> selectAll();

    int updateByPrimaryKey(FollowPost record);
}