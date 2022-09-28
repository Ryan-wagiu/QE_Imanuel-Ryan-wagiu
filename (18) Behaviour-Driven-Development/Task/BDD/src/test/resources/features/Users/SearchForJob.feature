Feature: Search For Job
  As a user
  I want search list job
  So I can find job looking for

  Scenario: apply job
    Given I go to job page
    When I click job name
    And I click apply button
    Then I go to company website

  Scenario: seve job with not logged in
    Given I go to job page
    When I click job name
    And I click Save button
    Then I a will get massage login first.

  Scenario: Save job with logged in
    Given I go to job page
    And I have logged in
    When I click job name
    And I click Save button
    Then I a save job in my job