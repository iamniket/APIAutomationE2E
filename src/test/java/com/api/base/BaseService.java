package com.api.base;

import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import com.api.filters.LoggingFilters;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BaseService {
	private static final String BASE_URL = "http://64.227.160.186:8080/";
	private RequestSpecification requestSpecification;
	
	static{
		RestAssured.filters(new LoggingFilters());
	}

	public BaseService() {
		requestSpecification = given().baseUri(BASE_URL);
	}

	protected void setAuthToken(String token) {
		requestSpecification.header("Authorization", "Bearer " + token);
	}

	protected Response postRequest(Object payload, String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	protected Response putRequest(Object payload, String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
	}

	protected Response getRequest(String endpoint) {
		return requestSpecification.get(endpoint);
	}

}
