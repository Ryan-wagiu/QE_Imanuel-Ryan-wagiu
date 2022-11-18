@subtraction
Feature: Subtraction
  As a user
  I want to subtraction a number
  So I can have the result

  Scenario: Five minus two
    Given I on calculator
    When I input five
    And I click Subtraction Button
    And I input two
    Then I get result three

  Scenario: Five minus nine
    Given I on calculator
    When I input five
    And I click Subtraction Button
    And I input nine
    Then I get result minus four

  Scenario: nine minus two
    Given I on calculator
    When I input nine
    And I click Subtraction Button
    And I input two
    Then I get result seven

  Scenario: five point two minus two
    Given I on calculator
    When I input five point two
    And I click Subtraction Button
    And I input two
    Then I get result three point two