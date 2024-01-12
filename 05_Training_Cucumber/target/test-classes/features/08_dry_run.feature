Feature: NetFlix

As a TV viewer I want to play videos in Netflix.

Background:
    Given the STB has access to internet

@hw-provision-ccl-netflix
@testenv-testing-storm
@test-execution-type-automate
@test-importance-high
@TEST_OSXRAY-35262
Scenario: launching non system UI apps which are in suspended state
     When the user registers the application as control application
     And  the user launches the user application amazon
     Then the user application amazon is running
     And the user waits for 30 seconds
     And the user application amazon is focused
     When the control application suspends the user application amazon
     When the user launches the user application netflix
     Then the user application netflix is running
     And the user waits for 30 seconds
     And the user application netflix is focused
     When the control application suspends the user application netflix
     Then the user application netflix is suspended
     When the user launches the user application cobalt
     And the user waits for 10 seconds
     Then the user application cobalt is running
     And the user waits for 10 seconds
     When the user launches the user application amazon
     Then the user application amazon is running
     And the user waits for 5 seconds
     When  the user launches the user application netflix
     Then the user application netflix is running
     When the user launches the user application cobalt
     Then the user application cobalt is running
     When the user destroys the user application amazon
     Then the user application amazon is destroyed
     When the user destroys the user application netflix
     And the user application netflix is destroyed
     And the user destroys the user application cobalt
     Then the user application cobalt is destroyed
     And the user unregisters the application as control application

@test-importance-high
@test-execution-type-automate
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-34466
Scenario: Launch time verification for netflix
    Given the user registers the application as control application
    When the user launches application netflix 1 times
    Then the average launch time of netflix with 93.93 bandwith is within threshold value
    And the user unregisters the application as control application

@test-importance-high
@test-execution-type-manual
@TEST_OSXRAY-10371
Scenario: Launch Netflix and navigate on UI
    When the user registers the application as control application
    Then the user tells the current application to borrow key KEY_1 while not in focus
    When the user navigates between all categories in netflix app
    And  the user launches the user application netflix
    And the user application netflix is running
    And the user waits for 10 seconds
    Then all categories or items is listed properly in netflix app
    And the user unregisters the application as control application

@test-importance-low
@test-execution-type-manual
@TEST_OSXRAY-10372
Scenario: Play one content from each category on Netflix
    When the user registers the application as control application
    Then the user tells the current application to borrow key KEY_1 while not in focus
    When the user plays content from all categories in netflix app
    And  the user launches the user application netflix
    And the user application netflix is running
    And the user waits for 10 seconds
    Then the content is played from all categories in netflix app
    And the user unregisters the application as control application

@test-importance-low
@test-execution-type-automate
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-20911
Scenario: Netflix home screen launch and navigation to different screens.
    When the user registers the application as control application
    And the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 30 seconds
    And the user goes to application netflix and page home
    And the user goes to application netflix and page search
    And the user goes to application netflix and page tvshows
    And the user goes to application netflix and page movies
    And the user goes to application netflix and page myList
    And the user goes to application netflix and page new
    And the user goes to application netflix and page settings
    When the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-critical
@test-execution-type-manual
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-22185
Scenario: Netflix play,pause and stop video
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 30 seconds
    And the user plays a content from application netflix
    And the user pauses a content from application netflix
    And the user stops a content from application netflix
    When the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-high
@test-execution-type-automate
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-22542
Scenario: Launch netflix and exit
    When the user registers the application as control application
    When the user launches application netflix 2 times
    Then the average launch time is displayed
    And the user unregisters the application as control application

@test-importance-high
@test-execution-type-automate
@test-execution-timeout-4h
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-22543
Scenario: Launch ,playback netflix content and suspend
    When the user registers the application as control application
    Then the user launches , navigates and exits application netflix 100 times
    And the user unregisters the application as control application

@test-importance-high
@test-execution-type-automate
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-22544
Scenario: Launch ,suspend and resume Netflix
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 30 seconds
    And the user application netflix is focused
    When the control application suspends the user application netflix
    Then the user application netflix is suspended
    And the user waits for 5 seconds
    When  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 30 seconds
    When the user destroys the user application netflix
    Then the user waits for 5 seconds
    And the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-high
