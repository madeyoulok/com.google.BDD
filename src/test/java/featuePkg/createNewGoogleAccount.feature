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

@NewAccount
Feature: Creating new google account

@Smoke
Scenario Outline: Create new google account data driven test
Given customer is in homepage
And customer clicks sign-in link
And customer clicks create account
And select for personal use option
When customer enters "<firstName>"
And customer enter "<lastName>"

Examples:
|firstName|lastName|
|test1|test2|
|test3|test4|
