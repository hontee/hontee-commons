package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.CategoryMapper;
import com.hontee.commons.db.entity.Category;
import com.hontee.commons.db.entity.CategoryExample;
import com.hontee.commons.exception.BusinessException;
import com.hontee.commons.service.CategoryService;
import com.hontee.commons.support.Pagination;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Resource
	private CategoryMapper categoryMapper;

	public int countByExample(CategoryExample example) throws BusinessException {
		return categoryMapper.countByExample(example);
	}

	public void deleteByExample(CategoryExample example) throws BusinessException {
		categoryMapper.deleteByExample(example);
	}

	public void deleteByPrimaryKey(Long id) throws BusinessException {
		categoryMapper.deleteByPrimaryKey(id);
	}
	
	public void deleteBatch(List<Long> list) throws Exception {
		categoryMapper.deleteBatch(list);
	}

	public void add(Category record) throws BusinessException {
		categoryMapper.insertSelective(record);
	}

	public List<Category> findByExample(CategoryExample example) throws BusinessException {
		return categoryMapper.selectByExample(example);
	}

	public Category findByPrimaryKey(Long id) throws BusinessException {
		return categoryMapper.selectByPrimaryKey(id);
	}

	public void updateByExample(Category record, CategoryExample example) throws BusinessException {
		categoryMapper.updateByExample(record, example);
	}

	public void updateByPrimaryKey(Category record) throws BusinessException {
		categoryMapper.updateByPrimaryKey(record);
	}

	public PageInfo<Category> findByExample(CategoryExample example, Pagination p) throws BusinessException {
		PageHelper.startPage(p.getPage(), p.getRows(), p.getOrderByClause());
		List<Category> list = this.findByExample(example);
		return new PageInfo<Category>(list);
	}

}
