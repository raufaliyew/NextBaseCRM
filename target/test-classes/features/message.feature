@smoke
Feature: User can send,attach and cancel message
Background:
	Given user is on main page
	#Negative test to verify user cant post empty messages
	@B26G27-81 @B26G27-82 @B26G27-66 @CRM
	Scenario: User shouldnt be able to post empty msg
		//Given user is on main page
		And user click on message button
		And user click send button
		Then user should see "The message title is not specified" msg

	#User as a HR should be able to send message on message tab
	@B26G27-78 @B26G27-82 @B26G27-66 @CRM @test
	Scenario: User as HR  should be able to send msg
		//Given user is on main page
		And user input a msg in message feature
		And user click send button
		Then user should see msg on Activity Stream	

	
	@B26G27-84 @B26G27-82 @B26G27-66 @CRM
	Scenario: User should be able to cancel the message
		//Given user is on main page
		And user inputs a msg
		And clicks save
		And clicks more button
		Then should see delete option
		When user clicks on delete button
		Then msg should be canceled

	
	@B26G27-86 @B26G27-82 @B26G27-66 @CRM
	Scenario: Verify if user can attach a link to msg
		//Given user is on  main page
		When user creates a message
		And  user clicks attach a link option
		Then user should see attach link pop up
		When user attach the link
		And user clicks save button
		Then user should see the link attached to msg