Feature: Verify Login page

  Background: Verify valid loginpage 
    Given User clicks Sign in link.
    When User enters Username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And User enter password from given sheetname "Sheet2" rownumber 1 and columnumber 1 
    Then User clicks login button
    
   @SmokeTest
    Scenario Outline: Verify invalid loginpage 
    Given User clicks Sign in link.
    When User enters Username from given sheetname "Sheet2" rownumber 2 and columnumber 0
    And User enter password from given sheetname "Sheet2" rownumber 2 and columnumber 1 
    And User clicks login button 
    Then pop should display with text"Invalid Username and Password"
    
    
    
   


