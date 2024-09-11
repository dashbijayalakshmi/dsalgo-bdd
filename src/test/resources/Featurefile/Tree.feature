Feature: Validate Tree module features

  Background: 
    Given User clicks Sign in link.
    When User enters Username and password and clicks login button.
    Then User enters home page.
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
    When The user writes valid Python code under Terminologies section
    And Click on Run button under Terminologies section
    Then User sees output in the output panel under Terminologies section

  #@Tree
  #Scenario: Verify running an invalid python code gives an error
    #Given User is already on the Try Editor page under Terminologies section
    #When The user writes invalid Python code under Terminologies section
    #And Click on Run button to run invalid code under Terminologies section
    #Then User gets error alert box under Terminologies section
#
  #@Tree
  #Scenario: Go back to Terminologies page from Try Try Editor page
    #Given User is on the Try Eiotr page of Terminologies section
    #When User clicks on the back arrow under Terminologies section
    #Then It should redirect to Terminologies page
    #And Topics covered section is displayed on the left under Terminologies section
