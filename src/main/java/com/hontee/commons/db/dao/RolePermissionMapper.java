package com.hontee.commons.db.dao;

import com.hontee.commons.db.entity.RolePermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("permissionId") Long permissionId);

    int insert(RolePermission record);

    RolePermission selectByPrimaryKey(@Param("roleId") Long roleId, @Param("permissionId") Long permissionId);

    List<RolePermission> selectAll();

    int updateByPrimaryKey(RolePermission record);
}