@test-execution-type-automate
@hw-provision-ccl-netflix
@test-execution-timeout-1h
@testenv-testing-storm
@TEST_OSXRAY-22727
Scenario: Seeks forward, backward and till the end of netflix content
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 30 seconds
    And the user seeks forward a content from application netflix
    And the user seeks backward a content from application netflix
    And the user seeks till end a content from application netflix
    When the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-high
@test-execution-type-automate
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-22728
Scenario: Verify that trick mode works during netflix video playback 
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 30 seconds
    And the user plays a content from application netflix
    And the user forwards a content at 2x speed from application netflix
    And the user rewinds a content at 1x speed from application netflix
    When the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-automate
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-22957
Scenario: Netflix content switching during playback
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 30 seconds
    And the user does content switching on application netflix 5 times
    When the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-manual
@TEST_OSXRAY-22959
Scenario Outline: Start, stop and change subtitle language of netflix content
    When the user registers the application as control application
    And the user <action1> subtitle language of any content on application netflix
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 15 seconds
    And the user tells the current application to borrow key KEY_1 while not in focus
    And the subtitle language is <action2> on netflix application content playback
    And the user unregisters the application as control application
    Examples:
        |   action1   |  action2    |
        |   starts    |    started  |
        |   stops     |    stopped  |
        |   changes   |    changed  |

@test-importance-medium
@test-execution-type-manual
@TEST_OSXRAY-22958
Scenario: Audio language changes of netflix content
    When the user registers the application as control application
    And the user changes audio language of any content on application netflix
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 15 seconds
    And the user tells the current application to borrow key KEY_1 while not in focus
    And the audio language is changed on netflix application content playback
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-automate
@hw-provision-ccl-netflix
@test-execution-timeout-1h
@TEST_OSXRAY-23202
@testenv-testing-storm
Scenario: Netflix application poster navigation
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 15 seconds
    And the user navigates netflix application poster 500 times
    When the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-manual
@TEST_OSXRAY-23203
Scenario: Launching the Netflix application with/with-out a network connection
    When the user registers the application as control application
    And the user sets the interface state to off for wired interface
    And the interface state for wired interface is off
    When the user launches netflix application with-out a network connection
    And  the user launches the user application netflix
    And the user application netflix is running
    And the user waits for 5 seconds
    And the user tells the current application to borrow key KEY_1 while not in focus
    Then the error page is displayed in netflix application
    When the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    When the user sets the interface state to on for wired interface
    Then the interface state for wired interface is on
    When the user launches netflix application with a network connection
    And  the user launches the user application netflix
    And the user application netflix is running
    And the user waits for 15 seconds
    Then the error page is not displayed in netflix application
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-manual
@TEST_OSXRAY-23468
Scenario: Verify Netflix Audio Level
    When the user registers the application as control application
    And the user sets the volume to 0
    Then the volume is set to 0
    When the user checks the audio volume is mute during netflix application video playback
    And the user tells the current application to borrow key KEY_1 while not in focus
    And  the user launches the user application netflix
    And the user application netflix is running
    And the user waits for 5 seconds
    Then the audio volume was muted in netflix application
    When the user sets the volume to 100
    Then the volume is set to 100
    When the user checks the audio volume is high during netflix application video playback
    And  the user launches the user application netflix
    And the user application netflix is running
    And the user waits for 5 seconds
    Then the audio volume was high in netflix application
    When the user sets the volume to 20
    Then the volume is set to 20
    When the user checks the audio volume is low during netflix application video playback
    And  the user launches the user application netflix
    And the user application netflix is running
    And the user waits for 5 seconds
    Then the audio volume was low in netflix application
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-automate
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-23469
Scenario: Verify netflix app behavior during power cycle
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 10 seconds
    And the user application netflix is focused
    When the user plays a content from application netflix
    And the user puts the STB in standby on mode
    And the STB is in standby on mode
    And the user waits for 5 seconds
    And the user puts the STB in standby off mode
    And the STB is in standby off mode
    Then the content is playing in netflix application
    When the user hard reboots the STB
    And the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    When the user waits for 10 seconds
    Then the user plays a content from application netflix
    When the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-automate
