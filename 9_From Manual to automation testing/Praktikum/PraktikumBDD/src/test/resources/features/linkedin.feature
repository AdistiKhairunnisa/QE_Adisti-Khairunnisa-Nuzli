Feature: LinkedIn Home

  @Login @NormalPositive
  Scenario: Login to LinkedIn
    Given User is on LinkedIn login page
    When User input email to field email
    And User input password to field password
    And User click login
    Then User is on homepage

  @CreateNewPost @NormalPositive
    Scenario: Create a new post
    Given user is on login page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on homepage
    And user input post
    And user click post
    Then user see their post in their feeds

    @CreateNewPost @NormalNegative
      Scenario: Create a new post
      Given user is on login page
      And user input correct username
      And user input correct password
      And user click login
      Then user is on homepage
      And user input blank post
      And user click post
      Then user can't click button post

    @CommentPost @NormalPositive
    Scenario: Comment in a post
    Given user is on LinkedIn login page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on homepage
    And user input post
    And user click send post
    Then user see their post in their feeds
    And user click comment button
    And user input comment
    And user click send comment

  @CommentPost @NormalNegative
  Scenario: Comment in a post
    Given user is on LinkedIn login page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on homepage
    And user input post
    And user click send post
    Then user see their post in their feeds
    And user click comment button
    And user input blank comment
    Then user can't click button post

    @likePost @NormalPositive
      Scenario: Like posts on LinkedIn Home
      Given user is on LinkedIn login page
      And user input correct username
      And user input correct password
      And user click login
      Then user is on homepage
      And user click button like
      And user choose emoticon like
      Then user can like and see her reaction


