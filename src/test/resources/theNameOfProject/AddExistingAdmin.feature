Feature: Adding Existing User as Admin

  Scenario: Adding Existing User as Admin Confirmation Message
    Given Navigate to "url" Enter Username as "username" and Password as "password"
    Then user click the add user button
    Then user enter a username which already exist
    And user validate already exists text is displayed