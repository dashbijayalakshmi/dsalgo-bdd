Feature: Verify Queue page

  Background: Verify loginpage Signin page
    Given User clicks Sign in link.
    When User enters Username from given sheetname "Sheet2" rownumber 1 and columnumber 0 
    And User enter password from given sheetname "Sheet2" rownumber 1 and columnumber 1 
    And User clicks login button
    Then User enters home page.
    And User clicks on Queue Get Start
    
     @Queue
    Scenario Outline: Verify required topics are covered on Queue page
    Given User is on the Queue module page
    When The user scroll downs to Topics covered section on the Queue page
    Then Topics covered should be displayed in Queue
     | Implementation of Queue in Python       |
     |Implementation using collections.deque   |
     |Implementation using array               |
     |Queue Operations                         |
    
  
     @Queue
    Scenario: Validate Implementation of Queue in Python page is opened
    Given The user is in the Queue page after loggedin
    When The user clicks Implementation of Queue in Python link present under topics covered
    Then The user should be directed to Implementation of Queue in Python page
  
    @Queue
    Scenario: Validate Try Here panel of Implementation of Queue in Python page
    Given The user is on the Implementation of Queue in Python page
    When User clicks on try here of Queue
    Then The user should be redirected to tryEditor page of Queue 
      
    @Queue
    Scenario: Verify valid python code
    Given User is on the Try Editor page of Implementation of Queue in Python section
    When User enter valid Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And User click on run of Queue
    Then User gets output in the output panel of Queue
  
    @Queue
    Scenario: Verify running an invalid python code gives an error
    Given User is already on the Try Editor of Queue
    When The user enter invalid Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on run of Queue
    Then User gets error popup of Queue
    
    @Queue
    Scenario: Go back to Implementation of Queue in Python page from Try Try Editor page
    Given User is on the Try Editor page of Implementation of Queue in Python section
    When User click on the back arrow of Queue
    Then It should redirect to Implementation of Queue in Python page
    And Topics covered under Queue should be displayed on the left
    
    
     @Queue
    Scenario: Validate Implementation using collections.deque page is opened
    Given The user is in the Queue page after loggedin
    When The user clicks Implementation using collections.deque link present under topics covered
    Then The user should be directed to Implementation using collections.deque page
  
    @Queue
    Scenario: Validate Try Here panel of Implementation using collections.deque page
    Given The user is on the Implementation using collections.deque page
    When User clicks on try here of Queue
    Then The user should be redirected to tryEditor page of Queue 
      
    @Queue
    Scenario: Verify valid python code
    Given User is on the Try Editor page of Implementation using collections.deque section
    When User enter valid Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And User click on run of Queue
    Then User gets output in the output panel of Queue
  
    @Queue
    Scenario: Verify running an invalid python code gives an error
    Given User is already on the Try Editor of Queue
    When The user enter invalid Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on run of Queue
    Then User gets error popup of Queue
    
    @Queue
    Scenario: Go back to Implementation using collections.deque page from Try Try Editor page
    Given User is on the Try Editor page of Implementation using collections.deque section
    When User click on the back arrow of Queue
    Then It should redirect to Implementation using collections.deque page
    And Topics covered under Queue should be displayed on the left
    
    
     @Queue
    Scenario: Validate Implementation using array page is opened
    Given The user is in the Queue page after loggedin
    When The user clicks Implementation using array link present under topics covered
    Then The user should be directed to Implementation using array page
  
    @Queue
    Scenario: Validate Try Here panel of Implementation using array page
    Given The user is on the Implementation using array page
    When User clicks on try here of Queue
    Then The user should be redirected to tryEditor page of Queue 
      
    @Queue
    Scenario: Verify valid python code
    Given User is on the Try Editor page of Implementation using array section
    When User enter valid Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And User click on run of Queue
    Then User gets output in the output panel of Queue
  
    @Queue
    Scenario: Verify running an invalid python code gives an error
    Given User is already on the Try Editor of Queue
    When The user enter invalid Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on run of Queue
    Then User gets error popup of Queue
    
    @Queue
    Scenario: Go back to Implementation using array page from Try Try Editor page
    Given User is on the Try Editor page of Implementation using array section
    When User click on the back arrow of Queue
    Then It should redirect to Implementation using array page
    And Topics covered under Queue should be displayed on the left
    
    
     @Queue
    Scenario: Validate Implementation using array page is opened
    Given The user is in the Queue page after loggedin
    When The user clicks Queue Operations link present under topics covered
    Then The user should be directed to Queue Operations page
  
    @Queue
    Scenario: Validate Try Here panel of Queue Operations page
    Given The user is on the Queue Operations page
    When User clicks on try here of Queue
    Then The user should be redirected to tryEditor page of Queue 
      
    @Queue
    Scenario: Verify valid python code
    Given User is on the Try Editor page of Queue Operations section
    When User enter valid Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And User click on run of Queue
    Then User gets output in the output panel of Queue
  
    @Queue
    Scenario: Verify running an invalid python code gives an error
    Given User is already on the Try Editor of Queue
    When The user enter invalid Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on run of Queue
    Then User gets error popup of Queue
    
    @Queue
    Scenario: Go back to Queue Operations page from Try Try Editor page
    Given User is on the Try Editor page of Queue Operations section
    When User click on the back arrow of Queue
    Then It should redirect to Queue Operations page
    And Topics covered under Queue should be displayed on the left
    
     @Queue
  Scenario: Validate Practice Questions of Queue section
    Given The user is in the Queue page after loggedin
    And Navigated to any topics of the Queue
    When The user clicks Practice Questions of Queue section
    Then Practice Question page should display

  @Queue
  Scenario: Validate id Practice Questions are visible on Practice Question Page
    Given The user is in the Queue page after loggedin
    And Navigated to any topics of the Queue
    When The user clicks Practice Questions of Queue section
    Then Sets of practice questions should be display on the page
    
    