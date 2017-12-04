Feature: Book a flight

  Scenario: Booking a flight

    Given Flight search page is available
    When Open page "https://www.transavia.com/en-EU/book-a-flight/flights/search/"
    And Select From Textbox to put outbound airport "Amsterdam (Schiphol), Netherlands"
    And Select To Textbox to put destination airport "Agadir, Morocco"
    And Select Depart on date "1 Jan 2018"
    And Select Return on date "23 Jan 2018"
    And Select the number of people travelling ""
    Then user click on Search Button ""
    Then User is login with home page