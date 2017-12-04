Feature: Login

  Scenario: Registered user login

    Given User is registered on Transavia
    When on Logon page "https://www.transavia.com/en-EU/my-transavia/account/logon/"
    And User provide registered user ID "sapana.dhuppe@gmail.com"
    And User provide password "Smile@123"
    And user click on Login Button "Log in"
    Then User is login with home page