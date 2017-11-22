@all @messages @smoke @regression 
Feature: ODH:Verify by navigating to MyMessages

  Scenario: Verify by navigating to MyMessages
    Given Homepage
    And click on My messages
    Then verify user is navigated to MyMessages
