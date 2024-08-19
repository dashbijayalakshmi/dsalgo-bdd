package StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.Signinpageobjects;
import Pageobjects.landingpageobjects;
import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	TestContextSetup testcontextsetup;
	landingpageobjects landingpage;
	Signinpageobjects signinpage;
	public Hooks(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
		this.signinpage=testcontextsetup.pageobjectmanager.getSigninpageobjects();
	}
	@Before(order=0)
	public void BeforeScenario() throws IOException {
		System.out.println(testcontextsetup.testbase.WebDriverManager().getTitle()+" from hooks");
		Assert.assertTrue(landingpage.h1_ptag_getstarted());
		landingpage.click_getstartbtn();
		Assert.assertTrue(signinpage.regis_sign());
		System.out.println(signinpage.datastructure()+" is displayed");
		}
	@Before(order=1)
	public void nextBeforeScenario() {
		
		signinpage.click_signin_link();
		signinpage.enter_username("Nirvana", "archanachaya");
		signinpage.click_login_btn();
	}
	
	@After
	public void AfterScenario() throws IOException {
		testcontextsetup.testbase.WebDriverManager().quit();
	}
	@AfterStep
	public void AddScreenShot(Scenario scenario) throws IOException {
		WebDriver driver=testcontextsetup.testbase.WebDriverManager();
		if(scenario.isFailed()) {
			File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(fileContent, "image/png", "image");
		}
	}

}
