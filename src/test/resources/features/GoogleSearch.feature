@regression @smoke
Feature: Google search functionality
  Agile story: As a user, when I am on the google page search page,
  I should be able to search whatever I want, and see relevant information

  Background: User is already on Google home page
    #Will be applied in all Scenarios
    #Very similar tool to @BeforeMethod from TestNG
    Given User is on Google home page

  @google @all
  Scenario: Search page title verification
    Then User should see title is "Google"

    @google @all @outline @dataBase
  Scenario Outline: User search title verification
    When User Searches for "<search keyword>"
    Then User should see "<search keyword>" in the title
    Examples: possible search keywords:
      | search keyword |
      | apple          |
      | wooden spoon   |
      | orange         |
