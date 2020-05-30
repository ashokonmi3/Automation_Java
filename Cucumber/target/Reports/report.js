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
  "comments": [
    {
      "line": 23,
      "value": "#@IGNORE"
    },
    {
      "line": 24,
      "value": "#Scenario Outline: Login functionality for a social networking site."
    },
    {
      "line": 25,
      "value": "#Givenuser navigates to Facebook"
    },
    {
      "line": 26,
      "value": "#When I enter Username as \"\u003cusername\u003e\" and Password as \"\u003cpassword\u003e\""
    },
    {
      "line": 27,
      "value": "#Then login should be unsuccessful"
    },
    {
      "line": 28,
      "value": "#"
    },
    {
      "line": 29,
      "value": "#Examples:"
    },
    {
      "line": 30,
      "value": "#|username |password |"
    },
    {
      "line": 31,
      "value": "#|admin |admin@123 |"
    },
    {
      "line": 32,
      "value": "#|admin |admin |"
    }
  ],
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
        "3"
      ],
      "line": 43,
      "id": "outline;addition-functionality-.;;3"
    },
    {
      "cells": [
        "5",
        "6",
        "11"
      ],
      "line": 44,
      "id": "outline;addition-functionality-.;;4"
    },
    {
      "cells": [
        "1",
        "1",
        "2"
      ],
      "line": 45,
      "id": "outline;addition-functionality-.;;5"
    },
    {
      "cells": [
        "1",
        "1",
        "2"
      ],
      "line": 46,
      "id": "outline;addition-functionality-.;;6"
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
  "duration": 156681002,
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
  "duration": 2359073,
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
  "duration": 332386,
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
  "duration": 913075,
  "error_message": "java.lang.AssertionError: expected:\u003c3\u003e but was:\u003c2\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:645)\r\n\tat org.junit.Assert.assertEquals(Assert.java:631)\r\n\tat stepDefinition.OutlineTest.result_should_be_printed(OutlineTest.java:54)\r\n\tat ✽.Then result 3 should be printed(Feature/Outline.feature:38)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 44,
  "name": "Addition functionality .",
  "description": "",
  "id": "outline;addition-functionality-.;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 37,
  "name": "I user adds numbers 5 and 6",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
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
  "duration": 363177,
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
  "duration": 327255,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Addition functionality .",
  "description": "",
  "id": "outline;addition-functionality-.;;5",
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
  "duration": 232117,
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
  "duration": 322122,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Addition functionality .",
  "description": "",
  "id": "outline;addition-functionality-.;;6",
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
  "duration": 339887,
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
  "duration": 379757,
  "status": "passed"
});
});