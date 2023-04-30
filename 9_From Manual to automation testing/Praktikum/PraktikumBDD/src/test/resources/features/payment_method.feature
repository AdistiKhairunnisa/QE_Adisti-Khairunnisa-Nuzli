Feature: Sepulsa paying method

  @PayingMethod @NormalPositive
    Scenario: User choose paying method
    Given user is on sepulsa login page
    And user input correct username
    And user input correct password
    Then user is on sepulsa home page
    And user choose the product
    And user fill the required data
    Then user can continue to pay the bill
    And user choose the paying method
    And user click pay button
    Then user successfully pay the product

  @PayingMethod @NormalNegative
  Scenario: User cannot choose paying method
    Given user is on sepulsa login page
    And user input correct username
    And user input correct password
    Then user is on sepulsa home page
    And user choose the product
    And user fill blank the required data
    Then user cannot choose paying method

  @PayingMethod @NormalNegative
  Scenario: User did not choose paying method
    Given user is on sepulsa login page
    And user input correct username
    And user input correct password
    Then user is on sepulsa home page
    And user choose the product
    And user fill the required data
    Then user can continue to pay the bill
    And user did not choose the paying method
    And user click pay button
    Then user cannot pay the product