@hw-provision-ccl-netflix
@test-execution-timeout-1h
@testenv-testing-storm
@TEST_OSXRAY-25657
Scenario: Netflix play series content then switch to another content
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 30 seconds
    And the user plays a content from tvshows and switch to another content from application netflix
    When the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-automate
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-25942
Scenario: Netflix setting screen launch and exit from application
    When the user registers the application as control application
    And the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 30 seconds
    And the user goes to setting screen and exit from application netflix
    When the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 30 seconds
    When the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-manual
@TEST_OSXRAY-25943
Scenario: Launching and playback netflix content after stb and tv comes out of standby and validating key press
    When the user puts the TV in standby mode
    And the user puts the STB in standby on mode
    Then the STB is in standby on mode
    And the user hard reboots the STB
    When the user puts the STB in standby off mode
    Then the STB is in standby off mode
    When the user registers the application as control application
    Then the user tells the current application to borrow key KEY_1 while not in focus
    When the user plays content from all categories in netflix app
    When the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 30 seconds
    Then the content is played from all categories in netflix app
    When the user installs the user application app_associate
    Then the user application app_associate is installed
    When the user suspends the user application app_associate
    Then the user application app_associate is suspended
    When the application app_associate is ready
    Then the user tells the application app_associate to be ready to receive the key KEY_MENU
    When the user presses the key KEY_MENU in 10 seconds
    Then the application app_associate receives the key KEY_MENU
    When the user uninstalls the user application app_associate
    Then the user application app_associate is uninstalled
    When the user presses the key KEY_MENU in 10 seconds
    Then the current application receives the key KEY_MENU
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-automate
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-25944
Scenario: Netflix play trailer from movies and perform trickmode to reach end of the content
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 30 seconds
    And the user play trailer till end of the content from application netflix
    When the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-automate
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-25945
Scenario: Netflix search and play HDR content from searched list
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 30 seconds
    And the user search and play HDR content from searched list on application netflix
    When the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-manual
@TEST_OSXRAY-26106
Scenario:Check the audio output after netflix app goes to suspended mode
    Given the user registers the application as control application
    And the user tells the current application to borrow key KEY_1 while not in focus
    When the user plays a ottcontent from application netflix
    And the user launches the user application netflix
    And the user application netflix is running
    Then the ottcontent is played in netflix application and the user suspends the application
    And user check audio outupt while netflix app in suspend mode
    When the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-manual
@TEST_OSXRAY-28122
Scenario: Play 4K netflix content under home theatre setup
    When the 4K TV is connected to STB
    And the TV supports the 2160p video format
    And the dolby decoder is connected to the STB
    And the user registers the application as control application
    And the user tells the current application to borrow key KEY_1 while not in focus
    And the user plays UHD support Dolby atmos ottcontent from application netflix after launch application
    And the user launches the user application netflix
    And the user application netflix is running
    Then the ottcontent is played in netflix application and the user destroys the application
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-manual
@TEST_OSXRAY-28123
Scenario: Play 4K netflix content and perform trickmode multiple times
    When the 4K TV is connected to STB
    And the TV supports the 2160p video format
    And the user sets 2160p video format
    And the user hard reboots the STB
    And the user registers the application as control application
    And the user tells the current application to borrow key KEY_1 while not in focus
    And the user plays UHD content and perform trickmodes multiple times after netflix launch
    And the user launches the user application netflix
    And the user application netflix is running
    Then the ottcontent is played in netflix application and the user destroys the application
    And the user unregisters the application as control application

@test-importance-medium
@test-execution-type-manual
@TEST_OSXRAY-28124
Scenario: play UHD content pausing and then performing TV standby on off
    When the user registers the application as control application
    And the user tells the current application to borrow key KEY_1 while not in focus
    And the user plays UHD content pausing and then performing standby on off after netflix launch
    And the user launches the user application netflix
    And the user application netflix is running
    Then the ottcontent is played in netflix application and the user destroys the application
    And the user unregisters the application as control application

@test-importance-high
@test-execution-type-automate
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-28848
Scenario: Check the netflix status after re-boot the STB
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user hard reboots the STB
    Then the user application netflix is destroyed

