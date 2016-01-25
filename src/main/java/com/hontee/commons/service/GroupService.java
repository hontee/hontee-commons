package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Group;
import com.hontee.commons.db.entity.GroupExample;
import com.hontee.commons.db.entity.GroupPost;
import com.hontee.commons.support.Pager;

public interface GroupService extends Pager<Group, GroupExample> {
	
	int countByExample(GroupExample example);

    void deleteByExample(GroupExample example);

    void deleteByPrimaryKey(Long id);

    void add(Group record);

    void addSelective(Group record);

    List<Group> findByExample(GroupExample example);
    
    Group findByPrimaryKey(Long id);

    void updateByExampleSelective(Group record, GroupExample example);

    void updateByExample(Group record, GroupExample example);

    void updateByPrimaryKeySelective(Group record);

    void updateByPrimaryKey(Group record);
    
    void unfollowPost(Long groupId, Long postId);

    void followPost(GroupPost record);

}
