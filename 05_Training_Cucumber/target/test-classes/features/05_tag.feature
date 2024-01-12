Feature: Portal Login
# hook and background cant be used together@WebTest

@MobileTest
Scenario: Home page default login for tagging @MobileTest
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@WebTest
Scenario: Home page default login first test for tagging @WebTest
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@WebTest
Scenario: Contact page default login for tagging @WebTest
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@WebTest @MobileTest
Scenario: Contact page default login for both tag @WebTest @MobileTest
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"