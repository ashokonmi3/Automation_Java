Feature: Application Login

@WebTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@MobileTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"

Scenario: Demo for regular expression
    Given User Ashok launching website www.yahoo.com
    And User closes the browser
     Given User Umesh launching website www.google.com
    And User closes the browser