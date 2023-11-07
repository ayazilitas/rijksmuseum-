@wipr
Feature: Get all information

  Scenario: As a User I get all information of image
    Given User gets the information in json format
    Then Verify the status code and body