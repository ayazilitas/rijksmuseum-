Feature: Get the maker data

  Scenario: As a user I should get the maker data
    Given User should get "Vincent van Gogh" data
    Then User verify that the status code should be 200

  Scenario: As a user I should not get invalid maker data
    Given User should get "Ahmet Nederland" data
    Then Status code should be 404