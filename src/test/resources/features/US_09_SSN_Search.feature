@us09
Feature: US_09_Ssn search
  Background:
    Given user logs in with user credentials
    Then user navigates to password page

@tc19
  Scenario: TC_19_User can search for a new applicant by their SSN and see all their registration info populated
    When user navigates to manage customers page
    And user clicks new customer button
    And user searchs the "123-45-7777"
    Then verify all registration info is populated
    |example|
    |test   |
    |123-45-7777|

@tc20
  Scenario: TC_20_User can not search for a new applicant by unregistered SSN
    When user navigates to manage customers page
    And user clicks new customer button
    And user searchs the "342-98-8365"
    Then verify all registration info is not populated


