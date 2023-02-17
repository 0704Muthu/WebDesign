Feature: connecting with peoples

@smoke
Scenario: SignIn to Facebook 

Given user can enter in the facebook homepage
When User can enter the valid username and password in given field
And User can Click the loginbutton
Then User can successfully login

@sanity
Scenario Outline: SignIn to Facebook 


Given user can enter in the facebook homepage
When User can enter the valid "<username>" and "<password>" in given field
And User can Click the loginbutton
Then User can successfully login

Examples:
|username | password|
|Muthu|M@123|
|Raj|K@1342|
|Babu|J@1243|
