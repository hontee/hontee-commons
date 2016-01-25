package com.hontee.commons.support;

/**
 * 分页组件
 * @author larry.qi
 */
public class Pagination {

	public static final int PAGE = 1;
	public static final int SIZE = 20;
	public static final Pagination DEFAULT = new Pagination();

	private int page;
	private int size;

	public Pagination() {
		this.page = PAGE;
		this.size = SIZE;
	}

	public Pagination(int page, int size) {
		this.page = page;
		this.size = size;
	}

	public int getPage() {
		return page;
	}

	public int getSize() {
		return size;
	}

}
