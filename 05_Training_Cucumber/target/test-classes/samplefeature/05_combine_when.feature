Feature: As a customer I should be able to edit the contents of my shopping basket, change quantities and then checkout

Scenario: As a user I should be able to login to my account using my credentials
Given the user is on the login page
And the signin button is displayed
When the user enters their username
When the user enters their password
When the user clicks the login button
Then the user is authenticated
Then the user is on the account page


Scenario: As a user I should be able to login to my account using my credentials
Given the user is on the login page
And the signin button is displayed
When the user enters their username
And the user enters their password
And the user clicks the login button
Then the user is authenticated
And the user is on the account page



