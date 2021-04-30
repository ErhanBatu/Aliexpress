@wip1
Feature: Automating payment functionality

  Scenario: User should be able to reach checkout
    Given the user is on the home page
    When the user clicks on Account button
    Then the user clicks on Sigin button
    And the user logs in "g.sallyaddress@outlook.com" and "Ww12345678"
    And the user should be able to click on Create Account button
    And the user enter "Apple iPhone 5 Used" in search box
    And the user selects an item
    And the user choose "16G" "White simple set"
    And the user click on Buy Now button
    And the user clicks on proceed button
    And the user should be able to see "Update address" screen
