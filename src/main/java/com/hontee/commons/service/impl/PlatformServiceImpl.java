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
		// TODO Auto-generated method stub
		return null;
	}

	
	public PageInfo<Platform> findByExample(PlatformExample example, Pagination p) {
		PageHelper.startPage(p.getPage(), p.getSize());
		List<Platform> list = this.findByExample(example);
		return new PageInfo<Platform>(list);
	}

	
	public void deleteByExample(PlatformExample example) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	public void add(Platform record) {
		// TODO Auto-generated method stub
		
	}

	
	public void addSelective(Platform record) {
		// TODO Auto-generated method stub
		
	}

	
	public void updateByExampleSelective(Platform record, PlatformExample example) {
		// TODO Auto-generated method stub
		
	}

	
	public void updateByExample(Platform record, PlatformExample example) {
		// TODO Auto-generated method stub
		
	}

	
	public void updateByPrimaryKeySelective(Platform record) {
		// TODO Auto-generated method stub
		
	}

	
	public void updateByPrimaryKey(Platform record) {
		// TODO Auto-generated method stub
		
	}

}
