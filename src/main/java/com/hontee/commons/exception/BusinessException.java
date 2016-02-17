package com.hontee.commons.exception;

/**
 * 业务处理异常
 * @author larry.qi
 *
 */
public class BusinessException extends Exception {

	private static final long serialVersionUID = 8855310217884985937L;

	public BusinessException() {
		super("业务处理异常。");
	}

	public BusinessException(String message, Throwable cause) {
		super("业务处理异常：" + message, cause);
	}

	public BusinessException(String message) {
		super("业务处理异常：" + message);
	}

	public BusinessException(Throwable cause) {
		super("业务处理异常。", cause);
	}

}
