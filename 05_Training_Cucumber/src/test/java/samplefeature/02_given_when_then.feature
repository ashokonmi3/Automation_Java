Feature: As a customer I should be able to edit the contents of my shopping basket, change quantities and then checkout

Scenario: As a customer I can add an item to my shopping basket
Given I am on the product detail page
When I click the Add to Basket button
Then the product is added to the basket

Scenario: As a customer I can remove an item from my shopping basket
Given I am on the basket page
When I click the remove button
Then the product is removed from the basket

Scenario: As a customer I can view the items of my shopping basket
Given I am on the home page
When I click the shopping basket icon
Then I see a list of shopping items

Scenario: As a customer I can checkout from the shopping basket
Given I am on the basket page
When I click the checkout button
Then I should be taken to the checkout page



#Objective/Description: To verify as a customer I can add an item to my shopping basket   : Scenerio
#Precondition: User is logged in and on the product details page   : Given
#Steps: 1. User clicks on the Add to basket button  #Expected Restult: 1. The product is added in the basket
           #2. When the user remove the product from the basket #Expected Restult:  #2. The product is removed from the basket
                             
  #Steps : When
  #Validation : Then