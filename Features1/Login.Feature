Feature: Login Action Test
Scenario Outline: Successful Login with valid credentials
Given user opens the  application
When user clicks on signin button
When user enters "<username>" and "<password>" 
Then Message displayed login successful

Examples:
|username |password    |
|lalitha  |password123 |
|admin    |password456 |