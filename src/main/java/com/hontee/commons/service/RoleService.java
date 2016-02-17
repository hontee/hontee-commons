package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Role;
import com.hontee.commons.db.entity.RoleExample;
import com.hontee.commons.support.Pager;

public interface RoleService extends Pager<Role, RoleExample> {

	int countByExample(RoleExample example) throws Exception;

	void deleteByExample(RoleExample example) throws Exception;

	void deleteByPrimaryKey(Long id) throws Exception;
	
	void deleteBatch(List<Long> list) throws Exception;

	void add(Role record) throws Exception;

	void addelective(Role record) throws Exception;

	List<Role> findByExample(RoleExample example) throws Exception;

	Role findByPrimaryKey(Long id) throws Exception;

	void updateByExampleSelective(Role record, RoleExample example) throws Exception;

	void updateByExample(Role record, RoleExample example) throws Exception;

	void updateByPrimaryKeySelective(Role record) throws Exception;

}
