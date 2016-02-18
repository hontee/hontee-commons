package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Menu;
import com.hontee.commons.db.entity.MenuExample;
import com.hontee.commons.support.Pager;

public interface MenuService extends Pager<Menu, MenuExample> {
	
	int countByExample(MenuExample example) throws Exception;

    void deleteByExample(MenuExample example) throws Exception;

    void deleteByPrimaryKey(Long id) throws Exception;
    
    void deleteBatch(List<Long> list) throws Exception;

    void add(Menu record) throws Exception;

    List<Menu> findByExample(MenuExample example) throws Exception;

    Menu findByPrimaryKey(Long id) throws Exception;

    void updateByExample(Menu record, MenuExample example) throws Exception;

    void updateByPrimaryKey(Menu record) throws Exception;

}
