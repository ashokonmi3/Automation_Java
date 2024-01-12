Feature: As a customer I should be able to edit the contents of my shopping basket, change quantities and then checkout

Scenario: As a customer I want to launch a website
When I launch the website "google.com"
Then The "Google" website is launched


Scenario: As a customer I want to launch a website yahoo
When I launch the website "yahoo.com"
Then The "yahoo" website is launched


#==============
#Scenario: As a customer I can add an item to my shopping basket
#Given I am on the product detail page
#And the product is in stock
#And this product is currently not in the basket
#When I click the Add to Basket button
#Then the product is added to the basket
#And a message is displayed to the user
#And the stock level is reduced by one
#
# product is not in stock and not in the basket
#Scenario: As a customer I am unable to add an item to my shopping basket if not in stock
#Given I am on the product detail page
#And the product is not in stock
#And this product is currently not in the basket
#When I click the Add to Basket button
#Then the product is not added to the basket
#And a message is displayed to the user
#And the stock level is unchanged
#
# product is in stock and in the basket
#Scenario: As a customer I am unable to add an item to my shopping basket if it's already in the basket
#Given I am on the product detail page
#And the product is in stock
#And this product is currently in the basket
#When I click the Add to Basket button
#Then the product is not added to the basket
#And a message is displayed to the user
#And the stock level is unchanged
#
#Scenario: As a customer I can remove an item from my shopping basket
#Given I am on the basket page
#When I click the remove button
#Then the product is removed from the basket
#
#Scenario: As a customer I can view the items of my shopping basket
#Given I am on the home page
#When I click the shopping basket icon
#Then I see a list of shopping items
#
#Scenario: As a customer I can checkout from the shopping basket
#Given I am on the basket page
#When I click the checkout button
#Then I should be taken to the checkout page
