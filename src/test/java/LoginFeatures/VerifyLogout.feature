@login @regression @all @smoke
Feature: LGN:Verify Logout functionality

Scenario: Verify Logout functionality

  Given Loginpage
      Given Loginpage
    And Enter valid credentials and hit login
    Then verify user is logged into the site
    And logout from the site
    Then verify user is navigated back to login page