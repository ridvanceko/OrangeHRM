Feature: User adds Employee

  @addFeature
  Scenario: User adds employee and validates
  Given Navigate to "url" Enter Username as "username" and Password as "password"
  Then Click the Admin function
  And Click Add button
  When Select User role
  And Select employee name
  Then Enter username
  When Select status
  And Enter the password and confirm
  When Click Save button
  And Validate "Successfully Saved" message