#Author: Anirudha Kulkarni

@login
Feature: User trying to perform login from login page
	User with valid user credentials should be able to perform successful login and land on profile page
	
	@loginWithValidUserCredentials
	Scenario: Check if user with valid user credentials is able to land on profile page after successful login
		Given any logged-out user
		And user lands on login page
		And such user has valid user credentials
		When user enters valid username
		And user enters valid password
		And user clicks on login button
		Then user should be able to login successfully
		And user should land on profile page