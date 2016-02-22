Feature: During the week every person should go to work, but should not go in the weekends.

  Background:
    Given There is a person

  Scenario: It is Monday morning
    And it is not weekend
    When the alarm rings
    Then the person should get up and go to work

  Scenario: My first test
  Given This is my first step
  When This is second step
  Then This is third step