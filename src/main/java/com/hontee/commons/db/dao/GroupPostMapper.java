package com.hontee.commons.db.dao;

import com.hontee.commons.db.entity.GroupPost;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupPostMapper {
    int deleteByPrimaryKey(@Param("groupId") Long groupId, @Param("postId") Long postId);

    int insert(GroupPost record);

    GroupPost selectByPrimaryKey(@Param("groupId") Long groupId, @Param("postId") Long postId);

    List<GroupPost> selectAll();

    int updateByPrimaryKey(GroupPost record);
}