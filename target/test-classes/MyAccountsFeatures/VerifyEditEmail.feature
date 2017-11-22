@myaccounts @regression @all @smoke
Feature: MyAc:Verify by editing email address

  Scenario: MyAc:Verify by editing email address
    Given Homepage
    And Navigate to MyAccounts
    Then verify user is navigated to  MyAccounts screen
    And click on edit email
    And Edit the email address
    And click on save
    Then verify the edited email is saved
