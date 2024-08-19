package Pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signinpageobjects {
	private By register_link=By.linkText("Register");
	private By signin=By.linkText("Sign in");
	private By datastructure=By.linkText("Data Structures");
	private By dropdownlist=By.cssSelector("div.dropdown-menu");
	private By elements=By.cssSelector("a");
	private By username=By.cssSelector("#id_username");
	private By password=By.cssSelector("#id_password");
	private By login_btn=By.xpath("//input[@value='Login']");
	private By alert_message=By.xpath("//div[@role='alert']");
	WebDriver driver;
	public Signinpageobjects(WebDriver driver) {
		this.driver=driver;
	}
	public boolean regis_sign(){
		WebElement register=driver.findElement(register_link);
		WebElement sign_in=driver.findElement(signin);
		return register.isDisplayed() && sign_in.isDisplayed();
	}public List<String> datastructure() {
		driver.findElement(datastructure).click();
		List<String>ListData=new ArrayList<>();
		WebElement ddlist=driver.findElement(dropdownlist);
		List<WebElement>listitems=ddlist.findElements(elements);
		for(WebElement datastructure:listitems) {
			String text=datastructure.getText();
			ListData.add(text);
		}
		return ListData;
		
	}
	public void click_signin_link() {
		driver.findElement(signin).click();
		
	}
	public void enter_username(String string, String string1) {
		driver.findElement(username).sendKeys(string);
		driver.findElement(password).sendKeys(string1);

	}
	public void click_login_btn() {
		driver.findElement(login_btn).click();
		
		}
	public WebElement logged_in() {
		WebElement you_login=driver.findElement(alert_message);
		return you_login;
	}

}
