Feature: Testing Stack page

  Background: 
    Given User clicks Sign in link.
    When User enters Username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And User enter password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    Then User clicks login button
    And User enters home page.
    And Clicks on Get Started button on the Stack introduction panel

  @Stack
  Scenario: Verify required topics are covered on Stack page
    Given User is on the Stack module page
    When The user scroll downs to Topics covered section on the Stack page
    Then Required list of Stack topics covered should be displayed
      | Operations in Stack |
      | Implementation      |
      | Applications        |

  @Stack
  Scenario: Validate Operations in Stack page is opened
    Given The user is on the Stack page after logged in
    When The user clicks Operations in Stack link present under topics covered
    Then The user should be directed to Operations in Stack Page

  @Stack
  Scenario: Validate to Try Here panel of Operations in Stack page
    Given The user is on the Operations in Stack page
    When The User clicks Try Here button of Stack
    Then The user redirected to on Operations in Stack page having an tryEditor with a Run button to test

  @Stack
  Scenario: Verify valid python code of Stack
    Given The user is on the Try Editor page of Operation of Stack
    When The User writes valid Python code for Stack
    And User click on Run button oon Stack
    Then User sees output in the output panel of Operation in Stack

  @Stack
  Scenario: The user Verify running an invalid python code of Operations in Stack gives an error
    Given The user is already on the Try Editor page of Stack
    When User writes invalid Python code for Stack
    And The user click on Run button to run invalid code of Stack
    Then The user gets error alert box under Operations in Stack

  @Stack
  Scenario: Go back to Operations in Stack of Stack page from Try Editor page
    Given The User is on the Try Editor page of Operations in Stack
    When The user clicks on the back arrow of Stack
    Then It should redirect to Operations in Stack
    And Topics covered section is displayed on left side of the Stack page

  @Stack
  Scenario: Validate Implementation page is opened
    Given The user is on the Implementation page after logged in
    When The user clicks Implementation link present under topics covered
    Then The user should be directed to Implementation Page

  @Stack
  Scenario: Validate to Try Here panel of Implementation of stack page
    Given The user is on the Implementation page
    When The User clicks Try Here button of Stack on Implmentation page
    Then The user redirected to Implement of Stack page having an tryEditor with a Run button to test

  @Stack
  Scenario: Verify valid python code of Implementation of Stack
    Given The user is on the Try Editor page of Implementation of Stack
    When User writes valid Python code for Stack from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And User click on Run button of Stack
    Then User sees output in the output panel under Implementation section

  @Stack
  Scenario: The user Verify running an invalid python code of Implementation of Stack gives an error
    Given The user is already on the Try Editor page of Implementation
    When User writes invalid Python code for Stack from given sheetname "Sheet4" rownumber 2 and columnumber 1
    And The user click on Run button of Stack
    Then The user gets error alert box of stack under Implementation

  @Stack
  Scenario: Go back to Implementation of Stack page from Try Editor page
    Given The User is on the Try Editor page of Implementation
    When The user clicks on the back arrow of Implementation
    Then It should redirect to of Implementation of Stack
    And Topics covered section is displayed on left side of the stack page

  @Stack
  Scenario: Validate Applications page is opened
    Given The user is on the Applications page after logged in
    When The user clicks Applications link present under topics covered
    Then The user should be directed to Applications Page

  @Stack
  Scenario: Validate to Try Here panel of Applications page
    Given The user is on the Applications page
    When The User clicks Try Here button on Stack
    Then The user redirected to Stack page having an tryEditor with a Run button to test

  @Stack
  Scenario: Verify valid python code of Applications of Stack
    Given The user is on the Try Editor page of Stack
    When User writes valid Python code for Stack from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And User click on Run button of Stack
    Then User sees output in the output panel under Stack

  @Stack
  Scenario: The user Verify running an invalid python code gives an error of Applications
    Given The user is already on the Try Editor page of Stack
    When User writes invalid Python code for Stack from given sheetname "Sheet4" rownumber 2 and columnumber 1
    And The user click on Run button of Stack
    Then The user gets error pop up box of Stack

  @Stack
  Scenario: Go back to Applications page from Try Editor page
    Given The User is on the Try Editor page of Stack
    When The user clicks on the back arrow of Application of Stack
    Then It should redirect to of Applications
    And Topics covered section is displayed on left side of the Stack page

  @Stack
  Scenario: The use validating Practice Questions page of Stack
    Given The user is on the Stack page after logged in
    And Navigated the topic of the Stack-Applications
    When The user clicks Practice Questions of Stack section
    Then Practice Questions Should be open of Stack Section

  @Stack
  Scenario: Validate Practice Questions are visible on Practice Question Page of Stack
    Given The user is in the Stack page after loggedin
    And Navigated to any topics of the Stack - Applications
    When The user clicks Practice Questions of Stack section
    Then Sets of practice questions should be available on the page
