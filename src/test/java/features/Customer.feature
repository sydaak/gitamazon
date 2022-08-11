Feature: Test
  Background:
    Given Customer already in a home page

    Scenario: User test
    When Customer try to click hamburger menu
    Then Customer able to open hamburger menu

      When Customer try to click TV, Appliances, Electronics option
      Then Customer success to click TV, Appliances, Electronics option

      When Customer try to click Televisions
      Then Customer able to click Televisions

      When Customer try to select brand Samsung
      Then Customer able to select brand Samsung

      When Customer try to click feature
      Then Customer able to click feature

      When Customer try to select price high to low
      Then Customer able to select price high to low

      When Customer try to click on the second highest priced item
      Then Customer able to click on the second highest priced item

      When Customer want to check about this item
      Then Customer able to check about this item