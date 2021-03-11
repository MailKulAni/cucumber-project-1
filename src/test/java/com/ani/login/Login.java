package com.ani.login;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	@Before
	public void beforeScenario() {
		System.out.println("before annotation -----------------");
	}
	
	@After
	public void afterScenario() {
		System.out.println("after annotation -----------------");
	}
	
	
	@Given("any logged-out user")
	public void loggedoutUser() {
		//System.out.println("make sure that user is logged-out user");
	}
	
	@And("user lands on login page")
	public void userLandsOnLoginPage() {
		//System.out.println("user lands on login page");
	}
	
//	@And("^such user has valid user credentials$")
//	public void makeSureToUseValidCredentialsToLogin() {
//		System.out.println("make sure to use valid user credentials for login purpose");
//	}
//
//	@When("user enters valid username: {string}")
//	public void userEntersValidUserName(String username) {
//		System.out.println("user enters valid username: "+username);
//	}
//	
//	@And("user enters valid password: {string}")
//	public void userEntersValidPassword(String pwd ) {
//		System.out.println("user enters valid pwd: "+pwd);
//	}
	
	
//	@Then("^user should be able to login successfully$")
//	public void loginSuccess() {
//		System.out.println("user should be able to login successfully");
//	}
//
//	@And("^user should land on profile page$")
//	public void profilePageAfterLoginSuccess() {
//		System.out.println("land on profile page after successful login");
//		System.out.println("-----------------------");
//	}
	
	@When("^user enters username as ([^\"]*)$")
	public void enter_username(String username) {
		//System.out.println("username is: "+username);
	}
	
	@And("^user enters password as ([^\"]*)$")
	public void enter_pwd(String pwd) {
		//System.out.println("pwd is: "+pwd);
	}
	
	@And("^user clicks on login button$")
	public void clickOnLoginbtn() {
		//System.out.println("User clicks on login button");
	}
	
	@Then("^user should ([^\"]*) able to login successfully$")
	public void behaviour(String behaviour) {
		//System.out.println("user should "+behaviour+" able to login successfully");
		//System.out.println("-----------------------");
	}
	
}
