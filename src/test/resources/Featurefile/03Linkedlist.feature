@Linkedlist
Feature: Testing Linked List page

  Background: 
    Given User clicks Sign in link.
    When User enters Username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And User enter password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    Then User clicks login button
    And User enters home page.
    And Clicks on Get Started button on the Linked List Introduction panel

  @Linkedlist
  Scenario: Verify required topics are covered on Linked list page
    Given User is on the Linked List module page
    When The user scroll downs to Topics covered section on the Linked List page
    Then Required list of Linked List topics covered should be displayed
      | Introduction                    |
      | Creating Linked LIst           |
      | Types of Linked List            |
      | Implement Linked List in Python |
      | Traversal                       |
      | Insertion                       |
      | Deletion                        |
      @Linkedlist
  Scenario: Validate Introduction of Linked List page is opened
    Given The user is in the Linked List page after logged in
    When The user clicks Introduction link present under topics covered
    Then The user should be directed to Introduction of Linked List Page

       @Linkedlist
  Scenario: Validate to Try Here panel of Introduction of Linked List page
    Given The user is on the Introduction of Linked List page
    When The User clicks Try Here button of Linked List page
    Then The user redirected to Linked List page having an tryEditor with a Run button to test
       @Linkedlist
  Scenario: Verify valid python code of Linked List
    Given The user is on the Try Editor page of Introduction of Linked List
    When User writes valid Python code of Linked List
    And User click on Run button of Linked List
    Then User sees output in the output panel of Linked List 
     @Linkedlist
  Scenario: The user Verify running an invalid python code gives an error of Linked List
    Given The user is already on the Try Editor page of Linked List
    When The User writes invalid Python code of Linked List
    And The user click on Run button to run invalid code of Linked List
    Then The user gets error alert box of Linked List
    
   @Linkedlist
  Scenario: Go back to Introduction of Linked List page from Try Editor page
    Given The User is on the Try Editorr page of Introduction of Linked List
    When The user clicks on the back arrow of Introduction of Linked List page
    Then It should redirect to of Intoduction of Linked List
    And Topics covered section is displayed on left side of the page
   @Linkedlist
    Scenario: Validate Creating Linked List page is opened
    Given The user is in the Linked List page after logged in
    When The user clicks Creating Linked List link present under topics covered
    Then The user should be directed to Creating Linked List Page
   @Linkedlist
    Scenario: Validate to Try Here panel of Creating Linked List page
    Given The user is on the Creating Linked List page
    When The User clicks Try Here button of Linked List page
    Then The user redirected to Linked List page having an tryEditor with a Run button to test
     @Linkedlist
  Scenario: Verify valid python code of Linked list
    Given The user is on the Try Editor page of Creating Linked list
    When User writes Python code for Linked list given sheetname "Sheet4" rownumber 1 and columnumber 1
    And User click on Run button of Linked list page
    Then User sees output in the output panel of Linked list
    
      @Linkedlist
  Scenario: The user Verify running an invalid python code of Linked list gives an error
    Given The user is already on the Try Editor page of Linked list Section
    When User writes Invalid Python code for Linked list given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on Run button of Linked list page
    Then The user gets error alert box of Linked list

  @Linkedlist
  Scenario: Go back to Creating Linked list page from Try Editor page
    Given The User is on the Try Editor page of Creating Linked list
    When The user clicks on the back arrow of Creating Linked list
    Then It should redirect to of Creating Linked list
    And Topics covered section is displayed on left side of the creating linked list page
 
   @Linkedlist
  Scenario: Validate to Try Here panel of Types of Linked list page
    Given The user is on the Types of Linked list page
    When The User clicks Try Here button of Types of Linked list page
    Then The user redirected to a Types of Linked list page having an tryEditor with a Run button to test
  @Linkedlist
   Scenario: Verify valid python code of Types of Linked list
    Given The user is on the Try Editor page of Types of Linked list
    When User writes Python code for Linked list from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And User click on Run button under Types of Linked list page
    Then User gets output in the output panel under Types of Linked list

  @Linkedlist
  Scenario: The user verify running an invalid python code gives an error of Linked list
    Given The user is on the Try Editor page of Linked list
    When User writes Python code for Linked list given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on Run button of Linked list page
    Then The user gets error pop up box of Linked List Page

 @Linkedlist
  Scenario: Go back to Types of Linked list page from Try Editor page
    Given The User is on the Try Editor page of Types of Linked List 
    When The user clicks on the back arrow of Types of Linked List
    Then It should redirect to of Types of Linked List
    And Topics covered section is displayed on left side of the page

  

  @Linkedlist
  Scenario: Validate Implement Linked List in Python page is opened
    Given The user is on the Linked List page after logged in
    When The user clicks Implement Linked in Python link present under topics covered
    Then The user should be directed to Implement Linked List in Python Page

  @Linkedlist
  Scenario: Validate to Try Here panel of Implement Linked list in Python page
    Given The user is on the Implement Linked list in Python page
    When The User clicks Try Here button of Implement Linked list page
    Then The user redirected to Implement Linked list in Python page having an tryEditor with a Run button to test

  @Linkedlist
  Scenario: Verify valid python code of Implement Linked list in Python
    Given The user is on the Try Editor page of Linked list
    When User writes Python code for Linked list given sheetname "sheet4" rownumber 1 and columnumber 1
    And User click on Run button on Linked list page
    Then User sees output in the output panel of Linked list Page

  @Linkedlist
  Scenario: The user Verify running an invalid python code gives an error of Linked list
    Given The user is on the Try Editor page of Linked list
    When User writes Python code for Linked list given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on Run button on Linked list page
    Then The user gets error pop up box of Linked list page

  @Linkedlist
  Scenario: Go back to Implement Linked list in Python page from Try Editor page
    Given The User is on the Try Editor page of Implement Linked list in Python
    When The user clicks on the back arrow under Implement Linked list in Python
    Then It should redirect to of Implement Linked list in Python 
    And Topics covered section is displayed on left side of the page

  @Linkedlist
  Scenario: Validate Traversal page is opened
    Given The user is on the Linked list page after logged in
    When The user clicks Traversal link present under topics covered
    Then The user should be directed to Traversal Page of Linked list

  @Linkedlist
  Scenario: Validate to Try Here panel of Traversal page
    Given The user is on the Traversal page of Linked list
    When The User clicks Try Here button on Traversal page of Linked list 
    Then The user redirected to Traversal page of Linked list having an tryEditor with a Run button to test

  @Linkedlist
  Scenario: Verify valid python code of Traversal
    Given The user is on the Try Editor page of Traversal
    When User writes Python code for Linked list given sheetname "Sheet4" rownumber 1 and columnumber 1
    And User click on Run button on Linked list page
    Then User sees output in the output panel of Linked list page 

  @Linkedlist
  Scenario: The user Verify running an invalid python code gives an error of Linked list
    Given The user is already on the Try Editor page of Traversal
    When User writes Python code for Linked list given sheetname "sheet4" rownumber 2 and columnumber 1
    And User Click on Run button on Linked list page
    Then The user gets error pop box of Linked list page

  @Linkedlist
  Scenario: Go back to Traversal page from Try Editor page
    Given The User is on the Try Editor page of Traversal
    When The user clicks on the back arrow of Traversal 
    Then It should redirect to of Traversal 
    And Topics covered section is displayed on left side of the page

  @Linkedlist
  Scenario: Validate Insertion page is opened
    Given The user is on the Linked list page after logged in
    When The user clicks Insertion link present under topics covered
    Then The user should be directed to Insertion Page

  @Linkedlist
  Scenario: Validate to Try Here panel of Insertion page
    Given The user is on the Insertion page 
    When The User clicks Try Here button on Insertion page
    Then The user redirected to Insertion page having an tryEditor with a Run button to test

  @Linkedlist
  Scenario: Verify valid python code of Insertion
    Given The user is on the Try Editor page of Insertion page
    When User writes Python code for Linked list given sheetname "sheet4" rownumber 1 and columnumber 1
    And User click on Run button on Linked list page
    Then User sees output in the output panel of Linked list page

  @Linkedlist
  Scenario: The user Verify running an invalid python code gives an error of Linked list
    Given The user is on the Try Editor page of Insertion page
    When User writes Python code for Linked list given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on Run button on Linked list page
    Then The user gets error pop up box of Linked list page

  @Linkedlist
  Scenario: Go back to Insertion page from Try Editor page
    Given The User is on the Try Editor page of Insertion
    When The user clicks on the back arrow of Insertion page
    Then It should redirect to of Insertion
    And Topics covered section is displayed on left side of the page

  @Linkedlist
  Scenario: Validate Deletion page is opened
    Given The user is on the Linked list page after logged in
    When The user clicks Deletion link present under topics covered
    Then The user should be directed to Deletion Page

  @Linkedlist
  Scenario: Validate to Try Here panel of Deletion
    Given The user is on the Deletion page
    When The User clicks Try Here button of Deletion page
    Then The user redirected to Deletion page having an tryEditor with a Run button to test

  @Linkedlist
  Scenario: Verify valid python code of Deletion
    Given The user is on the Try Editor page of Deletion page
    When User writes Python code for Linked list given sheetname "sheet4" rownumber 1 and columnumber 1
    And User click on Run button on Linked list page
    Then User sees output in the output panel under Deletion page

  @Linkedlist
  Scenario: The user Verify running an invalid python code gives an error of Linked list
    Given The user is already on the Try Editor page of Deletion page
    When User writes Python code for Linked list given sheetname "sheet4" rownumber 2 and columnumber 1
    And User click on Run button on Linked list page
    Then The user gets error pop up box of Linked list page

  @Linkedlist
  Scenario: Go back to Deletion page from Try Editor page
    Given The User is on the Try Editor page of Deletion
    When The user clicks on the back arrow of Deletion Page
    Then It should redirect to of Deletion
    And Topics covered section is displayed on left side of the page

  @Linkedlist
  Scenario: The user validating Practice Questions page of linked list
    Given The user is on the Linked list page after logged in
    And Navigated to any topics of the Linked list page -Types of Linkedlist
    When The user clicks on the Practice Questions of linked list
    Then Practice Question Page should be open on Linkedlist
   
  @Linkedlist
  Scenario: Validate Practice Questions are visible on Practice Question Page of Linked list
  Given The user is in the Linked list page after loggedin
  And Navigated to any topics of the Linked list page -Types of Linkedlist
  When The user clicks Practice Questions of LinkedList Section
  Then Sets of practice questions should be available on the LinkedList  
