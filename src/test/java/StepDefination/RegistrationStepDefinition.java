package StepDefination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Pageobjects.RegistrationPageObj;
import Pageobjects.landingpageobjects;
import Utils.ExcelReader;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class RegistrationStepDefinition {
	
	TestContextSetup testcontextsetup;
	landingpageobjects landingpageobj;
	RegistrationPageObj regpageobj;
	
	public RegistrationStepDefinition(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		this.regpageobj=testcontextsetup.pageobjectmanager.getregpageobj();
		this.landingpageobj=testcontextsetup.pageobjectmanager.getLandingpageobjects();
	}
	
	@When("User clicks Registration link.")
	public void user_clicks_registration_link() {
		regpageobj.click_register_link();
	    
	}

	@Then("The user is on the Registration Page")
	public void the_user_is_on_the_registartion_page() {
	    String exp_tit="Registration";
	    String actual_tit=landingpageobj.get_Title();
	    assertEquals(exp_tit,actual_tit);
	    System.out.println("User is on the "+actual_tit+" Page");	    
	}

	@When("User look for an availibitity of the fields from given sheetname {string} rownumber {int} and columnumber {int}")
	public void user_look_for_an_availibitity_of_the_fields_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) 
	{	    
	    String expected_username_field=ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
	    String actual_username_field=regpageobj.username_availability();
	    boolean result=(expected_username_field.equals(actual_username_field));
	    Assert.assertTrue(result, "FAILED expected field "+expected_username_field+" is not present");
	    System.out.println("PASSED expected field "+expected_username_field+" is present ");
 		
//	    Assert.assertEquals(expected_username_field, actual_username_field);
	        
//	    if (expected_username_field.equals(actual_username_field))	    {
//	    	System.out.println("PASS "+expected_username_field+" Field is present");
//		 }	    
//	    else
//	    {
//	    	assert.fail();
//	    	System.out.println("FAIL Username Field doesn't exist "+actual_username_field);
//	    }	   
	}
	@Then("Username field should be present on the Registration page")
	public void username_field_should_be_present_on_the_registration_page() 
	{
		System.out.println(" Username field is present on Registartion page");	    
	}
	
	@When("User look for an availibitity of the Password field from given sheetname {string} rownumber {int} and columnumber {int}")
	public void user_look_for_an_availibitity_of_the_password_field_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) 
	{
	  String actual_Password_field=regpageobj.password_availibility(); 
      String expected_password_field=ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
      boolean result1=(expected_password_field.equals(actual_Password_field));
      Assert.assertTrue(result1, "FAILED expected field "+expected_password_field+" is not present");
      System.out.println("PASSED expected field "+expected_password_field+" is present "); 
	}
	
	@Then("Password field should be present on the Registration page")
	public void password_field_should_be_present_on_the_registration_page() 
	{
		System.out.println(" Password field is present on Registartion page");
	}
	
	@When("User look for an availibitity of the PAssword Confirmation field from given sheetname {string} rownumber {int} and columnumber {int}")
	public void user_look_for_an_availibitity_of_the_p_assword_confirmation_field_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) 
	{
	  String actual_confirm_Password_field=regpageobj.confirm_passwd_availibilty(); 
      String expected_confirm_password_field=ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
      boolean result2=(expected_confirm_password_field.equals(actual_confirm_Password_field));
      Assert.assertTrue(result2, "FAILED expected field "+expected_confirm_password_field+" is not present");
      System.out.println("PASSED expected field "+expected_confirm_password_field+" is present ");   
	}
	
	@Then("Confirm Password field should be present on the Registration page")
	public void confirm_password_field_should_be_present_on_the_registration_page() 
	{
		System.out.println(" Password Confirmation field is present on Registartion page"); 	    
	}
	
	@When("User keeps username, password and confirm password fields blank")
	public void user_keeps_username_password_and_confirm_password_fields_blank() 
	{
		regpageobj.press_tab_username();
		regpageobj.press_tab_password();
		regpageobj.press_tab_confirmpassword();
	}
	
	

	

	
	@When("User enter confirm password from given sheetname {string} rownumber {int} and columnumber {int}")
	public void user_enter_confirm_password_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) {
		String confirm_Password=ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
		regpageobj.enter_password_confirmation(confirm_Password);      
	}

	@When("Clicked on Register button")
	public void clicked_on_register_button() 
	{
	    regpageobj.click_register_button();	    
	}

	@Then("Mandatory field error is occured")
	public void mandatory_field_error_is_occured() 
	{	    
	    
	}
	

	@Then("Password and confirm password mandatory field error is displayed")
	public void password_and_confirm_password_mandatory_field_error_is_displayed() {
	    
	    
	}

	@Then("Confirm password mandatory field error is displayed")
	public void confirm_password_mandatory_field_error_is_displayed() {
	    regpageobj.error_confirm_pass_req();
	}

	@Then("Invalid password error message should appear")
	public void invalid_password_error_message_should_appear() {
	    
	    
	}

	@Then("Password and confirm password error message should appear")
	public void password_and_confirm_password_error_message_should_appear() {
	    
	    
	}

	@Then("new user created successfully")
	public void new_user_created_successfully() {
	    
		regpageobj.newuser_susscess_message();
	}
	
	@Then("The error message to fill password field appears below Pwd textbox")
	public void the_error_message_to_fill_password_field_appears_below_pwd_textbox() 
	{
	    regpageobj.error_pass_req();
	}
	@When("From register page user enters Username from given sheetname {string} rownumber {int} and columnumber {int}")
	public void from_register_page_user_enters_username_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber)
	{
		String regUsername=ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
		regpageobj.enter_username_regpage(regUsername); 
	}
	@When("From register page user enter password from given sheetname {string} rownumber {int} and columnumber {int}")
	public void from_register_page_user_enter_password_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) 
	{
		String regPassword=ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
		regpageobj.enter_password_regpage(regPassword); 
	}
	@When("From register page user enter confirm password from given sheetname {string} rownumber {int} and columnumber {int}")
	public void from_register_page_user_enter_confirm_password_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) 
	{
		String regConfirmPassword=ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
		regpageobj.enter_confirmpassword_regpage(regConfirmPassword); 
	}
	@Then("Username can not have space.. error message should appear")
	public void username_can_not_have_space_error_message_should_appear() 
	{
	    
	    regpageobj.error_invalid_username_spacebar();
	}

	@Then("Password can not be less than eight characters error message should appear")
	public void password_can_not_be_less_than_eight_characters_error_message_should_appear() 
	{
	    
	    regpageobj.error_invalid_password_lessthan8char();
	}

	@Then("Password can not be only numeric.. error message should appear")
	public void password_can_not_be_only_numeric_error_message_should_appear() 
	{
	    regpageobj.error_invalid_password_numeric();
	    
	}


	@Then("Password and confirm password does not match error message should appear")
	public void password_and_confirm_password_does_not_match_error_message_should_appear()
	{
		regpageobj.error_invalid_passwordandConfirmpassword();
	}

	@Then("User already exists error message should appear")
	public void user_already_exists_error_message_should_appear() 
	{
	    regpageobj.error_existing_username();
	}



}
