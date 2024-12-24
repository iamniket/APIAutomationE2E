package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.pojo.request.LoginRequest;
import com.api.pojo.response.LoginResponse;
import com.api.pojo.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileTest {

	@Test(description = "Verify if the Get Profile is working")
	public void getProfileTest() {

		AuthService authservice = new AuthService();
		Response response = authservice.login(new LoginRequest("uday1234", "uday1234"));
		LoginResponse loginResponse=response.as(LoginResponse.class);
		
		UserManagementService userManagementService = new UserManagementService();
		response =userManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		System.out.println(userProfileResponse.getEmail());
	}
}
