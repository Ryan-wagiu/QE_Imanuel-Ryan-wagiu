Feature: Books
  As a user
  I wan to search book
  So I can find book I want

  Scenario: Search with available book
    Given I on book store page
    When I input available book name
    Then I will get book I want

  Scenario: Serch with non available book
    Given I on book store page
    When I input non available book name
    Then I will get nothing

  Scenario: Search with null
    Given I on book store page
    When I input null book name
    Then I will get all books available