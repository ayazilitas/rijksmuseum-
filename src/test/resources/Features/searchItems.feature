@wip
Feature: Search the items

  Scenario Outline: As a user I should search any item in data
    Given User should search "<expected_item>" by using the key words
    Then The data status code should be <expected_status_code>

    Examples:
      | expected_status_code | expected_item    |
      | 200                  | Amsterdam        |
      | 200                  | Harlem           |
      | 200                  | Japan            |
      | 200                  | Vincent van Gogh |
      | 404                  | Ahmet YAZILITAS  |
