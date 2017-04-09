Feature: Springer Search Functionality Test

As a Springer User
I want to search a keyword
so that I can see a list of articles related to the keyword

Scenario Outline: Search the Valid article keyword
Given I am in search page of Springer
When I enter valid keyword <Value> in search text box
And Click on Search button
Then I can see the list of results
Examples:
| Value         | 
|Cancer research| 