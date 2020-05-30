$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CucumberJunitJava/CucumberJunitJava/test.feature");
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
    },
    {
      "line": 20,
      "value": "#@tag"
    }
  ],
  "line": 21,
  "name": "Test 1",
  "description": "I want to use this template for my feature file",
  "id": "test-1",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 23,
  "name": "User is failed",
  "description": "",
  "id": "test-1;user-is-failed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "that the user x is given a task to clear Java certification exam",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "x got 40 marks in exam",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "x is not known as Java certified",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "x",
      "offset": 14
    },
    {
      "val": "Java",
      "offset": 41
    }
  ],
  "location": "UserSteps.certificationName(String,String)"
});
formatter.result({
  "duration": 172781800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "x",
      "offset": 0
    },
    {
      "val": "40",
      "offset": 6
    }
  ],
  "location": "UserSteps.gotMarks(String,int)"
});
formatter.result({
  "duration": 581000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "x",
      "offset": 0
    },
    {
      "val": "Java",
      "offset": 18
    }
  ],
  "location": "UserSteps.certifiedNo(String,String)"
});
formatter.result({
  "duration": 4085800,
  "status": "passed"
});
formatter.uri("CucumberJunitJava/CucumberJunitJava/user.feature");
formatter.feature({
  "line": 1,
  "name": "User Certification",
  "description": "",
  "id": "user-certification",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is ready to test",
  "keyword": "When "
});
formatter.match({
  "location": "UserSteps.readyfortest()"
});
formatter.result({
  "duration": 204800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User is Passed",
  "description": "",
  "id": "user-certification;user-is-passed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "that the user Vinod is given a task to clear Java certification exam",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Vinod got 60 marks in exam",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Vinod is known as Java certified",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Vinod",
      "offset": 14
    },
    {
      "val": "Java",
      "offset": 45
    }
  ],
  "location": "UserSteps.certificationName(String,String)"
});
formatter.result({
  "duration": 79400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vinod",
      "offset": 0
    },
    {
      "val": "60",
      "offset": 10
    }
  ],
  "location": "UserSteps.gotMarks(String,int)"
});
formatter.result({
  "duration": 113900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vinod",
      "offset": 0
    },
    {
      "val": "Java",
      "offset": 18
    }
  ],
  "location": "UserSteps.certifiedYes(String,String)"
});
formatter.result({
  "duration": 116500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is ready to test",
  "keyword": "When "
});
formatter.match({
  "location": "UserSteps.readyfortest()"
});
formatter.result({
  "duration": 64700,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User is Passed in certification",
  "description": "",
  "id": "user-certification;user-is-passed-in-certification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@SMOKETEST"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "that the user Ashok is given a task to clear Java certification exam",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Ashok got 80 marks in exam",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Ashok is known as Java certified",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Ashok",
      "offset": 14
    },
    {
      "val": "Java",
      "offset": 45
    }
  ],
  "location": "UserSteps.certificationName(String,String)"
});
formatter.result({
  "duration": 95300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ashok",
      "offset": 0
    },
    {
      "val": "80",
      "offset": 10
    }
  ],
  "location": "UserSteps.gotMarks(String,int)"
});
formatter.result({
  "duration": 155600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ashok",
      "offset": 0
    },
    {
      "val": "Java",
      "offset": 18
    }
  ],
  "location": "UserSteps.certifiedYes(String,String)"
});
formatter.result({
  "duration": 161700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is ready to test",
  "keyword": "When "
});
formatter.match({
  "location": "UserSteps.readyfortest()"
});
formatter.result({
  "duration": 217700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User is failed",
  "description": "",
  "id": "user-certification;user-is-failed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@REGRESSION"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "that the user x is given a task to clear Java certification exam",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "x got 40 marks in exam",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "x is not known as Java certified",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "x",
      "offset": 14
    },
    {
      "val": "Java",
      "offset": 41
    }
  ],
  "location": "UserSteps.certificationName(String,String)"
});
formatter.result({
  "duration": 408300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "x",
      "offset": 0
    },
    {
      "val": "40",
      "offset": 6
    }
  ],
  "location": "UserSteps.gotMarks(String,int)"
});
formatter.result({
  "duration": 141400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "x",
      "offset": 0
    },
    {
      "val": "Java",
      "offset": 18
    }
  ],
  "location": "UserSteps.certifiedNo(String,String)"
});
formatter.result({
  "duration": 96800,
  "status": "passed"
});
});