@test-importance-high
@test-execution-type-manual
@TEST_OSXRAY-28849
Scenario: Check netflix content playback during different network bandwidth
    When the user registers the application as control application
    And the user tells the current application to borrow key KEY_1 while not in focus
    And the user changes bandwidth 500Kbps
    And the user plays the video content at 500Kbps network bandwidth in netflix application
    And  the user launches the user application netflix
    Then the user application netflix is running
    And the user waits for 5 seconds
    Then the video content is played at 500Kbps network bandwidth in netflix application
    When the user changes bandwidth 2000Kbps
    And the user plays the video content at 2000Kbps network bandwidth in netflix application
    And  the user launches the user application netflix
    And the user application netflix is running
    And the user waits for 5 seconds
    Then the video content is played at 2000Kbps network bandwidth in netflix application
    When the user changes bandwidth 5000Kbps
    And the user plays the video content at 5000Kbps network bandwidth in netflix application
    And  the user launches the user application netflix
    And the user application netflix is running
    And the user waits for 5 seconds
    Then the video content is played at 5000Kbps network bandwidth in netflix application
    When the user destroys the user application netflix
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@test-importance-high
@test-execution-type-automate
@hw-provision-ccl-netflix
@testenv-testing-storm
@testenv-broadcast-public
@hw-pvr-disk
@TEST_OSXRAY-28931
Scenario: Launch netflix while time based reminder is on-going
    Given the STB has scanned a stream
    When the user books one time reminder which starts in 1 minutes with duration 2 minutes on channel DVB_TS1_HD0
    And the user registers the application as control application
    When the user launches the user application netflix
    And the user waits for 3 minutes
    Then the user application netflix is running
    When the user destroys the user application netflix
    And the user waits for 10 seconds
    Then the user application netflix is destroyed
    And the reminder RMDR1 is completed successfully
    And the user unregisters the application as control application

@test-importance-high
@test-execution-type-automate
@hw-provision-ccl-netflix
@testenv-testing-storm
@TEST_OSXRAY-28932
Scenario: Check netflix application status after STB standby off
    Given the user registers the application as control application
    When the user launches the user application netflix
    And the user waits for 30 seconds
    Then the user application netflix is running
    And the user waits for 30 seconds
    And the user puts the STB in standby on mode
    Then the STB is in standby on mode
    And the user waits for 10 seconds
    And the user puts the STB in standby off mode
    Then the STB is in standby off mode
    And the user application netflix is running
    And the user destroys the user application netflix
    And the user waits for 10 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@hw-provision-ccl-netflix
@testenv-testing-storm
@test-importance-high
@test-execution-type-automate
@TEST_OSXRAY-28933
Scenario: Launch suspend and destroy netflix application multiple times
    Given the user registers the application as control application
    When the user launch suspend and destroy application netflix 10 times
    Then the average launch time is displayed
    And the user unregisters the application as control application

@hw-provision-ccl-netflix
@testenv-testing-storm
@test-importance-high
@test-execution-type-automate
@TEST_OSXRAY-29012
Scenario: Launch and destroy youtube netflix and amazon application multiple times
    Given the user registers the application as control application
    When the user launch and destroy youtube,netflix,amazon application 10 times
    Then the average launch time is displayed
    And the user unregisters the application as control application

@hw-provision-ccl-netflix
@testenv-testing-storm
@test-importance-high
@test-execution-type-automate
@TEST_OSXRAY-29663
Scenario: netflix launch after factory reset 
    Given the user does a factory reset of the STB
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    When the user destroys the user application netflix
    And the user waits for 10 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application

@hw-provision-ccl-netflix
@testenv-testing-storm
@test-importance-high
@test-execution-type-automate
@TEST_OSXRAY-29809
Scenario:Verify parental lock and channel lock after exiting from netflix
    Given the STB has scanned a stream
    When the user plays channel DVB_TS1_HD0
    Then the channel is playing
    And the user enables the channel locker
    When the user add channel DVB_TS1_HD0 to restricted list
    Then the channel is locked by channel locker
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    When the user destroys the user application netflix
    And the user waits for 10 seconds
    Then the user application netflix is destroyed
    When the user plays channel DVB_TS1_HD0
    Then the channel is locked by channel locker
    And the user disables the channel locker 
    When the user removes channel DVB_TS1_HD0 from restricted list
    Then the channel is unlocked
    When the user plays channel DVB_TS1_HD0
    Then the channel is playing
    And the user enables the parental locker
    And the user sets default user age to 12
    Then the channel is locked by parental locker
    And  the user launches the user application netflix
    Then the user application netflix is running
    When the user destroys the user application netflix
    And the user waits for 10 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application
    When the user plays channel DVB_TS1_HD0
    Then the channel is locked by parental locker
    And the user disables the parental locker
    Then the channel is unlocked
    When the user plays channel DVB_TS1_HD0
    Then the channel is playing

