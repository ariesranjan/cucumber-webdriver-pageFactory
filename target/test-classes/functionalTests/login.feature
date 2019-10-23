@Login
Feature: Login Functionality

  Scenario Outline: Verify that user is able to logged in successfully
    Given User is on Home Page of the application
    When User clicks on Sign In link
    And User enters username '<username>' in username field
    And User enters password '<password>' in password field
    And User clicks on submit button
    Then User is able to see my account text
    And User is able to see account name as '<full name>'
    And User is able to see Welcome message
    And User is able to see Sign Out link
    And User is able to see current url contains my account url

    Examples: 
      | username                         | password | full name |
      | hf_challenge_123456@hf123456.com | 12345678 | Joe Black |
