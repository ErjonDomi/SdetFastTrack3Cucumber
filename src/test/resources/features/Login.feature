Feature: Testing login page

  Background: user is on login page
    Given user is on the login page


  Scenario: Student login test

    When student enters username
    And student enters password
    And student clicks login button
    Then student should see dashboard

  @wip
    Scenario:
      When librarian enters username
      And librarian enters password
      And librarian click login button
      Then librarian should see his username displayed.

