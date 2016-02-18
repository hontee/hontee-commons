package com.hontee.commons.db.dao;

import com.hontee.commons.db.entity.Track;
import com.hontee.commons.db.entity.TrackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrackMapper {
	
    int countByExample(TrackExample example);

    int deleteByExample(TrackExample example);

    int deleteByPrimaryKey(Long id);
    
    int deleteBatch(List<Long> list);

    int insertSelective(Track record);

    List<Track> selectByExampleWithBLOBs(TrackExample example);

    List<Track> selectByExample(TrackExample example);

    Track selectByPrimaryKey(Long id);

    int updateByExample(@Param("record") Track record, @Param("example") TrackExample example);

    int updateByPrimaryKey(Track record);
}