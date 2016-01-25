package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hontee.commons.db.dao.RoleMapper;
import com.hontee.commons.db.entity.Role;
import com.hontee.commons.db.entity.RoleExample;
import com.hontee.commons.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Resource
	private RoleMapper roleMapper;

	
	public int countByExample(RoleExample example) {
		return roleMapper.countByExample(example);
	}

	
	public void deleteByExample(RoleExample example) {
		roleMapper.deleteByExample(example);		
	}

	
	public void deleteByPrimaryKey(Long id) {
		roleMapper.deleteByPrimaryKey(id);		
	}

	
	public void add(Role record) {
		roleMapper.insert(record);		
	}

	
	public void addelective(Role record) {
		roleMapper.insertSelective(record);		
	}

	
	public List<Role> findByExample(RoleExample example) {
		return roleMapper.selectByExample(example);
	}

	
	public Role findByPrimaryKey(Long id) {
		return roleMapper.selectByPrimaryKey(id);
	}

	
	public void updateByExampleSelective(Role record, RoleExample example) {
		roleMapper.updateByExampleSelective(record, example);		
	}

	
	public void updateByExample(Role record, RoleExample example) {
		roleMapper.updateByExample(record, example);		
	}

	
	public void updateByPrimaryKeySelective(Role record) {
		roleMapper.updateByPrimaryKeySelective(record);		
	}

}