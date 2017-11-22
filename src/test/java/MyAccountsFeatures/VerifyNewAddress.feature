@myaccounts @regression @all @smoke
Feature: MyAc:Verify by adding new address

  Scenario: Verify by adding new address
    Given Homepage
    And Navigate to MyAccounts
    Then verify user is navigated to  MyAccounts screen
    And click on edit Add new address button
    And Enter the mandatory fields
    And click on save new address
    Then verify new address number is saved