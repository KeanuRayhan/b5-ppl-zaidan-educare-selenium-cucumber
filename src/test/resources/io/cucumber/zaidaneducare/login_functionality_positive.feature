Feature: Login Functionality

  Scenario: Check login is successful with valid credentials as role "bendahara"
    Given User has navigated to the login page
    When User enters username "bendahara" and password "admin123"
    And User clicks the login button
    Then User is navigated to the dashboard page with title "Dasbor - Bendahara"
    And User should see navigation bar for bendahara
