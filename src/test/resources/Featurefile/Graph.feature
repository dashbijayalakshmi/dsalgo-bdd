Feature: Verify Graph page

  Background: Verify loginpage Signin page
    Given User clicks Sign in link.
    When User enters Username from given sheetname "Sheet2" rownumber 1 and columnumber 0 
    And User enter password from given sheetname "Sheet2" rownumber 1 and columnumber 1 
    And User clicks login button
    Then User enters home page.
    And User clicks on Graph Get Start
    
    @Graph
    Scenario Outline: Verify required topics are covered on Graph page
    Given User is on the Graph module page
    When The user scroll downs to Topics covered section on the Graph page
    Then Topics covered should be displayed in Graph page
     | Graph                  |
     | Graph Representations  |
      

    
    @Graph
    Scenario: Validate Graph page is opened
    Given The user is in the Graph page after loggedin
    When The user clicks Graph link present under topics covered
    Then The user should be directed to Graph page
      
    @Graph
    Scenario: Validate Try Here panel of Graph page
    Given The user is on the Graph page
    When User clicks on Try Here of Graph
    Then The user should be redirected to tryEditor of Graph 
      
    @Graph
     Scenario: Verify valid python code
     Given User is on the Try Editor page of Graph section
     When The user enter valid Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
     And  User click on Run of Graph
     Then User gets output  
  
    @Graph
    Scenario: Verify running an invalid python code gives an error
    Given User is already on the Try Editor of Graph 
    When User enter invalid Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on Run of Graph
    Then The user gets error output of Graph
    
    @Graph
    Scenario: Go back to Graph page from Try Try Editor page
    Given User is on the Try Editor page of Graph section
    When The user clicks on the back arrow
    Then It should redirect to Graph page
    And Topics covered under graph should be displayed on the left
      
    @Graph
    Scenario: Validate Graph Representations page is opened
    Given The user is in the Graph page after loggedin
    When The user clicks Graph Representations link present under topics covered
    Then The user should be directed to Graph Representations page
  
    @Graph
    Scenario: Validate Try Here panel of Graph Representations page
    Given The user is on the Graph Representations page
    When User clicks on Try Here of Graph 
    Then The user should be redirected to tryEditor of Graph
      
    @Graph
    Scenario: Verify valid python code
    Given User is on the Try Editor page of Graph Representations section
    When The user enter valid Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And User click on Run of Graph
    Then User gets output 
  
    @Graph
    Scenario: Verify running an invalid python code gives an error
    Given User is already on the Try Editor of Graph
    When User enter invalid Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on Run of Graph
    Then The user gets error output of Graph
    
    @Graph
    Scenario: Go back to Graph Representation page from Try Try Editor page
    Given User is on the Try Editor page of Graph Representations section
    When The user clicks on the back arrow
    Then It should redirect to Graph Representations page
    And Topics covered under graph should be displayed on the left
    
     @Graph
  Scenario: Validate Practice Questions of Graph section
    Given The user is in the Graph page after loggedin
    And Navigated to any topics of the Graph
    When The user clicks Practice Questions of Graph section
    Then Practice Question page should display on Graph

  @Graph
  Scenario: Validate id Practice Questions are visible on Practice Question Page
    Given The user is in the Graph page after loggedin
    And Navigated to any topics of the Graph
    When The user clicks Practice Questions of Graph section
    Then Sets of practice questions should be display on the Graph page
    
    