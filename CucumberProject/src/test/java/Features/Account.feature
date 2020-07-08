Feature: Account information

Background:
Given Validate the browser
When Browser is trigerred
Then Check if browser is started

Scenario: Login to get Account information
Given User is in login page
When User enters username "user01" and password "pwd01"
Then Home page is displaying
And Cards information diaplying are "true"

Scenario: Login to get Account information not displayed
Given User is in login page
When User enters username "user02" and password "pwd02"
Then Home page is displaying
And Cards information diaplying are "false"

