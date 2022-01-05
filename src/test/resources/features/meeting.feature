@Meeting
Feature: Meeting feture

  Background: the user is logged in the StartSharp Page
    Given User login in the StartSharp with the user 'admin' and password 'serenity'

    Scenario: the user want create a new meeting
      Given The user goes to the meeting section
      When The user select the option to create a new meeting
      And The user fills the form to create a new meeting with the data
      |name|type   |number|startDate |endDate   |location|unit    |organizedBy     |reporter        |attendee        |
      |Meet|General|001   |01/05/2022|01/05/2022|Medellin|Felosque|Alejandro Ibarra|Alejandro Ibarra|Alejandro Ibarra|
      Then the meet is created