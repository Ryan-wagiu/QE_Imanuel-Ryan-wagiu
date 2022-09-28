Feature: Logout
  As a user
  I want to logout
  So I can login again

  Scenario: succsess logout
    Given I have logged in
    When I click Logout button
    Then I will go to login page