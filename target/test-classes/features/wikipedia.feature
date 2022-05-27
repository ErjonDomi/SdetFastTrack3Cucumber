Feature: Wikipedia search feature


  Scenario: Wikipedia title verifcation
    Given user is in the wikipedia main page
    When user searches for Steve Job
    And user clicks search button
    Then user should see Steve Jobs in title


  Scenario: Wikipedia header verification
    Given user is in the wikipedia main page
    When user searches for Steve Job
    And user clicks search button
    Then user should see Steve Jobs on the header

  Scenario: Wikipedia image header verification
    Given user is in the wikipedia main page
    When user searches for Steve Job
    And user clicks search button
    Then user should see Steve Jobs in Image header text


  Scenario: Wikipedia title verifcation
    Given user is in the wikipedia main page
    When user searches for "Steve Jobs"
    And user clicks search button
    Then user should see "Steve Jobs" in title


  Scenario: Wikipedia header verification
    Given user is in the wikipedia main page
    When user searches for "Steve Jobs"
    And user clicks search button
    Then user should see "Steve Jobs" on the header


  Scenario: Wikipedia image header verification
    Given user is in the wikipedia main page
    When user searches for "Steve Jobs"
    And user clicks search button
    Then user should see "Steve Jobs1332" in Image header text



  Scenario Outline: Wikipedia title header and image verification
    Given user is in the wikipedia main page
    When user searches for "<keyword>"
    And user clicks search button
    Then user should see "<expectedTitles>" on the title
    And user should see  "<expectedHeader>"  on the header
    And user should see "<expectedImageText>" on the Image
    Examples:
      | keyword     | expectedTitles | expectedHeader | expectedImageText |
      | Steve Jobs  | Steve Jobs     | Steve Jobs     | Steve Jobs        |
      | Johnny Depp | Johnny Depp    | Johnny Depp    | Johnny Depp       |
      | Amber Heard | Amber Heard    | Amber Heard    | Amber Heard       |

