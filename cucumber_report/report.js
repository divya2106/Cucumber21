$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:p3/multiple.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Newuser Signup",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@unit"
    }
  ]
});
formatter.step({
  "name": "User navigates to website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef3.user_navigates_to_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"lalitha\" and 123",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef3.enters_and(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the signup",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef3.click_on_the_signup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "welcomee page is appeared",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef3.welcomee_page_is_appeared()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login existing user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@unit"
    }
  ]
});
formatter.step({
  "name": "User enters user name",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef3.user_enters_user_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef3.user_enters_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef3.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef3.home_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});