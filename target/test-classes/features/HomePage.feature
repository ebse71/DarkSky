@temperature
Feature: DarkSky Homepage
   Scenario: Elements displayed correctly

    Given I am on the Homepage
    When enter city name
    And  click on the search button
    Then see the temperature

