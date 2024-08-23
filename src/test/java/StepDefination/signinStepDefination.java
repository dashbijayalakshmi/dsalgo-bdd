package StepDefination;

import Pageobjects.Signinpageobjects;
import Pageobjects.landingpageobjects;
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
	@When("User enters Username and password and clicks login button.")
	public void enter_username_password_click_btn() {
		signinpage.enter_username("Nirvana", "archanachaya");
		signinpage.click_login_btn();
	}
	@Then("User enters home page.")
	public void get_title_home_page() {
		landingpage.get_Title();
	}
}
