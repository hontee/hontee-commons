package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Permission;
import com.hontee.commons.db.entity.PermissionExample;
import com.hontee.commons.support.Pager;

public interface PermissionService extends Pager<Permission, PermissionExample> {
	
	int countByExample(PermissionExample example) throws Exception;

    void deleteByExample(PermissionExample example) throws Exception;

    void deleteByPrimaryKey(Long id) throws Exception;
    
    void deleteBatch(List<Long> list) throws Exception;

    void add(Permission record) throws Exception;

    List<Permission> findByExample(PermissionExample example) throws Exception;

    Permission findByPrimaryKey(Long id) throws Exception;

    void updateByExampleSelective(Permission record, PermissionExample example) throws Exception;

    void updateByExample(Permission record, PermissionExample example) throws Exception;

    void updateByPrimaryKeySelective(Permission record) throws Exception;

    void updateByPrimaryKey(Permission record) throws Exception;

}
