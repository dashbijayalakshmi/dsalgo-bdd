@tag
Feature: DS-Algo Home page

  @homepage
  Scenario: Validate dropdown list displayed on the home page
    Given User enters home page.
    When drop-down list is present
    Then List of modules are present in the drop-down list
