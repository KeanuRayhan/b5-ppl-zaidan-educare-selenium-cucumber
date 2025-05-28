Feature: Access to ZaidanEducare

  Scenario: Access login page
    Given I navigate to the login page
    Then I should see the login form
    And the page title should be displayed
