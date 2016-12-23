package com.pureadrenalineconsulting.lambda_hello.domain;

public class Response {
	private String greeting;

	public Response() {
	}

	public Response(String greeting) {
		this.greeting = greeting;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
