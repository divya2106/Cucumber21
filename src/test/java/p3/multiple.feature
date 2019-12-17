
Feature: Title of your feature
  I want to use this template for my feature file

  @smoke @unit
  Scenario: Newuser Signup
     Given User navigates to website
    And enters "lalitha" and 123
    When Click on the signup 
    Then welcomee page is appeared
   

  @unit 
  Scenario: Login existing user
    Given User enters user name
    And User enters password
    When User clicks on login button
    Then Home page is displayed

