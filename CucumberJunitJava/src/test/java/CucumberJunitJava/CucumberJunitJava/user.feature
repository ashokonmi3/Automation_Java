Feature: User Certification
 
 Background:
    When User is ready to test
 
  Scenario: User is Passed
    Given that the user Vinod is given a task to clear Java certification exam
    When Vinod got 60 marks in exam
    Then Vinod is known as Java certified
 
 @SMOKETEST
  Scenario: User is Passed in certification
    Given that the user Ashok is given a task to clear Java certification exam
    When Ashok got 80 marks in exam
    Then Ashok is known as Java certified
  @REGRESSION
 Scenario: User is failed
    Given that the user x is given a task to clear Java certification exam
    When x got 40 marks in exam
    Then x is not known as Java certified
          #(.*) is not known as (.*) certified