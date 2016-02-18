package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.User;
import com.hontee.commons.db.entity.UserExample;
import com.hontee.commons.support.Pager;

public interface UserService extends Pager<User, UserExample> {
	
	int countByExample(UserExample example) throws Exception;

    void deleteByExample(UserExample example) throws Exception;

    void deleteByPrimaryKey(Long id) throws Exception;
    
    void deleteBatch(List<Long> list) throws Exception;

    void add(User record) throws Exception;

    List<User> findByExample(UserExample example) throws Exception;

    User findByPrimaryKey(Long id) throws Exception;

    void updateByExampleSelective(User record, UserExample example) throws Exception;

    void updateByExample(User record, UserExample example) throws Exception;

    void updateByPrimaryKeySelective(User record) throws Exception;

    void updateByPrimaryKey(User record) throws Exception;

}
