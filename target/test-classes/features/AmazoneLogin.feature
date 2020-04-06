Feature: Amazon scenarios

  Scenario: Login to Amazon page
    Given I login to "Amazon" page
    Then I page is loaded successfully

  Scenario: Find a gift
    Given I login to "Amazon" page
    When I mouse over "Account & Lists"
    And I choose item from "Your Lists"
    Then I am navigated to the chosen page

