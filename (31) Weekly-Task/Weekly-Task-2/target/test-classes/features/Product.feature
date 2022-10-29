Feature:
  As a user
  I want to add product
  So I can manage the product

  Scenario: add new Product
    Given I set url add Product
    And  I set email username password
    When I send request add product
    Then I get status code 203

  Scenario: Get all product
    Given I set the url
    When I send request get all product
    Then I get status code 200

  Scenario: Get a single product
    Given I set url get a product
    When I request get product
    Then I get status code 200