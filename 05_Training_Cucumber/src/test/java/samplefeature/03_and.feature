Feature: As a customer I should be able to edit the contents of my shopping basket, change quantities and then checkout
#AND : used when we have 2 or more consecutive steps or validation

Scenario: As a customer I can add an item to my shopping basket without AND
Given I am on the product detail page
Given  the product is in stock
Given this product is currently not in the basket
When I click the Add to Basket button
Then the product is added to the basket
Then a message is displayed to the user
Then the stock level is reduced by one


Scenario: As a customer I can add an item to my shopping basket
Given I am on the product detail page
And the product is in stock
And this product is currently not in the basket
When I click the Add to Basket button
Then the product is added to the basket
And a message is displayed to the user
And the stock level is reduced by one


