package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.GroupMapper;
import com.hontee.commons.db.dao.GroupPostMapper;
import com.hontee.commons.db.entity.Group;
import com.hontee.commons.db.entity.GroupExample;
import com.hontee.commons.db.entity.GroupPost;
import com.hontee.commons.service.GroupService;
import com.hontee.commons.support.Pagination;

@Service
public class GroupServiceImpl implements GroupService {
	
	@Resource
	private GroupMapper groupMapper;
	
	@Resource
	private GroupPostMapper gpMapper;

	
	public int countByExample(GroupExample example) {
		return groupMapper.countByExample(example);
	}

	
	public void deleteByExample(GroupExample example) {
		groupMapper.deleteByExample(example);
	}

	
	public void deleteByPrimaryKey(Long id) {
		groupMapper.deleteByPrimaryKey(id);		
	}

	
	public void add(Group record) {
		groupMapper.insert(record);		
	}

	
	public void addSelective(Group record) {
		groupMapper.insertSelective(record);		
	}

	
	public List<Group> findByExample(GroupExample example) {
		return groupMapper.selectByExample(example);
	}

	
	public Group findByPrimaryKey(Long id) {
		return groupMapper.selectByPrimaryKey(id);
	}

	
	public void updateByExampleSelective(Group record, GroupExample example) {
		groupMapper.updateByExampleSelective(record, example);
	}

	
	public void updateByExample(Group record, GroupExample example) {
		groupMapper.updateByExample(record, example);
	}

	
	public void updateByPrimaryKeySelective(Group record) {
		groupMapper.updateByPrimaryKeySelective(record);
	}

	
	public void updateByPrimaryKey(Group record) {
		groupMapper.updateByPrimaryKey(record);
	}

	
	public void unfollowPost(Long groupId, Long postId) {
		gpMapper.deleteByPrimaryKey(groupId, postId);
	}

	
	public void followPost(GroupPost record) {
		gpMapper.insert(record);
	}

	public PageInfo<Group> findByExample(GroupExample example, Pagination p) {
		PageHelper.startPage(p.getPage(), p.getSize());
		List<Group> list = this.findByExample(example);
		return new PageInfo<Group>(list);
	}

}
