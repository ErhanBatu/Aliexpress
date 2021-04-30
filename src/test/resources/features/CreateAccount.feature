
Feature: Users should be able to create an account

  Background:
    Given the user is on the home page
  @wip2
  Scenario Outline: Create an account with valid credentials (Positive Testing)
    When the user clicks on Account button
    Then the user clicks on Join button
#    And the user should be able to click on View more sign-in options button
    And the user clicks on Register with Email section
    And the user logs in using "<Email>" and "<Password>"
    And the user should be able to click on Create Account button
    And the user should be able to see "<Email>" address under Account button

    Examples:
      | Email                   | Password   |
      | yisoti3017@httptuan.com | Ww12345678 |

  @wip3
  Scenario Outline: Create an account with invalid credentials (Negative Testing)
    When the user clicks on Account button
    Then the user clicks on Join button
#    And the user should be able to click on View more sign-in options button
    And the user clicks on Register with Email section
    And the user logs in using "<Email>" and "<Password>"
    And Error message "This email already exists." is displayed

    Examples:
      | Email                   | Password  |
      | yisoti3017@httptuan.com | Ww1235678 |


