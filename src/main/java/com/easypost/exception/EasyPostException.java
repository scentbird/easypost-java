package com.easypost.exception;

import com.easypost.model.ErrorCollection;

public class EasyPostException extends Exception {

	private static final long serialVersionUID = 1L;
	private final String param;
	private ErrorCollection error;

	public EasyPostException(String message) {
		super(message, null);
		this.param = null;
	}

	public EasyPostException(String message, ErrorCollection error) {
		super(message, null);
		this.param = null;
		this.error = error;
	}

	public EasyPostException(String message, Throwable e) {
		super(message, e);
		this.param = null;
	}

	public EasyPostException(String message, String param, Throwable e) {
		super(message, e);
		this.param = param;
	}

	public String getParam() {
		return param;
	}

	public ErrorCollection getError() {
		return error;
	}

}
