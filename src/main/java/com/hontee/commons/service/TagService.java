package com.hontee.commons.service;

import java.util.List;

import com.hontee.commons.db.entity.Tag;
import com.hontee.commons.db.entity.TagExample;
import com.hontee.commons.support.Pager;

public interface TagService extends Pager<Tag, TagExample> {
	
	int countByExample(TagExample example) throws Exception;

    void deleteByExample(TagExample example) throws Exception;

    void deleteByPrimaryKey(Long id) throws Exception;
    
    void deleteBatch(List<Long> list) throws Exception;

    void add(Tag record) throws Exception;

    List<Tag> findByExample(TagExample example) throws Exception;

    Tag findByPrimaryKey(Long id) throws Exception;

    void updateByExample(Tag record, TagExample example) throws Exception;

    void updateByPrimaryKey(Tag record) throws Exception;

}
