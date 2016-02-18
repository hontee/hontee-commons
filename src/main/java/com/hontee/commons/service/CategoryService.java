package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Category;
import com.hontee.commons.db.entity.CategoryExample;
import com.hontee.commons.support.Pager;

public interface CategoryService extends Pager<Category, CategoryExample> {

	int countByExample(CategoryExample example) throws Exception;

	void deleteByExample(CategoryExample example) throws Exception;

	void deleteByPrimaryKey(Long id) throws Exception;
	
	void deleteBatch(List<Long> list) throws Exception;

	void add(Category record) throws Exception;

	List<Category> findByExample(CategoryExample example) throws Exception;

	Category findByPrimaryKey(Long id) throws Exception;

	void updateByExample(Category record, CategoryExample example) throws Exception;

	void updateByPrimaryKey(Category record) throws Exception;

}
