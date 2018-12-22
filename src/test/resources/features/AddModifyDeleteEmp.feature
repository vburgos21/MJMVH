#Author: SyntaxTeam@your.domain.com
Feature: Add Modify Delete Employee feature

  Background: 
    Given OrangeHRM logo is displayed

  Scenario: Add Employee
    When I enter "admin" and "admin123"
    And I click on login button
    And I click on PIM
    And I navigated to the Add Employee Page
    When I provide the "Ray" and "Bayou" and "Prince" of the employee
    Then I successfully added an employee

  Scenario: Modify Employee
    When I enter "admin" and "admin123"
    And I click on login button
    And I click on PIM
    And I go to the Employee List Page
    When I search for employee with name and id of "Ray Bayou Prince" and "0076"
    And Search results table appears
    And selected employee "Ray Bayou Prince" 
    Then I navigated to the employee profile
    And I can edit Employee information

  Scenario: Delete Employee
    When I enter "admin" and "admin123"
    And I click on login button
    And I click on PIM
    And I go to the Employee List Page
    When I search for employee with name and id of "Ray Bayou Prince" and "0076"
    And Search results table appears
    Then I should be able to delete that employee "Ray" 
