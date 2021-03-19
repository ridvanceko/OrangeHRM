Feature: User adds Employee

  @addFeature
  Scenario: User adds employee and validates
  Given Navigate to "url" Enter Username as "username" and Password as "password"
  Then Click the Admin function
    * Click the first checkbox next to the Username
    * Validate that all checkboxes are selected
    * Click on top of username two time
    And Validate usernames are listed in descending order

