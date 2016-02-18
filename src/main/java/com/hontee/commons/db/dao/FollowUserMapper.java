package com.hontee.commons.db.dao;

import com.hontee.commons.db.entity.FollowUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowUserMapper {
	
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("followId") Long followId);

    int insert(FollowUser record);

    FollowUser selectByPrimaryKey(@Param("userId") Long userId, @Param("followId") Long followId);

    List<FollowUser> selectAll();

    int updateByPrimaryKey(FollowUser record);
}