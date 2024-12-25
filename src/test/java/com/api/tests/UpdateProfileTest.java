package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.pojo.request.LoginRequest;
import com.api.pojo.request.UpdateProfileRequest;
import com.api.pojo.response.LoginResponse;
import com.api.pojo.response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {

	@Test (description="Verify if the update API is working")
	public void updateProfile() {
		AuthService authservice = new AuthService();
		Response response = authservice.login(new LoginRequest("niketaws", "Niket@123"));
		LoginResponse loginResponse=response.as(LoginResponse.class);
		
		UserManagementService userManagementService = new UserManagementService();
		response =userManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		System.out.println(userProfileResponse.getEmail());
		
		UpdateProfileRequest updateProfileRequest = new UpdateProfileRequest.Builder().firstName("Samdish").lastName("Patil")
				.email("niketawspractice@gmail.com").mobileNumber("2356987456").build();
		response =userManagementService.updateProfile(loginResponse.getToken(), updateProfileRequest);
		System.out.println(response.asPrettyString());
	}

}
