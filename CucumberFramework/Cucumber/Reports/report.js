$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/Outline.feature");
formatter.feature({
  "line": 1,
  "name": "outline",
  "description": "",
  "id": "outline",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "#@IGNORE"
    }
  ],
  "line": 3,
  "name": "Login functionality for a social networking site.",
  "description": "Givenuser navigates to Facebook",
  "id": "outline;login-functionality-for-a-social-networking-site.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I enter Username as \"\u003cusername\u003e\" and Password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "login should be unsuccessful",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "outline;login-functionality-for-a-social-networking-site.;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "outline;login-functionality-for-a-social-networking-site.;;1"
    },
    {
      "cells": [
        "admin",
        "admin@123"
      ],
      "line": 10,
      "id": "outline;login-functionality-for-a-social-networking-site.;;2"
    },
    {
      "cells": [
        "admin",
        "admin"
      ],
      "line": 11,
      "id": "outline;login-functionality-for-a-social-networking-site.;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1002800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Login functionality for a social networking site.",
  "description": "Givenuser navigates to Facebook",
  "id": "outline;login-functionality-for-a-social-networking-site.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I enter Username as \"admin\" and Password as \"admin@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
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
  "duration": 235523000,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinition.OutlineTest.I_enter_Username_as_and_Password_as(OutlineTest.java:23)\r\n\tat ✽.When I enter Username as \"admin\" and Password as \"admin@123\"(Feature/Outline.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OutlineTest.validateRelogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 537600,
  "status": "passed"
});
formatter.before({
  "duration": 296200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login functionality for a social networking site.",
  "description": "Givenuser navigates to Facebook",
  "id": "outline;login-functionality-for-a-social-networking-site.;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I enter Username as \"admin\" and Password as \"admin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
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
  "duration": 418300,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinition.OutlineTest.I_enter_Username_as_and_Password_as(OutlineTest.java:23)\r\n\tat ✽.When I enter Username as \"admin\" and Password as \"admin\"(Feature/Outline.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OutlineTest.validateRelogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 195000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Addition functionality .",
  "description": "",
  "id": "outline;addition-functionality-.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I user adds numbers \u003cx\u003e and \u003cy\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "result \u003cz\u003e should be printed",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
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
      "line": 20,
      "id": "outline;addition-functionality-.;;1"
    },
    {
      "cells": [
        "2",
        "3",
        "5"
      ],
      "line": 21,
      "id": "outline;addition-functionality-.;;2"
    },
    {
      "cells": [
        "1",
        "1",
        "3"
      ],
      "line": 22,
      "id": "outline;addition-functionality-.;;3"
    },
    {
      "cells": [
        "5",
        "6",
        "11"
      ],
      "line": 23,
      "id": "outline;addition-functionality-.;;4"
    },
    {
      "cells": [
        "1",
        "1",
        "2"
      ],
      "line": 24,
      "id": "outline;addition-functionality-.;;5"
    },
    {
      "cells": [
        "1",
        "11",
        "12"
      ],
      "line": 25,
      "id": "outline;addition-functionality-.;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 142800,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Addition functionality .",
  "description": "",
  "id": "outline;addition-functionality-.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I user adds numbers 2 and 3",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
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
  "duration": 1243300,
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
  "duration": 1801700,
  "status": "passed"
});
formatter.after({
  "duration": 209900,
  "status": "passed"
});
formatter.before({
  "duration": 287800,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Addition functionality .",
  "description": "",
  "id": "outline;addition-functionality-.;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I user adds numbers 1 and 1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
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
  "location": "OutlineTest.i_user_adds_numbers_and(int,int)"
});
formatter.result({
  "duration": 529300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 7
    }
  ],
  "location": "OutlineTest.result_should_be_printed(int)"
});
formatter.result({
  "duration": 517300,
  "error_message": "java.lang.AssertionError: expected:\u003c3\u003e but was:\u003c2\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:645)\r\n\tat org.junit.Assert.assertEquals(Assert.java:631)\r\n\tat stepDefinition.OutlineTest.result_should_be_printed(OutlineTest.java:54)\r\n\tat ✽.Then result 3 should be printed(Feature/Outline.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 56700,
  "status": "passed"
});
formatter.before({
  "duration": 255500,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Addition functionality .",
  "description": "",
  "id": "outline;addition-functionality-.;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I user adds numbers 5 and 6",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
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
  "location": "OutlineTest.i_user_adds_numbers_and(int,int)"
});
formatter.result({
  "duration": 178200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11",
      "offset": 7
    }
  ],
  "location": "OutlineTest.result_should_be_printed(int)"
});
formatter.result({
  "duration": 302000,
  "status": "passed"
});
formatter.after({
  "duration": 63500,
  "status": "passed"
});
formatter.before({
  "duration": 56500,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Addition functionality .",
  "description": "",
  "id": "outline;addition-functionality-.;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I user adds numbers 1 and 1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
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
  "duration": 324000,
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
  "duration": 115700,
  "status": "passed"
});
formatter.after({
  "duration": 135500,
  "status": "passed"
});
formatter.before({
  "duration": 66900,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Addition functionality .",
  "description": "",
  "id": "outline;addition-functionality-.;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I user adds numbers 1 and 11",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
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
  "location": "OutlineTest.i_user_adds_numbers_and(int,int)"
});
formatter.result({
  "duration": 146300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 7
    }
  ],
  "location": "OutlineTest.result_should_be_printed(int)"
});
formatter.result({
  "duration": 125200,
  "status": "passed"
});
formatter.after({
  "duration": 168200,
  "status": "passed"
});
});