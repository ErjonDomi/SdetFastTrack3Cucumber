
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

      @wip
      Scenario: Wikipedia image header verification
        Given user is in the wikipedia main page
        When user searches for Steve Job
        And user clicks search button
        Then user should see Steve Jobs in Image header text