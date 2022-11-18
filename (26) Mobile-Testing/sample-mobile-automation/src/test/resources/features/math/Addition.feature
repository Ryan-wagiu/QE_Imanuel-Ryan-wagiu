@addition
Feature: Addition
  As a user
  I want to Addition a number
  So I can have the result

  Scenario: Five plus two
    Given I on calculator
    When I input five
    And I click Addition Button
    And I input two
    Then I get result seven

  Scenario: Five plus nine
    Given I on calculator
    When I input five
    And I click Addition Button
    And I input nine
    Then I get result fourteen

  Scenario: nine plus two
    Given I on calculator
    When I input nine
    And I click Addition Button
    And I input two
    Then I get result eleven

  Scenario: five point two plus two
    Given I on calculator
    When I input five point two
    And I click Addition Button
    And I input two
    Then I get result seven point two