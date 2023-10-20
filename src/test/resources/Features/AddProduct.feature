Feature: Add Product
  Scenario: I wants to add product to the shopping cart
    Given click name of product
    And click add to cart button
    When click basket button
    Then shopping cart in website swag labs