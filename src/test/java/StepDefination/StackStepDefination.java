package StepDefination;

import static org.testng.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Pageobjects.Run_PythonCodes;
import Pageobjects.StackPageObject;
import Pageobjects.landingpageobjects;
import Utils.ExcelReader;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackStepDefination {
	WebDriver driver;
	//Stack s1= new Stack();
	TestContextSetup testcontextsetup;
	StackPageObject stackpageobj; 
	static String expectedmsg;
	Run_PythonCodes runpythoncode;
	landingpageobjects landingpage;
	public StackStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		this.stackpageobj=testcontextsetup.pageobjectmanager.getstackpageobj();
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
		this.runpythoncode=testcontextsetup.pageobjectmanager.getruncodeobj();
	
} 

  @And("Clicks on Get Started button on the Stack introduction panel")
public void clicks_on_get_started_button_on_the_stack_introduction_panel() {
	  stackpageobj.click_stack_getstarted();
  }

@Given("User is on the Stack module page")
public void user_is_on_the_stack_module_page() {
	String actual_title2=landingpage.get_Title();
	String expected_title2="Stack";
	assertEquals(expected_title2,actual_title2);
	System.out.println("You are on the" +expected_title2+ "Page");
   }
   
@When("The user scroll downs to Topics covered section on the Stack page")
public void the_user_scroll_downs_to_topics_covered_section_on_the_stack_page() {
	stackpageobj.stack_topics_covered_section();   
}
@Then("Required list of Stack topics covered should be displayed")
public void required_list_of_stack_topics_covered_should_be_displayed(io.cucumber.datatable.DataTable stackTopics) {
	List<String>Expected_list=stackTopics.asList();
	List<String> Actual_list = stackpageobj.stack_topicscovered_list();
    System.out.println("Expected List is:"+Expected_list);
    System.out.println("Actual List is:"+stackpageobj.stack_topicscovered_list());
    Assert.assertEquals(stackpageobj.stack_topicscovered_list(), Expected_list); 

}
@Given("The user is on the Stack page after logged in")
public void the_user_is_on_the_stack_page_after_logged_in() {
	String actual_title = landingpage.get_Title();
	String expected_title = "Stack";
	assertEquals(expected_title, actual_title);
	System.out.println("User is on the" + expected_title + "page");
    
}
@When("The user clicks Operations in Stack link present under topics covered")
public void the_user_clicks_operations_in_stack_link_present_under_topics_covered() {
	stackpageobj.click_operations_in_Stack();
	System.out.println("User clicked Oeration in stack link");
}
@Then("The user should be directed to Operations in Stack Page")
public void the_user_should_be_directed_to_operations_in_stack_page() {
	String actualtitle = landingpage.get_Title();
	String expectedtitle = "Operations in Stack";
	assertEquals(expectedtitle, actualtitle);
	System.out.println("User is on the" + expectedtitle + "page");
}
@Given("The user is on the Operations in Stack page")
public void the_user_is_on_the_operations_in_stack_page() {
	stackpageobj.click_operations_in_Stack();
 
}
@When("The User clicks Try Here button of Stack")
public void the_user_clicks_try_here_button_of_stack() {
	stackpageobj.click_TryHere_from_Operationsinstack();
	System.out.println("User clicked Try Here button from Operations in Stack");
}
@Then("The user redirected to on Operations in Stack page having an tryEditor with a Run button to test")
public void the_user_redirected_to_on_operations_in_stack_page_having_an_try_editor_with_a_run_button_to_test() {
	String actualt_title = landingpage.get_Title();
	String expected_title = "Assessment";
	assertEquals(expected_title, actualt_title);
	System.out.println("User is on the Try Editor Page");
}

@Given("The user is on the Try Editor page of Operation of Stack")
public void the_user_is_on_the_try_editor_page_of_operation_of_stack() {
	stackpageobj.click_operations_in_Stack();
	stackpageobj.click_TryHere_from_Operationsinstack();
	System.out.println("User is on the Try Editor page of Operations in Stack section");
}
@When("The User writes valid Python code for Stack")
public void the_user_writes_valid_python_code_for_stack() {
	runpythoncode.validcode_editor();
	System.out.println("Valid Python code entered ");

   
}
@When("User click on Run button oon Stack")
public void user_click_on_run_button_oon_stack() {
	runpythoncode.run_button();
}

@Then("User sees output in the output panel of Operation in Stack")
public void user_sees_output_in_the_output_panel_of_operation_in_stack() {
	runpythoncode.Ouptput_ValidCode();
}

@Given("The user is already on the Try Editor page of Stack")
public void the_user_is_already_on_the_try_editor_page_of_stack() {	
	stackpageobj.click_operations_in_Stack();
	stackpageobj.click_TryHere_from_Operationsinstack();
	System.out.println("User is on the Try Editor page of Operations in Stack section");
}
@When("User writes invalid Python code for Stack")
public void user_writes_invalid_python_code_for_stack() {
	runpythoncode.invalidcode_editor();
}

