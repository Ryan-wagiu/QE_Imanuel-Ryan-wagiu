Feature: Signin
  As a user
  I want to create account with my email and password
  So i can access all of the feature

  Scenario: Signin with null email and null password
    Given I go to signin page
    When I click Signin button
    Then I will get error message password and email is required
    And I can't signin

  Scenario: Signin with valid email and null password
    Given I go to signin page
    When  I input new valid email
    And I click Signin button
    Then I will get error message password is required

  Scenario: Signin with null email and valid password
    Given I go to signin page
    When  I input new valid password
    And I click Signin button
    Then I will get error message email is required

  Scenario: Signin with valid email and valid password
    Given I go to signin page
    When I input new valid email
    And I input new valid password
    And I click Signin button
    Then I have logged in
    And I created an new account