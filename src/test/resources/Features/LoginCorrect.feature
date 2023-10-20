Feature: Successful login
  @regression
  Scenario: I want to shopping online in Swag Labs
    Given I am on log in page
    And Input username
    And Input password
    When Click log in button
    Then Dashboard website swag labs

    @TTD
    Scenario Outline: user login to Swag Labs
      Given I am on log in page
      And I Input <username> as username
      And I Input <password> as password
      When Click log in button
      Then I verify <status> login result

      Examples:
        | username     | password    | status |
        |standard_user |secret_sauce |success |
        |standard_user |123456789    |failed  |

