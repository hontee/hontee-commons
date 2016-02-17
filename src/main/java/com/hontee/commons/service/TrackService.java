package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Track;
import com.hontee.commons.db.entity.TrackExample;
import com.hontee.commons.support.Pager;

public interface TrackService extends Pager<Track, TrackExample> {
	
	int countByExample(TrackExample example) throws Exception;

	void deleteByExample(TrackExample example) throws Exception;

	void deleteByPrimaryKey(Long id) throws Exception;
	
	void deleteBatch(List<Long> list) throws Exception;

	void add(Track record) throws Exception;

	void addSelective(Track record) throws Exception;

	List<Track> findByExampleWithBLOBs(TrackExample example) throws Exception;

	List<Track> findByExample(TrackExample example) throws Exception;

	Track findByPrimaryKey(Long id) throws Exception;

	void updateByExampleSelective(Track record, TrackExample example) throws Exception;
	
	void updateByExampleWithBLOBs(Track record, TrackExample example) throws Exception;

	void updateByExample(Track record, TrackExample example) throws Exception;

	void updateByPrimaryKeySelective(Track record) throws Exception;

	void updateByPrimaryKeyWithBLOBs(Track record) throws Exception;

	void updateByPrimaryKey(Track record) throws Exception;

}
