@countryUpdate
Feature: Api - Create New Account test

  Background: Set up the connection
    Given user provides the account creation endpoint "/tp-accounts"

  Scenario: Verify admin can create new account
    When admin create new account with following attributes:
      | accountStatusType | accountType | balance | closedDate               | createDate               | description      |
      | ACTIVE            | CREDIT_CARD | 55555   | 2032-12-24T23:00:00.000Z | 2020-12-24T23:00:00.000Z | KhanAcademy 3333 |

    Then admin verify that account is created


