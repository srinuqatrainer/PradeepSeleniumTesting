Feature: NewTors LogIn Functionality
Scenario Outline: validaing newtours login functionality

Given Open firefox browser and navigate to newTours Application
When User enters valid "<UserName>" and "<Password>" and click on SignIn button
Then User Should be able to successfully logIn and close the application

Examples:
|  UserName    |    Password  |
|  tutorial    |    tutorial  |
|  tutorial    |    Password  |