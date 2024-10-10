package StepDefination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import Pageobjects.Signinpageobjects;
import Pageobjects.landingpageobjects;
import Utils.ExcelReader;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class signinStepDefination {
	
	TestContextSetup testcontextsetup;
	Signinpageobjects signinpage;
	landingpageobjects landingpage;
	
	public signinStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.signinpage=testcontextsetup.pageobjectmanager.getSigninpageobjects();
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
	}
	
	@Given("User is already navigated to the DS Algo Portal")
	public void user_is_already_navigated_to_the_ds_algo_portal() throws IOException {
		System.out.println("The User is on the"+testcontextsetup.testbase.WebDriverManager().getTitle()+" Portal");
	}
	
	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
	    String actual_title=landingpage.get_Title();
	    String exp_title="Login";
	    assertEquals(exp_title,actual_title);
	    System.out.println("User navigated to "+actual_title+ " Page");
	}
	
   @Given("User clicks Sign in link.")
	public void click_sign() {
	signinpage.click_signin_link();
   }
		
   @When("User enters Username from given sheetname {string} rownumber {int} and columnumber {int}")
   public void user_enters_username_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) {
	   String newUsername=ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
	   signinpage.enter_username(newUsername);
	 
   }

   @When("User enter password from given sheetname {string} rownumber {int} and columnumber {int}")
   public void user_enter_password_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) {
	   String newPassword=ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
	   signinpage.enter_password(newPassword);
	
   }

   @Then("User clicks login button")
   public void user_clicks_login_button() {
	   signinpage.click_login_btn();
      
   }

	@Then("User enters home page.")
	public void get_title_home_page() {
		landingpage.get_Title();
	}
	
	@When("User clicks login button without providing any Username & Passowrd details")
	public void user_clicks_login_button_without_providing_any_username_passowrd_details()  {
		signinpage.press_tab_on_username();
		signinpage.press_tab_on_password();
		signinpage.click_login_btn();
	    
	}

	@Then("User should receive an error message")
	public void user_should_receive_an_error_message() {
		signinpage.error_username_req();
	    
	}

	@Then("The error message Please fill out this field appears below Pwd textbox")
	public void the_error_message_please_fill_out_this_field_appears_below_pwd_textbox() {
	    signinpage.error_password_req();
	}
	@Then("The error message Please fill out this field appears below USername textbox")
	public void the_error_message_please_fill_out_this_field_appears_below_u_sername_textbox() {
		signinpage.error_username_req();
	}
	@Then("User should receive an invalid user credentials error message")
	public void user_should_receive_an_invalid_user_credentials_error_message() {
	    
	    signinpage.error_invalid_userandpass();
	}

	@Then("User should receive an invalid password error message")
	public void user_should_receive_an_invalid_password_error_message() {
		signinpage.error_invalid_userandpass();
	    
	}

	@Then("User should receive an invalid username error message")
	public void user_should_receive_an_invalid_username_error_message() {
		signinpage.error_invalid_userandpass();
	    
	}

	@When("User clicks Register link present on the Signin page")
	public void user_clicks_register_link_present_on_the_signin_page() {
	    signinpage.click_register_from_signingpage();
	    
	}

	@Then("USer should be redirected to the registration page")
	public void u_ser_should_be_redirected_to_the_registration_page() {
	    String actual_tit=landingpage.get_Title();
	    String exp_tit="Registration";
	    assertEquals(exp_tit,actual_tit);
	    System.out.println("User navigated to "+actual_tit+ " Page");
	    
	}

	
	
	
	
	
	
	
	
}
