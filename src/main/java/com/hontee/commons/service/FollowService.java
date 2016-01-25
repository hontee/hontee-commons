package com.hontee.commons.service;

import com.hontee.commons.db.entity.FollowGroup;
import com.hontee.commons.db.entity.FollowPost;
import com.hontee.commons.db.entity.FollowUser;

public interface FollowService {
	
	/**
	 * 取消关注Group
	 * @param userId
	 * @param groupId
	 * @return
	 */
	void unfollowGroup(Long userId, Long groupId);

	/**
	 * 添加关注Group
	 * @param record
	 * @return
	 */
    void followGroup(FollowGroup record);
    
    /**
     * 取消关注Post
     * @param userId
     * @param postId
     */
    void unfollowPost(Long userId, Long postId);

    /**
     * 添加关注Post
     * @param record
     */
    void followPost(FollowPost record);
    
    /**
     * 取消关注用户
     * @param userId
     * @param followId
     * @return
     */
    void unfollowUser(Long userId, Long followId);

    /**
     * 添加关注用户
     * @param record
     * @return
     */
    void followUser(FollowUser record);

}
