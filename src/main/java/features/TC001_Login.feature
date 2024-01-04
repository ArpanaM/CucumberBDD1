Feature: Login Action
Scenario: Validate Login with valid credentials and display message as Login Successful
Given user is on home page
When user clicks on signin link
Then next page is displayed with title 
When user enters username
And user enters password 
And clicks on Submit button
Then User should connected to inbox
And display a message Login successful 
When user clicks on Logout
Then Application gets closed
