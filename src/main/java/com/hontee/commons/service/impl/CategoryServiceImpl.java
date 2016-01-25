package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hontee.commons.db.dao.CategoryMapper;
import com.hontee.commons.db.entity.Category;
import com.hontee.commons.db.entity.CategoryExample;
import com.hontee.commons.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Resource
	private CategoryMapper categoryMapper;
	
	public int countByExample(CategoryExample example) {
		return categoryMapper.countByExample(example);
	}
	
	public void deleteByExample(CategoryExample example) {
		categoryMapper.deleteByExample(example);
	}
	
	public void deleteByPrimaryKey(Long id) {
		categoryMapper.deleteByPrimaryKey(id);
	}
	
	public void add(Category record) {
		categoryMapper.insert(record);
	}
	
	public void addSelective(Category record) {
		categoryMapper.insertSelective(record);
	}
	
	public List<Category> findByExample(CategoryExample example) {
		return categoryMapper.selectByExample(example);
	}

	public Category findByPrimaryKey(Long id) {
		return categoryMapper.selectByPrimaryKey(id);
	}
	
	public void updateByExampleSelective(Category record, CategoryExample example) {
		categoryMapper.updateByExampleSelective(record, example);
	}

	public void updateByExample(Category record, CategoryExample example) {
		categoryMapper.updateByExample(record, example);
	}
	
	public void updateByPrimaryKeySelective(Category record) {
		categoryMapper.updateByPrimaryKeySelective(record);
		
	}
	
	public void updateByPrimaryKey(Category record) {
		categoryMapper.updateByPrimaryKey(record);		
	}

}
