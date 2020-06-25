Feature: promociones home page

  Scenario: Featured promotions are up to date
    When I am in Privalia Home Page
    Then All the featured ads are up to date

  Scenario: Current promotions are up to date
    When I am in Privalia Home Page
    Then All the current ads are up to date

  Scenario: Coming up promotions don't have a due date
    When I am in Privalia Home Page
    Then Coming up promotions don't have a due date