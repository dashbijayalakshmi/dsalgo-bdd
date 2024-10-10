package Pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManger {
public WebDriver driver;
public landingpageobjects landingpage;
public Signinpageobjects signinpage;
public DataStructPage datastructpage;
public ArraysDocPageObjects arraysdocpage;

public QueuePageObjects queuepage;
public homepage_pageobject homepage;

//public QueuePageObjects queuepage;
public GraphPageObjects graphpage;

//public TreePageObjects treepageobj;
//public Run_PythonCodes runpythoncode;
public RegistrationPageObj registrationpage; 


public TreePageObjects treepageobj;
public Run_PythonCodes runpythoncode;

public PageObjectManger(WebDriver driver) {
	this.driver=driver;
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
public QueuePageObjects getQueuePage() {
	queuepage=new QueuePageObjects(driver);
	return queuepage;
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
public GraphPageObjects getGraphPage() {
	graphpage=new GraphPageObjects(driver);
	return graphpage;
}
}
