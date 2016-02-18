package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Share;
import com.hontee.commons.db.entity.ShareExample;
import com.hontee.commons.support.Pager;

public interface ShareService extends Pager<Share, ShareExample> {

	int countByExample(ShareExample example) throws Exception;

	void deleteByExample(ShareExample example) throws Exception;

	void deleteByPrimaryKey(Long id) throws Exception;
	
	void deleteBatch(List<Long> list) throws Exception;

	void add(Share record) throws Exception;

	List<Share> findByExample(ShareExample example) throws Exception;

	Share findByPrimaryKey(Long id) throws Exception;

	void updateByExampleSelective(Share record, ShareExample example) throws Exception;

	void updateByExample(Share record, ShareExample example) throws Exception;

	void updateByPrimaryKeySelective(Share record) throws Exception;

	void updateByPrimaryKey(Share record) throws Exception;

}
