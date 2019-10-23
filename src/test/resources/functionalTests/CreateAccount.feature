@CreateAccount
Feature: Create an account

  Scenario: Verify that user is able to create an account by providing all the correct details.
    Given User is on Home Page of the application
    When User clicks on Sign In link
    And User enters email address in email field
    And User clicks on Create an Account button
    And User fills all the details in Create An Account form
    And User clicks on Register button
    Then User is able to see my account text
    And User is able to see account name as user full name for new user
    And User is able to see Welcome message
    And User is able to see Sign Out link
    And User is able to see current url contains my account url