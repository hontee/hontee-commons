package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.PostMapper;
import com.hontee.commons.db.entity.Post;
import com.hontee.commons.db.entity.PostExample;
import com.hontee.commons.exception.BusinessException;
import com.hontee.commons.service.PostService;
import com.hontee.commons.support.Pagination;

@Service
public class PostServiceImpl implements PostService {

	@Resource
	private PostMapper postMapper;

	public int countByExample(PostExample example) throws BusinessException {
		return postMapper.countByExample(example);
	}

	public void deleteByExample(PostExample example) throws BusinessException {
		postMapper.deleteByExample(example);
	}

	public void deleteByPrimaryKey(Long id) throws BusinessException {
		postMapper.deleteByPrimaryKey(id);
	}
	
	public void deleteBatch(List<Long> list) throws Exception {
		postMapper.deleteBatch(list);
	}

	public void add(Post record) throws BusinessException {
		postMapper.insertSelective(record);
	}

	public List<Post> findByExample(PostExample example) throws BusinessException {
		return postMapper.selectByExample(example);
	}

	public Post findByPrimaryKey(Long id) throws BusinessException {
		return postMapper.selectByPrimaryKey(id);
	}

	public void updateByExampleSelective(Post record, PostExample example) throws BusinessException {
		postMapper.updateByExampleSelective(record, example);
	}

	public void updateByExample(Post record, PostExample example) throws BusinessException {
		postMapper.updateByExample(record, example);
	}

	public void updateByPrimaryKeySelective(Post record) throws BusinessException {
		postMapper.updateByPrimaryKeySelective(record);
	}

	public void updateByPrimaryKey(Post record) throws BusinessException {
		postMapper.updateByPrimaryKey(record);
	}

	public PageInfo<Post> findByExample(PostExample example, Pagination p) throws BusinessException {
		PageHelper.startPage(p.getPage(), p.getRows(), p.getOrderByClause());
		List<Post> list = this.findByExample(example);
		return new PageInfo<Post>(list);
	}

}
