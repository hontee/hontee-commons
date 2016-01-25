package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.UserMapper;
import com.hontee.commons.db.entity.User;
import com.hontee.commons.db.entity.UserExample;
import com.hontee.commons.service.UserService;
import com.hontee.commons.support.Pagination;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;


	public int countByExample(UserExample example) {
		return userMapper.countByExample(example);
	}


	public void deleteByExample(UserExample example) {
		userMapper.deleteByExample(example);		
	}


	public void deleteByPrimaryKey(Long id) {
		userMapper.deleteByPrimaryKey(id);		
	}


	public void add(User record) {
		userMapper.insert(record);		
	}


	public void addSelective(User record) {
		userMapper.insertSelective(record);		
	}


	public List<User> findByExample(UserExample example) {
		return userMapper.selectByExample(example);
	}


	public User findByPrimaryKey(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}


	public void updateByExampleSelective(User record, UserExample example) {
		userMapper.updateByExampleSelective(record, example);
	}


	public void updateByExample(User record, UserExample example) {
		userMapper.updateByExample(record, example);
	}


	public void updateByPrimaryKeySelective(User record) {
		userMapper.updateByPrimaryKeySelective(record);		
	}


	public void updateByPrimaryKey(User record) {
		userMapper.updateByPrimaryKey(record);
	}


	public PageInfo<User> findByExample(UserExample example, Pagination p) {
		PageHelper.startPage(p.getPage(), p.getSize());
		List<User> list = this.findByExample(example);
		return new PageInfo<User>(list);
	}

}
