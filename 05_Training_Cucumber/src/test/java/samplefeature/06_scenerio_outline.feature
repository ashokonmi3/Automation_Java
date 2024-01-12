Feature: SCENARIO OUTLINES

Scenario: Validate Successful Login
When I enter a username user1
And I enter a password webdriver123
And I click on the login button
Then I should be presented with the successful login message


Scenario: Validate Unsuccessful Login
When I enter a username user2
And I enter a password user1234
And I click on the login button
Then I should be presented with the unsuccessful login message


Scenario Outline: Validate - Successful & Unsuccessful Login
When I enter a username <username>
And I enter a password <password>
And I click on the login button
Then I should be presented with message <loginValidationText>
Examples:
| username | password | loginValidationText |
| webdriver | webdriver123 | validation succeeded |
| webdriver | webdriver1 | validation failed |
| user1 | user123 | validation failed |
| user2 | user321 | validation succeeded |