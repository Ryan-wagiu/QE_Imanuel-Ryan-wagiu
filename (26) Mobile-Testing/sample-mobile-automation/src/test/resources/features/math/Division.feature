@division
Feature: Division
  As a user
  I want to division a number
  So I can have the result

  Scenario: Five divide two
    Given I on calculator
    When I input five
    And I click divide Button
    And I input two
    Then I get result two point five

  Scenario: Four divide two
    Given I on calculator
    When I input four
    And I click divide Button
    And I input two
    Then I get result two
