package StepDefination;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.Signinpageobjects;
import Pageobjects.landingpageobjects;
import Utils.ConfigReader;
import Utils.DriverFactory;
import Utils.TestContextSetup;
//import Utils.driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {
	TestContextSetup testcontextsetup;
	landingpageobjects landingpage;
	Signinpageobjects signinpage;
	static DriverFactory driverfactorypage;
	ConfigReader configreaderfile;
	
	public Hooks(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
		this.signinpage=testcontextsetup.pageobjectmanager.getSigninpageobjects();
		this.driverfactorypage=testcontextsetup.pageobjectmanager.getdriverfactory();
		this.configreaderfile=testcontextsetup.pageobjectmanager.getconfigreaderfile();
	}
	private By getStarted=By.linkText("Get Started");
		
	static WebDriver driver;
	
	static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(DriverFactory.class);
	
	//For Cross-browser Testing
	 
	@Before(order=0)
		public void before() throws Throwable 
	 	{
			//Get browser Type from config file
			logger.info("Loading Config file");
			String browser = ConfigReader.getBrowserType();		
			//Initialize driver from driver factory
			driverfactorypage = new DriverFactory();
			driver = driverfactorypage.getdriver();
			logger.info("Initializing driver for : "+browser);		
		}
	 
	//Get URL and Click on Get started button

	 @Before(order=1)	
		 public void before1() throws IOException
		 {	
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
			Properties prop=new Properties();
			prop.load(fis);
			String url=prop.getProperty("URL"); 
			driver.get(url);
			driver.findElement(getStarted).click();
		 }
	 
	 @After
		 public void After()
		 {
			 driver.quit();
		 }
		 
	@AfterStep
		public void AddScreenShot(Scenario scenario) throws IOException {
			if(scenario.isFailed()) 
			{
				File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				byte[] fileContent=FileUtils.readFileToByteArray(sourcepath);
				scenario.attach(fileContent, "image/png", "image");
			}
	}
}

//@Before(order=0)
//public void BeforeScenario() throws IOException {
//	//System.out.println(testcontextsetup.testbase.WebDriverManager().getTitle()+" from hooks");
//	Assert.assertTrue(landingpage.h1_ptag_getstarted());
//	landingpage.click_getstartbtn();
//	Assert.assertTrue(signinpage.regis_sign());
//	//System.out.println(signinpage.datastructure()+" is displayed");
//	}


//	@After
//	public void AfterScenario(Scenario scenario) throws IOException {
//		WebDriver driver=testcontextsetup.testbase.WebDriverManager();
//		if(scenario.isFailed()) {
//			byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//			Allure.addAttachment("Failed Screenshot",new ByteArrayInputStream(screenshot));
//		}
//		driver.quit();
//	}
//	@AfterStep
//	public void AddScreenShot(Scenario scenario) throws IOException {
//		WebDriver driver=testcontextsetup.testbase.WebDriverManager();
//		if(scenario.isFailed()) {
//			File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			byte[] fileContent=FileUtils.readFileToByteArray(sourcepath);
//			scenario.attach(fileContent, "image/png", "image");
//		}
//	}



