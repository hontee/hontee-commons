package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.PermissionMapper;
import com.hontee.commons.db.entity.Permission;
import com.hontee.commons.db.entity.PermissionExample;
import com.hontee.commons.service.PermissionService;
import com.hontee.commons.support.Pagination;

@Service
public class PermissionServiceImpl implements PermissionService {
	
	@Resource
	private PermissionMapper permissionMapper;

	
	public int countByExample(PermissionExample example) {
		return permissionMapper.countByExample(example);
	}

	
	public void deleteByExample(PermissionExample example) {
		permissionMapper.deleteByExample(example);		
	}

	
	public void deleteByPrimaryKey(Long id) {
		permissionMapper.deleteByPrimaryKey(id);		
	}

	
	public void add(Permission record) {
		permissionMapper.insert(record);
	}

	
	public void addSelective(Permission record) {
		permissionMapper.insertSelective(record);
	}

	
	public List<Permission> findByExample(PermissionExample example) {
		return permissionMapper.selectByExample(example);
	}

	
	public Permission findByPrimaryKey(Long id) {
		return permissionMapper.selectByPrimaryKey(id);
	}

	
	public void updateByExampleSelective(Permission record, PermissionExample example) {
		permissionMapper.updateByExampleSelective(record, example);
	}

	
	public void updateByExample(Permission record, PermissionExample example) {
		permissionMapper.updateByExample(record, example);
	}

	
	public void updateByPrimaryKeySelective(Permission record) {
		permissionMapper.updateByPrimaryKeySelective(record);
	}

	
	public void updateByPrimaryKey(Permission record) {
		permissionMapper.updateByPrimaryKey(record);		
	}


	public PageInfo<Permission> findByExample(PermissionExample example, Pagination p) {
		PageHelper.startPage(p.getPage(), p.getSize());
		List<Permission> list = this.findByExample(example);
		return new PageInfo<Permission>(list);
	}

}
