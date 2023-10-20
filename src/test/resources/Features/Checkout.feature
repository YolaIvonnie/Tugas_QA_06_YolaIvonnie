Feature: Checkout Product
  Scenario: I want to buy product
    Given click add to cart button on the product
    And click basket button
    When click checkout button
    And Input first name
    And Input last name
    When Input postal code
    Then click finish button