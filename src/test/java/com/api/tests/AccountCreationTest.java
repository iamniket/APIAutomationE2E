package com.api.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.pojo.request.SignUpRequest;
import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description = "Verify if the signup is working")

	public void createAccountTest() {
		SignUpRequest signUpRequest = new SignUpRequest.Builder().username("Samu").password("Samu123")
				.email("Samunik@gmail.com").firstName("Samdish").lastName("Patil").mobileNumber("9881178574").build();

		AuthService authservice = new AuthService();
		Response response = authservice.signUp(signUpRequest);
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
	}
}
