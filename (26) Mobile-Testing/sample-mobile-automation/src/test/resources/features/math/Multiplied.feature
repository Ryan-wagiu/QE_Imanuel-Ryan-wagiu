@multiplied
Feature: Multiplied
  As a user
  I want to multiplied a number
  So I can have the result

  Scenario: Five times two
    Given I on calculator
    When I input five
    And I click multiplied Button
    And I input two
    Then I get result ten

  Scenario: Four times two
    Given I on calculator
    When I input four
    And I click multiplied Button
    And I input two
    Then I get result eight