@hw-wifi-adapter
@test-importance-high
@test-execution-type-automate
@TEST_OSXRAY-29949
Scenario: Launch netflix multipletimes from wifi network
    When the user scans for wireless networks
    Then wifi_NARA is one of the access points available
    When the user connects to the wireless network 
    And the STB is connected to the wireless network
    Then the wireless interface has property details
    When the user sets the interface state to off for wired interface
    Then the interface state for wired interface is off
    And the user waits for 10 seconds
    When the user registers the application as control application
    And  the user launches the user application netflix
    Then the user application netflix is running
    When the user destroys the user application netflix
    And the user waits for 10 seconds
    Then the user application netflix is destroyed
    When  the user launches the user application netflix
    Then the user application netflix is running
    When the user destroys the user application netflix
    And the user waits for 10 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application
    When the user sets the interface state to on for wired interface
    Then the interface state for wired interface is on

@hw-wifi-adapter
@test-importance-high
@test-execution-type-manual
@TEST_OSXRAY-29950
Scenario: Launch and playback of netflix application with ethernet and wireless connection
    When the user registers the application as control application
    And the user sets the interface state to on for wired interface
    Then the interface state for wired interface is on
    When the user sets the interface state to disable for wireless interface
    Then the interface state for wireless interface is disable
    When the user tells the current application to borrow key KEY_1 while not in focus
    And the user plays content from all categories in netflix app
    And  the user launches the user application netflix
    And the user application netflix is running
    And the user waits for 10 seconds
    Then the content is played from all categories in netflix app
    When the user sets the interface state to on for wireless interface
    Then the interface state for wireless interface is on
    And the user waits for 20 seconds
    When the user scans for wireless networks
    Then wifi_NARA is one of the access points available
    When the user connects to the wireless network 
    And the STB is connected to the wireless network
    Then the wireless interface has property details
    When the user sets the interface state to off for wired interface
    Then the interface state for wired interface is off
    And the user waits for 10 seconds
    When the user plays content from all categories in netflix app
    And  the user launches the user application netflix
    And the user application netflix is running
    And the user waits for 10 seconds
    Then the content is played from all categories in netflix app
    When the user sets the interface state to on for wired interface
    Then the interface state for wired interface is on
    And the user unregisters the application as control application

#This test case is only valid for build which does not contain Netflix app
@test-important-high
@test-execution-type-automate
@TEST_OSXRAY-34687
Scenario: install uninstall Netflix app from ocs server
    When the user installs the user application NagraNetflixApp from server
    And the user registers the application as control application
    And the user launches the user application netflix
    And the user waits for 10 seconds
    Then the user application netflix is running
    And the user waits for 10 seconds
    And the user destroys the user application netflix
    And the user waits for 5 seconds
    Then the user application netflix is destroyed
    And the user unregisters the application as control application
    When the user uninstalls the user application netflix
    Then the user application netflix is uninstalled

