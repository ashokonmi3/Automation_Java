# hook and background cant be used together@WebTest

#@MobileTest
#Scenario: Home page default login
#Given User is on NetBanking landing page
#When User login into application with "jin" and password "1234"
#Then Home page is populated
#And Cards displayed are "true"
#
#
#
#@WebTest
#Scenario: Home page default login
#Given User is on NetBanking landing page
#When User login into application with "jin" and password "1234"
#Then Home page is populated
#And Cards displayed are "true"

Feature: Test Hooks

Scenario: This scenario is to test hooks functionality
Given this is the first step for hook
When this is the second step for hook
Then this is the fourth step for hook


@MobileTest
Scenario: This scenario is to test hooks functionality from Hooks.java file
Given this is the first step for hook
When this is the second step for hook
Then this is the fourth step for hook
