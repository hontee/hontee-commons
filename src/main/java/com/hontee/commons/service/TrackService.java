package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Track;
import com.hontee.commons.db.entity.TrackExample;
import com.hontee.commons.support.Pager;

public interface TrackService extends Pager<Track, TrackExample> {
	
	int countByExample(TrackExample example);

	void deleteByExample(TrackExample example);

	void deleteByPrimaryKey(Long id);

	void add(Track record);

	void addSelective(Track record);

	List<Track> findByExampleWithBLOBs(TrackExample example);

	List<Track> findByExample(TrackExample example);

	Track findByPrimaryKey(Long id);

	void updateByExampleSelective(Track record, TrackExample example);
	
	void updateByExampleWithBLOBs(Track record, TrackExample example);

	void updateByExample(Track record, TrackExample example);

	void updateByPrimaryKeySelective(Track record);

	void updateByPrimaryKeyWithBLOBs(Track record);

	void updateByPrimaryKey(Track record);

}
