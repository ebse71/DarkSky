Feature: ISpeakBetter login
  @signup
  Scenario: SignUp
    Given I am on the signup page
    When I enter name
    And  I enter lastname
    And  I enter email
    And  I enter any password
    And  I enter password again
    And  I click on the signup button
    Then I see success message
  @emptysignup
  Scenario: Empty Signup
    Given I am on the signup page
    When I enter any username
    And  I enter any password
    And  I click on the login button
    Then I see the error message
  @signupwithoutemail
  Scenario: Signup Without Email
    Given I am on the signup page
    When I enter any username
    And  I enter any password
    And  I click on the login button
    Then I see the error message