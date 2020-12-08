@register
Feature: US01 Registration Test
  Scenario: TC01 Verify that user can register

    Given User navigates to GMI BANK HomePage
    Then user clicks to user-icon
    Then user clicks on register button
    Then user fills SSN input box
    Then user fills the firstname and lastname input box
    Then user fills the address input box
    Then user fills the username input box
    Then user fills the mobilePhone input box
    And user fills the email input box
    Then user fills the new password and confirmation password
    Then user clicks on registerSubmit button