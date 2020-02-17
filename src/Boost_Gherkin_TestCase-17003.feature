#Auto generated Octane revision tag
@TID17003REV0.2.0
Feature: LogIn functionality on login page of Application
Scenario: Verification of LogIn button 


Given Open the Chrome and launch the application                  
When Clicking the Company Single Sign-On
And Fill Username and Password
And Click Sign and No               
Then Login Sign in page



#Given EmployeeDetailsUpdates
#When Editing
#Then Updated


Given User sign Out
When Click Drop Down
And Click Sign Out
And Click Confirm
Then Logged Out