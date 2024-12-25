package com.api.tests;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.pojo.request.SignUpRequest;
import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class AccountCreationTest {

	@Test(description = "Verify if the signup is working")

	public void createAccountTest() {
		SignUpRequest signUpRequest = new SignUpRequest.Builder().username("niketaws123").password("Niket@123")
				.email("niketawspractice123@gmail.com").firstName("Niket").lastName("Patil").mobileNumber("9949791497").build();

		AuthService authservice = new AuthService();
		Response response = authservice.signUp(signUpRequest);
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
	}
}
