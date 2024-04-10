package com.sunbeam.exception;

public class ExceptionLineTooLong extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	public ExceptionLineTooLong() {

		this.message = "";
	}

	public ExceptionLineTooLong(String msg) {

		this.message = msg;
	}

	@Override
	public void printStackTrace() {
		System.err.println("Exception :");
		System.err.println("ExceptionLineTooLong: " +  message);
		System.err.println("Field :" + " String");
	}

}
