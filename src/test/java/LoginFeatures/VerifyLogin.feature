@all @run
Feature: LGN:Verify user is able to Login with valid credentials

  Scenario: Verify user is able to Login with valid credentials
    Given Loginpage
    And Enter valid credentials and hit login
    Then verify user is logged into the site

 

    