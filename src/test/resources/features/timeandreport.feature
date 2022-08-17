@us11 @smoke
Feature: Users GR and marketing can get on time and report module
	Agile Story: As a user, I should be able to access to time and reports module

	Background: HR user is on the home page
		Given HR user are in Home page
		When user clicks on Time and report module
	#This test is to validate if hr and marketing can access to time and report module
	@B26G27-99 @B26G27-106 @B26G27-66
	Scenario: Verify only hr and marketing team can access to time and report module

		When user clicks on Time and report module
		Then user should be directed to the new page	

	
	@B26G27-100 @B26G27-106 @B26G27-66
	Scenario: Verify Users (hr,marketing) can filter absence char by day

		And user clicks on "Day" filer
		Then chart is filtered by day	

	
	@B26G27-102 @B26G27-106 @B26G27-66 @CRM
	Scenario: Verify Users (hr,marketing) can filter absence char by week
		And user clicks on "Week" filer
		Then chart is filtered by week	

	
	@B26G27-103 @B26G27-106 @B26G27-66 @CRM
	Scenario: Verify Users (hr,marketing) can filter absence char by month

		And user clicks on "Month" filer
		Then chart is filtered by month	

	
	@B26G27-105 @B26G27-106 @B26G27-66 @CRM
	Scenario: Verify Users can check show start and end time under the worktime

		And User clocks on Works time feature
		Then User should be able select workstart and end time