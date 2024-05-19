Feature: User Login
  As a user
  I want to be able to login to my account
  So that I can access my personalized content

  @raditTest
  Scenario: [T0.0.1] Login successful with valid credentials
    Given I am on the login page
    When I enter my username "standard_user" and password "secret_sauce"
    And I click the login button
    Then I should be logged in successfully and view the menu