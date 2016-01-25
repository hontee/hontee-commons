package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hontee.commons.db.dao.PostMapper;
import com.hontee.commons.db.entity.Post;
import com.hontee.commons.db.entity.PostExample;
import com.hontee.commons.service.PostService;

@Service
public class PostServiceImpl implements PostService {
	
	@Resource
	private PostMapper postMapper;

	
	public int countByExample(PostExample example) {
		return postMapper.countByExample(example);
	}

	
	public void deleteByExample(PostExample example) {
		postMapper.deleteByExample(example);		
	}

	
	public void deleteByPrimaryKey(Long id) {
		postMapper.deleteByPrimaryKey(id);		
	}

	
	public void add(Post record) {
		postMapper.insert(record);		
	}

	
	public void addSelective(Post record) {
		postMapper.insertSelective(record);		
	}

	
	public List<Post> findByExample(PostExample example) {
		return postMapper.selectByExample(example);
	}

	
	public Post findByPrimaryKey(Long id) {
		return postMapper.selectByPrimaryKey(id);
	}

	
	public void updateByExampleSelective(Post record, PostExample example) {
		postMapper.updateByExampleSelective(record, example);		
	}

	
	public void updateByExample(Post record, PostExample example) {
		postMapper.updateByExample(record, example);		
	}

	
	public void updateByPrimaryKeySelective(Post record) {
		postMapper.updateByPrimaryKeySelective(record);
	}

	
	public void updateByPrimaryKey(Post record) {
		postMapper.updateByPrimaryKey(record);
	}

}
