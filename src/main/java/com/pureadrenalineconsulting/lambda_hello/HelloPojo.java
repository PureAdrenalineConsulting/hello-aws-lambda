package com.pureadrenalineconsulting.lambda_hello;

import com.amazonaws.services.lambda.runtime.Context;
import com.pureadrenalineconsulting.lambda_hello.domain.Request;
import com.pureadrenalineconsulting.lambda_hello.domain.Response;

public class HelloPojo {
	public Response myHandler(Request request, Context context) {
		String greetingString = String.format("Hello %s, %s.", request.getFirstName(), request.getLastName());
		return new Response(greetingString);
	}
}
