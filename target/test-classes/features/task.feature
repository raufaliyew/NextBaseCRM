@B26G27-94 @CRM
Feature: Default

	
	@B26G27-93 @B26G27-66 @CRM @task
	Scenario: User should be able to assign tasks by clicking Task tab
		    //Given user is on main page
			And user click Task feature
			And user click checklist
			And user add an item to checklist
			And user click on deadline field
			And user choose date and time
			And user click on Time planning
			And user click on Start Task On
			And user click on Duration in day
			And user click on Finish 
			And user select date and time

			Then user should see "Task has been created" pop up