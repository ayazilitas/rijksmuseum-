@wip
Feature: Sort artists a-z

  Scenario: As a User I should sort artist from a to z
    Given User should sort the data from a to z
    Then verify the status code 200
    And Verify that first artist is"'s Lands Werf Amsterdam", last artist is "Raphaël Sadeler (I)"


  Scenario: As a user should sort the artistDesc from z to a

    Given User should sort the collection from z to a
    Then verify the status code 200
    And Verify first artist is"Raphaël Sadeler (I)", last artist is "'s Lands Werf Amsterdam"
