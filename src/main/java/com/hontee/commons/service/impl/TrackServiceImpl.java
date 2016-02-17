package com.hontee.commons.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hontee.commons.db.dao.TrackMapper;
import com.hontee.commons.db.entity.Track;
import com.hontee.commons.db.entity.TrackExample;
import com.hontee.commons.exception.BusinessException;
import com.hontee.commons.service.TrackService;
import com.hontee.commons.support.Pagination;

@Service
public class TrackServiceImpl implements TrackService {

	@Resource
	private TrackMapper trackMapper;

	public int countByExample(TrackExample example) throws BusinessException {
		return trackMapper.countByExample(example);
	}

	public void deleteByExample(TrackExample example) throws BusinessException {
		trackMapper.deleteByExample(example);
	}

	public void deleteByPrimaryKey(Long id) throws BusinessException {
		trackMapper.deleteByPrimaryKey(id);
	}
	
	public void deleteBatch(List<Long> list) throws Exception {
		trackMapper.deleteBatch(list);
	}

	public void add(Track record) throws BusinessException {
		trackMapper.insert(record);
	}

	public void addSelective(Track record) throws BusinessException {
		trackMapper.insertSelective(record);
	}

	public List<Track> findByExampleWithBLOBs(TrackExample example) throws BusinessException {
		return trackMapper.selectByExampleWithBLOBs(example);
	}

	public List<Track> findByExample(TrackExample example) throws BusinessException {
		return trackMapper.selectByExample(example);
	}

	public Track findByPrimaryKey(Long id) throws BusinessException {
		return trackMapper.selectByPrimaryKey(id);
	}

	public void updateByExampleSelective(Track record, TrackExample example) throws BusinessException {
		trackMapper.updateByExampleSelective(record, example);
	}

	public void updateByExampleWithBLOBs(Track record, TrackExample example) throws BusinessException {
		trackMapper.updateByExampleWithBLOBs(record, example);
	}

	public void updateByExample(Track record, TrackExample example) throws BusinessException {
		trackMapper.updateByExample(record, example);
	}

	public void updateByPrimaryKeySelective(Track record) throws BusinessException {
		trackMapper.updateByPrimaryKeySelective(record);

	}

	public void updateByPrimaryKeyWithBLOBs(Track record) throws BusinessException {
		trackMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	public void updateByPrimaryKey(Track record) throws BusinessException {
		trackMapper.updateByPrimaryKey(record);
	}

	public PageInfo<Track> findByExample(TrackExample example, Pagination p) throws BusinessException {
		PageHelper.startPage(p.getPage(), p.getRows(), p.getOrderByClause());
		List<Track> list = this.findByExample(example);
		return new PageInfo<Track>(list);
	}

}
