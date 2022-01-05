@BusinessUnit
Feature: Business Unit Feature

  Background: the user is logged in the StartSharp Page
    Given User login in the StartSharp with the user 'admin' and password 'serenity'

    Scenario: the user want create one Business Unit
      Given The user goes to the business unit section
      When The user select the option to create a new Business Unit
      And The user fills the form to create a Business Unit with the data
      | name     | parentUnit |
      | Felosque | myparent |
      Then the business unit is created