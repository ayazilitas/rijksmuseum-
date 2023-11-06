Feature: GET All Collection

  Scenario: As a User I should get all API collections

    Given User should see all collection
    Then User verify the status code and body

  Scenario: As a user, I should see 100 data on 1 page.

    Given User should see expected data
    Then User verify the status code and body

