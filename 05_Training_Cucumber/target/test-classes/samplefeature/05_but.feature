Feature: As a customer I should be able to edit the contents of my shopping basket, change quantities and then checkout

 #But keyword can be used when a situation is effectively negative.
#'Then the product is not added to the basket'.
#So we have the word Not here.
#And also, for example, we say 'And the stock level is unchanged'.
#Instead of saying unchanged, if we use the word 'And the stock level is not changed', like this, let's
#update both of these, then we could actually use the But keyword for both of these.
##So we could say 'But the stock level is not changed'.
#
#So if we actually re-arrange this where it says 'And the message is displayed to the user'.
#
#So if we say 'Then a message is displayed to the user', we could also use But here,
#
#So we can say 'Then a message is displayed to the user, But the product is not added to the basket.
#
#But the stock level is not changed'.
#
#But you notice where we have two Buts, it doesn't actually make any much sense at all.
#
#It doesn't read at all nicely.
#
#So we may only prefer to just have one But and say, 'But the product is not added to the basket, And the
#
#stock level is not changed' because that And
#
#there is effectively a continuation on from the previous But.
#
#When I'm actually reading this through to me using the word But kind of still doesn't quite flow.
#
#I think in this situation I still prefer to use the word And.
#
#So we've got 'Then a message is displayed to the user, And the product is not added to the basket, And the
#
#stock level is not changed'.
#
#I think personally that reads still nicer than using the word But.
#
#But you may think differently.
#
#So the But keyword is available in a situation where you have a negative, or it's not necessary to use
#
#it at all and you could just stick with And if you prefer.
#
#What I'm going to do is just update both of these two tests so they effectively assert in the same way.
#
#Okay.
#
#So that's all I wanted to say about the keyword But.
#
#And in the next section, we are going to have a quick further discussion on features and scenario.
#



Scenario: As a customer I can add an item to my shopping basket
Given I am on the product detail page
And the product is in stock
And this product is currently not in the basket
When I click the Add to Basket button
Then the product is added to the basket
But a message is displayed to the user
And the stock level is reduced by one

# product is not in stock and not in the basket
Scenario: As a customer I am unable to add an item to my shopping basket if not in stock
Given I am on the product detail page
And the product is not in stock
And this product is currently not in the basket
When I click the Add to Basket button
Then a message is displayed to the user
And the product is not added to the basket
And the stock level is unchanged

# product is in stock and in the basket
Scenario: As a customer I am unable to add an item to my shopping basket if it's already in the basket
Given I am on the product detail page
And the product is in stock
And this product is currently in the basket
When I click the Add to Basket button
Then a message is displayed to the user
And the product is not added to the basket
And the stock level is unchanged

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

