$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/greenKart.feature");
formatter.feature({
  "name": "search and place order the product from GreenKart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search for item and place order",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User in on GreenKart landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User search for \u003cprod name\u003e vegitable",
  "keyword": "When "
});
formatter.step({
  "name": "Add items to kart",
  "keyword": "And "
});
formatter.step({
  "name": "User proceed to check out for purchase",
  "keyword": "And "
});
formatter.step({
  "name": "Verify selected \u003cprod name\u003e items are displayed in check out screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "prod name"
      ]
    },
    {
      "cells": [
        "Brinjal"
      ]
    },
    {
      "cells": [
        "Brocolli"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search for item and place order",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User in on GreenKart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.MyStepDefinitions.user_in_on_greenkart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search for Brinjal vegitable",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.MyStepDefinitions.user_search_for_vegitable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add items to kart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.MyStepDefinitions.add_items_to_kart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceed to check out for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.MyStepDefinitions.user_proceed_to_check_out_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify selected Brinjal items are displayed in check out screen",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.stepDefination.verify_selected_items_are_displayed_in_check_out_screen(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for item and place order",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User in on GreenKart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.MyStepDefinitions.user_in_on_greenkart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search for Brocolli vegitable",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.MyStepDefinitions.user_search_for_vegitable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add items to kart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.MyStepDefinitions.add_items_to_kart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceed to check out for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.MyStepDefinitions.user_proceed_to_check_out_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify selected Brocolli items are displayed in check out screen",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.stepDefination.verify_selected_items_are_displayed_in_check_out_screen(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});