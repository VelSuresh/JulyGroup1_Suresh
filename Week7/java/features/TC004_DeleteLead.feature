Feature: Funtionality of Delete Lead Module

Scenario Outline: Delete Lead with Lead ID field

#Given Launch the browser
#And Load the url
Given Enter the Username as 'demoSalesManager'
Given Enter the Password as 'crmsfa'
When Click on the Login button
Then WelcomePage is dispalyed
When Click on CRMSFA link
When Click on Leads link
When Click on FindLead link
When Click on phone link
When send phoneNumber as <phone>
When Click on FindLeads Button
When Click on LeadList to Update
When Click on Delete lead link
When Find Leads to be deleted
When Send LeadID<leadID>
Then Delete the Lead<leadID>

Examples:
|phone|leadID|
|'123'|'10074'|

