package com.luke.foundation.web;

public class InternalServerError extends RuntimeException {
	public InternalServerError() {
	}

	public InternalServerError(String message) {
		super(message);
	}
}
