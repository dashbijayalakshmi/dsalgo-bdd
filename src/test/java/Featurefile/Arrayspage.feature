Feature: Verify Arrays page

  Background: Verify loginpage Signin page
    Given User Clicks GetStated button of Arrays pane.
    When Arrays page is displayed with Topics covered.
      | Arrays in Python          |
      | Arrays Using List         |
      | Basic Operations in Lists |
      | Applications of Array     |
   @SmokeTest
  Scenario Outline: Verify the array Topics
    Given User clicks "Arrays in Python".
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output
    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |
   @SmokeTest
 Scenario Outline: Verify the array Topics
    Given User clicks "Arrays Using List".
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output
    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |
  @SmokeTest
 Scenario Outline: Verify the array Topics
    Given User clicks "Basic Operations in Lists".
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output
    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |
   @SmokeTest
  Scenario Outline: Verify the array Topics
    Given User clicks "Applications of Array".
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output
    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |
      