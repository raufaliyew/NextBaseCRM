@smoke
Feature: Search Feature
  Agile Story: As a User I should be able to search from search box

  Background: User is on the Home page
    Given hr user is on the Home page
  @B26G27-67 @B26G27-70 @B26G27-66
  Scenario:users can search a valid info : employee, doc, post, task
    When User enters a valid info (employee,doc,post,task) "Mail"in the search box
    And User hits enter button
    Then User can see "Mail" is in the Title


  @B26G27-68 @B26G27-70 @B26G27-66 @CRM
  Scenario: users can not find invalid info, the page should show "Nothing found"
    When User enters a invalid info in the search box
    And User hits enter button
    Then User can see "Nothing found"