$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("01_First_Feature.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    },
    {
      "line": 20,
      "value": "#@WebTest"
    }
  ],
  "line": 21,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 597400,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Home page default login",
  "description": "",
  "id": "login-feature;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "validate the browser",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Browser is triggered",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "check if browser is started",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User login into application with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 463998100,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.validate_the_browser()"
});
formatter.result({
  "duration": 186900,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.browser_is_triggered()"
});
formatter.result({
  "duration": 144500,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.check_if_browser_is_started()"
});
formatter.result({
  "duration": 153300,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.user_login_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 129700,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 179700,
  "status": "passed"
});
formatter.after({
  "duration": 226500,
  "status": "passed"
});
formatter.uri("02_Regex.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 463800,
  "status": "passed"
});
formatter.before({
  "duration": 333600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Home page default login",
  "description": "",
  "id": "application-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User login into application with \"jin\" and password \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 191000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 3543173700,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 83500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 187100,
  "status": "passed"
});
formatter.after({
  "duration": 105600,
  "status": "passed"
});
formatter.after({
  "duration": 91300,
  "status": "passed"
});
formatter.before({
  "duration": 196100,
  "status": "passed"
});
formatter.before({
  "duration": 113000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Home page default login",
  "description": "",
  "id": "application-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@MobileTest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User login into application with \"john\" and password \"4321\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Cards displayed are \"false\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 129300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "john",
      "offset": 34
    },
    {
      "val": "4321",
      "offset": 54
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 2359201100,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 65500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 158700,
  "status": "passed"
});
formatter.after({
  "duration": 118300,
  "status": "passed"
});
formatter.after({
  "duration": 98600,
  "status": "passed"
});
formatter.before({
  "duration": 135300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Demo for regular expression",
  "description": "",
  "id": "application-login;demo-for-regular-expression",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "User Ashok launching website www.yahoo.com",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User closes the browser",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Umesh launching website www.google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User closes the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Ashok",
      "offset": 5
    },
    {
      "val": "www.yahoo.com",
      "offset": 29
    }
  ],
  "location": "Step_def_02_regex.regeular_exp(String,String)"
});
formatter.result({
  "duration": 17231111800,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_09_selenium.closeBrowser()"
});
formatter.result({
  "duration": 7637211500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Umesh",
      "offset": 5
    },
    {
      "val": "www.google.com",
      "offset": 29
    }
  ],
  "location": "Step_def_02_regex.regeular_exp(String,String)"
});
formatter.result({
  "duration": 11167495200,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_09_selenium.closeBrowser()"
});
formatter.result({
  "duration": 5026525000,
  "error_message": "org.openqa.selenium.NoSuchSessionException: invalid session id\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-N6P94DG\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 116.0.5845.141, chrome: {chromedriverVersion: 116.0.5845.96 (1a3918166880..., userDataDir: C:\\Users\\91973\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:52923}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 2b113f693925bddce5e997e456f59bb0\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:442)\r\n\tat stepDefinations.Step_def_09_selenium.closeBrowser(Step_def_09_selenium.java:65)\r\n\tat ✽.And User closes the browser(02_Regex.feature:21)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 80600,
  "status": "passed"
});
formatter.uri("03_DataDriven.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 105000,
  "status": "passed"
});
formatter.before({
  "duration": 72500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Home page default login",
  "description": "",
  "id": "application-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@MobileTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User sign up with following details",
  "rows": [
    {
      "cells": [
        "jenny",
        "abcd",
        "john@abcd.com",
        "Australia",
        "3242353"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Cards displayed are \"false\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 102800,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_03_data_driven.user_sign_up_with_following_details(DataTable)"
});
formatter.result({
  "duration": 1859166800,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 188300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 2027076600,
  "status": "passed"
});
formatter.after({
  "duration": 64000,
  "status": "passed"
});
formatter.after({
  "duration": 52500,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 11,
      "value": "#"
    },
    {
      "line": 12,
      "value": "#"
    }
  ],
  "line": 14,
  "name": "Home page default login",
  "description": "",
  "id": "application-login;home-page-default-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User login in to application with \u003cUsername\u003e and password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "application-login;home-page-default-login;",
  "rows": [
    {
      "cells": [
        "Username",
        "password"
      ],
      "line": 21,
      "id": "application-login;home-page-default-login;;1"
    },
    {
      "cells": [
        "user1",
        "pass1"
      ],
      "line": 22,
      "id": "application-login;home-page-default-login;;2"
    },
    {
      "cells": [
        "user2",
        "pass2"
      ],
      "line": 23,
      "id": "application-login;home-page-default-login;;3"
    },
    {
      "cells": [
        "user3",
        "pass3"
      ],
      "line": 24,
      "id": "application-login;home-page-default-login;;4"
    },
    {
      "cells": [
        "user4",
        "pass4"
      ],
      "line": 25,
      "id": "application-login;home-page-default-login;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 514300,
  "status": "passed"
});
formatter.before({
  "duration": 122900,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Home page default login",
  "description": "",
  "id": "application-login;home-page-default-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User login in to application with user1 and password pass1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 186000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user1",
      "offset": 34
    },
    {
      "val": "pass1",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_and_password(String,String)"
});
formatter.result({
  "duration": 2392129200,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 1120700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 398300,
  "status": "passed"
});
formatter.after({
  "duration": 61900,
  "status": "passed"
});
formatter.after({
  "duration": 88300,
  "status": "passed"
});
formatter.before({
  "duration": 87100,
  "status": "passed"
});
formatter.before({
  "duration": 91400,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Home page default login",
  "description": "",
  "id": "application-login;home-page-default-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User login in to application with user2 and password pass2",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 209800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user2",
      "offset": 34
    },
    {
      "val": "pass2",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_and_password(String,String)"
});
formatter.result({
  "duration": 2338656400,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 88400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 150100,
  "status": "passed"
});
formatter.after({
  "duration": 58300,
  "status": "passed"
});
formatter.after({
  "duration": 66600,
  "status": "passed"
});
formatter.before({
  "duration": 96300,
  "status": "passed"
});
formatter.before({
  "duration": 89800,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Home page default login",
  "description": "",
  "id": "application-login;home-page-default-login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User login in to application with user3 and password pass3",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 115300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user3",
      "offset": 34
    },
    {
      "val": "pass3",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_and_password(String,String)"
});
formatter.result({
  "duration": 2791298900,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 282600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 282500,
  "status": "passed"
});
formatter.after({
  "duration": 103600,
  "status": "passed"
});
formatter.after({
  "duration": 140300,
  "status": "passed"
});
formatter.before({
  "duration": 187000,
  "status": "passed"
});
formatter.before({
  "duration": 142600,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Home page default login",
  "description": "",
  "id": "application-login;home-page-default-login;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User login in to application with user4 and password pass4",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 491000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user4",
      "offset": 34
    },
    {
      "val": "pass4",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_and_password(String,String)"
});
formatter.result({
  "duration": 2451121700,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 55900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 138600,
  "status": "passed"
});
formatter.after({
  "duration": 78100,
  "status": "passed"
});
formatter.after({
  "duration": 64100,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 26,
      "value": "#"
    },
    {
      "line": 28,
      "value": "#Scenario Outline: Login functionality for a social networking site."
    },
    {
      "line": 29,
      "value": "#Given user navigates to Facebook"
    },
    {
      "line": 30,
      "value": "#When I enter Username as \"\u003cusername\u003e\" and Password as \"\u003cpassword\u003e\""
    },
    {
      "line": 31,
      "value": "#Then login should be unsuccessful"
    },
    {
      "line": 32,
      "value": "#And user closes the browser"
    },
    {
      "line": 33,
      "value": "#"
    },
    {
      "line": 34,
      "value": "#Examples:"
    },
    {
      "line": 35,
      "value": "#|username |password |"
    },
    {
      "line": 36,
      "value": "#|root |root |"
    },
    {
      "line": 37,
      "value": "#|admin |admin |"
    },
    {
      "line": 38,
      "value": "#"
    }
  ],
  "line": 40,
  "name": "Addition functionality .",
  "description": "",
  "id": "application-login;addition-functionality-.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 42,
  "name": "I user adds numbers \u003cx\u003e and \u003cy\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "result \u003cz\u003e should be printed",
  "keyword": "Then "
});
formatter.examples({
  "line": 45,
  "name": "",
  "description": "",
  "id": "application-login;addition-functionality-.;",
  "rows": [
    {
      "cells": [
        "x",
        "y",
        "z"
      ],
      "line": 46,
      "id": "application-login;addition-functionality-.;;1"
    },
    {
      "cells": [
        "2",
        "3",
        "5"
      ],
      "line": 47,
      "id": "application-login;addition-functionality-.;;2"
    },
    {
      "cells": [
        "1",
        "1",
        "3"
      ],
      "line": 48,
      "id": "application-login;addition-functionality-.;;3"
    },
    {
      "cells": [
        "5",
        "6",
        "11"
      ],
      "line": 49,
      "id": "application-login;addition-functionality-.;;4"
    },
    {
      "cells": [
        "1",
        "1",
        "2"
      ],
      "line": 50,
      "id": "application-login;addition-functionality-.;;5"
    },
    {
      "cells": [
        "1",
        "11",
        "12"
      ],
      "line": 51,
      "id": "application-login;addition-functionality-.;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 217600,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Addition functionality .",
  "description": "",
  "id": "application-login;addition-functionality-.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 42,
  "name": "I user adds numbers 2 and 3",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "result 5 should be printed",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 20
    },
    {
      "val": "3",
      "offset": 26
    }
  ],
  "location": "Step_def_03_data_driven.i_user_adds_numbers_and(int,int)"
});
formatter.result({
  "duration": 2727422900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 7
    }
  ],
  "location": "Step_def_03_data_driven.result_should_be_printed(int)"
});
formatter.result({
  "duration": 4977900,
  "status": "passed"
});
formatter.after({
  "duration": 209500,
  "status": "passed"
});
formatter.before({
  "duration": 120800,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Addition functionality .",
  "description": "",
  "id": "application-login;addition-functionality-.;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 42,
  "name": "I user adds numbers 1 and 1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "result 3 should be printed",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    },
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "Step_def_03_data_driven.i_user_adds_numbers_and(int,int)"
});
formatter.result({
  "duration": 3217389200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 7
    }
  ],
  "location": "Step_def_03_data_driven.result_should_be_printed(int)"
});
formatter.result({
  "duration": 908000,
  "error_message": "java.lang.AssertionError: expected:\u003c3\u003e but was:\u003c2\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:555)\r\n\tat org.junit.Assert.assertEquals(Assert.java:542)\r\n\tat stepDefinations.Step_def_03_data_driven.result_should_be_printed(Step_def_03_data_driven.java:85)\r\n\tat ✽.Then result 3 should be printed(03_DataDriven.feature:43)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 85100,
  "status": "passed"
});
formatter.before({
  "duration": 116900,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Addition functionality .",
  "description": "",
  "id": "application-login;addition-functionality-.;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 42,
  "name": "I user adds numbers 5 and 6",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "result 11 should be printed",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 20
    },
    {
      "val": "6",
      "offset": 26
    }
  ],
  "location": "Step_def_03_data_driven.i_user_adds_numbers_and(int,int)"
});
formatter.result({
  "duration": 5035377500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11",
      "offset": 7
    }
  ],
  "location": "Step_def_03_data_driven.result_should_be_printed(int)"
});
formatter.result({
  "duration": 199800,
  "status": "passed"
});
formatter.after({
  "duration": 66000,
  "status": "passed"
});
formatter.before({
  "duration": 115700,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Addition functionality .",
  "description": "",
  "id": "application-login;addition-functionality-.;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 42,
  "name": "I user adds numbers 1 and 1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "result 2 should be printed",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    },
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "Step_def_03_data_driven.i_user_adds_numbers_and(int,int)"
});
formatter.result({
  "duration": 4688591800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 7
    }
  ],
  "location": "Step_def_03_data_driven.result_should_be_printed(int)"
});
formatter.result({
  "duration": 206100,
  "status": "passed"
});
formatter.after({
  "duration": 60000,
  "status": "passed"
});
formatter.before({
  "duration": 85100,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Addition functionality .",
  "description": "",
  "id": "application-login;addition-functionality-.;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 42,
  "name": "I user adds numbers 1 and 11",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "result 12 should be printed",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    },
    {
      "val": "11",
      "offset": 26
    }
  ],
  "location": "Step_def_03_data_driven.i_user_adds_numbers_and(int,int)"
});
formatter.result({
  "duration": 4719037600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 7
    }
  ],
  "location": "Step_def_03_data_driven.result_should_be_printed(int)"
});
formatter.result({
  "duration": 203100,
  "status": "passed"
});
formatter.after({
  "duration": 64800,
  "status": "passed"
});
formatter.uri("04_Background.feature");
formatter.feature({
  "line": 1,
  "name": "Portal Login",
  "description": "",
  "id": "portal-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 77300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "# should be always on top and will be executed before every scenerio",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "validate the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Browser is triggered",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "check if browser is started",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_def_01.validate_the_browser()"
});
formatter.result({
  "duration": 92100,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.browser_is_triggered()"
});
formatter.result({
  "duration": 74700,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.check_if_browser_is_started()"
});
formatter.result({
  "duration": 69500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Home page default login",
  "description": "",
  "id": "portal-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@PortalTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User login into application with \"jin\" and password \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 291000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 3408358100,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 89900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 217500,
  "status": "passed"
});
formatter.after({
  "duration": 71200,
  "status": "passed"
});
formatter.before({
  "duration": 2305400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "# should be always on top and will be executed before every scenerio",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "validate the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Browser is triggered",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "check if browser is started",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_def_01.validate_the_browser()"
});
formatter.result({
  "duration": 105900,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.browser_is_triggered()"
});
formatter.result({
  "duration": 90500,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.check_if_browser_is_started()"
});
formatter.result({
  "duration": 85800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Home page login",
  "description": "",
  "id": "portal-login;home-page-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@PortalTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User login into application with \"jin\" and password \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 75300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 2938245000,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 482800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 157300,
  "status": "passed"
});
formatter.after({
  "duration": 603500,
  "status": "passed"
});
formatter.uri("05_tag.feature");
formatter.feature({
  "line": 1,
  "name": "Portal Login",
  "description": "",
  "id": "portal-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 106100,
  "status": "passed"
});
formatter.before({
  "duration": 115900,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "# hook and background cant be used together@WebTest"
    }
  ],
  "line": 5,
  "name": "Home page default login for tagging @MobileTest",
  "description": "",
  "id": "portal-login;home-page-default-login-for-tagging-@mobiletest",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@MobileTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User login into application with \"jin\" and password \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 196700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 2801835000,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 103900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 142600,
  "status": "passed"
});
formatter.after({
  "duration": 53700,
  "status": "passed"
});
formatter.after({
  "duration": 71200,
  "status": "passed"
});
formatter.before({
  "duration": 78800,
  "status": "passed"
});
formatter.before({
  "duration": 64600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Home page default login first test for tagging @WebTest",
  "description": "",
  "id": "portal-login;home-page-default-login-first-test-for-tagging-@webtest",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User login into application with \"jin\" and password \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 135700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 2935877000,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 71800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 157400,
  "status": "passed"
});
formatter.after({
  "duration": 79000,
  "status": "passed"
});
formatter.after({
  "duration": 77800,
  "status": "passed"
});
formatter.before({
  "duration": 111400,
  "status": "passed"
});
formatter.before({
  "duration": 118400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Contact page default login for tagging @WebTest",
  "description": "",
  "id": "portal-login;contact-page-default-login-for-tagging-@webtest",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User login into application with \"jin\" and password \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 143700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 4889728100,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 63000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 123300,
  "status": "passed"
});
formatter.after({
  "duration": 62900,
  "status": "passed"
});
formatter.after({
  "duration": 39100,
  "status": "passed"
});
formatter.before({
  "duration": 74000,
  "status": "passed"
});
formatter.before({
  "duration": 47600,
  "status": "passed"
});
formatter.before({
  "duration": 98300,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Contact page default login for both tag @WebTest @MobileTest",
  "description": "",
  "id": "portal-login;contact-page-default-login-for-both-tag-@webtest-@mobiletest",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@WebTest"
    },
    {
      "line": 25,
      "name": "@MobileTest"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User login into application with \"jin\" and password \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 801000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 10451413400,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 66000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 122200,
  "status": "passed"
});
formatter.after({
  "duration": 46000,
  "status": "passed"
});
formatter.after({
  "duration": 41100,
  "status": "passed"
});
formatter.after({
  "duration": 50700,
  "status": "passed"
});
formatter.uri("06_hook.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# hook and background cant be used together@WebTest"
    },
    {
      "line": 3,
      "value": "#@MobileTest"
    },
    {
      "line": 4,
      "value": "#Scenario: Home page default login"
    },
    {
      "line": 5,
      "value": "#Given User is on NetBanking landing page"
    },
    {
      "line": 6,
      "value": "#When User login into application with \"jin\" and password \"1234\""
    },
    {
      "line": 7,
      "value": "#Then Home page is populated"
    },
    {
      "line": 8,
      "value": "#And Cards displayed are \"true\""
    },
    {
      "line": 9,
      "value": "#"
    },
    {
      "line": 10,
      "value": "#"
    },
    {
      "line": 11,
      "value": "#"
    },
    {
      "line": 12,
      "value": "#@WebTest"
    },
    {
      "line": 13,
      "value": "#Scenario: Home page default login"
    },
    {
      "line": 14,
      "value": "#Given User is on NetBanking landing page"
    },
    {
      "line": 15,
      "value": "#When User login into application with \"jin\" and password \"1234\""
    },
    {
      "line": 16,
      "value": "#Then Home page is populated"
    },
    {
      "line": 17,
      "value": "#And Cards displayed are \"true\""
    }
  ],
  "line": 19,
  "name": "Test Hooks",
  "description": "",
  "id": "test-hooks",
  "keyword": "Feature"
});
formatter.before({
  "duration": 64200,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "This scenario is to test hooks functionality",
  "description": "",
  "id": "test-hooks;this-scenario-is-to-test-hooks-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "this is the first step for hook",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "this is the second step for hook",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "this is the fourth step for hook",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_def_6_hook.hook_first()"
});
formatter.result({
  "duration": 102000,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_6_hook.hook2()"
});
formatter.result({
  "duration": 85400,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_6_hook.hook3()"
});
formatter.result({
  "duration": 73800,
  "status": "passed"
});
formatter.after({
  "duration": 59500,
  "status": "passed"
});
formatter.before({
  "duration": 68600,
  "status": "passed"
});
formatter.before({
  "duration": 79500,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "This scenario is to test hooks functionality from Hooks.java file",
  "description": "",
  "id": "test-hooks;this-scenario-is-to-test-hooks-functionality-from-hooks.java-file",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@MobileTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "this is the first step for hook",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "this is the second step for hook",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "this is the fourth step for hook",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_def_6_hook.hook_first()"
});
formatter.result({
  "duration": 85600,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_6_hook.hook2()"
});
formatter.result({
  "duration": 57100,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_6_hook.hook3()"
});
formatter.result({
  "duration": 82100,
  "status": "passed"
});
formatter.after({
  "duration": 64500,
  "status": "passed"
});
formatter.after({
  "duration": 41100,
  "status": "passed"
});
formatter.uri("07_report.feature");
formatter.feature({
  "line": 1,
  "name": "Portal Login",
  "description": "",
  "id": "portal-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 87500,
  "status": "passed"
});
formatter.before({
  "duration": 62200,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "# hook and background cant be used together@WebTest"
    }
  ],
  "line": 4,
  "name": "Home page default login",
  "description": "",
  "id": "portal-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@MobileTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User login into application with \"jin\" and password \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 103000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 3369731300,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 83400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 142000,
  "status": "passed"
});
formatter.after({
  "duration": 49300,
  "status": "passed"
});
formatter.after({
  "duration": 52200,
  "status": "passed"
});
formatter.before({
  "duration": 89800,
  "status": "passed"
});
formatter.before({
  "duration": 65400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Home page default login",
  "description": "",
  "id": "portal-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User login into application with \"jin\" and password \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 3175500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 2869109100,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 779400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 163600,
  "status": "passed"
});
formatter.after({
  "duration": 64700,
  "status": "passed"
});
formatter.after({
  "duration": 103600,
  "status": "passed"
});
formatter.uri("08_cuc_options.feature");
formatter.feature({
  "line": 1,
  "name": "Portal Login",
  "description": "",
  "id": "portal-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 97700,
  "status": "passed"
});
formatter.before({
  "duration": 83600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "# hook and background cant be used together@WebTest"
    }
  ],
  "line": 4,
  "name": "Home page default login",
  "description": "",
  "id": "portal-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@MobileTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User login into application with \"jin\" and password \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 138600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 2758460400,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 64500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 1517300,
  "status": "passed"
});
formatter.after({
  "duration": 432400,
  "status": "passed"
});
formatter.after({
  "duration": 48200,
  "status": "passed"
});
formatter.before({
  "duration": 909700,
  "status": "passed"
});
formatter.before({
  "duration": 200900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Home page default login",
  "description": "",
  "id": "portal-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User login into application with \"jin\" and password \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Cards are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Step_def_01.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 79500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 53
    }
  ],
  "location": "Step_def_02_regex.user_login_into_application_with_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 2190565300,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_01.home_page_is_populated()"
});
formatter.result({
  "duration": 41300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "Step_def_02_regex.cards_displayed_are(String)"
});
formatter.result({
  "duration": 183300,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 99600,
  "status": "passed"
});
formatter.after({
  "duration": 73900,
  "status": "passed"
});
formatter.uri("09_SeleniumTest.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.before({
  "duration": 109800,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#@SMOKETEST"
    },
    {
      "line": 3,
      "value": "#Scenario: Successful Login with Valid Credentials"
    },
    {
      "line": 4,
      "value": "#\tGiven User is on Home Page"
    },
    {
      "line": 5,
      "value": "#\tWhen User login a site"
    },
    {
      "line": 6,
      "value": "#\tWhen User is on Home Page"
    },
    {
      "line": 7,
      "value": "#\tThen User login a site with invalid user name"
    },
    {
      "line": 8,
      "value": "#\tAnd User closes the browser"
    }
  ],
  "line": 11,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@REGRESSIONTEST"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User login a site",
  "keyword": "When "
});
formatter.match({
  "location": "Step_def_09_selenium.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 6006370000,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_09_selenium.user_login()"
});
formatter.result({
  "duration": 16606833500,
  "status": "passed"
});
formatter.after({
  "duration": 21700,
  "status": "passed"
});
formatter.before({
  "duration": 32100,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Unsuccessful Login with inValid Credentials test1",
  "description": "",
  "id": "login-action;unsuccessful-login-with-invalid-credentials-test1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@SMOKETEST"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User login a site with invalid user name",
  "keyword": "When "
});
formatter.match({
  "location": "Step_def_09_selenium.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 5357814000,
  "status": "passed"
});
formatter.match({
  "location": "Step_def_09_selenium.user_login_invalid()"
});
formatter.result({
  "duration": 15453260500,
  "status": "passed"
});
formatter.after({
  "duration": 72100,
  "status": "passed"
});
formatter.uri("10_Before_After.feature");
formatter.feature({
  "line": 1,
  "name": "Priority for test cases",
  "description": "",
  "id": "priority-for-test-cases",
  "keyword": "Feature"
});
formatter.before({
  "duration": 60900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "First scenario to test Order Hooks functionality",
  "description": "",
  "id": "priority-for-test-cases;first-scenario-to-test-order-hooks-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "this is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "this is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "this is the third step",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Step_def_10_Before_After.this_is_the_second_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_def_10_Before_After.this_is_the_third_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 90600,
  "status": "passed"
});
formatter.before({
  "duration": 107300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Second scenario to test Order Hooks functionality",
  "description": "",
  "id": "priority-for-test-cases;second-scenario-to-test-order-hooks-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "this is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "this is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "this is the third step",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Step_def_10_Before_After.this_is_the_second_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_def_10_Before_After.this_is_the_third_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 100000,
  "status": "passed"
});
});