package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.DataStructPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class DataStructureStepDefination {
	public WebDriver driver;
	public TestContextSetup testcontextsetup;
	public DataStructPage datastructpage;
	public DataStructureStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		datastructpage=testcontextsetup.pageobjectmanager.getDataStructPage();
	}
	@Given("Click  GetStarted button of Data Structures-Introduction pane.")
	public void click_get_stated_button_of_pane() {
		datastructpage.click_DSgetstart();
	}
	@When("Data Structures-Introduction page is displayed with Topics covered.User clicks TimeComplexity link.")
	public void data_structures_introduction_page_is_displayed_with_topics_covered() {
	Assert.assertTrue(datastructpage.topic_displayed());
	datastructpage.click_timecomplex();
	}
	@And("User Enters valid code in editorpage")
	public void Enter_valid() {
	datastructpage.enter_valideditor();	
	}
	@And("User Enters Invalid code in editorpage")
     public void Enter_Invalid() {
		datastructpage.enter_Invalideditor();
			
		}
	@Then("Click Run button and capture the output")
	public void Run_capture() {
		System.out.println(datastructpage.Output());
	}
	
	}
