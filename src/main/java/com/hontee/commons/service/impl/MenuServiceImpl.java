package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.MenuMapper;
import com.hontee.commons.db.entity.Menu;
import com.hontee.commons.db.entity.MenuExample;
import com.hontee.commons.exception.BusinessException;
import com.hontee.commons.service.MenuService;
import com.hontee.commons.support.Pagination;

@Service
public class MenuServiceImpl implements MenuService {

	@Resource
	private MenuMapper menuMapper;

	public int countByExample(MenuExample example) throws BusinessException {
		return menuMapper.countByExample(example);
	}

	public void deleteByExample(MenuExample example) throws BusinessException {
		menuMapper.deleteByExample(example);
	}

	public void deleteByPrimaryKey(Long id) throws BusinessException {
		menuMapper.deleteByPrimaryKey(id);
	}
	
	public void deleteBatch(List<Long> list) throws Exception {
		menuMapper.deleteBatch(list);
	}

	public void add(Menu record) throws BusinessException {
		menuMapper.insert(record);
	}

	public void addSelective(Menu record) throws BusinessException {
		menuMapper.insertSelective(record);
	}

	public List<Menu> findByExample(MenuExample example) throws BusinessException {
		return menuMapper.selectByExample(example);
	}

	public Menu findByPrimaryKey(Long id) throws BusinessException {
		return menuMapper.selectByPrimaryKey(id);
	}

	public void updateByExampleSelective(Menu record, MenuExample example) throws BusinessException {
		menuMapper.updateByExampleSelective(record, example);
	}

	public void updateByExample(Menu record, MenuExample example) throws BusinessException {
		menuMapper.updateByExample(record, example);
	}

	public void updateByPrimaryKeySelective(Menu record) throws BusinessException {
		menuMapper.updateByPrimaryKeySelective(record);
	}

	public void updateByPrimaryKey(Menu record) throws BusinessException {
		menuMapper.updateByPrimaryKey(record);
	}

	public PageInfo<Menu> findByExample(MenuExample example, Pagination p) throws BusinessException {
		PageHelper.startPage(p.getPage(), p.getRows(), p.getOrderByClause());
		List<Menu> list = this.findByExample(example);
		return new PageInfo<Menu>(list);
	}

}
