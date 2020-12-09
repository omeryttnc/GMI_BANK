$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Register.feature");
formatter.feature({
  "name": "US01 Registration Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.scenario({
  "name": "TC01 Verify that user can register",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "User navigates to GMI BANK HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.ilker_stepdefinitions.user_navigates_to_GMI_BANK_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks to user-icon",
  "keyword": "Then "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.ilker_stepdefinitions.user_clicks_to_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "Then "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.ilker_stepdefinitions.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills SSN input box",
  "keyword": "Then "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.ilker_stepdefinitions.user_fills_SSN_input_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the firstname and lastname input box",
  "keyword": "Then "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.ilker_stepdefinitions.user_fills_the_firstname_and_lastname_input_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the address input box",
  "keyword": "Then "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.ilker_stepdefinitions.user_fills_the_address_input_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the username input box",
  "keyword": "Then "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.ilker_stepdefinitions.user_fills_the_username_input_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the mobilePhone input box",
  "keyword": "Then "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.ilker_stepdefinitions.user_fills_the_mobilePhone_input_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the email input box",
  "keyword": "And "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.ilker_stepdefinitions.user_fills_the_email_input_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the new password and confirmation password",
  "keyword": "Then "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.ilker_stepdefinitions.user_fills_the_new_password_and_confirmation_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on registerSubmit button",
  "keyword": "Then "
});
formatter.match({
  "location": "GMI_BANK_13.stepdefitions.ilker_stepdefinitions.user_clicks_on_registerSubmit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});