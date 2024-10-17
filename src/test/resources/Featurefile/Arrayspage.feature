Feature: Verify Arrays page

  Background: 
    Given User clicks Sign in link.
    When User enters Username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And User enter password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    Then User clicks login button
    And User enters home page.
    And Clicks on Get Started button on the Array Introduction panel

  @Arrays
  Scenario: Verify required topics are covered on Array page
    Given User is on the Array module page
    When The user scroll downs to Topics covered section on the Array page
    Then Required list of Arrays topics covered should be displayed
      | Arrays in Python          |
      | Arrays Using List         |
      | Basic Operations in Lists |
      | Applications of Array     |

  @Arrays
  Scenario: Validate Arrays in Python page is opened
    Given The user is in the Array page after logged in
    When The user clicks Arrays in Python link present under topics covered
    Then The user should be directed to Arrays in Python Page

  @Arrays
  Scenario: Validate to Try Here panel of Arrays in Python page
    Given The user is on the Arrays in Python page
    When The User clicks Try Here button of Arrays page
    Then The user redirected to Arrays page having an tryEditor with a Run button to test

  @Arrays
  Scenario: Verify valid python code of Arrays
    Given The user is on the Try Editor page of Arrays in Python
    When User writes valid Python code of Arrays
    And User click on Run button of Arrays
    Then User sees output in the output panel of Arrays

  @Arrays
  Scenario: The user Verify running an invalid python code gives an error of Arrays
    Given The user is already on the Try Editor page of Arrays
    When The User writes invalid Python code of Arrays
    And The user click on Run button to run invalid code of Arrays
    Then The user gets error alert box of Arrays

  @Arrays
  Scenario: Go back to Arrays in Python page from Try Editor page
    Given The User is on the Try Editorr page of Arrays in Python
    When The user clicks on the back arrow of Arrays in Python page
    Then It should redirect to of Arrays in Python
    And Topics covered section is displayed on left side of the arrays page

  @Arrays
  Scenario: Validate Arrays using list page is opened
    Given The user is in the Array page after logged in
    When The user clicks Arrays using list link present under topics covered
    Then The user should be directed to Arrays using list Page

  @Arrays
  Scenario: Validate to Try Here panel of Arrays using list page
    Given The user is on the Arrays using list page
    When The User clicks Try Here button of Arrrays page
    Then The user redirected to Arrays page having an tryEditor with a Run button to test

  @Arrays
  Scenario: Verify valid python code of Arrays
    Given The user is on the Try Editor page of Arrays using list
    When User writes Python code for Arrays given sheetname "Sheet4" rownumber 1 and columnumber 1
    And User click on Run button of Arrays page
    Then User sees output in the output panel of Arrays

  @Arrays
  Scenario: The user Verify running an invalid python code of Arrays gives an error
    Given The user is already on the Try Editor page of Arrays Section
    When User writes Invalid Python code for Arrays given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on Run button of Arrays page
    Then The user gets error alert box of Arrays

  @Arrays
  Scenario: Go back to Arrays using list page from Try Editor page
    Given The user is on the Try Editor page of Arrays using list
    When The user clicks on the back arrow of Arrays using list
    Then It should redirect to of Arrays using list
    And Topics covered section is displayed on left side of the Arrays using list page

  @Arrays
  Scenario: Validate to Try Here panel of Basic Operations in Lists page
    Given The user is on the Basic Operations in Lists page
    When The User clicks Try Here button of Basic Operations in Lists page
    Then The user redirected to a Basic Operations in Lists page having an tryEditor with a Run button to test

  @Arrays
  Scenario: Verify valid python code of Basic Operations in List
    Given The user is on the Try Editor page of Basic Operations in List
    When User writes Python code for Arrays from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And User click on Run button under Basic Operations in List
    Then User gets output in the output panel under Basic Operations in List

  @Arrays
  Scenario: The user verify running an invalid python code gives an error of Arrays
    Given The user is on the Try Editor page of Arrays
    When User writes Python code for Arrays given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on Run button of Arrays page
    Then The user gets error pop up box of Arrays Page

  @Arrays
  Scenario: Go back to Basic operations in List page from Try Editor page
    Given The user is on the Try Editor page of Basic Operations in List
    When The user clicks on the back arrow of Basic operations in List
    Then It should redirect to of Basic operations in List
    And Topics covered section is displayed on left side of the page of Arrays

  @Arrays
  Scenario: Validate Applications of Array page is opened
    Given The user is on the Arrays page after logged in
    When The user clicks Applications of Array link present under topics covered
    Then The user should be directed to Applications of Array Page

  @Arrays
  Scenario: Validate to Try Here panel of Applications of Array page
    Given The user is on the Applications of Array page
    When The User clicks Try Here button of Applications of Array page
    Then The user redirected to Applications of Arraypage having an tryEditor with a Run button to test

  @Arrays
  Scenario: Verify valid python code of Applications os Array
    Given The user is on the Try Editor page of Array
    When User writes Python code for Array given sheetname "sheet4" rownumber 1 and columnumber 1
    And User click on Run button on Array page
    Then User sees output in the output panel of Array Page

  @Arrays
  Scenario: The user Verify running an invalid python code gives an error of Arrays
    Given The user is on the Try Editor page of Arrays
    When User writes Python code for Arrays given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on Run button on Arrays page
    Then The user gets error pop up box of Arrays Page
    

  @Arrays
  Scenario: Go back to Applications of Array page from Try Editor page
    Given The User is on the Try Editor page of Applications of Array
    When The user clicks on the back arrow under Applications of Arrays
    Then It should redirect to of Applications of Arrays
    And Topics covered section is displayed on left side of the page of Arrays

  @Arrays
  Scenario: The user validating Practice Questions page of Arrays
    Given The user is on the Arrays page after logged in
    And Navigated to any topics of the Arrays page -Applications of Arrays
    When The user clicks on the Practice Questions of Arrays
    Then Practice Question Page should be open on Arrays
    
     @Arrays
  Scenario: The user validating Practice Questions Search the array
    Given The user is on the practice questions of Array page
    When The user clicks on the Search the arrays
    Then Search the arrays Question Page should be open
    
     @Arrays
  Scenario: Verify valid code
    Given The user is on the Search the arrays page
    When User writes Python code for Arrays from given sheetname "Sheet4" rownumber 3 and columnumber 1
    Then User click on Run button on Array page
    And User gets error popup of Array Page
    
    
     @Arrays
  Scenario: The user validating Practice Questions Max Consecutive Ones
    Given The user is on the practice questions of Array page
    When The user clicks on the Max Consecutive Ones
    Then Search the arrays Question Page should be open
    
     @Arrays
  Scenario: Verify valid code Max Consecutive Ones
    Given The user is on the Max Consecutive Ones page
    When User writes Python code for Arrays from given sheetname "Sheet4" rownumber 4 and columnumber 1
    Then User click on Run button on Array page
    And User gets error popup of Array Page
    
      @Arrays
  Scenario: The user validating Practice Questions Find Numbers with Even Number of Digits
    Given The user is on the practice questions of Array page
    When The user clicks on the Find Numbers with Even Number of Digits
    Then Search the arrays Question Page should be open
    
     @Arrays
  Scenario: Verify valid code Find Numbers with Even Number of Digits
    Given The user is on the Find Numbers with Even Number of Digits page
    When User writes Python code for Arrays from given sheetname "Sheet4" rownumber 4 and columnumber 1
    Then User click on Run button on Array page
   And User gets error popup of Array Page
   
     @Arrays
  Scenario: The user validating Practice Questions Squares of a Sorted Array
    Given The user is on the practice questions of Array page
    When The user clicks on the Squares of a Sorted Array
    Then Search the arrays Question Page should be open
    
     @Arrays
  Scenario: Verify valid code Squares of a Sorted Array
    Given The user is on the Squares of a Sorted Array page
    When User writes Python code for Arrays from given sheetname "Sheet4" rownumber 4 and columnumber 1
    Then User click on Run button on Array page
    And User gets error popup of Array Page
    #
