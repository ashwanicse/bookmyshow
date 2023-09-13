package com.bookmyshow.exceptions;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 807092338568490853L;

	private int code;

	public CustomException(int code, String message) {
		super(message);
		this.setCode(code);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
