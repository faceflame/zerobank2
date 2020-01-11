$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddNewPayee.feature");
formatter.feature({
  "name": "Add new payee under pay bills",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@add_new_payee"
    }
  ]
});
formatter.scenario({
  "name": "Add a new payee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@add_new_payee"
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
  "name": "the user is on Add New Payee tab",
  "keyword": "Given "
});
formatter.match({
  "location": "AddNewPayeeStepDefs.the_user_is_on_Add_New_Payee_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user creates new payee using following information",
  "rows": [
    {
      "cells": [
        "Payee Name",
        "The Law Offices of Hyde, Price \u0026 Scharks"
      ]
    },
    {
      "cells": [
        "Payee Address",
        "100 Same st, Anytown, USA, 10001"
      ]
    },
    {
      "cells": [
        "Account",
        "Checking"
      ]
    },
    {
      "cells": [
        "Payee details",
        "XYZ account"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddNewPayeeStepDefs.the_user_creates_new_payee_using_following_information(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system should display \"The new payee The Law Offices of Hyde, Price \u0026 Scharks was successfully created.\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewPayeeStepDefs.the_system_should_display_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});