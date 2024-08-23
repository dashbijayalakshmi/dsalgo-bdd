Feature: DsAlgo Landing page
Background:
Given User clicks Sign in link.
When User enters Username and password and clicks login button.
Then User enters home page.
@Monkey
Scenario Outline: Verify DataStructure page
Given Click  GetStarted button of Data Structures-Introduction pane.
When Data Structures-Introduction page is displayed with Topics covered.User clicks TimeComplexity link.
And User Enters <validInvalid> code in editorpage
Then Click Run button and capture the output
Examples:
|validInvalid|
|valid|
|Invalid|

   


