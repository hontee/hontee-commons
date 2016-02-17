package com.hontee.commons.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hontee.commons.db.dao.FollowGroupMapper;
import com.hontee.commons.db.dao.FollowPostMapper;
import com.hontee.commons.db.dao.FollowUserMapper;
import com.hontee.commons.db.entity.FollowGroup;
import com.hontee.commons.db.entity.FollowPost;
import com.hontee.commons.db.entity.FollowUser;
import com.hontee.commons.exception.BusinessException;
import com.hontee.commons.service.FollowService;

@Service
public class FollowServiceImpl implements FollowService {

	@Resource
	private FollowGroupMapper fgMapper;

	@Resource
	private FollowPostMapper fpMapper;

	@Resource
	private FollowUserMapper fuMapper;

	public void unfollowGroup(Long userId, Long groupId) throws BusinessException {
		fgMapper.deleteByPrimaryKey(userId, groupId);
	}

	public void followGroup(FollowGroup record) throws BusinessException {
		fgMapper.insert(record);
	}

	public void unfollowPost(Long userId, Long postId) throws BusinessException {
		fpMapper.deleteByPrimaryKey(userId, postId);
	}

	public void followPost(FollowPost record) throws BusinessException {
		fpMapper.insert(record);
	}

	public void unfollowUser(Long userId, Long followId) throws BusinessException {
		fuMapper.deleteByPrimaryKey(userId, followId);
	}

	public void followUser(FollowUser record) throws BusinessException {
		fuMapper.insert(record);
	}

}
