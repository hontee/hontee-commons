package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Category;
import com.hontee.commons.db.entity.CategoryExample;

public interface CategoryService {

	int countByExample(CategoryExample example);

	void deleteByExample(CategoryExample example);

	void deleteByPrimaryKey(Long id);

	void add(Category record);

	void addSelective(Category record);

	List<Category> findByExample(CategoryExample example);

	Category findByPrimaryKey(Long id);

	void updateByExampleSelective(Category record, CategoryExample example);

	void updateByExample(Category record, CategoryExample example);

	void updateByPrimaryKeySelective(Category record);

	void updateByPrimaryKey(Category record);

}
