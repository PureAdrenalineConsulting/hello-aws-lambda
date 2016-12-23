package com.pureadrenalineconsulting.lambda_hello.domain;

public class Request {
	private String firstName;
	private String lastName;

	public Request() {
	}

	public Request(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first) {
		this.firstName = first;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last) {
		this.lastName = last;
	}
}
