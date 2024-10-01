Feature: Validate Tree module features

  Background: 
    Given User clicks Sign in link.
    When User enters Username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And User enter password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    Then User clicks login button
    And User enters home page.
    And Clicks on Get Started button on the Tree introduction panel

  @Tree
  Scenario Outline: Verify required topics are covered on Tree page
    Given User is on the Tree module page
    When The user scroll downs to Topics covered section on the Tree page
    Then Required list of topics covered should be displayed
      | Overview of Trees              |
      | Terminologies                  |
      | Types of Trees                 |
      | Tree Traversals                |
      | Traversals-Illustration        |
      | Binary Trees                   |
      | Types of Binary Trees          |
      | Implementation in Python       |
      | Binary Tree Traversals         |
      | Implementation of Binary Trees |
      | Applications of Binary trees   |
      | Binary Search Trees            |
      | Implementation Of BST          |

  @Tree
  Scenario: Validate Overview of Trees page is opened
    Given The user is in the Tree page after loggedin
    When The user clicks Overview of Trees link present under topics covered
    Then The user should be directed to Overview of Trees page

  @Tree
  Scenario: Validate Try Here panel of Overview of Trees page
    Given The user is on the Overview of Trees page
    When User clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @Tree
  Scenario: Verify valid python code
    Given User is on the Try Editor page of Overview of Trees section
    When The user writes valid Python code
    And Click on Run button
    Then User sees output in the output panel

  @Tree
  Scenario: Verify running an invalid python code gives an error
    Given User is already on the Try Editor page
    When The user writes invalid Python code
    And Click on Run button to run invalid code
    Then User gets error alert box

  @Tree
  Scenario: Go back to Overview of Trees page from Try Try Editor page
    Given User is on the Try Eiotr page of Overview of Trees section
    When User clicks on the back arrow
    Then It should redirect to Overview of Trees page
    And Topics covered section is displayed on the left

  @Tree
  Scenario: Validate Terminologies page is opened
    Given The user is in the Tree page after login
    When The user clicks Terminologies link present under topics covered
    Then The user should be directed to Terminologies page

  @Tree
  Scenario: Validate Try Here panel of Terminologies page
    Given The user is on the Terminologies page
    When User clicks Try Here button on the Terminologies page
    Then The user should be redirected to a Terminologies page having an tryEditor with a Run button to test

  @Tree
  Scenario: Verify valid python code for Terminilogies section
    Given User is on the Try Editor page of Terminologies section
    When The user writes Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And Click on Run button
    Then User sees output in the output panel under Terminologies section

  @Tree
  Scenario: Verify running an invalid python code gives an error
    Given User is already on the Try Editor page under Terminologies section
    When The user writes Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And Click on Run button
    Then User gets error alert box under Terminologies section

  @Tree
  Scenario: Go back to Terminologies page from Try Try Editor page
    Given User is on the Try Editor page of Terminologies section
    When User clicks on the back arrow under Terminologies section
    Then It should redirect to Terminologies page
    And Topics covered section is displayed on the left

  @Tree
  Scenario: Validate Types of Trees page is opened
    Given The user is in the Tree page after loggedin
    When The user clicks Types of Trees link present under topics covered
    Then The user should be directed to Types of Trees page

  @Tree
  Scenario: Validate Try Here panel of Types of Trees page
    Given The user is on the Types of Trees page
    When User clicks Try Here button
    Then The user should be redirected to a Types of Trees page having an tryEditor with a Run button to test

  @Tree
  Scenario: Verify valid python code for Types of Trees section
    Given User is on the Try Editor page
    When The user writes Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And Click on Run button
    Then User gets output in the output panel

  @Tree
  Scenario: Verify running an invalid python code gives an error
    Given User is on the Try Editor page
    When The user writes Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And Click on Run button
    Then User gets error popup box

  @Tree
  Scenario: Go back to Types of Trees page from Try Try Editor page
    Given User is on the Try Editor page
    When User clicks on the back arrow under Types of Trees section
    Then It should redirect to Types of Trees page
    And Topics covered section is displayed on the left

  @Tree
  Scenario: Validate Tree Traversalss page is opened
    Given The user is in the Tree page after loggedin
    When The user clicks Tree Traversals link present under topics covered
    Then The user should be directed to Tree Traversals page

  @Tree
  Scenario: Validate Try Here panel of Tree Traversals page
    Given The user is on the Tree Traversals page
    When User clicks Try Here button from Tree Traversals page
    Then The user should be redirected to a Tree Traversals page having an tryEditor with a Run button to test

  @Tree
  Scenario: Verify valid python code for Tree Traversals section
    Given User is on the Try Editor page of Tree Traversals
    When The user writes Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And Click on Run button
    Then User gets output in the output panel

  @Tree
  Scenario: Verify running an invalid python code gives an error
    Given User is on the Try Editor page of Tree Traversals
    When The user writes Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And Click on Run button
    Then User gets error popup box

  @Tree
  Scenario: Go back to Tree Traversals page from Try Try Editor page
    Given User is on the Try Editor page from Tree Traversals
    When User clicks on the back arrow under Tree Traversals section
    Then It should redirect to Tree Traversals page
    And Topics covered section is displayed on the left

  @Tree
  Scenario: Validate Traversals-Illustrations page is opened
    Given The user is in the Tree page after loggedin
    When The user clicks Traversals-Illustrations link present under topics covered
    Then The user should be directed to Traversals-Illustrations page

  @Tree
  Scenario: Validate Try Here panel of Traversals-Illustrations page
    Given The user is on the Traversals-Illustrations page
    When User clicks Try Here button from Traversals-Illustrations page
    Then The user should be redirected to a Traversals-Illustrations page having an tryEditor with a Run button to test

  @Tree
  Scenario: Verify valid python code for Terminilogies section
    Given User is on the Try Editor page of Traversals-Illustrations page
    When The user writes Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And Click on Run button
    Then User gets output in the output panel

  @Tree
  Scenario: Verify running an invalid python code gives an error
    Given User is on the Try Editor page of Traversals-Illustrations page
    When The user writes Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And Click on Run button
    Then User gets error popup box

  @Tree
  Scenario: Go back to Traversals-Illustrations page from Try Try Editor page
    Given User is on the Try Editor page from Traversals-Illustrations page
    When User clicks on the back arrow under Traversals-Illustrations section
    Then It should redirect to Traversals-Illustrations page
    And Topics covered section is displayed on the left

  @Tree
  Scenario: Validate Binary Trees page is opened
    Given The user is in the Tree page after loggedin
    When The user clicks Binary Trees link present under topics covered
    Then The user should be directed to Binary Trees page

  @Tree
  Scenario: Validate Try Here panel of Binary Trees page
    Given The user is on the Binary Trees page
    When User clicks Try Here button from Binary Trees page
    Then The user should be redirected to a Binary Trees page having an tryEditor with a Run button to test

  @Tree
  Scenario: Verify valid python code for Terminilogies section
    Given User is on the Try Editor page of Binary Trees page
    When The user writes Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And Click on Run button
    Then User gets output in the output panel

  @Tree
  Scenario: Verify running an invalid python code gives an error
    Given User is on the Try Editor page of Binary Trees page
    When The user writes Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And Click on Run button
    Then User gets error popup box

  @Tree
  Scenario: Go back to Binary Trees page from Try Try Editor page
    Given User is on the Try Editor page from Binary Trees page
    When User clicks on the back arrow under Binary Trees section
    Then It should redirect to Binary Trees page
    And Topics covered section is displayed on the left

  @Tree
  Scenario: Validate Types of Binary Trees page is opened
    Given The user is in the Tree page after loggedin
    When The user clicks Types of Binary Trees link present under topics covered
    Then The user should be directed to Types of Binary Trees page

  @Tree
  Scenario: Validate Try Here panel of Types of Binary Trees page
    Given The user is on the Types of Binary Trees page
    When User clicks Try Here button from Types of Binary Trees page
    Then The user should be redirected to a Types of Binary Trees page having an tryEditor with a Run button to test

  @Tree
  Scenario: Verify valid python code for Terminilogies section
    Given User is on the Try Editor page of Types of Binary Trees page
    When The user writes Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And Click on Run button
    Then User gets output in the output panel

  @Tree
  Scenario: Verify running an invalid python code gives an error
    Given User is on the Try Editor page of Types of Binary Trees page
    When The user writes Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And Click on Run button
    Then User gets error popup box

  @Tree
  Scenario: Go back to Types of Binary Trees page from Try Try Editor page
    Given User is on the Try Editor page from Types of Binary Trees page
    When User clicks on the back arrow under Types of Binary Trees section
    Then It should redirect to Types of Binary Trees page
    And Topics covered section is displayed on the left

  @Tree
  Scenario: Validate Implementation in Python page is opened
    Given The user is in the Tree page after loggedin
    When The user clicks Implementation in Python link present under topics covered
    Then The user should be directed to Implementation in Python page

  @Tree
  Scenario: Validate Try Here panel of Implementation in Python page
    Given The user is on the Implementation in Python page
    When User clicks Try Here button from Implementation in Python page
    Then The user should be redirected to a Implementation in Python page having an tryEditor with a Run button to test

  @Tree
  Scenario: Verify valid python code for Terminilogies section
    Given User is on the Try Editor page of Implementation in Python page
    When The user writes Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And Click on Run button
    Then User gets output in the output panel

  @Tree
  Scenario: Verify running an invalid python code gives an error
    Given User is on the Try Editor page of Implementation in Python page
    When The user writes Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And Click on Run button
    Then User gets error popup box

  @Tree
  Scenario: Go back to Implementation in Python page from Try Try Editor page
    Given User is on the Try Editor page of Implementation in Python page
    When User clicks on the back arrow under Implementation in Python section
    Then It should redirect to Implementation in Python page
    And Topics covered section is displayed on the left

  @Tree
  Scenario: Validate Binary Tree Traversals page is opened
    Given The user is in the Tree page after loggedin
    When The user clicks Binary Tree Traversals link present under topics covered
    Then The user should be directed to Binary Tree Traversals page

  @Tree
  Scenario: Validate Try Here panel of Binary Tree Traversals page
    Given The user is on the Binary Tree Traversals page
    When User clicks Try Here button from Binary Tree Traversals page
    Then The user should be redirected to a Binary Tree Traversals page having an tryEditor with a Run button to test

  @Tree
  Scenario: Verify valid python code for Terminilogies section
    Given User is on the Try Editor page of Binary Tree Traversals page
    When The user writes Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And Click on Run button
    Then User gets output in the output panel

  @Tree
  Scenario: Verify running an invalid python code gives an error
    Given User is on the Try Editor page of Binary Tree Traversals page
    When The user writes Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And Click on Run button
    Then User gets error popup box

  @Tree
  Scenario: Go back to Binary Tree Traversals page from Try Try Editor page
    Given User is on the Try Editor page of Binary Tree Traversals page
    When User clicks on the back arrow under Binary Tree Traversals section
    Then It should redirect to Binary Tree Traversals page
    And Topics covered section is displayed on the left

  @Tree
  Scenario: Validate Implementation of Binary Trees page is opened
    Given The user is in the Tree page after loggedin
    When The user clicks Implementation of Binary Trees link present under topics covered
    Then The user should be directed to Implementation of Binary Trees page

  @Tree
  Scenario: Validate Try Here panel of Implementation of Binary Trees page
    Given The user is on the Implementation of Binary Trees page
    When User clicks Try Here button from Implementation of Binary Trees page
    Then The user should be redirected to a Implementation of Binary Trees page having an tryEditor with a Run button to test

  @Tree
  Scenario: Verify valid python code for Terminilogies section
    Given User is on the Try Editor page of Implementation of Binary Trees page
    When The user writes Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And Click on Run button
    Then User gets output in the output panel

  @Tree
  Scenario: Verify running an invalid python code gives an error
    Given User is on the Try Editor page of Implementation of Binary Trees page
    When The user writes Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And Click on Run button
    Then User gets error popup box

  @Tree
  Scenario: Go back to Implementation of Binary Trees page from Try Try Editor page
    Given User is on the Try Editor page of Implementation of Binary Trees page
    When User clicks on the back arrow under Implementation of Binary Trees section
    Then It should redirect to Implementation of Binary Trees page
    And Topics covered section is displayed on the left

  @Tree
  Scenario: Validate Applications of Binary trees Trees page is opened
    Given The user is in the Tree page after loggedin
    When The user clicks Applications of Binary trees Trees link present under topics covered
    Then The user should be directed to Applications of Binary trees Trees page

  @Tree
  Scenario: Validate Try Here panel of Applications of Binary trees Trees page
    Given The user is on the Applications of Binary trees Trees page
    When User clicks Try Here button from Applications of Binary trees Trees page
    Then The user should be redirected to a Applications of Binary trees Trees page having an tryEditor with a Run button to test

  @Tree
  Scenario: Verify valid python code for Terminilogies section
    Given User is on the Try Editor page of Applications of Binary trees Trees page
    When The user writes Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And Click on Run button
    Then User gets output in the output panel

  @Tree
  Scenario: Verify running an invalid python code gives an error
    Given User is on the Try Editor page of Applications of Binary trees Trees page
    When The user writes Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And Click on Run button
    Then User gets error popup box

  @Tree
  Scenario: Go back to Applications of Binary trees Trees page from Try Try Editor page
    Given User is on the Try Editor page of Applications of Binary trees Trees page
    When User clicks on the back arrow under Applications of Binary trees Trees section
    Then It should redirect to Applications of Binary trees Trees page
    And Topics covered section is displayed on the left

  @Tree
  Scenario: Validate Binary Search  Trees page is opened
    Given The user is in the Tree page after loggedin
    When The user clicks Binary Search  Trees link present under topics covered
    Then The user should be directed to Binary Search  Trees page

  @Tree
  Scenario: Validate Try Here panel of Binary Search  Trees page
    Given The user is on the Binary Search  Trees page
    When User clicks Try Here button from Binary Search  Trees page
    Then The user should be redirected to a Binary Search  Trees page having an tryEditor with a Run button to test

  @Tree
  Scenario: Verify valid python code for Terminilogies section
    Given User is on the Try Editor page of Binary Search  Trees page
    When The user writes Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And Click on Run button
    Then User gets output in the output panel

  @Tree
  Scenario: Verify running an invalid python code gives an error
    Given User is on the Try Editor page of Binary Search  Trees page
    When The user writes Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And Click on Run button
    Then User gets error popup box

  @Tree
  Scenario: Go back to Binary Search  Trees page from Try Try Editor page
    Given User is on the Try Editor page of Binary Search  Trees page
    When User clicks on the back arrow under Binary Search  Trees section
    Then It should redirect to Binary Search  Trees page
    And Topics covered section is displayed on the left

  @Tree
  Scenario: Validate Implementation Of BST page is opened
    Given The user is in the Tree page after loggedin
    When The user clicks Implementation Of BST link present under topics covered
    Then The user should be directed to Implementation Of BST page

  @Tree
  Scenario: Validate Try Here panel of Implementation Of BST page
    Given The user is on the Implementation Of BST page
    When User clicks Try Here button from Implementation Of BST page
    Then The user should be redirected to a Implementation Of BST page having an tryEditor with a Run button to test

  @Tree
  Scenario: Verify valid python code for Terminilogies section
    Given User is on the Try Editor page of Implementation Of BST page
    When The user writes Python code from given sheetname "Sheet4" rownumber 1 and columnumber 1
    And Click on Run button
    Then User gets output in the output panel

  @Tree
  Scenario: Verify running an invalid python code gives an error
    Given User is on the Try Editor page of Implementation Of BST page
    When The user writes Python code from given sheetname "sheet4" rownumber 2 and columnumber 1
    And Click on Run button
    Then User gets error popup box

  @Tree
  Scenario: Go back to Implementation Of BST page from Try Try Editor page
    Given User is on the Try Editor page of Implementation Of BST page
    When User clicks on the back arrow under Implementation Of BST section
    Then It should redirect to Implementation Of BST page
    And Topics covered section is displayed on the left

  @Tree
  Scenario: Validate Practice Questions of Tree section
    Given The user is in the Tree page after loggedin
    And Navigated to any topics of the Tree - Implementation Of BST
    When The user clicks Practice Questions of Tree section
    Then Practice Question page should open

  @Tree
  Scenario: Validate id Practice Questions are visible on Practice Question Page
    Given The user is in the Tree page after loggedin
    And Navigated to any topics of the Tree - Implementation Of BST
    When The user clicks Practice Questions of Tree section
    Then Sets of practice questions should be available on the page
