package com.hontee.commons.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.PlatformMapper;
import com.hontee.commons.db.entity.Platform;
import com.hontee.commons.db.entity.PlatformExample;
import com.hontee.commons.service.PlatformService;
import com.hontee.commons.support.Pagination;

@Service
public class PlatformServiceImpl implements PlatformService {
	
	@Autowired
	private PlatformMapper platformMapper;

	
	public int countByExample(PlatformExample example) {
		return platformMapper.countByExample(example);
	}

	
	public List<Platform> findByExample(PlatformExample example) {
		return platformMapper.selectByExample(example);
	}

	
	public Platform findByPrimaryKey(Long id) {
		return platformMapper.selectByPrimaryKey(id);
	}

	
	public PageInfo<Platform> findByExample(PlatformExample example, Pagination p) {
		PageHelper.startPage(p.getPage(), p.getSize());
		List<Platform> list = this.findByExample(example);
		return new PageInfo<Platform>(list);
	}

	
	public void deleteByExample(PlatformExample example) {
		platformMapper.deleteByExample(example);
	}

	
	public void deleteByPrimaryKey(Long id) {
		platformMapper.deleteByPrimaryKey(id);
	}

	
	public void add(Platform record) {
		platformMapper.insert(record);
	}

	
	public void addSelective(Platform record) {
		platformMapper.insertSelective(record);		
	}

	
	public void updateByExampleSelective(Platform record, PlatformExample example) {
		platformMapper.updateByExampleSelective(record, example);		
	}

	
	public void updateByExample(Platform record, PlatformExample example) {
		platformMapper.updateByExample(record, example);		
	}

	
	public void updateByPrimaryKeySelective(Platform record) {
		platformMapper.updateByPrimaryKeySelective(record);
	}

	
	public void updateByPrimaryKey(Platform record) {
		platformMapper.updateByPrimaryKey(record);
	}

}
