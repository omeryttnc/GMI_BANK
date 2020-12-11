@us08
Feature: Password segment on Homepage should be editable

  Background:
    Given user logs in with user credentials
    Then user navigates to password page
@tc01
  Scenario: US_08_TC_01_The old password should not be used
    When user enters current password in current textbox
    And user enters new password in new password textbox
    And user enters old password in new password confirmation textbox
    And user clicks save button
    Then verify the message is like "Password changed!"
@tc02-17
  Scenario Outline: TC_002_There should be at least 7 chars for a stronger password
    When user enters "<firstpass>" in new  password textbox
    Then verify the changing of the level chart
    And user adds "<secondpass>" for stronger password
    Then verify the changing of the level chart
    And user adds "<thirdpass>" for stronger password
    Then verify the changing of the level chart
    And user adds "<fourthpass>" for stronger password
    Then verify the changing of the level chart
    Examples:
      | firstpass | secondpass | thirdpass | fourthpass |
      | 1234567   | a          | B         | !          |
      | abcdefg   | 1          | F         | !          |
      | ABCDEFG   | 1          | f         | !          |
      | @!<.#/&   | 1          | f         | A          |

