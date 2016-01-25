package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.User;
import com.hontee.commons.db.entity.UserExample;
import com.hontee.commons.support.Pager;

public interface UserService extends Pager<User, UserExample> {
	
	int countByExample(UserExample example);

    void deleteByExample(UserExample example);

    void deleteByPrimaryKey(Long id);

    void add(User record);

    void addSelective(User record);

    List<User> findByExample(UserExample example);

    User findByPrimaryKey(Long id);

    void updateByExampleSelective(User record, UserExample example);

    void updateByExample(User record, UserExample example);

    void updateByPrimaryKeySelective(User record);

    void updateByPrimaryKey(User record);

}
