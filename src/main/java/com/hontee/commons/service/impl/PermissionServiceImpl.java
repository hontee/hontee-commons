package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.PermissionMapper;
import com.hontee.commons.db.entity.Permission;
import com.hontee.commons.db.entity.PermissionExample;
import com.hontee.commons.exception.BusinessException;
import com.hontee.commons.service.PermissionService;
import com.hontee.commons.support.Pagination;

@Service
public class PermissionServiceImpl implements PermissionService {

	@Resource
	private PermissionMapper permissionMapper;

	public int countByExample(PermissionExample example) throws BusinessException {
		return permissionMapper.countByExample(example);
	}

	public void deleteByExample(PermissionExample example) throws BusinessException {
		permissionMapper.deleteByExample(example);
	}

	public void deleteByPrimaryKey(Long id) throws BusinessException {
		permissionMapper.deleteByPrimaryKey(id);
	}

	public void deleteBatch(List<Long> list) throws Exception {
		permissionMapper.deleteBatch(list);
	}

	public void add(Permission record) throws BusinessException {
		permissionMapper.insertSelective(record);
	}

	public List<Permission> findByExample(PermissionExample example) throws BusinessException {
		return permissionMapper.selectByExample(example);
	}

	public Permission findByPrimaryKey(Long id) throws BusinessException {
		return permissionMapper.selectByPrimaryKey(id);
	}

	public void updateByExampleSelective(Permission record, PermissionExample example) throws BusinessException {
		permissionMapper.updateByExampleSelective(record, example);
	}

	public void updateByExample(Permission record, PermissionExample example) throws BusinessException {
		permissionMapper.updateByExample(record, example);
	}

	public void updateByPrimaryKeySelective(Permission record) throws BusinessException {
		permissionMapper.updateByPrimaryKeySelective(record);
	}

	public void updateByPrimaryKey(Permission record) throws BusinessException {
		permissionMapper.updateByPrimaryKey(record);
	}

	public PageInfo<Permission> findByExample(PermissionExample example, Pagination p) throws BusinessException {
		PageHelper.startPage(p.getPage(), p.getRows(), p.getOrderByClause());
		List<Permission> list = this.findByExample(example);
		return new PageInfo<Permission>(list);
	}

}
