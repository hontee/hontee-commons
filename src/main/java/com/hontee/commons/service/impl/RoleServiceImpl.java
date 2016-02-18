package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.RoleMapper;
import com.hontee.commons.db.entity.Role;
import com.hontee.commons.db.entity.RoleExample;
import com.hontee.commons.exception.BusinessException;
import com.hontee.commons.service.RoleService;
import com.hontee.commons.support.Pagination;

@Service
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleMapper roleMapper;

	public int countByExample(RoleExample example) throws BusinessException {
		return roleMapper.countByExample(example);
	}

	public void deleteByExample(RoleExample example) throws BusinessException {
		roleMapper.deleteByExample(example);
	}

	public void deleteByPrimaryKey(Long id) throws BusinessException {
		roleMapper.deleteByPrimaryKey(id);
	}

	public void deleteBatch(List<Long> list) throws Exception {
		roleMapper.deleteBatch(list);
	}

	public void add(Role record) throws BusinessException {
		roleMapper.insertSelective(record);
	}

	public List<Role> findByExample(RoleExample example) throws BusinessException {
		return roleMapper.selectByExample(example);
	}

	public Role findByPrimaryKey(Long id) throws BusinessException {
		return roleMapper.selectByPrimaryKey(id);
	}

	public void updateByExampleSelective(Role record, RoleExample example) throws BusinessException {
		roleMapper.updateByExampleSelective(record, example);
	}

	public void updateByExample(Role record, RoleExample example) throws BusinessException {
		roleMapper.updateByExample(record, example);
	}

	public void updateByPrimaryKeySelective(Role record) throws BusinessException {
		roleMapper.updateByPrimaryKeySelective(record);
	}

	public PageInfo<Role> findByExample(RoleExample example, Pagination p) throws BusinessException {
		PageHelper.startPage(p.getPage(), p.getRows(), p.getOrderByClause());
		List<Role> list = this.findByExample(example);
		return new PageInfo<Role>(list);
	}

	public void updateByPrimaryKey(Role record) throws Exception {
		roleMapper.updateByPrimaryKey(record);
	}

}
