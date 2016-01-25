package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Tag;
import com.hontee.commons.db.entity.TagExample;

public interface TagService {
	
	int countByExample(TagExample example);

    void deleteByExample(TagExample example);

    void deleteByPrimaryKey(Long id);

    void add(Tag record);

    void addSelective(Tag record);

    List<Tag> findByExample(TagExample example);

    Tag findByPrimaryKey(Long id);

    void updateByExampleSelective(Tag record, TagExample example);

    void updateByExample(Tag record, TagExample example);

    void updateByPrimaryKeySelective(Tag record);

    void updateByPrimaryKey(Tag record);

}
