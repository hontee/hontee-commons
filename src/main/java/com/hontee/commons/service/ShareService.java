package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Share;
import com.hontee.commons.db.entity.ShareExample;

public interface ShareService {

	int countByExample(ShareExample example);

	void deleteByExample(ShareExample example);

	void deleteByPrimaryKey(Long id);

	void add(Share record);

	void addSelective(Share record);

	List<Share> findByExample(ShareExample example);

	Share findByPrimaryKey(Long id);

	void updateByExampleSelective(Share record, ShareExample example);

	void updateByExample(Share record, ShareExample example);

	void updateByPrimaryKeySelective(Share record);

	void updateByPrimaryKey(Share record);

}
