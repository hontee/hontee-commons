package com.hontee.commons.db.dao;

import com.hontee.commons.db.entity.Tag;
import com.hontee.commons.db.entity.TagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagMapper {
	
    int countByExample(TagExample example);

    int deleteByExample(TagExample example);

    int deleteByPrimaryKey(Long id);
    
    int deleteBatch(List<Long> list);

    int insertSelective(Tag record);

    List<Tag> selectByExample(TagExample example);

    Tag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tag record, @Param("example") TagExample example);

    int updateByExample(@Param("record") Tag record, @Param("example") TagExample example);

    int updateByPrimaryKeySelective(Tag record);

    int updateByPrimaryKey(Tag record);
}