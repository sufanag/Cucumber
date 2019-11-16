@Search-Cars
Feature: Acceptance testing to validate search cars page 

 @Search-Cars-Positive
  Scenario: Validate Search Cars Page
    Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide Website
    When I move to Car For Sale Menu
      | Menu          |
      | Cars For Sale |
    And click on "Search Cars" link
    