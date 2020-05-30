$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/Outline.feature");
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
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 22,
  "name": "outline",
  "description": "",
  "id": "outline",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "Login functionality for a social networking site.",
  "description": "Givenuser navigates to Facebook",
  "id": "outline;login-functionality-for-a-social-networking-site.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@IGNORE"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I enter Username as \"\u003cusername\u003e\" and Password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "login should be unsuccessful",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "outline;login-functionality-for-a-social-networking-site.;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 30,
      "id": "outline;login-functionality-for-a-social-networking-site.;;1"
    },
    {
      "cells": [
        "admin",
        "admin@123"
      ],
      "line": 31,
      "id": "outline;login-functionality-for-a-social-networking-site.;;2"
    },
    {
      "cells": [
        "admin",
        "admin"
      ],
      "line": 32,
      "id": "outline;login-functionality-for-a-social-networking-site.;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 31,
  "name": "Login functionality for a social networking site.",
  "description": "Givenuser navigates to Facebook",
  "id": "outline;login-functionality-for-a-social-networking-site.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@IGNORE"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I enter Username as \"admin\" and Password as \"admin@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "login should be unsuccessful",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "admin@123",
      "offset": 45
    }
  ],
  "location": "OutlineTest.I_enter_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 134992788,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinition.OutlineTest.I_enter_Username_as_and_Password_as(OutlineTest.java:23)\r\n\tat ✽.When I enter Username as \"admin\" and Password as \"admin@123\"(Feature/Outline.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OutlineTest.validateRelogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 32,
  "name": "Login functionality for a social networking site.",
  "description": "Givenuser navigates to Facebook",
  "id": "outline;login-functionality-for-a-social-networking-site.;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@IGNORE"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I enter Username as \"admin\" and Password as \"admin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "login should be unsuccessful",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "admin",
      "offset": 45
    }
  ],
  "location": "OutlineTest.I_enter_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 412916,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinition.OutlineTest.I_enter_Username_as_and_Password_as(OutlineTest.java:23)\r\n\tat ✽.When I enter Username as \"admin\" and Password as \"admin\"(Feature/Outline.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OutlineTest.validateRelogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 35,
  "name": "Addition functionality .",
  "description": "",
  "id": "outline;addition-functionality-.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 37,
  "name": "I user adds numbers \u003cx\u003e and \u003cy\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "result \u003cz\u003e should be printed",
  "keyword": "Then "
});
formatter.examples({
  "line": 40,
  "name": "",
  "description": "",
  "id": "outline;addition-functionality-.;",
  "rows": [
    {
      "cells": [
        "x",
        "y",
        "z"
      ],
      "line": 41,
      "id": "outline;addition-functionality-.;;1"
    },
    {
      "cells": [
        "2",
        "3",
        "5"
      ],
      "line": 42,
      "id": "outline;addition-functionality-.;;2"
    },
    {
      "cells": [
        "1",
        "1",
        "2"
      ],
      "line": 43,
      "id": "outline;addition-functionality-.;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 42,
  "name": "Addition functionality .",
  "description": "",
  "id": "outline;addition-functionality-.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 37,
  "name": "I user adds numbers 2 and 3",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
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
  "location": "OutlineTest.i_user_adds_numbers_and(int,int)"
});
formatter.result({
  "duration": 1173614,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 7
    }
  ],
  "location": "OutlineTest.result_should_be_printed(int)"
});
formatter.result({
  "duration": 1740880,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Addition functionality .",
  "description": "",
  "id": "outline;addition-functionality-.;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 37,
  "name": "I user adds numbers 1 and 1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
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
  "location": "OutlineTest.i_user_adds_numbers_and(int,int)"
});
formatter.result({
  "duration": 180404,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 7
    }
  ],
  "location": "OutlineTest.result_should_be_printed(int)"
});
formatter.result({
  "duration": 252250,
  "status": "passed"
});
});