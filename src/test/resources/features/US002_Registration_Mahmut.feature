@registration
Feature: US002_user_wants_to_register_scenario_outline

  Scenario Outline: TC_01_Required_information_was_given_by_user
    Given user is on the website
    When user clicks on user icon
    And user clicks on register button
    Then user enters the SSN "<ssn>"
    And user enters the first name "<firstname>"
    And user enters the last name "<lastname>"
    And user enters the address "<address>"
    And user enters the mobile phone number "<mobile_number>"
    And user enters the username "<username>"
    And user enters the email address "<email>"
    And user enters the new password "<password>"
    And user enters the new password confirmation "<confirmation>"
    And user clicks on the Register button
    Then verify the text message
    Examples:
      | ssn         | firstname | lastname | address           | mobile_number | username   | email         | password    | confirmation  |
      |000-00-000   |Johannes   |Savanna   |JFK Str. 19, 07558 | 000-000-0000  |JohnS       | johns@xyz.com | johns123    | johns123      |
