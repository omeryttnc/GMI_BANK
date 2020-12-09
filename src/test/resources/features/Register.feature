Feature: Test password strength functionality
  Background:
    Given edit password field
    Given click user icon
    Given click register page

  Scenario: Check level and color of chart status
    When edit password field
    |password|
    |1234567 |
    |abcdefg |
    |ABCDEFG |
    Then click confirm password field