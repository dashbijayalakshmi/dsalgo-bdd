package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pageobjects.PageObjectManger;

public class TestContextSetup {
public WebDriver driver;
public PageObjectManger pageobjectmanager;
public TestBase testbase;

public TestContextSetup() throws IOException {
	testbase=new TestBase();
	pageobjectmanager=new PageObjectManger(testbase.WebDriverManager());
}
}
