@tag
Feature: Validate User Registration page of DS Algo Portal

  Background: 
    Given User is already navigated to the DS Algo Portal
    When User clicks Registration link.
    Then The user is on the Registration Page

  @Registration
  Scenario: Verify that Username field is present on the registartion page
    Given The user is on the Registration Page
    When User look for an availibitity of the fields from given sheetname "Sheet3" rownumber 0 and columnumber 0
    Then Username field should be present on the Registration page

  @Registration
  Scenario: Verify that Password field is present on the registartion page
    Given The user is on the Registration Page
    When User look for an availibitity of the Password field from given sheetname "Sheet3" rownumber 1 and columnumber 0
    Then Password field should be present on the Registration page

  @Registration
  Scenario: Verify that Confirm Password field is present on the registartion page
    Given The user is on the Registration Page
    When User look for an availibitity of the PAssword Confirmation field from given sheetname "Sheet3" rownumber 2 and columnumber 0
    Then Confirm Password field should be present on the Registration page

  @Registration
  Scenario: Verify when Username, Password and confirm password fields are kept blank and then Register button is clicked
    Given The user is on the Registration Page
    When User keeps username, password and confirm password fields blank
    And Clicked on Register button
    Then The error message Please fill out this field appears below USername textbox

  @Registration
  Scenario: Verify when only Username is provided and other fields are blank
    Given The user is on the Registration Page
    When User enters Username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And Clicked on Register button
    Then The error message to fill password field appears below Pwd textbox

  @Registration
  Scenario: Verify when only Username and password are provided and Confirm password is blank
    Given The user is on the Registration Page
    When From register page user enters Username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And From register page user enter password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    And Clicked on Register button
    Then Confirm password mandatory field error is displayed

  @Registration
  Scenario: Verify when spacebar is entered in username but valid password and confirm password is entered
    Given The user is on the Registration Page
    When From register page user enters Username from given sheetname "Sheet3" rownumber 4 and columnumber 0
    And From register page user enter password from given sheetname "Sheet3" rownumber 4 and columnumber 1
    And From register page user enter confirm password from given sheetname "Sheet3" rownumber 4 and columnumber 2
    And Clicked on Register button
    Then Username can not have space.. error message should appear

  @Registration
  Scenario: Verify when valid username is entered and password entered is less than eight character
    Given The user is on the Registration Page
    When From register page user enters Username from given sheetname "Sheet3" rownumber 5 and columnumber 0
    And From register page user enter password from given sheetname "Sheet3" rownumber 5 and columnumber 1
    And From register page user enter confirm password from given sheetname "Sheet3" rownumber 5 and columnumber 2
    And Clicked on Register button
    Then Password can not be less than eight characters error message should appear

  @Registration
  Scenario: Verify when valid username is entered and password entered is only numeric
    Given The user is on the Registration Page
    When From register page user enters Username from given sheetname "Sheet3" rownumber 6 and columnumber 0
    And From register page user enter password from given sheetname "Sheet3" rownumber 6 and columnumber 1
    And From register page user enter confirm password from given sheetname "Sheet3" rownumber 6 and columnumber 2
    And Clicked on Register button
    Then Password can not be only numeric.. error message should appear

  @Registration
  Scenario: The user clicks Register button after entering different passwords in Password and Password Confirmation fields
    Given The user is on the Registration Page
    When From register page user enters Username from given sheetname "Sheet3" rownumber 7 and columnumber 0
    And From register page user enter password from given sheetname "Sheet3" rownumber 7 and columnumber 1
    And From register page user enter confirm password from given sheetname "Sheet3" rownumber 7 and columnumber 2
    And Clicked on Register button
    Then Password and confirm password does not match error message should appear

  @Registration
  Scenario: Verify when an existing username is entered
    Given The user is on the Registration Page
    When From register page user enters Username from given sheetname "Sheet3" rownumber 7 and columnumber 0
    And From register page user enter password from given sheetname "Sheet3" rownumber 7 and columnumber 1
    And From register page user enter confirm password from given sheetname "Sheet3" rownumber 7 and columnumber 2
    And Clicked on Register button
    Then User already exists error message should appear
