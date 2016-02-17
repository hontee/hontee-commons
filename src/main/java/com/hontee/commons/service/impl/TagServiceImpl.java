package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.TagMapper;
import com.hontee.commons.db.entity.Tag;
import com.hontee.commons.db.entity.TagExample;
import com.hontee.commons.exception.BusinessException;
import com.hontee.commons.service.TagService;
import com.hontee.commons.support.Pagination;

@Service
public class TagServiceImpl implements TagService {

	@Resource
	private TagMapper tagMapper;

	public int countByExample(TagExample example) throws BusinessException {
		return tagMapper.countByExample(example);
	}

	public void deleteByExample(TagExample example) throws BusinessException {
		tagMapper.deleteByExample(example);
	}

	public void deleteByPrimaryKey(Long id) throws BusinessException {
		tagMapper.deleteByPrimaryKey(id);
	}

	public void deleteBatch(List<Long> list) throws Exception {
		tagMapper.deleteBatch(list);
	}

	public void add(Tag record) throws BusinessException {
		tagMapper.insert(record);
	}

	public void addSelective(Tag record) throws BusinessException {
		tagMapper.insertSelective(record);
	}

	public List<Tag> findByExample(TagExample example) throws BusinessException {
		return tagMapper.selectByExample(example);
	}

	public Tag findByPrimaryKey(Long id) throws BusinessException {
		return tagMapper.selectByPrimaryKey(id);
	}

	public void updateByExampleSelective(Tag record, TagExample example) throws BusinessException {
		tagMapper.updateByExampleSelective(record, example);
	}

	public void updateByExample(Tag record, TagExample example) throws BusinessException {
		tagMapper.updateByExample(record, example);
	}

	public void updateByPrimaryKeySelective(Tag record) throws BusinessException {
		tagMapper.updateByPrimaryKeySelective(record);
	}

	public void updateByPrimaryKey(Tag record) throws BusinessException {
		tagMapper.updateByPrimaryKey(record);
	}

	public PageInfo<Tag> findByExample(TagExample example, Pagination p) throws BusinessException {
		PageHelper.startPage(p.getPage(), p.getRows(), p.getOrderByClause());
		List<Tag> list = this.findByExample(example);
		return new PageInfo<Tag>(list);
	}

}
