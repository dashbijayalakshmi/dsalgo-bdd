Feature: DsAlgo Landing page

  Background: 
    Given User clicks Sign in link.
    When User enters Username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And User enter password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    Then User clicks login button
    And User enters home page.
    And Clicks on Get Started button on the Data Structures introduction panel

  @DataStructure
  Scenario Outline: Verify required topics are covered on Data Structures page
    Given User is on the Data Structures Module page
    When The user scroll downs to Topics covered section on the Data Structure page
    Then Required list of Data Structure topics covered should be displayed
      | Time Complexity |

  @DataStructure
  Scenario: Validate Time Complexity page is opened
    Given The user is in Data Structure after loggedin
    When The user clicks Time Complexity under topic covered
    Then The user should be directed Time Complexity of Data Structures

  @DataStructure
  Scenario: Validate Try Here panel of Time Complexity of Data Structure page
    Given The user is on the Time Complexity of Data Structure page
    When User clicks Try Here button of Data Structures page
    Then The user should be redirected to Data Structures page having an tryEditor with a Run button to test

  @DataStructure
  Scenario: Verify valid python code of Data Structures page
    Given User is on the Try Editor page of Time Complexity section
    When The user writes valid Python code of Data Structures
    And Click on Run button of Data Sturutures
    Then User sees output in the output panel of Data Structures

  @DataStructure
  Scenario: Verify running an invalid python code gives an error of Data Structures
    Given User is already on the Try Editor page of Data Structures
    When The user writes invalid Python code of Data Strutures
    And Click on Run button to run invalid code of Data Structures
    Then User gets error alert box of Data Structures

  @DataStructure
  Scenario: Go back to Time Complexity from Try Editor page
    Given User is on the Try Editor page of Data Structures section
    When User clicks on the back arrow of Data Structures
    Then It should redirect to Data Structures
    And Topics covered section is displayed on the left of Data Structures

  @Datastructure
  Scenario: Validate Practice Questions of Data Structuressection
    Given The user is in the Data Structure after loggedin
    And Navigated to any topics of the Data Structure- Time Complexity
    When The user clicks Practice Questions of Data Structure section
    Then Practice Question page should open of Data Structure

  @DataStructure
  Scenario: Validate Practice Questions of Data Structure are visible on Practice Question Page
    Given The user is in the Data Structures after loggedin
    And Navigated to any topics of the  Data Struture - Time Complexity
    When The user clicks Practice Questions of Data Struture section
    Then Sets of practice questions should be available on the Data Struture page
