package com.luke.foundation.web;

public class WrongParameters extends RuntimeException {

	public WrongParameters() {
	}

	public WrongParameters(String message) {
		super(message);
	}

}
