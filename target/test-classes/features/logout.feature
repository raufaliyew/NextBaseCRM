Feature: Default

	#data:
	#
	#[hr53@cybertekschool.com|mailto:hr53@cybertekschool.com]
	#
	#password:UserUser
	#
	# 
	@B26G27-91 @B26G27-66 @CRM  @logout
	Scenario: Verify User can login and logout
		Given user is on login page and logs in
		And user click user button
		And user click logout button
		Then user should be on login page