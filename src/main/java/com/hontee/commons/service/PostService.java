package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Post;
import com.hontee.commons.db.entity.PostExample;
import com.hontee.commons.support.Pager;

public interface PostService extends Pager<Post, PostExample> {

	int countByExample(PostExample example);

	void deleteByExample(PostExample example);

	void deleteByPrimaryKey(Long id);

	void add(Post record);

	void addSelective(Post record);

	List<Post> findByExample(PostExample example);

	Post findByPrimaryKey(Long id);

	void updateByExampleSelective(Post record, PostExample example);

	void updateByExample(Post record, PostExample example);

	void updateByPrimaryKeySelective(Post record);

	void updateByPrimaryKey(Post record);
}
