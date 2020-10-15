Feature: outline
#@IGNORE
Scenario Outline: Login functionality for a social networking site.
Givenuser navigates to Facebook
When I enter Username as "<username>" and Password as "<password>"
Then login should be unsuccessful

Examples:
   |username |password |
    |admin |admin@123 |
     |admin |admin |
     
     
Scenario Outline: Addition functionality .

When I user adds numbers <x> and <y>
Then result <z> should be printed

Examples:
    |x |y |z|
    |2 |3 |5|
    |1 |1 |3|
    |5 |6 |11|
    |1 |1 |2|
    |1 |11|12|
    
    
    
    