@When("The user click on Run button to run invalid code of Stack")
public void the_user_click_on_run_button_to_run_invalid_code_of_stack() {
	runpythoncode.run_button();
}

@Then("The user gets error alert box under Operations in Stack")
public void the_user_gets_error_alert_box_under_operations_in_stack() {
	runpythoncode.error_alert();

}
@Given("The User is on the Try Editor page of Operations in Stack")
public void the_user_is_on_the_try_editor_page_of_operations_in_stack() {
	stackpageobj.click_operations_in_Stack();
	stackpageobj.click_TryHere_from_Operationsinstack();
	System.out.println("User is on the Try Editor page of Operations in Stack section");   
}

@When("The user clicks on the back arrow of Stack")
public void the_user_clicks_on_the_back_arrow_of_stack() {
   stackpageobj.goback_frmTryeditor();
}

@Then("It should redirect to Operations in Stack")
public void it_should_redirect_to_operations_in_stack() {
	String actualtitle = landingpage.get_Title();
	String expectedtitle = "Operations in Stack";
	assertEquals(expectedtitle, actualtitle);
	System.out.println("User is on the" + expectedtitle + "page");

}

@Then("Topics covered section is displayed on left side of the Stack page")
public void Topics_covered_section_is_displayed_on_left_side_of_the_stack_page() {
	stackpageobj.contents_on_outpage();
}
@Given("The user is on the Implementation page after logged in")
public void the_user_is_on_the_implementation_page_after_logged_in() {
    
	String actual_title = landingpage.get_Title();
	String expected_title = "Stack";
	assertEquals(expected_title, actual_title);
	System.out.println("User is on the " + actual_title + "page");
}

@When("The user clicks Implementation link present under topics covered")
public void the_user_clicks_implementation_link_present_under_topics_covered() {
	stackpageobj.click_Implementation();
}

@Then("The user should be directed to Implementation Page")
public void the_user_should_be_directed_to_implementation_page() {
	String actual_title = landingpage.get_Title();
	String expected_title = "Implementation";
	assertEquals(expected_title, actual_title);
	System.out.println("User is on the " + actual_title + " Page");
}
 @Given("The user is on the Implementation page")
 public void the_user_is_on_the_implementation_page() {
	stackpageobj.click_Implementation();
}
 @When("The User clicks Try Here button of Stack on Implmentation page")
 public void the_user_clicks_try_here_button_of_stack_on_implmentation_page() {
    stackpageobj.click_tryHere_on_Implementation();
}

@Then("The user redirected to Implement of Stack page having an tryEditor with a Run button to test")
public void the_user_redirected_to_implement_of_stack_page_having_an_try_editor_with_a_run_button_to_test() {
	String actual_tit = landingpage.get_Title();
	String Expected_tit = "Assessment";
	assertEquals(Expected_tit, actual_tit);
	System.out.println("User is on the " + actual_tit + " Page of Implementation section");
    
}

@Given("The user is on the Try Editor page of Implementation of Stack")
public void The_user_is_on_the_try_editor_page_of_implementation_of_stack() {
	stackpageobj.click_Implementation();
	stackpageobj.click_tryHere_on_Implementation();
}

@When("User writes valid Python code for Stack from given sheetname {string} rownumber {int} and columnumber {int}")
public void user_writes_valid_python_code_for_stack_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber)  throws InterruptedException 
{
	String python_code = ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
	System.out.println("First");
	stackpageobj.getPythonCode_from_excel(python_code);

}

@When("User click on Run button of Stack")
public void user_click_on_run_button_of_stack() {
	runpythoncode.run_button();
	}


@Then("User sees output in the output panel under Implementation section")
public void user_sees_output_in_the_output_panel_of_stack() {
	runpythoncode.Ouptput_ValidCode();
}
@Given("The user is already on the Try Editor page of Implementation")
public void the_user_is_already_on_the_try_editor_page_of_implementation() {
	stackpageobj.click_Implementation();
	stackpageobj.click_tryHere_on_Implementation();
    
}
@When("User writes invalid Python code for Stack from given sheetname {string} rownumber {int} and columnumber {int}")
public void user_writes_invalid_python_code_for_stack_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) {
	runpythoncode.invalidcode_editor();
}
@When("The user click on Run button of Stack")
public void the_user_click_on_run_button_of_stack() {
	stackpageobj.run_button();

	}

@Then("The user gets error alert box of stack under Implementation")
public void The_user_gets_error_alert_box_of_stack_under_Implementation() {
	runpythoncode.error_alert();
}

@Given("The User is on the Try Editor page of Implementation")
public void the_user_is_on_the_try_editor_page_of_implementation() {
	stackpageobj.click_Implementation();
	stackpageobj.click_tryhereapplication();
}

@Given("The User is on the Try Editor page of Implementation of Stack")
public void the_user_is_on_the_try_editor_page_of_implementation_of_stack() {
	stackpageobj.click_Implementation();
	stackpageobj.click_tryHere_on_Implementation();
}

