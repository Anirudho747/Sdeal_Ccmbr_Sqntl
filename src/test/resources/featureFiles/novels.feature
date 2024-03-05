Feature: Filter Books and sort Dress

  Scenario Outline: Select  Thriller novels and Educational books having more than 4 Stars in Reviews
                    Given user is at Homescreen
                    When user searches for "<searchTerm>"
                    And user taps on Filter
                    And selects Customer rating of 4 and above
                    And discount of "<discountPercent>"
                    And upper price is set to "<upperLimit>"
                    And taps om Apply Filter
                    Then user is moved to result screen
                    And screen has matching labels
  Examples:
  | searchTerm        | discountPercent | upperLimit     |
  | Thriller novels   | 0-10            | 2000           |
  | Educational books | 10-20           |  500           |


  Scenario Outline: Select Dress and arrange them by discount
    Given user is at Homescreen
    When user searches for "<searchTerm>"
    Then user is moved to result screen
    And selects size of "<size>"
    And taps apply filter button
    When user applies Sort by discount
    Then user is shown sorted list
    And user can see scratched price and new price

    Examples:
      | searchTerm   | size  |
      | Jeans        |  34   |
      | Denim Shirt  |  42   |
