$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountSummary.feature");
formatter.feature({
  "name": "Account Summary",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@account_summary"
    }
  ]
});
formatter.scenario({
  "name": "Account summary page should have the title Zero - Account Summary.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@account_summary"
    },
    {
      "name": "@acct_summary_page_title"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSummaryStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"Zero - Account Summary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.the_page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});