Feature: Portal Login

Background: # should be always on top and will be executed before every scenerio
Given validate the browser
When Browser is triggered
Then check if browser is started

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"


@PortalTest
Scenario: Home page login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"