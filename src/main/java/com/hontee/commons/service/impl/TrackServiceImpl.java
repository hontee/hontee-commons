package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.TrackMapper;
import com.hontee.commons.db.entity.Track;
import com.hontee.commons.db.entity.TrackExample;
import com.hontee.commons.service.TrackService;
import com.hontee.commons.support.Pagination;

@Service
public class TrackServiceImpl implements TrackService {
	
	@Resource
	private TrackMapper trackMapper;

	
	public int countByExample(TrackExample example) {
		return trackMapper.countByExample(example);
	}

	
	public void deleteByExample(TrackExample example) {
		trackMapper.deleteByExample(example);
	}

	
	public void deleteByPrimaryKey(Long id) {
		trackMapper.deleteByPrimaryKey(id);		
	}

	
	public void add(Track record) {
		trackMapper.insert(record);		
	}

	
	public void addSelective(Track record) {
		trackMapper.insertSelective(record);
	}

	
	public List<Track> findByExampleWithBLOBs(TrackExample example) {
		return trackMapper.selectByExampleWithBLOBs(example);
	}

	
	public List<Track> findByExample(TrackExample example) {
		return trackMapper.selectByExample(example);
	}

	
	public Track findByPrimaryKey(Long id) {
		return trackMapper.selectByPrimaryKey(id);
	}

	
	public void updateByExampleSelective(Track record, TrackExample example) {
		trackMapper.updateByExampleSelective(record, example);		
	}

	
	public void updateByExampleWithBLOBs(Track record, TrackExample example) {
		trackMapper.updateByExampleWithBLOBs(record, example);		
	}

	
	public void updateByExample(Track record, TrackExample example) {
		trackMapper.updateByExample(record, example);
	}

	
	public void updateByPrimaryKeySelective(Track record) {
		trackMapper.updateByPrimaryKeySelective(record);
		
	}

	
	public void updateByPrimaryKeyWithBLOBs(Track record) {
		trackMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	
	public void updateByPrimaryKey(Track record) {
		trackMapper.updateByPrimaryKey(record);
	}


	public PageInfo<Track> findByExample(TrackExample example, Pagination p) {
		PageHelper.startPage(p.getPage(), p.getSize());
		List<Track> list = this.findByExample(example);
		return new PageInfo<Track>(list);
	}

}
