package com.hontee.commons.db.dao;

import com.hontee.commons.db.entity.RoleMenu;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuMapper {
	
    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("menuId") Long menuId);

    int insert(RoleMenu record);

    RoleMenu selectByPrimaryKey(@Param("roleId") Long roleId, @Param("menuId") Long menuId);

    List<RoleMenu> selectAll();

    int updateByPrimaryKey(RoleMenu record);
}