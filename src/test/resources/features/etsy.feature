Feature: Etsy Title Verification
  User Story : Etsy Title Verification is working as expected

  Background:
    Given user is on etsy main page

  Scenario: Etsy title verification
    Then user verifies that title is Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


    Scenario: Search keyword verification
      When User searches for keyword
      Then keyword displays in the title
