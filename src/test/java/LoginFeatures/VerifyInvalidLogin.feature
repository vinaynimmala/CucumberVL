@login @regression @all @negative 
Feature: LGN:Verify an appropriate message is displayed when logging with In-valid credentials
    
     Scenario: Verify an appropriate message is displayed when logging with In-valid credentials
    Given Loginpage
    And Enter In-valid credentials and hit login
    Then verify an appropriate message is displayed