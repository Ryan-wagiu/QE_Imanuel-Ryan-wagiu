Feature: Login
  As a user
  I want to login with my email and password
  So i can access all of the feature

  Scenario: Login with null email and null password
    Given I go to login page
    When I click Login button
    Then I will get error message data is required
    And I can't login

  Scenario: Login with null email and valid password
    Given I go to login page
    When I input valid password
    And I click Login button
    Then I will get error message data email is required

  Scenario: Login with valid email and null password
    Given I go to login page
    When I input valid email
    And I click Login button
    Then I will get error message data password is required

  Scenario: Login with valid email and valid password
    Given I go to login page
    When I input valid email
    And I input valid password
    And I click Login button
    Then I have logged in