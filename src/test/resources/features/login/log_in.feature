Feature: Log in

  Scenario: Try to log in with valid credentials and go to products
    Given Christian wants to access to sauce app
    When he sends his credentials
    Then he should see the products
    And access to a product
    And back to the products view again

