@myaccounts @regression @all @smoke
Feature: MyAc:Verify by editing phone number

  Scenario: Verify by editing phone number
    Given Homepage
    And Navigate to MyAccounts
    Then verify user is navigated to  MyAccounts screen
    And click on edit phone number button
    And Edit the phone number
    And click on save phone number button
    Then verify the edited phone number is saved
    