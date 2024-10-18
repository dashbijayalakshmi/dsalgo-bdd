package Pageobjects;

import org.openqa.selenium.WebDriver;

import Utils.ConfigReader;
import Utils.DriverFactory;

public class PageObjectManger {
public WebDriver driver;
public landingpageobjects landingpage;
public Signinpageobjects signinpage;
public DataStructPage datastructpage;
public ArraysDocPageObjects arraysdocpage;
public homepage_pageobject homepage;
public DriverFactory driverfactory;
public ConfigReader configreader;


//public QueuePageObjects queuepage;


public TreePageObjects treepageobj;
public Run_PythonCodes runpythoncode;
public RegistrationPageObj registrationpage; 

public PageObjectManger(WebDriver driver) {
	driverfactory=new DriverFactory();
	this.driver=driverfactory.getdriver();	
	
}
public landingpageobjects getLandingpageobjects() {
	landingpage=new landingpageobjects(driver);
	return landingpage;
}
public Signinpageobjects getSigninpageobjects() {
	signinpage=new Signinpageobjects(driver);
	return signinpage;
}public DataStructPage getDataStructPage() {
	datastructpage=new DataStructPage(driver);
	return datastructpage;
}public ArraysDocPageObjects getArrayDocPage() {
	arraysdocpage=new ArraysDocPageObjects(driver);
	return arraysdocpage;
}

//public QueuePageObjects getQueuePage() {
//	queuepage=new QueuePageObjects(driver);
//	return queuepage;

public TreePageObjects gettreepageobj() {
	treepageobj=new TreePageObjects(driver);
	return treepageobj;
}
public Run_PythonCodes getruncodeobj()
{
	 runpythoncode=new Run_PythonCodes(driver);
	 return runpythoncode;
}
public RegistrationPageObj getregpageobj()
	{
		registrationpage=new RegistrationPageObj(driver);
		return registrationpage;
	}
public homepage_pageobject gethomepageobj()
{
	homepage=new homepage_pageobject(driver);
	return homepage;
	
}
public DriverFactory getdriverfactory()
{
	driverfactory=new DriverFactory();
	
	return driverfactory;
}
public ConfigReader getconfigreaderfile()
{
	configreader=new ConfigReader();
	return configreader;
			
}

}