/*@When("The user clicks on the back arrow of Implementations of Stack")
public void the_user_clicks_on_the_back_arrow_of_implementations_of_stack() 
{
	stackpageobj.goback_frmTryeditor();

}*/
@When("The user clicks on the back arrow of Implementation")
public void the_user_clicks_on_the_back_arrow_of_implementation() {
	stackpageobj.goback_frmTryeditor();
}
@Then("It should redirect to of Implementation of Stack")
public void it_should_redirect_to_of_implementation_of_stack() 
{
	String actualtitle = landingpage.get_Title();
	String expectedtitle = "Implementation";
	assertEquals(expectedtitle, actualtitle);
	System.out.println("User is on the" + expectedtitle + "page");
}

@Then("Topics covered section is displayed on left side of the stack page")
public void topics_covered_section_is_displayed_on_left_side_of_the_stack_page() {
	stackpageobj.contents_on_outpage();
}

@Given("The user is on the Applications page after logged in")
public void the_user_is_on_the_applications_page_after_logged_in() {
	String actual_title = landingpage.get_Title();
	String expected_title = "Stack";
	assertEquals(expected_title, actual_title);
	System.out.println("User is on the " + actual_title + "page");
}

@When("The user clicks Applications link present under topics covered")
public void the_user_clicks_applications_link_present_under_topics_covered() {
	stackpageobj.click_applications();
}

@Then("The user should be directed to Applications Page")
public void the_user_should_be_directed_to_applications_page() {
	String actual_title = landingpage.get_Title();
	String expected_title = "Applications";
	assertEquals(expected_title, actual_title);
	System.out.println("User is on the " + actual_title + " Page");
}
@Given("The user is on the Applications page")
public void the_user_is_on_the_applications_page() {
	stackpageobj.click_applications();
    
}
@When("The User clicks Try Here button on Stack")
public void the_user_clicks_try_here_button_on_stack() {
	stackpageobj.click_TryHere_from_applications();
}

@Then("The user redirected to Stack page having an tryEditor with a Run button to test")
public void the_user_redirected_to_stack_page_having_an_try_editor_with_a_run_button_to_test() {
	String actual_tit = landingpage.get_Title();
	String Expected_tit = "Assessment";
	assertEquals(Expected_tit, actual_tit);
	System.out.println("User is on the " + actual_tit + " Page of Applications section");
}

@Given("The user is on the Try Editor page of Stack")
public void the_user_is_on_the_try_editor_page_of_stack() {
	stackpageobj.click_applications();
	stackpageobj.click_TryHere_from_applications();
}

@Then("User sees output in the output panel under Stack")
public void user_sees_output_in_the_output_panel_under_stack() {
	stackpageobj.show_output();


}

@Then("The user gets error alert box of Stack")
public void the_user_gets_error_alert_box_of_stack() {
	runpythoncode.error_alert();
}

@Given("The User is on the Try Editor page of Applications of Stack")
public void the_user_is_on_the_try_editor_page_of_applications_of_stack() {
	stackpageobj.click_applications();
	//stackpageobj.click_tryhereApplication);
}
@Then("The user gets error pop up box of Stack")
public void the_user_gets_error_pop_up_box_of_stack() {
	runpythoncode.error_alert();
}



@Given("The User is on the Try Editor page of Stack")
public void The_user_is_on_the_try_editor_page_of_stack() 
{
	stackpageobj.click_applications();
	stackpageobj.click_tryhereapplication();
}
@When("The user clicks on the back arrow of Application of Stack")
public void the_user_clicks_on_the_back_arrow_of_application_of_stack() {
	stackpageobj.goback_frmTryeditor();

    
}

@Then("It should redirect to of Applications")
public void it_should_redirect_to_of_applications() {
	String actual_tit1 = landingpage.get_Title();
	String exp_tit1 = "Applications";
	Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
	System.out.println("User navigated to " + actual_tit1);
}



@Given("Navigated the topic of the Stack-Applications")
public void navigated_the_topic_of_the_stack_applications() {
	stackpageobj.click_applications();
}

@When("The user clicks Practice Questions of Stack section")
public void the_user_clicks_practice_questions_of_stack_section() {
    
	stackpageobj.click_PracticeQuestion();
}

@Then("Practice Questions Should be open of Stack Section")
public void practice_questions_should_be_open_of_stack_section() {
	String actual_tit1 = landingpage.get_Title();
	String exp_tit1 = "Practice Questions";
	Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
	System.out.println("User navigated to " + actual_tit1);
}

@Given("The user is in the Stack page after loggedin")
public void the_user_is_in_the_stack_page_after_loggedin() {
	String actual_title = landingpage.get_Title();
	String expected_title = "Stack";
	assertEquals(expected_title, actual_title);
	System.out.println("User is on the " + actual_title + "page");
}

@Given("Navigated to any topics of the Stack - Applications")
public void navigated_to_any_topics_of_the_stack_applications() {
	stackpageobj.click_applications();
}



}