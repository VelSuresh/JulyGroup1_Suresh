Feature: Funtionality of Edit Lead Module

Scenario Outline: Edit Lead with Mandatory fields

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
When Click on Edit lead link
When update the companyName as 'ABC'
Then Click on submit button


Examples:
|phone|
|'99'|
|'123'|
