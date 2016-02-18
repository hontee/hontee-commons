package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Platform;
import com.hontee.commons.db.entity.PlatformExample;
import com.hontee.commons.support.Pager;

public interface PlatformService extends Pager<Platform, PlatformExample> {

	int countByExample(PlatformExample example) throws Exception;

	void deleteByExample(PlatformExample example) throws Exception;

	void deleteByPrimaryKey(Long id) throws Exception;
	
	void deleteBatch(List<Long> list) throws Exception;

	void add(Platform record) throws Exception;

	List<Platform> findByExample(PlatformExample example) throws Exception;

	Platform findByPrimaryKey(Long id) throws Exception;

	void updateByExample(Platform record, PlatformExample example) throws Exception;

	void updateByPrimaryKey(Platform record) throws Exception;

}
