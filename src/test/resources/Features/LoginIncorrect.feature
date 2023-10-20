Feature: Failed login
  Scenario: I want to shopping online in Swag Labs
    Given I am on log in page
    And Input username
    And Input invalid password
    When Click log in button
    Then User get error message