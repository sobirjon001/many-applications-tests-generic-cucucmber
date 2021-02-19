@regression @all @cybertek
Feature: TC#28: PracticeCybertek/dropdownsmonth dropdown options verification

  @smoke @dataTale
  Scenario: User should be able to see all 12 months in dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January    |
      | February   |
      | March      |
      | April      |
      | May        |
      | June       |
      | July       |
      | August     |
      | September  |
      | October    |
      | November   |
      | December   |