Feature: Login with Parameters


  Scenario: login with parameters at library app
    Given user is in the login page of library application
    When librarian enters username "librarian1@library" and password "qU9mrvur"
    And librarian clicks login button
    Then librarian should see his username "Test Librarian 1" displayed in the page


    Scenario: login with parameters as student
      Given user is in the login page of library application
      When student enters username "student1@library" and password "d5fv9BtX"
      And students clicks login button
      Then student should see his username "Test Student 1" displayed in the page