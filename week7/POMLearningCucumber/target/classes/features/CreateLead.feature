Feature: CreateLead Functionality for Leaftaps Application

Background: Positive Login
Given Enter the username as 'DemoCSR2'
And Enter the password as 'crmsfa'
When Click on  Login button
Then HomPage should be displayed

@Group1
Scenario Outline: Create Lead with different data
Given Click CRMSFA link
And Click Leads Button
And Click CreateLead link
When Enter the companyName as <companyname>
And Enter the firstName as <firstname>
And Enter the LastName as <lastname>
And Click on the CreateLeads Button

Examples:
|companyname|firstname|lastname|
|TestLeaf|Subraja|Subi|
|Qeagle|Vidhya|R|







