package StepDefination;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

import java.util.List;
import org.testng.Assert;

import Pageobjects.QueuePageObjects;
import Pageobjects.Run_PythonCodes;
import Pageobjects.TreePageObjects;
import Pageobjects.landingpageobjects;
import Utils.ExcelReader;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class QueueStepDefination {
	WebDriver driver;
	TestContextSetup testcontextsetup;
	QueuePageObjects queuepage;
	landingpageobjects landingpage;
	//Run_PythonCodes runpythoncode;
	//TreePageObjects treepageobj;
	public QueueStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.queuepage=testcontextsetup.pageobjectmanager.getQueuePage();
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
		//this.runpythoncode=testcontextsetup.pageobjectmanager.getruncodeobj();
	}
	
	
	@Given("User clicks on Queue Get Start")
	public void user_clicks_on_queue_get_start() {
	    queuepage.btnGetStartQueue();
	}

	@Then("Queuepage should be displayed with text {string}")
	public void queuepage_should_be_displayed_with_text(String expectedText) {
		queuepage.text(expectedText);
		
	}

	@When("User clicks on Implementation of Queue in Python")
	public void user_clicks_on_implementation_of_queue_in_python() {
	   queuepage.linkImplementationOfQueueInPython();
	}

	@Given("User clicks on try here of Queue")
	public void user_clicks_on_try_here_of_queue() {
		 queuepage.tryhere();
	  
	}

	@When("User enter valid Python code from given sheetname {string} rownumber {int} and columnumber {int}")
	public void user_enters_code(String sheetname, Integer rownumber , Integer columnumber) {
	    String validCode=ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
	    queuepage.actionCode(validCode);
	}

	@Then("User click on run of Queue")
	public void user_clicks_on_run_of_queue() {
		 queuepage.run();
	   
	}
	
	/*@Then("User sees output in the output")
	public void user_is_see_output_in_the_output_() {

		runpythoncode.Ouptput_ValidCode();
	}*/
	
	@Given("The user enter invalid Python code from given sheetname {string} rownumber {int} and columnumber {int}")
	public void user_enters_invalidcode(String sheetname, Integer rownumber , Integer columnumber) {
	    String invalidCode=ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
	    queuepage.actionCode(invalidCode);
	}

	@Then("User should validat on code output from excel sheetname {string} rownumber {int} and columnumber {int}")
	public void user_should_validat_on_code_output_(String sheetname, Integer rownumber, Integer columnumber) {
	    String txtoutput=ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
	    queuepage.output(txtoutput);
	}
	
	@When("The user clicks Implementation using collections.deque link present under topics covered")
	public void the_user_clicks_implementation_using_collections_link_present_under_topics_covered() {
		queuepage.linkImplementationUsingCollections();
	}
	

	
	@When("The user clicks Implementation using array link present under topics covered")
	public void the_user_clicks_implementation_using_array_link_present_under_topics_covered() {
		queuepage.linkImplementationUsingArray();
	}
	

	
	@When("The user clicks Queue Operations link present under topics covered")
	public void the_user_clicks_queue_operations_link_present_under_topics_covered() {
		queuepage.linkQueueOperations();
	}
	@Then("User gets error popup of Queue")
	public void user_gets_error_alert_popup_of_queue()  {
	    queuepage.popUp();
	}
	
	
	//****//
	
	@Given("User is on the Queue module page")
	public void user_is_on_the_graph_module_page() {
		String actual_title=landingpage.get_Title();
		String expected_title="Queue";
		assertEquals(expected_title,actual_title);
		System.out.println("You are on the" +expected_title+ "Page");
	}
	
	@Given("The user is in the Queue page after loggedin")
	public void the_user_is_in_the_queue_page_after_loggedin() {
		
		String actual_title=landingpage.get_Title();
		String expected_title="Queue";
		assertEquals(expected_title,actual_title);
		//System.out.println("User is on the" +expected_title+ "page");
	}
	
	@When("The user clicks Implementation of Queue in Python link present under topics covered")
	public void the_user_clicks_implementation_of_queue_in_python_link_present_under_topics_covered() {
		queuepage.linkImplementationOfQueueInPython();
	}
	@Then("The user should be directed to Implementation of Queue in Python page")
	public void the_user_should_be_directed_to_implementation_of_queue_in_python_page() {
	    String actualtitle = landingpage.get_Title();
		String expectedtitle="Implementation of Queue in Python";
		assertEquals(expectedtitle,actualtitle);
		//System.out.println("User is on the" +expectedtitle+ "page");	  
	}
	@Given("The user is on the Implementation of Queue in Python page")
	public void the_user_is_on_the_implementation_of_queue_in_python_page() throws InterruptedException {
		queuepage.linkImplementationOfQueueInPython();

	}
	@Then("The user should be directed to Implementation using collections.deque page")
	public void the_user_should_be_directed_to_implementation_using_collections_page() {
	    String actualtitle = landingpage.get_Title();
		String expectedtitle="Implementation using collections.deque";
		assertEquals(expectedtitle,actualtitle);
		//System.out.println("User is on the" +expectedtitle+ "page");	  
	}
	@Given("The user is on the Implementation using collections.deque page")
	public void the_user_is_on_the_implementation_using_collections_page() throws InterruptedException {
		queuepage.linkImplementationUsingCollections();

	}
	@Then("The user should be redirected to tryEditor page of Queue")
	public void the_user_should_be_redirected_to_try_editor_page_of_queue() {
	    String actualt_title=landingpage.get_Title();
	    String expected_title="Assessment";
	    assertEquals(expected_title,actualt_title);
	}
	@Given("User is on the Try Editor page of Implementation of Queue in Python section")
	public void user_is_on_the_try_editor_page_of_implementation_of_queue_in_python() {
		queuepage.linkImplementationOfQueueInPython();
		queuepage.tryhere();
		//System.out.println("User is on the Try Editor page of Overview of Trees section");
	}
	
	@When("User click on the back arrow of Queue")
	public void user_click_on_the_back_arrow_of_queue() {
		queuepage.goBackFromTryeditor();

	}
	
	@Then("It should redirect to Implementation of Queue in Python page")
	public void it_should_redirect_to_implementation_of_queue_in_python_page() {
		String actualtitle = landingpage.get_Title();
		String expectedtitle = "Implementation of Queue in Python";
		assertEquals(expectedtitle, actualtitle);
		//System.out.println("User is on the" + expectedtitle + "page");

	}
	@Then("Topics covered under Queue should be displayed on the left")
	public void topics_covered_under_queue_is_displayed_on_the_left() {
		queuepage.contents();
	}
	@Then("User gets output in the output panel of Queue")
	public void user_gets_output_in_the_output_panel_of_queue() {
		queuepage.show_output();

	}
	@Given("User is already on the Try Editor of Queue")
	public void user_is_already_on_the_try_editor() {
		queuepage.linkImplementationOfQueueInPython();
		queuepage.tryhere();
		
	}
	@Given("User is on the Try Editor page of Implementation using collections.deque section")
	public void user_is_on_the_try_editor_page_of_implementation_using_collections() {
		queuepage.linkImplementationUsingCollections();
		queuepage.tryhere();
		//System.out.println("User is on the Try Editor page of Overview of Trees section");
	}
	@Then("It should redirect to Implementation using collections.deque page")
	public void it_should_redirect_to_implementation_using_collections_page() {
		String actualtitle = landingpage.get_Title();
		String expectedtitle = "Implementation using collections.deque";
		assertEquals(expectedtitle, actualtitle);
		//System.out.println("User is on the" + expectedtitle + "page");

	}
	@Given("The user is on the Implementation using array page")
	public void the_user_is_on_the_implementation_using_array_page() throws InterruptedException {
		queuepage.linkImplementationUsingArray();

	}
	
	@Given("The user is on the Queue Operations page")
	public void the_user_is_on_the_queue_operations_page() throws InterruptedException {
		queuepage.linkImplementationUsingArray();

	}
	@Then("The user should be directed to Implementation using array page")
	public void the_user_should_be_directed_to_implementation_using_array_page() {
	    String actualtitle = landingpage.get_Title();
		String expectedtitle="Implementation using array";
		assertEquals(expectedtitle,actualtitle);
		//System.out.println("User is on the" +expectedtitle+ "page");	  
	}
	@Given("User is on the Try Editor page of Implementation using array section")
	public void user_is_on_the_try_editor_page_of_implementation_using_array() {
		queuepage.linkImplementationUsingArray();
		queuepage.tryhere();
		//System.out.println("User is on the Try Editor page of Overview of Trees section");
	}
	@Then("It should redirect to Implementation using array page")
	public void it_should_redirect_to_implementation_using_array() {
		String actualtitle = landingpage.get_Title();
		String expectedtitle = "Implementation using array";
		assertEquals(expectedtitle, actualtitle);
		//System.out.println("User is on the" + expectedtitle + "page");

	}
	@Then("The user should be directed to Queue Operations page")
	public void the_user_should_be_directed_to_queue_operations_page() {
	    String actualtitle = landingpage.get_Title();
		String expectedtitle="Queue Operations";
		assertEquals(expectedtitle,actualtitle);
		//System.out.println("User is on the" +expectedtitle+ "page");	  
	}
	@Given("User is on the Try Editor page of Queue Operations section")
	public void user_is_on_the_try_editor_page_of_queue_operations() {
		queuepage.linkQueueOperations();
		queuepage.tryhere();
		//System.out.println("User is on the Try Editor page of Overview of Trees section");
	}
	@Then("It should redirect to Queue Operations page")
	public void it_should_redirect_to_queue_operations() {
		String actualtitle = landingpage.get_Title();
		String expectedtitle = "Queue Operations";
		assertEquals(expectedtitle, actualtitle);
		//System.out.println("User is on the" + expectedtitle + "page");

	}
	
	
	
	


}
