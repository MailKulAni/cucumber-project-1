package com.ani.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	@Given("any logged-out user")
	public void loggedoutUser() {
		System.out.println("make sure that user is logged-out user");
	}
	
	@And("user lands on login page")
	public void userLandsOnLoginPage() {
		System.out.println("user lands on login paage");
	}
	
	@And("such user has valid user credentials")
	public void makeSureToUseValidCredentialsToLogin() {
		System.out.println("make sure to use valid user credentials for login purpose");
	}

	@When("user enters valid username")
	public void userEntersValidUserName() {
		System.out.println("user enters valid username");
	}
	
	@And("user enters valid password")
	public void userEntersValidPassword() {
		System.out.println("user enters valid pwd");
	}
	
	@And("user clicks on login button")
	public void clickOnLoginbtn() {
		System.out.println("User clicks on login button");
	}
	
	@Then("user should be able to login successfully")
	public void loginSuccess() {
		System.out.println("user should be able to login successfully");
	}

	@And("user should land on profile page")
	public void profilePageAfterLoginSuccess() {
		System.out.println("land on profile page after successful login");
	}
	
}
