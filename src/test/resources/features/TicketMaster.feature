Feature: TecketMaster

  Scenario: Automate Scenario for TicketMasterPage
    Given Navigate to "TicketMaster.com"
    And Conduct search for all events in "San Francisco"
    And Confirm the correct City name is displayed
    And Filter by Date Range of April 1-30
    And Filter by Distance of 75 Miles
    Then Return a text file with cancelled events efter "6" PM
    And The file should have a desired format
