package com.hontee.commons.db.dao;

import com.hontee.commons.db.entity.FollowGroup;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowGroupMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("groupId") Long groupId);

    int insert(FollowGroup record);

    FollowGroup selectByPrimaryKey(@Param("userId") Long userId, @Param("groupId") Long groupId);

    List<FollowGroup> selectAll();

    int updateByPrimaryKey(FollowGroup record);
}