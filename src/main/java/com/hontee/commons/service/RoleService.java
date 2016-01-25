package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Role;
import com.hontee.commons.db.entity.RoleExample;

public interface RoleService {

	int countByExample(RoleExample example);

	void deleteByExample(RoleExample example);

	void deleteByPrimaryKey(Long id);

	void add(Role record);

	void addelective(Role record);

	List<Role> findByExample(RoleExample example);

	Role findByPrimaryKey(Long id);

	void updateByExampleSelective(Role record, RoleExample example);

	void updateByExample(Role record, RoleExample example);

	void updateByPrimaryKeySelective(Role record);

}
