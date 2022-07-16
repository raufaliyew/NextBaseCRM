@B26G27-80
Feature: As a user, I should be able to create a poll

  Background: Logging as a HR user
    Given User logins with HR credentials
    When User clicks "Poll" tab


  @B26G27-59 @B26G27-79 @B26G27-66
  Scenario: user creates a poll with Q/A
    And User adds Title
    And User adds question to question field
    And User adds multiple answers to answer fields
    And User clicks Send button
    Then User should see same poll with same title and same question in Activity Stream

  @B26G27-60 @B26G27-79 @B26G27-66
  Scenario: user gets error message
    And User leaves empty title field
    And User adds question to question field
    And User adds multiple answers to answer fields
    And User clicks Send button
    Then User should see "The message title is not specified" notification

  @B26G27-61 @B26G27-79 @B26G27-66
  Scenario: User creates poll with checking "allow multiple Choice"
    And User adds Title
    And User adds question to question field
    And User adds multiple answers to answer fields
    And User enables "allow multiple Choice" checkbox
    Then User should be able to select multiple answers in Activity Stream

  @B26G27-62 @B26G27-79 @B26G27-66
  Scenario: User adds multiple questions to poll
    And User adds Title
    And User clicks Add question button
    Then User should see new QA fields

  @B26G27-63 @B26G27-79 @B26G27-66
  Scenario: User cancels creating poll
    And User adds Title
    And User adds question to question field
    And User adds multiple answers to answer fields
    And User clicks Cancel button
    Then User should see active tab is Message


