package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.pojo.request.LoginRequest;
import com.api.pojo.response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest {

	@Test(description = "Verify if the login API is working..")
	public void loginTest() {
		LoginRequest loginRequest = new LoginRequest("niketaws", "Niket@123");
		AuthService authservice = new AuthService();
		Response response = authservice.login(loginRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.statusCode(), 200);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());

	}

}
