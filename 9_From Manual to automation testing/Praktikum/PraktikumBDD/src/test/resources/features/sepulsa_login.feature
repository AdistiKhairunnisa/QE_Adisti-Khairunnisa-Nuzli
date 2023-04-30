Feature: Login Sepulsa

  @Login @NormalPositive
    Scenario: user Login to sepulsa login page
    Given User is on sepulsa login page
    When User input correct email to field email
    And User input correct password to field password
    And User click login
    Then User is on homepage

  @Login @NormalNegative
  Scenario: user cannot Login to sepulsa login page with incorrect email
    Given User is on sepulsa login page
    And User input incorrect email to field email
    And User input password to field password
    And User click login
    Then User cannot login and still on login page

  @Login @NormalNegative
  Scenario: user cannot Login to sepulsa login page with incorrect password
    Given User is on sepulsa login page
    And User input correct email to field email
    And User input incorrect password to field password
    And User click login
    Then User cannot login and still on login page

  @Login @NormalNegative
  Scenario: user cannot Login to sepulsa login page with incorrect email and password
    Given User is on sepulsa login page
    And User input incorrect email to field email
    And User input incorrect password to field password
    And User click login
    Then User cannot login and still on login page