package com.hontee.commons.db.dao;

import com.hontee.commons.db.entity.Share;
import com.hontee.commons.db.entity.ShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShareMapper {
	
    int countByExample(ShareExample example);

    int deleteByExample(ShareExample example);

    int deleteByPrimaryKey(Long id);
    
    int deleteBatch(List<Long> list);

    int insertSelective(Share record);

    List<Share> selectByExample(ShareExample example);

    Share selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Share record, @Param("example") ShareExample example);

    int updateByExample(@Param("record") Share record, @Param("example") ShareExample example);

    int updateByPrimaryKeySelective(Share record);

    int updateByPrimaryKey(Share record);
}