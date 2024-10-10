package StepDefination;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.DataStructPage;
import Pageobjects.Linkedlistpageobject;
import Pageobjects.Run_PythonCodes;
import Pageobjects.landingpageobjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class DataStructureStepDefination {
	public WebDriver driver;
	/*public TestContextSetup testcontextsetup;
	public DataStructPage datastructpage;
	public DataStructureStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		datastructpage=testcontextsetup.pageobjectmanager.getDataStructPage();*/
	TestContextSetup testcontextsetup;
	DataStructPage datastructpageobj; 
	static String exectedmsg;
	Run_PythonCodes runpythoncode;
	landingpageobjects landingpage;
	public DataStructureStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		this.datastructpageobj=testcontextsetup.pageobjectmanager.getdatastructPage();
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
		this.runpythoncode=testcontextsetup.pageobjectmanager.getruncodeobj();
	}
	@And("Clicks on Get Started button on the Data Structures introduction panel")
	public void clicks_on_get_started_button_on_the_data_structures_introduction_panel() {
		datastructpageobj.click_datastructures_getstarted();
	}
    @Given("User is on the Data Structures Module page")
	public void user_is_on_the_data_structures_module_page() {
		String actual_title = landingpage.get_Title();
		String expected_title = "Data Structures-Introduction";
		assertEquals(expected_title, actual_title);
		System.out.println("You are on the" + expected_title + "Page");
	}

	@When("The user scroll downs to Topics covered section on the Data Structure page")
	public void the_user_scroll_downs_to_topics_covered_section_on_the_data_structure_page() {
		datastructpageobj.datastructures_topics_covered_section();
	
	}
    @Then("Required list of Data Structure topics covered should be displayed")
	  public void required_list_of_data_structure_topics_covered_should_be_displayed(io.cucumber.datatable.DataTable DatastructTopics) {
		List<String> Expected_list = DatastructTopics.asList();
		List<String> Actual_list = datastructpageobj.datastuct_topicscovered_list();
		System.out.println("Expected List is:" + Expected_list);
		System.out.println("Actual List is:" + Actual_list);
		Assert.assertEquals(Expected_list, Actual_list, "List is not present");
	}

	@Given("The user is in Data Structure after loggedin")
	public void the_user_is_in_data_structure_after_loggedin() {
		String actual_title = landingpage.get_Title();
		String expected_title = "Data Structures-Introduction";
		assertEquals(expected_title, actual_title);
		System.out.println("User is on the" + expected_title + "page");

	}

	@When("The user clicks Time Complexity under topic covered")
	public void the_user_clicks_time_complexity_under_topic_covered() {
		datastructpageobj.click_timecomplexity();
		System.out.println("User clicked Time Complexity link");
	}
    @Then("The user should be directed Time Complexity of Data Structures")
	public void the_user_should_be_directed_time_complexity_of_data_structures() {
		String actualtitle = landingpage.get_Title();
		String expectedtitle = "Time Complexity";
		assertEquals(expectedtitle, actualtitle);
		System.out.println("User is on the" + expectedtitle + "page");
    }
    @Given("The user is on the Time Complexity of Data Structure page")
	public void the_user_is_on_the_time_complexity_of_data_structure_page() {
		datastructpageobj.click_Time_complexity();
	}

	@When("User clicks Try Here button of Data Structures page")
	public void user_clicks_try_here_button_of_data_structures_page() {
		datastructpageobj.click_TryHere_from_TimeComplexity();
		System.out.println("User clicked Try Here button from Time Complexity");
	}
    @Then("The user should be redirected to Data Structures page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_data_structures_page_having_an_try_editor_with_a_run_button_to_test() {
		String actualt_title = landingpage.get_Title();
		String expected_title = "Assessment";
		assertEquals(expected_title, actualt_title);
		System.out.println("User is on the Try Editor Page");
    }
	@Given("User is on the Try Editor page of Time Complexity section")
	public void user_is_on_the_try_editor_page_of_time_complexity_section() {
		datastructpageobj.click_Time_complexity();
		datastructpageobj.click_TryHere_from_TimeComplexity();
		System.out.println("User is on the Try Editor page of Overview of Trees section");
	}
	@When("The user writes valid Python code of Data Structures")
	public void the_user_writes_valid_python_code_of_data_structures() {
		runpythoncode.validcode_editor();
		System.out.println("Valid Python code entered ");
	}

	@And("Click on Run button of Data Sturutures")
	public void click_on_run_button_of_data_sturutures() {
		runpythoncode.run_button();
	}

	@Then("User sees output in the output panel of Data Structures")
	public void user_sees_output_in_the_output_panel_of_data_structures() {
		runpythoncode.Ouptput_ValidCode();
	}

	@Given("User is already on the Try Editor page of Data Structures")
	public void user_is_already_on_the_try_editor_page_of_data_structures() {
		datastructpageobj.click_Time_complexity();
		datastructpageobj.click_TryHere_from_TimeComplexity();
		System.out.println("User is on the Try Editor page of Overview of Trees section");
	}

	@When("The user writes invalid Python code of Data Strutures")
	public void the_user_writes_invalid_python_code_of_data_strutures() {
		runpythoncode.invalidcode_editor();

	}

	@And("Click on Run button to run invalid code of Data Structures")
	public void click_on_run_button_to_run_invalid_code_of_data_structures() {
		runpythoncode.run_button();
	}

	@Then("User gets error alert box of Data Structures")
	public void user_gets_error_alert_box_of_data_structures() {

		runpythoncode.error_alert();
	}

	@Given("User is on the Try Editor page of Data Structures section")
	public void user_is_on_the_try_editor_page_of_data_structures_section() {
		datastructpageobj.click_Time_complexity();
		datastructpageobj.click_TryHere_from_TimeComplexity();
		System.out.println("User is on the Try Editor page of TIme Complexity section");
	}
	

	@When("User clicks on the back arrow of Data Structures")
	public void user_clicks_on_the_back_arrow_of_data_structures() {
		datastructpageobj.goback_frmTryeditor();
	}

	@Then("It should redirect to Data Structures")
	public void it_should_redirect_to_data_structures() {
		String actualtitle = landingpage.get_Title();
		String expectedtitle = "Time Complexity";
		assertEquals(expectedtitle, actualtitle);
		System.out.println("User is on the" + expectedtitle + "page");
	}

	@And("Topics covered section is displayed on the left of Data Structures")
	public void topics_covered_section_is_displayed_on_the_left_of_data_structures() {
		datastructpageobj.contents_outpage();
	}

	@Given("The user is in the Data Structure after loggedin")
	public void the_user_is_in_the_data_structure_after_loggedin() {
		String actual_title = landingpage.get_Title();
		String expected_title = "Data Structures-Introduction";
		assertEquals(expected_title, actual_title);
		System.out.println("User is on the " + actual_title + "page");
	}

	@And("Navigated to any topics of the Data Structure- Time Complexity")
	public void navigated_to_any_topics_of_the_data_structure_time_complexity() {
		datastructpageobj.click_Time_complexity();
	}

	@When("The user clicks Practice Questions of Data Structure section")
	public void the_user_clicks_practice_questions_of_data_structure_section() {
		datastructpageobj.click_PracticeQuestions();
	}

	@Then("Practice Question page should open of Data Structure")
	public void practice_question_page_should_open_of_data_structure() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Practice Questions";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}
	@Given("The user is in the Data Structures after loggedin")
	public void the_user_is_in_the_data_structures_after_loggedin() {
		String actual_title = landingpage.get_Title();
		String expected_title = "Data Structures-Introduction";
		assertEquals(expected_title, actual_title);
		System.out.println("User is on the " + actual_title + "page");
	}
	@And("Navigated to any topics of the  Data Struture - Time Complexity")
	public void navigated_to_any_topics_of_the_data_struture_time_complexity() {
		datastructpageobj.click_Time_complexity();
	}
	@When("The user clicks Practice Questions of Data Struture section")
	public void the_user_clicks_practice_questions_of_data_struture_section() {
		datastructpageobj.click_PracticeQuestions();
	   
	}
	@Then("Sets of practice questions should be available on the Data Struture page")
	public void sets_of_practice_questions_should_be_available_on_the_data_struture_page() {
		datastructpageobj.is_practiceQuestion_Displayed();
	}
}


	