#This test case is only valid for build which does not contain Netflix app
# Install SNA apps need to be handled which is still in discussion
@test-importance-high
@test-execution-type-manual
@TEST_OSXRAY-34688
Scenario: Offload and Reload Netflix App
   When the user installs the user application NagraNetflixApp from server
   And the user registers the application as control application
   And the user launches the user application netflix
   And the user waits for 10 seconds
   Then the user application netflix is running
   And the user waits for 10 seconds
   And the user destroys the user application netflix
   And the user waits for 10 seconds
   Then the user application netflix is destroyed
   And the user unregisters the application as control application
   When the user offloads the user application netflix
   Then the user application netflix is offloaded
   When the user uninstalls the user application netflix
   Then the user application netflix is uninstalled
   When the user installs the user application NagraNetflixApp from server
   And the user registers the application as control application
   When the user sign in application netflix
   And  the user launches the user application netflix
   Then the user application netflix is running
   And the user waits for 150 seconds
   And the user destroys the user application netflix
   And the user waits for 10 seconds
   Then the user application netflix is destroyed
   And the user unregisters the application as control application
   When the user offloads the user application netflix
   Then the user application netflix is offloaded
   When the user reloads the user application netflix
   Then the user application netflix is reloaded 
   When the user registers the application as control application
   Then the user tells the current application to borrow key KEY_1 while not in focus
   When the user validates application netflix is logged in
   Then the user launches the user application netflix
   And the user application netflix is running
   When the user waits for 10 seconds
   When the user application netflix is logged in 
   Then the user unregisters the application as control application
   When the user uninstalls the user application netflix
   Then the user application netflix is uninstalled

#This test case is only valid for build which has Netflix as built-in app
@test-importance-high
@test-execution-type-manual
@TEST_OSXRAY-34689
Scenario: Update and Rollback built-in SNA apps.
   When the user registers the application as control application
   Then the user tells the current application to borrow key KEY_1 while not in focus
   When the user sign in application netflix
   And  the user launches the user application netflix
   Then the user application netflix is running
   And the user waits for 120 seconds
   And the user destroys the user application netflix
   And the user waits for 10 seconds
   Then the user application netflix is destroyed
   And the user unregisters the application as control application
   When the user updates the user application netflix to NagraNetflixApp from server
   Then the user application netflix is updated to NagraNetflixApp from server
   When the user registers the application as control application
   Then the user tells the current application to borrow key KEY_1 while not in focus
   When the user validates application NagraNetflixApp is logged in
   Then the user launches the user application netflix
   And the user application netflix is running
   When the user waits for 10 seconds
   When the user application netflix is logged in 
   Then the user unregisters the application as control application
   When the user rollbacks the user application netflix
   Then the user application netflix is rollbacked from NagraNetflixApp
   When the user registers the application as control application
   Then the user tells the current application to borrow key KEY_1 while not in focus
   When the user validates application netflix is logged in
   Then the user launches the user application netflix
   And the user application netflix is running
   When the user waits for 10 seconds
   When the user application netflix is logged in 
   Then the user unregisters the application as control application

@test-importance-high
@test-execution-type-manual
@TEST_OSXRAY-35263
Scenario: Delete AppData of Netflix app
   When the user installs the user application NagraNetflixApp from server
   And the user registers the application as control application
   Then the user tells the current application to borrow key KEY_1 while not in focus
   When the user sign in application netflix
   And the user launches the user application netflix
   And the user waits for 120 seconds
   Then the user application netflix is running
   And the user waits for 20 seconds
   And the user destroys the user application netflix
   And the user waits for 10 seconds
   Then the user application netflix is destroyed
   And the user unregisters the application as control application
   When the user deletes app data of the user application netflix
   And the user registers the application as control application
   Then the user tells the current application to borrow key KEY_1 while not in focus
   When the user validates application netflix is not logged in
   Then the user launches the user application netflix
   And the user application netflix is running
   When the user waits for 10 seconds
   When the user application netflix is logged in
   And the user unregisters the application as control application
   When the user uninstalls the user application netflix
   Then the user application netflix is uninstalled

@test-importance-high
@test-execution-type-manual
@TEST_OSXRAY-35264
Scenario: Get the Netflix app data usage size.
   When the user installs the user application NagraNetflixApp from server
   And the user registers the application as control application
   When the user gets the app data usage size of the user application netflix
   Then the user displayed the app data usage size of the user application netflix
   When the user sign in application netflix
   And the user launches the user application netflix
   Then the user application netflix is running
   And the user waits for 120 seconds
   When the user gets the app data usage size of the user application netflix
   Then the user displayed the app data usage size of the user application netflix
   And the user destroys the user application netflix
   And the user waits for 10 seconds
   Then the user application netflix is destroyed
   And the user unregisters the application as control application
   When the user deletes app data of the user application netflix
   When the user gets the app data usage size of the user application netflix
   Then the user displayed the app data usage size of the user application netflix
   When the user uninstalls the user application netflix
   Then the user application netflix is uninstalled
