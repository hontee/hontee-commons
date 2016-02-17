package com.hontee.commons.db.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hontee.commons.db.entity.Platform;
import com.hontee.commons.db.entity.PlatformExample;

public interface PlatformMapper {
    int countByExample(PlatformExample example);

    int deleteByExample(PlatformExample example);

    int deleteByPrimaryKey(Long id);
    
    int deleteBatch(List<Long> list);

    int insert(Platform record);

    int insertSelective(Platform record);

    List<Platform> selectByExample(PlatformExample example);

    Platform selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Platform record, @Param("example") PlatformExample example);

    int updateByExample(@Param("record") Platform record, @Param("example") PlatformExample example);

    int updateByPrimaryKeySelective(Platform record);

    int updateByPrimaryKey(Platform record);
}