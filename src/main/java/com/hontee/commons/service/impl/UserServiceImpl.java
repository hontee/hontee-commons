package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.UserMapper;
import com.hontee.commons.db.entity.User;
import com.hontee.commons.db.entity.UserExample;
import com.hontee.commons.exception.BusinessException;
import com.hontee.commons.service.UserService;
import com.hontee.commons.support.Pagination;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	public int countByExample(UserExample example) throws BusinessException {
		return userMapper.countByExample(example);
	}

	public void deleteByExample(UserExample example) throws BusinessException {
		userMapper.deleteByExample(example);
	}

	public void deleteByPrimaryKey(Long id) throws BusinessException {
		userMapper.deleteByPrimaryKey(id);
	}
	
	public void deleteBatch(List<Long> list) throws Exception {
		userMapper.deleteBatch(list);
	}

	public void add(User record) throws BusinessException {
		userMapper.insert(record);
	}

	public void addSelective(User record) throws BusinessException {
		userMapper.insertSelective(record);
	}

	public List<User> findByExample(UserExample example) throws BusinessException {
		return userMapper.selectByExample(example);
	}

	public User findByPrimaryKey(Long id) throws BusinessException {
		return userMapper.selectByPrimaryKey(id);
	}

	public void updateByExampleSelective(User record, UserExample example) throws BusinessException {
		userMapper.updateByExampleSelective(record, example);
	}

	public void updateByExample(User record, UserExample example) throws BusinessException {
		userMapper.updateByExample(record, example);
	}

	public void updateByPrimaryKeySelective(User record) throws BusinessException {
		userMapper.updateByPrimaryKeySelective(record);
	}

	public void updateByPrimaryKey(User record) throws BusinessException {
		userMapper.updateByPrimaryKey(record);
	}

	public PageInfo<User> findByExample(UserExample example, Pagination p) throws BusinessException {
		PageHelper.startPage(p.getPage(), p.getRows(), p.getOrderByClause());
		List<User> list = this.findByExample(example);
		return new PageInfo<User>(list);
	}

}
