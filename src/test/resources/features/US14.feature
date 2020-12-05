@us14tc01
Feature: US16
  Scenario: Test Case 01
    Given Login in customer account
    Then Go to my accounts
    And Assert if there is 2nd View Transaction

  @us14tc02
  Scenario: Test Case 04
    Given Login in customer account
    Then Go to my operations
    Then Go to transfer money
    And choose first account
    Then choose remain one
    And enter balance
    And click on transfer money
    And receive alert description
    And close browser