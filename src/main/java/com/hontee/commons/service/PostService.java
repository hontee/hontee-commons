package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Post;
import com.hontee.commons.db.entity.PostExample;
import com.hontee.commons.support.Pager;

public interface PostService extends Pager<Post, PostExample> {

	int countByExample(PostExample example) throws Exception;

	void deleteByExample(PostExample example) throws Exception;

	void deleteByPrimaryKey(Long id) throws Exception;
	
	void deleteBatch(List<Long> list) throws Exception;

	void add(Post record) throws Exception;

	void addSelective(Post record) throws Exception;

	List<Post> findByExample(PostExample example) throws Exception;

	Post findByPrimaryKey(Long id) throws Exception;

	void updateByExampleSelective(Post record, PostExample example) throws Exception;

	void updateByExample(Post record, PostExample example) throws Exception;

	void updateByPrimaryKeySelective(Post record) throws Exception;

	void updateByPrimaryKey(Post record) throws Exception;
}
