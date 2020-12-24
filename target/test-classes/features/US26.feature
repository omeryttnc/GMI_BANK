@countryUpdate
Feature: Api - update Country test

  Background: Set up the connection
    Given user provides the api endpoint "/tp-countries"

  Scenario Outline:  User can just update each country 1 by 1
    Given user gets all countries
    And user selects country with id and send new "<name>"
    Examples:
      | name        |
      | new zeland  |


