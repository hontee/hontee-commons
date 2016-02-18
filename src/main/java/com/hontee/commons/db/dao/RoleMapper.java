package com.hontee.commons.db.dao;

import com.hontee.commons.db.entity.Role;
import com.hontee.commons.db.entity.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
	
    int countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Long id);
    
    int deleteBatch(List<Long> list);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}