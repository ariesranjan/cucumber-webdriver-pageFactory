@Checkout
Feature: Checkout process

  Scenario Outline: Verify that user is able to place the order successfully
    Given User is on Home Page of the application
    When User clicks on Sign In link
    And User enters username '<username>' in username field
    And User enters password '<password>' in password field
    And User clicks on submit button
    And User clicks on Women category
    And User clicks on '<dressName>' dress
    And User clicks on add to cart button
    And User clicks on Proceed to checkout button
    And User click on Proceed to checkout button on Summary page
    And User click on Proceed to checkout button on Address page
    And User checks terms and condition check box
    And User clicks on Proceed to checkout button on Shipping page
    And User clicks on Pay by Bank Wire option
    And User clicks on Confirm order button
    Then User is able to see Order Confirmation heading
    And User is on last page of order placement
    And User is able to see order confirmation message
    And User is able to see current url contains order confirmation url

    Examples: 
      | username                         | password | dressName                   |
      | hf_challenge_123456@hf123456.com | 12345678 | Faded Short Sleeve T-shirts |
