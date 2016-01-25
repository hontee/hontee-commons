package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hontee.commons.db.dao.MenuMapper;
import com.hontee.commons.db.entity.Menu;
import com.hontee.commons.db.entity.MenuExample;
import com.hontee.commons.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Resource
	private MenuMapper menuMapper;

	
	public int countByExample(MenuExample example) {
		return menuMapper.countByExample(example);
	}

	
	public void deleteByExample(MenuExample example) {
		menuMapper.deleteByExample(example);
	}

	
	public void deleteByPrimaryKey(Long id) {
		menuMapper.deleteByPrimaryKey(id);
	}

	
	public void add(Menu record) {
		menuMapper.insert(record);
	}

	
	public void addSelective(Menu record) {
		menuMapper.insertSelective(record);
	}

	
	public List<Menu> findByExample(MenuExample example) {
		return menuMapper.selectByExample(example);
	}

	
	public Menu findByPrimaryKey(Long id) {
		return menuMapper.selectByPrimaryKey(id);
	}

	
	public void updateByExampleSelective(Menu record, MenuExample example) {
		menuMapper.updateByExampleSelective(record, example);		
	}

	
	public void updateByExample(Menu record, MenuExample example) {
		menuMapper.updateByExample(record, example);		
	}

	
	public void updateByPrimaryKeySelective(Menu record) {
		menuMapper.updateByPrimaryKeySelective(record);		
	}

	
	public void updateByPrimaryKey(Menu record) {
		menuMapper.updateByPrimaryKey(record);
	}

}
