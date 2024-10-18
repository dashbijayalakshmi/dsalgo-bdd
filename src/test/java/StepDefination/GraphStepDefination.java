package StepDefination;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.GraphPageObjects;
import Pageobjects.Run_PythonCodes;

import Pageobjects.landingpageobjects;
import Utils.ExcelReader;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphStepDefination {
	WebDriver driver;
	TestContextSetup testcontextsetup;
	GraphPageObjects graphpage;
	
	Run_PythonCodes runpythoncode;
	
	landingpageobjects landingpage;
	public GraphStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.graphpage=testcontextsetup.pageobjectmanager.getGraphPage();
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
		this.runpythoncode=testcontextsetup.pageobjectmanager.getruncodeobj();
	}
	@Given("User clicks on Graph Get Start")
	public void user_clicks_on_graph_get_start() {
	    graphpage.btnGetStartGraph();
	}
	/*@When("User clicks on Graph")
	public void user_clicks_on_graph() {
		graphpage.graph();
	}
	@When("User clicks on Graph Representation")
	public void user_clicks_on_Graph_Representation() {
		graphpage.GraphRepresentation();
	}*/
	
//***/	
	@Given("User is on the Graph module page")
	public void user_is_on_the_graph_module_page() {
		String actual_title=landingpage.get_Title();
		String expected_title="Graph";
		assertEquals(expected_title,actual_title);
		System.out.println("You are on the" +expected_title+ "Page");
	}

	@When("The user scroll downs to Topics covered section on the Graph page")
	public void the_user_scroll_downs_to_topics_covered_section_on_the_graph_page() {
		graphpage.graphTopicsCovered();
	}

	@Then("Topics covered should be displayed in Graph page")
	public void topics_covered_should_be_displayed(io.cucumber.datatable.DataTable GraphTopics) {
		List<String> Expected_list = GraphTopics.asList();
		List<String> Actual_list = graphpage.graph_topicscovered_list();
		System.out.println("Expected List is:" + Expected_list);
		System.out.println("Actual List is:" + Actual_list);
		Assert.assertEquals(Expected_list, Actual_list, "List is not present");
	}
	
	@Given("The user is in the Graph page after loggedin")
	public void the_user_is_in_the_graph_page_after_loggedin() {
		
		String actual_title=landingpage.get_Title();
		String expected_title="Graph";
		assertEquals(expected_title,actual_title);
		//System.out.println("User is on the" +expected_title+ "page");
	}
	
	@When("The user clicks Graph link present under topics covered")
	public void the_user_clicks_graph_link_present_under_topics_covered() {
	    graphpage.graph();
	}
	
	@When("User clicks on Try Here of Graph")
	public void user_clicks_try_here_of_graph() {
		graphpage.click_TryHere();
	    
	   
	}
	
	@Then("The user should be redirected to tryEditor of Graph")
	public void the_user_should_be_redirected_to_try_editor_of_graph() {
	    String actualt_title=landingpage.get_Title();
	    String expected_title="Assessment";
	    assertEquals(expected_title,actualt_title);
	}
	    
	@Then("The user should be directed to Graph page")
	public void the_user_should_be_directed_to_Graph_page() {
	    String actualtitle = landingpage.get_Title();
		String expectedtitle="Graph";
		assertEquals(expectedtitle,actualtitle);
		//System.out.println("User is on the" +expectedtitle+ "page");	  
	}
	@Given("The user is on the Graph page")
	public void the_user_is_on_the_graph_page() throws InterruptedException {
		graphpage.graph();

	}
	
	@When("The user enter valid Python code from given sheetname {string} rownumber {int} and columnumber {int}")
	public void the_user_enter_valid_python_code(String sheetname,
	Integer rownumber, Integer columnumber) throws InterruptedException {
		String printCode = ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
		graphpage.txtEnterCode(printCode);

	}
	@And("User click on Run of Graph")
	public void user_click_on_run_of_graph() {
		runpythoncode.run_button();
	}
	@Then("User gets output")
	public void user_gets_output() {
		graphpage.show_output();

	}
	
	@Given("User is already on the Try Editor of Graph")
	public void user_is_alreadyon_the_try_editor_of_graph() {
		graphpage.graph();
		graphpage.click_TryHere();;
		
	}
	@When("User enter invalid Python code from given sheetname {string} rownumber {int} and columnumber {int}")
	public void user_enter_invalid_python_code(String sheetname,
			Integer rownumber, Integer columnumber) throws InterruptedException {
		String printCode = ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
		graphpage.txtEnterCode(printCode);
	}

	

	@Then("The user gets error output of Graph")
	public void the_user_gets_error_output_of_graph() {
		graphpage.popUp();

		

	}
	
	@Given("User is on the Try Editor page of Graph section")
	public void user_is_on_the_try_editor_page_of_graph() {
		graphpage.graph();
		graphpage.click_TryHere();
		
	}
	@Then("It should redirect to Graph page")
	public void it_should_redirect_to_overview_of_graph_page() {
		String actualtitle = landingpage.get_Title();
		String expectedtitle = "Graph";
		assertEquals(expectedtitle, actualtitle);
		//System.out.println("User is on the" + expectedtitle + "page");

	}
	
	@When("The user clicks on the back arrow")
	public void the_user_click_on_the_back_arrow() {
		graphpage.goBackFromTryeditor();

	}
	
	@Then("Topics covered under graph should be displayed on the left")
	public void topics_covered_under_graphsection_is_displayed_on_the_left() {
		graphpage.contents();
	}
	
	@Given("The user is in the Graph Representations page after loggedin")
	public void the_user_is_in_the_graph_representations_page_after_loggedin() {
		
		String actual_title=landingpage.get_Title();
		String expected_title="Graph Representations";
		assertEquals(expected_title,actual_title);
		//System.out.println("User is on the" +expected_title+ "page");
	}
	
	@When("The user clicks Graph Representations link present under topics covered")
	public void the_user_clicks_overview_of_graph_representations_page_link_present_under_topics_covered() {
	    graphpage.graphRepresentation();
	}
	
	@Then("The user should be directed to Graph Representations page")
	public void the_user_should_be_directed_to_graph_representations_page() {
	    String actualtitle = landingpage.get_Title();
		String expectedtitle="Graph Representations";
		assertEquals(expectedtitle,actualtitle);
		//System.out.println("User is on the" +expectedtitle+ "page");	  
	}
	
	@Given("The user is on the Graph Representations page")
	public void the_user_is_on_the_graph_representations_page() throws InterruptedException {
		graphpage.graphRepresentation();;

	}
	
	@Given("User is on the Try Editor page of Graph Representations section")
	public void user_is_on_the_try_editor_page_of_graph_representations() {
		graphpage.graphRepresentation();
		graphpage.click_TryHere();
		
	}
	@Then("It should redirect to Graph Representations page")
	public void it_should_redirect_to_overview_of_graph_representations_page() {
		String actualtitle = landingpage.get_Title();
		String expectedtitle = "Graph Representations";
		assertEquals(expectedtitle, actualtitle);
		//System.out.println("User is on the" + expectedtitle + "page");

	}
	@Given("Navigated to any topics of the Graph")
	public void navigated_to_any_topics_of_the_qraph() {
		graphpage.graphRepresentation();
	}
	@When("The user clicks Practice Questions of Graph section")
	public void the_user_clicks_practice_questions_of_graph_section() {
		graphpage.PracticeQuestion();

	}
	@Then("Practice Question page should display on Graph")
	public void practice_question_page_should_display_on_graph() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Practice Questions";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);

	}
	@Then("Sets of practice questions should be display on the Graph page")
	public void sets_of_practice_questions_should_be_display_on_graph_page() {
		graphpage.practiceQuestionDisplayed();

	}

	

	
}
