Feature: Logout from ZaidanEducare

    Scenario: Logout from dashboard as role "bendahara"
        Given User has login using valid credentials as role "bendahara" with password "admin123"
        When User clicks logout button on top right in the navigation bar section
        And User clicks yes on confirmation pop up
        Then User is redirected to the login page
        And User should be able to see username and password fields input