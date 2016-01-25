package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.ShareMapper;
import com.hontee.commons.db.entity.Share;
import com.hontee.commons.db.entity.ShareExample;
import com.hontee.commons.service.ShareService;
import com.hontee.commons.support.Pagination;

@Service
public class ShareServiceImpl implements ShareService {
	
	@Resource
	private ShareMapper shareMapper;

	
	public int countByExample(ShareExample example) {
		return shareMapper.countByExample(example);
	}

	
	public void deleteByExample(ShareExample example) {
		shareMapper.deleteByExample(example);		
	}

	
	public void deleteByPrimaryKey(Long id) {
		shareMapper.deleteByPrimaryKey(id);		
	}

	
	public void add(Share record) {
		shareMapper.insert(record);		
	}

	
	public void addSelective(Share record) {
		shareMapper.insertSelective(record);		
	}

	
	public List<Share> findByExample(ShareExample example) {
		return shareMapper.selectByExample(example);
	}

	
	public Share findByPrimaryKey(Long id) {
		return shareMapper.selectByPrimaryKey(id);
	}

	
	public void updateByExampleSelective(Share record, ShareExample example) {
		shareMapper.updateByExampleSelective(record, example);		
	}

	
	public void updateByExample(Share record, ShareExample example) {
		shareMapper.updateByExample(record, example);		
	}

	
	public void updateByPrimaryKeySelective(Share record) {
		shareMapper.updateByPrimaryKeySelective(record);	
	}

	
	public void updateByPrimaryKey(Share record) {
		shareMapper.updateByPrimaryKey(record);		
	}


	public PageInfo<Share> findByExample(ShareExample example, Pagination p) {
		PageHelper.startPage(p.getPage(), p.getSize());
		List<Share> list = this.findByExample(example);
		return new PageInfo<Share>(list);
	}

}
