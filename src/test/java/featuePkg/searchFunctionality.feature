#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Search
Feature: Search Functionality
As a Customer, I should be able to search desired keywords entered and be able to get results.

@Positive @E2E @Regression
Scenario: Positive search functionality test by clicking Google Search button
Given customer is in homepage
When customer enters desired keywords in search textfield
And clicks Google Search button
Then customer should land in search result page for desired keyword searched
And search result page should show results related to desired keyword searched

@Positive @E2E @Regression
Scenario: Positive search functionality test by hitting enter key
Given customer is in homepage
When customer enters desired keywords in search textfield
And customer hits enter key
Then customer should land in search result page for desired keyword searched
And search result page should show results related to desired keyword searched

@Negative @E2E @Regression
Scenario: Negative search functionality test by hitting enter key
Given customer is in homepage
When customer enters desired invalid keywords in search textfield
And customer hits enter key
Then customer should land in search result page for desired invalid keyword searched
And search result page should show error message "No results containing all your search terms were found."

@Negative @E2E @Regression
Scenario: Negative search functionality test by clicking Google Search button
Given customer is in homepage
When customer enters desired invalid keywords in search textfield
And clicks Google Search button
Then customer should land in search result page for desired invalid keyword searched
And search result page should show error message "No results containing all your search terms were found."

@Positive @E2E @Regression
Scenario Outline: Positive data driven search functionality test by clicking Google Search button
Given customer is in homepage
When customer enters "<desiredKeywords>" in search textfield
And clicks Google Search button
Then customer should land in search result page for "<desiredKeywords>" searched
And search result page should show results related to "<desiredKeywords>" searched

Examples:
|desiredKeywords|
|apple|
|samsung|
|lg|
|amazon|
|nokia|
|pixel|

@new
Scenario: Edge search functionality test by clicking Google Search button without entering product
Given customer is in homepage
When customer deos not enter keywords in search textfield
And clicks Google Search button
Then customer should see error message "Blank input is not allowed!"




