package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Platform;
import com.hontee.commons.db.entity.PlatformExample;
import com.hontee.commons.support.Pager;

public interface PlatformService extends Pager<Platform, PlatformExample> {

	int countByExample(PlatformExample example);

	void deleteByExample(PlatformExample example);

	void deleteByPrimaryKey(Long id);

	void add(Platform record);

	void addSelective(Platform record);

	List<Platform> findByExample(PlatformExample example);

	Platform findByPrimaryKey(Long id);

	void updateByExampleSelective(Platform record, PlatformExample example);

	void updateByExample(Platform record, PlatformExample example);

	void updateByPrimaryKeySelective(Platform record);

	void updateByPrimaryKey(Platform record);

}
