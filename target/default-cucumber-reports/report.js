$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US26.feature");
formatter.feature({
  "name": "Api - update Country test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@countryUpdate"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User can just update each country 1 by 1",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user gets all countries",
  "keyword": "Given "
});
formatter.step({
  "name": "user selects country with id and send new \"\u003cname\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name"
      ]
    },
    {
      "cells": [
        "new zeland"
      ]
    }
  ]
});
formatter.background({
  "name": "Set up the connection",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user provides the api endpoint \"/tp-countries\"",
  "keyword": "Given "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.CountriesSD.user_provides_the_api_endpoint(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can just update each country 1 by 1",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@countryUpdate"
    }
  ]
});
formatter.step({
  "name": "user gets all countries",
  "keyword": "Given "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.CountriesSD.user_gets_all_countries()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects country with id and send new \"new zeland\"",
  "keyword": "And "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.CountriesSD.user_selects_country_with_id_and_send_new(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});