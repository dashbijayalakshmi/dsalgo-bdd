package cucumber;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Featurefile",glue="StepDefination",monochrome=true,
//tags= "",plugin= {"html:target/cucumber.html","json:target/cucumber.json",

tags= "@Stack",plugin= {"html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestNgRunner extends AbstractTestNGCucumberTests {
@Override
@DataProvider(parallel=true)
public Object[][] scenarios(){
	return super.scenarios();
}
}
