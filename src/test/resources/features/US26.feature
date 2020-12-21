Background: Set up the connection
Given user provides the api endpoint "https://www.gmibank.com/api/tp-countries"

Scenario Outline:  User can just update each country 1 by 1
Given user gets all countries
And user selects country with "<id>" and "<name>"


