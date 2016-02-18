package com.hontee.commons.db.dao;

import com.hontee.commons.db.entity.Post;
import com.hontee.commons.db.entity.PostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostMapper {
	
    int countByExample(PostExample example);

    int deleteByExample(PostExample example);

    int deleteByPrimaryKey(Long id);
    
    int deleteBatch(List<Long> list);

    int insertSelective(Post record);

    List<Post> selectByExample(PostExample example);

    Post selectByPrimaryKey(Long id);

    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    int updateByPrimaryKey(Post record);
}