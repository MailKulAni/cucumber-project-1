#Author: Anirudha Kulkarni


Feature: User performing successful registration

  Scenario: User trying to register
    Given any logged-out user
     When user lands on login page
      And user enters valid registration information
      | field | value | 
      | f1    | v1    | 
      | f2    | v2    | 
      | f3    | v3    | 
      And user clicks on register button    
     Then user should be able to register successfully
      And user lands on profile page