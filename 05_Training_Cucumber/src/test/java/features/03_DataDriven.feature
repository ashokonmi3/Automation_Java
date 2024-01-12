Feature: Application Login


@MobileTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User sign up with following details
| jenny | abcd | john@abcd.com |Australia | 3242353|
Then Home page is populated
And Cards displayed are "false"
#
#
@WebTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with <Username> and password <password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|Username |password|
|user1    |pass1   |
|user2    |pass2   |
|user3    |pass3   |
|user4    |pass4   |
#

#Scenario Outline: Login functionality for a social networking site.
#Given user navigates to Facebook
#When I enter Username as "<username>" and Password as "<password>"
#Then login should be unsuccessful
#And user closes the browser
#
#Examples:
   #|username |password |
    #|root |root |
     #|admin |admin |
     #
     
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