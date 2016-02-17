package com.hontee.commons.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.PlatformMapper;
import com.hontee.commons.db.entity.Platform;
import com.hontee.commons.db.entity.PlatformExample;
import com.hontee.commons.exception.BusinessException;
import com.hontee.commons.service.PlatformService;
import com.hontee.commons.support.Pagination;

@Service
public class PlatformServiceImpl implements PlatformService {

	@Autowired
	private PlatformMapper platformMapper;

	public int countByExample(PlatformExample example) throws BusinessException {
		return platformMapper.countByExample(example);
	}

	public List<Platform> findByExample(PlatformExample example) throws BusinessException {
		return platformMapper.selectByExample(example);
	}

	public Platform findByPrimaryKey(Long id) throws BusinessException {
		return platformMapper.selectByPrimaryKey(id);
	}

	public PageInfo<Platform> findByExample(PlatformExample example, Pagination p) throws BusinessException {
		PageHelper.startPage(p.getPage(), p.getRows(), p.getOrderByClause());
		List<Platform> list = this.findByExample(example);
		return new PageInfo<Platform>(list);
	}

	public void deleteByExample(PlatformExample example) throws BusinessException {
		platformMapper.deleteByExample(example);
	}

	public void deleteByPrimaryKey(Long id) throws BusinessException {
		platformMapper.deleteByPrimaryKey(id);
	}

	public void deleteBatch(List<Long> list) throws BusinessException {
		platformMapper.deleteBatch(list);
	}

	public void add(Platform record) throws BusinessException {
		platformMapper.insert(record);
	}

	public void addSelective(Platform record) throws BusinessException {
		platformMapper.insertSelective(record);
	}

	public void updateByExampleSelective(Platform record, PlatformExample example) throws BusinessException {
		platformMapper.updateByExampleSelective(record, example);
	}

	public void updateByExample(Platform record, PlatformExample example) throws BusinessException {
		platformMapper.updateByExample(record, example);
	}

	public void updateByPrimaryKeySelective(Platform record) throws BusinessException {
		platformMapper.updateByPrimaryKeySelective(record);
	}

	public void updateByPrimaryKey(Platform record) throws BusinessException {
		platformMapper.updateByPrimaryKey(record);
	}

}
