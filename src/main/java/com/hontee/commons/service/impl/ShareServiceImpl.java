package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.ShareMapper;
import com.hontee.commons.db.entity.Share;
import com.hontee.commons.db.entity.ShareExample;
import com.hontee.commons.exception.BusinessException;
import com.hontee.commons.service.ShareService;
import com.hontee.commons.support.Pagination;

@Service
public class ShareServiceImpl implements ShareService {

	@Resource
	private ShareMapper shareMapper;

	public int countByExample(ShareExample example) throws BusinessException {
		return shareMapper.countByExample(example);
	}

	public void deleteByExample(ShareExample example) throws BusinessException {
		shareMapper.deleteByExample(example);
	}

	public void deleteByPrimaryKey(Long id) throws BusinessException {
		shareMapper.deleteByPrimaryKey(id);
	}
	
	public void deleteBatch(List<Long> list) throws Exception {
		shareMapper.deleteBatch(list);
	}

	public void add(Share record) throws BusinessException {
		shareMapper.insertSelective(record);
	}

	public List<Share> findByExample(ShareExample example) throws BusinessException {
		return shareMapper.selectByExample(example);
	}

	public Share findByPrimaryKey(Long id) throws BusinessException {
		return shareMapper.selectByPrimaryKey(id);
	}

	public void updateByExample(Share record, ShareExample example) throws BusinessException {
		shareMapper.updateByExample(record, example);
	}

	public void updateByPrimaryKey(Share record) throws BusinessException {
		shareMapper.updateByPrimaryKey(record);
	}

	public PageInfo<Share> findByExample(ShareExample example, Pagination p) throws BusinessException {
		PageHelper.startPage(p.getPage(), p.getRows(), p.getOrderByClause());
		List<Share> list = this.findByExample(example);
		return new PageInfo<Share>(list);
	}

}
