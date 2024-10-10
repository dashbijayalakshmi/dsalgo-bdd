package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
public WebDriver driver;
public WebDriver WebDriverManager() throws IOException {
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String url=prop.getProperty("URL");
	String browser=prop.getProperty("browser");
	if(driver==null) {
	if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	if(browser.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	

	}
	return driver;
}
}
