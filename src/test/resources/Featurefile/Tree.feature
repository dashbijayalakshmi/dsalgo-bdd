Feature: Validate Tree module features

  Background: 
    Given User clicks Sign in link.
    When User enters Username and password and clicks login button.
    Then User enters home page.
    And Clicks on Get Started button on the Tree introduction panel

  #@Tree
  #Scenario: Open Tree Module page
    #Given User has logged in
    #When User clicks on Get Started button on the Tree introduction panel
    #Then Tree details page opens up

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

  #@Tree
  #Scenario: Validate Try Here panel of Overview of Trees page
    #Given The user is on the Overview of Trees page
    #When User clicks Try Here button
    #Then The user should be redirected to a page having an tryEditor with a Run button to test
#
  #@Tree
  #Scenario: Verify valid python code
    #Given User is on the Try Editor page
    #When The user writes valid Python code
    #And Click on Run button
    #Then User is see output in the output panel
#
  #@Tree
  #Scenario: Verify invalid python code
    #Given User is on the Try Editor page
    #When The user writes invalid Python code
    #And Click on Run button
    #Then User gets error
    #And An Alert box is dispalyed
#
  #@Tree
  #Scenario: Verify that an alert box is closed when clicked on button
    #Given User has run invalid code
    #When USer clicks ok on the alert popup after running invalid code
    #Then Alert popup box is closed
    #And User is still on the Try Editor page
#
  #@Tree
  #Scenario: Go back to Overview of Trees page from Try Try Editor page
    #Given User is on the Try Eiotr page of Overview of Trees section
    #When User clicks on the back arrow
    #Then It should redirect to Overview of Trees page
    #And Topics covered section is displayed on the left
