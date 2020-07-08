Feature: Login information

@webTest
Scenario: Login to get card information
Given User is in login page
When User enters username "user01" and password "pwd01"
Then Home page is displaying
And Cards information diaplying are "true"

@mobileTest
Scenario: Login to get card information not displayed
Given User is in login page
When User enters username "user02" and password "pwd02"
Then Home page is displaying
And Cards information diaplying are "false"

@mobileTest
Scenario: Signup to get card information 
Given User is in login page
When User sign up with below details
|saroj|username|password|address|phone|
Then Home page is displaying
And Cards information diaplying are "true"

@webTest
Scenario Outline: Login with multiple parameter of data to get card information 
Given User is in login page
When User login with multiple data, username <username> and password <password>
Then Home page is displaying
And Cards information diaplying are "true"

Examples:
|username  |password  |
|username01|password01|
|username02|password02|
|username03|password03|
|username04|password04|
