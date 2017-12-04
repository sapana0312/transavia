# new feature
# Tags: optional
    
Feature: To see the navigation of different pages
    
Scenario: Navigation
    Given User is registered on Transavia
    When on Logon page "https://www.transavia.com/en-EU/my-transavia/account/logon/"
    And User provide registered user ID "sapana.dhuppe@gmail.com"
    And User provide password "Smile@123"
    And user click on Login Button "Log in"
    Then User is login with home page
    When user click on "plan and book" top menu
    Then "Plan and Book" process dialog section is displayed
    When user click on "Manage your booking" top menu
    Then "Manage your booking" process dialog section is displayed
    When user click on "Service" top menu
    Then "Service" process dialog section is displayed
    When user click on "Home" top icon
    Then home page is displayed
