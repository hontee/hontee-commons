package com.hontee.commons.db.dao;

import com.hontee.commons.db.entity.Menu;
import com.hontee.commons.db.entity.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
	
    int countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Long id);
    
    int deleteBatch(List<Long> list);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Long id);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKey(Menu record);
}