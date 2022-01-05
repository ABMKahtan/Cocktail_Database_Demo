Feature: Whats on the menu?
  As a customer I want to see what drinks are available at the bar so that i can then choose my drink.

  Scenario: I successfully see the menu
    Given That a menu exists
    When A customer requests to see the menu
    Then The list of cocktails is then shown to the customer

