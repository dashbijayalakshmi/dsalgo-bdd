package cucumber;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Utils.ConfigReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/Featurefile",
				 glue="StepDefination",
				 monochrome=true,
				 tags = " ",
				 plugin= {"html:target/cucumber.html","json:target/cucumber.json",
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
				)

public class TestNgRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios(){
		return super.scenarios();
	}

	@BeforeTest
	@Parameters({"browser"})
	public void defineBrowser(String browser) throws Throwable {
		ConfigReader.setBrowserType(browser);
	}

}
