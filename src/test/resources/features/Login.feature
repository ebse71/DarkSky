
Feature: ISpeakBetter login
   Scenario: Valid login

    Given I am on the login page
    When enter valid username
    And  enter valid password
    And  click on the login button
    Then see the home page

@invalidlogin
  Scenario: Invalid login

    Given I am on the login page
    When enter invalid username
    And  enter invalid password
    And  click on the login button
    Then see the error message


