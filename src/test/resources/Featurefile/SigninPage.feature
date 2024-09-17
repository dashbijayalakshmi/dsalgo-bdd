@tag
Feature: Validate DS Algo Sign in Page

  Background: 
    Given User is already navigated to the DS Algo Portal
    When User clicks Sign in link.
    Then The user is on the DS Algo Sign in Page

  @login
  Scenario: Validate when valid username & password are provided
    Given The user is on the DS Algo Sign in Page
    When User enters Username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And User enter password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    And User clicks login button
    Then User enters home page.

  @login
  Scenario: Validate when only Username is provided and Password is not provided
    Given The user is on the DS Algo Sign in Page
    When User enters Username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And User clicks login button
    Then The error message Please fill out this field appears below Pwd textbox

  @login
  Scenario: Validate when only Password is provided and Username is not provided
    Given The user is on the DS Algo Sign in Page
    When User enter password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    And User clicks login button
    Then The error message Please fill out this field appears below USername textbox

  @login
  Scenario: Validate when invalid username & invalid password are provided
    Given The user is on the DS Algo Sign in Page
    When User enters Username from given sheetname "Sheet2" rownumber 3 and columnumber 0
    And User enter password from given sheetname "Sheet2" rownumber 3 and columnumber 1
    And User clicks login button
    Then User should receive an invalid user credentials error message

  @login
  Scenario: Validate when valid username & invalid password are provided
    Given The user is on the DS Algo Sign in Page
    When User enters Username from given sheetname "Sheet2" rownumber 2 and columnumber 0
    And User enter password from given sheetname "Sheet2" rownumber 2 and columnumber 1
    And User clicks login button
    Then User should receive an invalid password error message

  @login
  Scenario: Validate when invalid username & valid password are provided
    Given The user is on the DS Algo Sign in Page
    When User enters Username from given sheetname "Sheet2" rownumber 3 and columnumber 0
    And User enter password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    And User clicks login button
    Then User should receive an invalid username error message

  @login
  Scenario: Validate login functionality without providing username & Password
    Given The user is on the DS Algo Sign in Page
    When User clicks login button without providing any Username & Passowrd details
    Then User should receive an error message

  @login
  Scenario: Validate Registeration page is opened when Register link is clicked from the signin page
    Given The user is on the DS Algo Sign in Page
    When User clicks Register link present on the Signin page
    Then USer should be redirected to the registration page
