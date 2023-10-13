Feature: Login Functionality

  Scenario: Successful login
    Given browser is open
    And user is on login page
    When I enter username and password
    And I click the login button
    Then Add to card, checkout and logout
