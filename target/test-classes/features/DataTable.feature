Feature: DataTables Practice

  @wip
  Scenario: DataTable login
    Given User is on the login page of Library App
    When user enters username and password and clicks login button
    |username|student1@library|
    |password|d5fv9BtX5555        |
    Then user should see dashboard
