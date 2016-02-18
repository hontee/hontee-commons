package com.hontee.commons.db.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hontee.commons.db.entity.User;
import com.hontee.commons.db.entity.UserExample;

public interface UserMapper {
	
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);
    
    int deleteBatch(List<Long> list);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKey(User record);
}