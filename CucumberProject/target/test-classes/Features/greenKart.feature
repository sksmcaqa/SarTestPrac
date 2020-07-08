Feature: search and place order the product from GreenKart

@RegressionTest
Scenario: Search for items and validate
Given User in on GreenKart landing page
When User search for Cucumber vegitable
Then "Cucumber" results are displayed

@SmokeTest
Scenario Outline: Search for item and place order
Given User in on GreenKart landing page
When User search for <prod name> vegitable
And Add items to kart
And User proceed to check out for purchase
Then Verify selected <prod name> items are displayed in check out screen

Examples:
|prod name	|
|Brinjal		|
|Brocolli		|
