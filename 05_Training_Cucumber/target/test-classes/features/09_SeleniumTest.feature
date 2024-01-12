Feature: Login Action
#@SMOKETEST
#Scenario: Successful Login with Valid Credentials
#	Given User is on Home Page
#	When User login a site
#	When User is on Home Page
#	Then User login a site with invalid user name
#	And User closes the browser
 
 @REGRESSIONTEST 
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User login a site
 
 @SMOKETEST 
Scenario: Unsuccessful Login with inValid Credentials test1
	Given User is on Home Page
	When User login a site with invalid user name
 
# Scenario: Unsuccessful Login with inValid Credentials
	#Given User is on Home Page
#	When User login a site
	#When User is on Home Page
	#Then User login a site with invalid user name
	#And User closes the browser

 #@REGRESSIONTEST 
  #Scenario: Successful Login with inValid Credentials test1
	#Given User is on Home Page
	#When User login a site with invalid user name
	#And User closes the browser
	
#Scenario: Successful Login Credentials
#	When User login a site

#Scenerio:  Validate the logo after login
  #  Given User is on Home Page
    #When User login a site
    #When user validate logo
    #And User closes the browser
    

   

  