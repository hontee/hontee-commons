package com.hontee.commons.db.dao;

import com.hontee.commons.db.entity.RoleUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleUserMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("roleId") Long roleId);

    int insert(RoleUser record);

    RoleUser selectByPrimaryKey(@Param("userId") Long userId, @Param("roleId") Long roleId);

    List<RoleUser> selectAll();

    int updateByPrimaryKey(RoleUser record);
}