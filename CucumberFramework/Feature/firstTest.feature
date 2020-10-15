

Feature: Login Action

@REGRESSIONTEST 
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User login a site
 
 @SMOKETEST 
Scenario: Unsuccessful Login with inValid Credentials test1
	Given User is on Home Page
	When User login a site with invalid user name

#Scenario: Successful Login Credentials
	#When User login a site
  