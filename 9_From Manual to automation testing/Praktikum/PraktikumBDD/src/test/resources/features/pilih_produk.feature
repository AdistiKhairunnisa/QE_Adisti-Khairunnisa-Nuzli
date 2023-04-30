Feature: Sepulsa choose product

  @ChooseProduct @NormalPositive
  Scenario: Choose product and fill the required data
    Given user is on sepulsa login page
    And user input correct username
    And user input correct password
    Then user is on sepulsa home page
    And user choose the product
    And user fill the required data
    Then user can continue to pay the bill

  @ChooseProduct @NormalNegative
  Scenario: Choose product and fill blank the required data
    Given user is on sepulsa login page
    And user input correct username
    And user input correct password
    Then user is on sepulsa home page
    And user choose the product
    And user fill blank the required data
    Then user cannot continue to pay the bill