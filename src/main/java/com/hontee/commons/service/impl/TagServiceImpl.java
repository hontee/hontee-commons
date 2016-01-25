package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hontee.commons.db.dao.TagMapper;
import com.hontee.commons.db.entity.Tag;
import com.hontee.commons.db.entity.TagExample;
import com.hontee.commons.service.TagService;

@Service
public class TagServiceImpl implements TagService {
	
	@Resource
	private TagMapper tagMapper;

	
	public int countByExample(TagExample example) {
		return tagMapper.countByExample(example);
	}

	
	public void deleteByExample(TagExample example) {
		tagMapper.deleteByExample(example);		
	}

	
	public void deleteByPrimaryKey(Long id) {
		tagMapper.deleteByPrimaryKey(id);		
	}

	
	public void add(Tag record) {
		tagMapper.insert(record);		
	}

	
	public void addSelective(Tag record) {
		tagMapper.insertSelective(record);		
	}

	
	public List<Tag> findByExample(TagExample example) {
		return tagMapper.selectByExample(example);
	}

	
	public Tag findByPrimaryKey(Long id) {
		return tagMapper.selectByPrimaryKey(id);
	}

	
	public void updateByExampleSelective(Tag record, TagExample example) {
		tagMapper.updateByExampleSelective(record, example);		
	}

	
	public void updateByExample(Tag record, TagExample example) {
		tagMapper.updateByExample(record, example);		
	}

	
	public void updateByPrimaryKeySelective(Tag record) {
		tagMapper.updateByPrimaryKeySelective(record);		
	}

	
	public void updateByPrimaryKey(Tag record) {
		tagMapper.updateByPrimaryKey(record);		
	}

}
