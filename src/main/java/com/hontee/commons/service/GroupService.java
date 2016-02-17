package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Group;
import com.hontee.commons.db.entity.GroupExample;
import com.hontee.commons.db.entity.GroupPost;
import com.hontee.commons.support.Pager;

public interface GroupService extends Pager<Group, GroupExample> {
	
	int countByExample(GroupExample example) throws Exception;

    void deleteByExample(GroupExample example) throws Exception;

    void deleteByPrimaryKey(Long id) throws Exception;
    
    void deleteBatch(List<Long> list) throws Exception;

    void add(Group record) throws Exception;

    void addSelective(Group record) throws Exception;

    List<Group> findByExample(GroupExample example) throws Exception;
    
    Group findByPrimaryKey(Long id) throws Exception;

    void updateByExampleSelective(Group record, GroupExample example) throws Exception;

    void updateByExample(Group record, GroupExample example) throws Exception;

    void updateByPrimaryKeySelective(Group record) throws Exception;

    void updateByPrimaryKey(Group record) throws Exception;
    
    void unfollowPost(Long groupId, Long postId) throws Exception;

    void followPost(GroupPost record) throws Exception;

}
