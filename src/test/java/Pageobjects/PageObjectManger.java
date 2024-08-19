package Pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManger {
public WebDriver driver;
public landingpageobjects landingpage;
public Signinpageobjects signinpage;
public DataStructPage datastructpage;
public ArraysDocPageObjects arraysdocpage;
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
}
