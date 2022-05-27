Feature: DataTables Practice


  Scenario: DataTable login
    Given User is on the login page of Library App
    When user enters username and password and clicks login button
      | username | student1@library |
      | password | d5fv9BtX         |
    Then user should see dashboard


  Scenario: User should be able to see all 12 months in months dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January     |
      | February    |
      | March       |
      | April       |
      | May         |
      | June        |
      | July        |
      | August      |
      | September   |
      | October     |
      | November    |
      | December123 |


  Scenario: User should be able to see all the page option numbers
    Given librarian is on the login page of the app
    When librarian enters username and password and clicks login button
    And librarian clicks user link
    Then librarian should see page dropdown numbers
      #5, 10, 15, 50, 100, 200, 500
      | 5  |
      | 10 |
      | 15 |
      | 50 |
      | 100 |
      | 200 |
      | 500 |



