package StepDefination;

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
}
