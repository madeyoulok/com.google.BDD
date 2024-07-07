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

@GoogleApps
Feature: Google Apps
As a customer, I should be able to see apps available after clicking Google Apps in home page and they should be functional

@Smoke @Regression
Scenario: Testing Google Maps app from Google Apps
Given customer is in homepage
When customer clicks on Google App
And customer clicks on Maps
Then customer should be in Google Maps page

@Sanity @Regression
Scenario: Testing YouTube app from Google Apps
Given customer is in homepage
When customer clicks on YouTube from Google Apps down drop
Then customer should be in YouTube page