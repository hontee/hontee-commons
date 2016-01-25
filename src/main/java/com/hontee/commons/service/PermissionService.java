package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Permission;
import com.hontee.commons.db.entity.PermissionExample;

public interface PermissionService {
	
	int countByExample(PermissionExample example);

    void deleteByExample(PermissionExample example);

    void deleteByPrimaryKey(Long id);

    void add(Permission record);

    void addSelective(Permission record);

    List<Permission> findByExample(PermissionExample example);

    Permission findByPrimaryKey(Long id);

    void updateByExampleSelective(Permission record, PermissionExample example);

    void updateByExample(Permission record, PermissionExample example);

    void updateByPrimaryKeySelective(Permission record);

    void updateByPrimaryKey(Permission record);

}
