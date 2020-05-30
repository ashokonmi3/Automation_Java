#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template


Feature: outline
#@IGNORE
#Scenario Outline: Login functionality for a social networking site.
#Givenuser navigates to Facebook
#When I enter Username as "<username>" and Password as "<password>"
#Then login should be unsuccessful
#
#Examples:
   #|username |password |
    #|admin |admin@123 |
     #|admin |admin |
     
     
Scenario Outline: Addition functionality .

When I user adds numbers <x> and <y>
Then result <z> should be printed

Examples:
   |x |y |z|
    |2 |3|5|
    |1 |1 |3|
    |5 |6|11|
    |1 |1 |2|
    |1 |1 |2|
    
    
    
    