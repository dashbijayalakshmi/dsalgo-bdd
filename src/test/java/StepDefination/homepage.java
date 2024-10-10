package StepDefination;

import Pageobjects.Signinpageobjects;
import Pageobjects.homepage_pageobject;
import Pageobjects.landingpageobjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class homepage {

	TestContextSetup testcontextsetup;
	Signinpageobjects signinpage;
	landingpageobjects landingpage;
	homepage_pageobject homepageobj;
	
	public homepage(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.signinpage=testcontextsetup.pageobjectmanager.getSigninpageobjects();
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
		this.homepageobj=testcontextsetup.pageobjectmanager.gethomepageobj();
	}
	

	@When("drop-down list is present")
	public void drop_down_list_is_present() {
		homepageobj.is_dropdownlist_present();
	}
	@Then("List of modules are present in the drop-down list")
	public void list_of_modules_are_present_in_the_drop_down_list() 
	{
		System.out.println(homepageobj.datastructure()+" is displayed");
	}

	
}
