Feature: Admin Function

  Scenario: Admin functionality
    Given user navigates to  URL
    Then user login by Username: "loginUsername" and Password: "loginPassword"
    * Click login button
    * Click the Admin function
    * Click the first checkbox next to the Username Validate that all checkboxes are selected
    * Click on top of username 2 time
    And Validate usernames are listed in descending order