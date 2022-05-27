Feature: login with different users
  @wip
 Scenario Outline: Login Scenario Outline
    Given user is on the login page of the library app
    When user enters "<email>" and "<password>"
    And user clicks on the login button
    Then user should see "<Username>"
   Examples:
   |email|password|Username|
   | student1@library    |    d5fv9BtX    |Test Student 1        |
   | student2@library    |    zyxa10vg    |Test Student 2        |
   | student3@library    |    rPjgZ86a|Test Student 3       |
   | student4@library    |    pG3V6qaL    |Test Student 4       |
   | student5@library    |    i1oDgf2d    |Test Student 5       |
   | student6@library    |    NXhpXJdC    |Test Student 6        |