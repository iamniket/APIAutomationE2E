package com.api.tests;

import org.testng.annotations.Test;
import com.api.base.AuthService;
import io.restassured.response.Response;

public class ForgotPasswordTest {

	@Test(description = "Verify if the forgot password is working")

	public void forgotPasswordTest() {
		AuthService authservice = new AuthService();
		Response response = authservice.forgotPassword("niketawspractice@gmail.com");
		System.out.println(response.asPrettyString());
	}

}
