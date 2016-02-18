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
import com.hontee.commons.exception.BusinessException;
import com.hontee.commons.service.GroupService;
import com.hontee.commons.support.Pagination;

@Service
public class GroupServiceImpl implements GroupService {

	@Resource
	private GroupMapper groupMapper;

	@Resource
	private GroupPostMapper gpMapper;

	public int countByExample(GroupExample example) throws BusinessException {
		return groupMapper.countByExample(example);
	}

	public void deleteByExample(GroupExample example) throws BusinessException {
		groupMapper.deleteByExample(example);
	}

	public void deleteByPrimaryKey(Long id) throws BusinessException {
		groupMapper.deleteByPrimaryKey(id);
	}
	
	public void deleteBatch(List<Long> list) throws Exception {
		groupMapper.deleteBatch(list);
	}

	public void add(Group record) throws BusinessException {
		groupMapper.insertSelective(record);
	}

	public List<Group> findByExample(GroupExample example) throws BusinessException {
		return groupMapper.selectByExample(example);
	}

	public Group findByPrimaryKey(Long id) throws BusinessException {
		return groupMapper.selectByPrimaryKey(id);
	}

	public void updateByExample(Group record, GroupExample example) throws BusinessException {
		groupMapper.updateByExample(record, example);
	}

	public void updateByPrimaryKey(Group record) throws BusinessException {
		groupMapper.updateByPrimaryKey(record);
	}

	public void unfollowPost(Long groupId, Long postId) throws BusinessException {
		gpMapper.deleteByPrimaryKey(groupId, postId);
	}

	public void followPost(GroupPost record) throws BusinessException {
		gpMapper.insert(record);
	}

	public PageInfo<Group> findByExample(GroupExample example, Pagination p) throws BusinessException {
		PageHelper.startPage(p.getPage(), p.getRows(), p.getOrderByClause());
		List<Group> list = this.findByExample(example);
		return new PageInfo<Group>(list);
	}

}
