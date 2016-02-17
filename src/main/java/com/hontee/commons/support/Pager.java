package com.hontee.commons.support;

import com.github.pagehelper.PageInfo;
import com.hontee.commons.exception.BusinessException;

public interface Pager<T, S> {
	
	/**
	 * 带分页的条件查询
	 * @param example
	 * @param p
	 * @return
	 */
	PageInfo<T> findByExample(S example, Pagination p) throws BusinessException;

}
