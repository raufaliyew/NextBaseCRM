Feature: As a user, I should be able to create a poll

  Background: Logging as a HR user
    Given User logins with HR credentials
    When User clicks "Poll" tab


  Scenario: user creates a poll with Q/A
    And User adds Title
    And User adds question to question field
    And User adds multiple answers to answer fields
    And User clicks Send button
    Then User should see same poll with same title and same question in Activity Stream


  Scenario: user gets error message
    And User leaves empty title field
    And User adds question to question field
    And User adds multiple answers to answer fields
    And User clicks Send button
    Then User should see "The message title is not specified" notification

  Scenario: User creates poll with checking "allow multiple Choice"
    And User adds Title
    And User adds question to question field
    And User adds multiple answers to answer fields
    And User enables "allow multiple Choice" checkbox
    Then User should be able to select multiple answers in Activity Stream

  Scenario: User adds multiple questions to poll
    And User adds Title
    And User clicks Add question button
    Then User should see new QA fields

  Scenario: User cancels creating poll
    And User adds Title
    And User adds question to question field
    And User adds multiple answers to answer fields
    And User clicks Cancel button
    Then User should see active tab is Message
