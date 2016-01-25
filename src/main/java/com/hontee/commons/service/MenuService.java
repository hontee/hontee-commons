package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Menu;
import com.hontee.commons.db.entity.MenuExample;

public interface MenuService {
	
	int countByExample(MenuExample example);

    void deleteByExample(MenuExample example);

    void deleteByPrimaryKey(Long id);

    void add(Menu record);

    void addSelective(Menu record);

    List<Menu> findByExample(MenuExample example);

    Menu findByPrimaryKey(Long id);

    void updateByExampleSelective(Menu record, MenuExample example);

    void updateByExample(Menu record, MenuExample example);

    void updateByPrimaryKeySelective(Menu record);

    void updateByPrimaryKey(Menu record);

}
