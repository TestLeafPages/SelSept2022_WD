Feature: Login Functionality for Leaftaps Application

@Group2
Scenario: Login with positive credential
Given Enter the username as 'Democsr2'
Given Enter the password as 'crmsfa'
When Click on  Login button
Then HomPage should be displayed

@Group3
Scenario: Login with Negative credential

And Enter the username as 'Democsr2'
And Enter the password as 'crmsfa1'
When Click on  Login button
Then ErrorMessage should be displayed


