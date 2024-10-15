package StepDefination;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.ArraysDocPageObjects;
import Pageobjects.Run_PythonCodes;
import Pageobjects.landingpageobjects;
import Utils.ExcelReader;
import Utils.TestContextSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class ArraysDocPageStepDefination {
	WebDriver driver;
	TestContextSetup testcontextsetup;
	ArraysDocPageObjects arraysdocpage;
	landingpageobjects landingpage;
	Run_PythonCodes runpythoncode;
	public ArraysDocPageStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.arraysdocpage=testcontextsetup.pageobjectmanager.getArrayDocPage();
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
		this.runpythoncode=testcontextsetup.pageobjectmanager.getruncodeobj();
	}
	/*@And("User Clicks GetStated button of Arrays pane.")
	public void user_clicks_get_stated_button_of_pane() {
		arraysdocpage.click_getstarted();
		Assert.assertTrue(arraysdocpage.topic_display());
	}
	

	@Then("Arrays page is displayed with Topics covered.")
	public void page_is_displayed_with_topics_covered(DataTable Array_topics) {
	    List<String>Expected_list=Array_topics.asList();
	    System.out.println("expected list: "+Expected_list);
	    System.out.println("actaual list:"+arraysdocpage.List_arraysTopics());
	    Assert.assertEquals(arraysdocpage.List_arraysTopics(),Expected_list);
	}
	@Given("User clicks {string}.")
	public void click_arrays_in_python(String ArraysLinks) {
		System.out.println("Title:"+landingpage.get_Title());
		System.out.println(ArraysLinks+" This link ");
		arraysdocpage.clickArrayListLinks(ArraysLinks);
	}
	@When("new page is displayed with [Try here>>>] button")
	public void arrays_try_here_button() {
		System.out.println("Title:"+landingpage.get_Title());
		arraysdocpage.click_Tryhere_btn();
	}

}*/
@And("Clicks on Get Started button on the Array Introduction panel")
public void clicks_on_get_started_button_on_the_array_introduction_panel() {
	arraysdocpage.click_getstarted();
}

@Given("User is on the Array module page")
public void user_is_on_the_array_module_page() {
	String actual_title=landingpage.get_Title();
	String expected_title="Array";
	assertEquals(expected_title,actual_title);
	System.out.println("You are on the" +expected_title+ "Page");
}


@When("The user scroll downs to Topics covered section on the Array page")
public void the_user_scroll_downs_to_topics_covered_section_on_the_array_page() {
	 arraysdocpage.topic_display(); 
}

@Then("Required list of Arrays topics covered should be displayed")
public void required_list_of_arrays_topics_covered_should_be_displayed(io.cucumber.datatable.DataTable Arraystopics) 
{
	List<String> Expected_list = Arraystopics.asList();
	List<String> Actual_list = arraysdocpage.arrays_topicscovered_list();
    System.out.println("Expected List is:" + Expected_list);
    System.out.println("Actual List is:" + Actual_list);
    Assert.assertEquals(Expected_list, Actual_list, "List is not present"); 
}

@Given("The user is in the Array page after logged in")
public void the_user_is_in_the_array_page_after_logged_in() {
	        String actual_title=landingpage.get_Title();
			String expected_title="Array";
			assertEquals(expected_title,actual_title);
			System.out.println("User is on the" +expected_title+ "page");
}

@When("The user clicks Arrays in Python link present under topics covered")
public void the_user_clicks_arrays_in_python_link_present_under_topics_covered() {
	arraysdocpage.click_ArraysinPython();
    System.out.println("User clicked Arrays in Python link");
}

@Then("The user should be directed to Arrays in Python Page")
public void the_user_should_be_directed_to_arrays_in_python_page() {
	String actualtitle = landingpage.get_Title();
	String expectedtitle="Arrays in Python";
	assertEquals(expectedtitle,actualtitle);
	System.out.println("User is on the" +expectedtitle+ "page");
}

@Given("The user is on the Arrays in Python page")
public void the_user_is_on_the_arrays_in_python_page() {
	arraysdocpage.click_ArraysinPython();
}

@When("The User clicks Try Here button of Arrays page")
public void the_user_clicks_try_here_button_of_arrays_page() {
	 
	arraysdocpage.click_TryHere();  
	   System.out.println("User clicked Try Here button from Arrays in Python"); 
}

@Then("The user redirected to Arrays page having an tryEditor with a Run button to test")
public void the_user_redirected_to_arrays_page_having_an_try_editor_with_a_run_button_to_test() {
	String actual_title=landingpage.get_Title();
    String expected_title="Assessment";
    assertEquals(expected_title,actual_title);
    System.out.println("User is on the Try Editor Page");
}

@Given("The user is on the Try Editor page of Arrays in Python")
public void the_user_is_on_the_try_editor_page_of_arrays_in_python() {
    arraysdocpage.click_ArraysinPython();
	arraysdocpage.click_TryHere_ArraysinPython();
	System.out.println("User is on the Try Editor page of Arrays in Python section");  
 }


@When("User writes valid Python code of Arrays")
public void user_writes_valid_python_code_of_arrays()
{
	   runpythoncode.validcode_editor();
	   System.out.println("Valid Python code entered ");
}
     


@When("User click on Run button of Arrays")
public void user_click_on_run_button_of_arrays() {
	 runpythoncode.run_button();

}

@Then("User sees output in the output panel of Arrays")
public void user_sees_output_in_the_output_panel_of_arrays() {
	runpythoncode.Ouptput_ValidCode();
}
@Given("The user is already on the Try Editor page of Arrays")
public void the_user_is_already_on_the_try_editor_page_of_arrays() {
	arraysdocpage.click_ArraysinPython();
	arraysdocpage.click_TryHere();  
	System.out.println("User is on the Try Editor page of Arrays in Python");
	}


@When("The User writes invalid Python code of Arrays")
public void the_user_writes_invalid_python_code_of_arrays() {
	runpythoncode.invalidcode_editor();
}

@When("The user click on Run button to run invalid code of Arrays")
public void the_user_click_on_run_button_to_run_invalid_code_of_arrays() {
	runpythoncode.run_button();
}

@Then("The user gets error alert box of Arrays")
public void the_user_gets_error_alert_box_of_arrays() {
	runpythoncode.error_alert();
}

@Given("The User is on the Try Editorr page of Arrays in Python")
public void the_user_is_on_the_try_editorr_page_of_arrays_in_python() {
	arraysdocpage.click_ArraysinPython();
	arraysdocpage.click_TryHere();
	System.out.println("User is on the Try Editor page of Arrays in Pythonn page");
}

@When("The user clicks on the back arrow of Arrays in Python page")
public void the_user_clicks_on_the_back_arrow_of_arrays_in_python_page() {

	arraysdocpage.goback_frmTryeditor();
  
}

@Then("It should redirect to of Arrays in Python")
public void it_should_redirect_to_of_arrays_in_python() {
	String actualtitle = landingpage.get_Title();
	String expectedtitle = "Arrays in Python";
	assertEquals(expectedtitle, actualtitle);
	System.out.println("User is on the" + expectedtitle + "page");
}

@Then("Topics covered section is displayed on left side of the arrays page")
public void topics_covered_section_is_displayed_on_left_side_of_the_arrays_page() {
	arraysdocpage.contents_on_outpage();
	   
}
@When("The user clicks Arrays using list link present under topics covered")
public void the_user_clicks_arrays_using_list_link_present_under_topics_covered() {
	arraysdocpage.click_Arraysusinglist();
}

@Then("The user should be directed to Arrays using list Page")
public void the_user_should_be_directed_to_arrays_using_list_page() {
	String actual_title = landingpage.get_Title();
	String expected_title="Arrays Using List";
	assertEquals(expected_title,actual_title);
	System.out.println("User is on the" +expected_title+ "page");
}
@Given("The user is on the Arrays using list page")
public void the_user_is_on_the_arrays_using_list_page() {
	arraysdocpage.click_Arraysusinglist();
}

@When("The User clicks Try Here button of Arrrays page")
public void the_user_clicks_try_here_button_of_arrrays_page() {
   
arraysdocpage.click_TryHere();
}
@Given("The user is on the Try Editor page of Arrays using list")
public void the_user_is_on_the_try_editor_page_of_arrays_using_list() {
	arraysdocpage.click_Arraysusinglist();
	arraysdocpage.click_TryHere();
}

@When("User writes Python code for Arrays given sheetname {string} rownumber {int} and columnumber {int}")
public void user_writes_python_code_for_arrays_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) throws InterruptedException  {
	String python_code = ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
	System.out.println("First");
	arraysdocpage.getPythonCode_from_excel(python_code);
}

@When("User click on Run button of Arrays page")
public void user_click_on_run_button_of_arrays_page() {
	runpythoncode.run_button();
}
@Given("The user is already on the Try Editor page of Arrays Section")
public void the_user_is_already_on_the_try_editor_page_of_arrays_section() {
	arraysdocpage.click_Arraysusinglist();
	arraysdocpage.click_TryHere();
}


@When("User writes Invalid Python code for Arrays given sheetname {string} rownumber {int} and columnumber {int}")
public void user_writes_invalid_python_code_for_arrays_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) throws InterruptedException
{
	String python_code = ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
	System.out.println("First");
	arraysdocpage.getPythonCode_from_excel(python_code);
}
/*@Given("The User is on the Try Editor page of Arrays using list")
public void the_user_is_on_the_try_editor_page_of_arrays_using_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}*/

@When("The user clicks on the back arrow of Arrays using list")
public void the_user_clicks_on_the_back_arrow_of_arrays_using_list() {
	arraysdocpage.goback_frmTryeditor();

}

@Then("It should redirect to of Arrays using list")
public void it_should_redirect_to_of_arrays_using_list() {

	String actualtitle = landingpage.get_Title();
	String expectedtitle = "Arrays Using List";
	assertEquals(expectedtitle, actualtitle);
	System.out.println("User is on the" + expectedtitle + "page");
}

@Then("Topics covered section is displayed on left side of the Arrays using list page")
public void topics_covered_section_is_displayed_on_left_side_of_the_arrays_using_list_page() {
	 arraysdocpage.contents_on_outpage();
}

@Given("The user is on the Basic Operations in Lists page")
public void the_user_is_on_the_basic_operations_in_lists_page() {

	arraysdocpage.click_BasicOpertaionList();
}

@When("The User clicks Try Here button of Basic Operations in Lists page")
public void the_user_clicks_try_here_button_of_basic_operations_in_lists_page() {
    arraysdocpage.click_TryHere();
}

@Then("The user redirected to a Basic Operations in Lists page having an tryEditor with a Run button to test")
public void the_user_redirected_to_a_basic_operations_in_lists_page_having_an_try_editor_with_a_run_button_to_test() {
	String actual_tit = landingpage.get_Title();
	String Expected_tit = "Assessment";
	assertEquals(Expected_tit, actual_tit);
	System.out.println("User is on the " + actual_tit + " Page of Basic Operations in Lists");
}
@Given("The user is on the Try Editor page of Basic Operations in List")
public void the_user_is_on_the_try_editor_page_of_basic_operations_in_list() {
	arraysdocpage.click_BasicOpertaionList();
	 arraysdocpage.click_TryHere();
	}

@When("User writes Python code for Arrays from given sheetname {string} rownumber {int} and columnumber {int}")
public void user_writes_python_code_for_arrays_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) throws InterruptedException 
{
	String python_code = ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
	System.out.println("First");
	arraysdocpage.getPythonCode_from_excel(python_code);
}

@When("User click on Run button under Basic Operations in List")
public void user_click_on_run_button_under_basic_operations_in_list() {
	runpythoncode.run_button();
}

@Then("User gets output in the output panel under Basic Operations in List")
public void user_gets_output_in_the_output_panel_under_basic_operations_in_list() {
	 runpythoncode.Ouptput_ValidCode();
}

@Given("The user is on the Try Editor page of Arrays")
public void the_user_is_on_the_try_editor_page_of_arrays() {
	arraysdocpage.click_BasicOpertaionList();
	arraysdocpage.click_TryHere();
	
	
}

@Then("The user gets error pop up box of Arrays Page")
public void the_user_gets_error_pop_up_box_of_arrays_page() {
	runpythoncode.error_alert();
}
/*@Given("The User is on the Try Editor page of Basic operations in List")
public void the_user_is_on_the_try_editor_page_of_basic_operations_in_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}*/

@When("The user clicks on the back arrow of Basic operations in List")
public void the_user_clicks_on_the_back_arrow_of_basic_operations_in_list() {
	arraysdocpage.goback_frmTryeditor();
}

@Then("It should redirect to of Basic operations in List")
public void it_should_redirect_to_of_basic_operations_in_list() {
	String actualtitle = landingpage.get_Title();
	String expectedtitle = "Basic Operations in Lists";
	assertEquals(expectedtitle, actualtitle);
	System.out.println("User is on the" + expectedtitle + "page");

}

@Then("Topics covered section is displayed on left side of the page of Arrays")
public void topics_covered_section_is_displayed_on_left_side_of_the_page_of_arrays() {
	arraysdocpage.contents_on_outpage();
}

@Given("The user is on the Arrays page after logged in")
public void the_user_is_on_the_arrays_page_after_logged_in() {
	 String actual_title=landingpage.get_Title();
		String expected_title="Array";
		assertEquals(expected_title,actual_title);
		System.out.println("User is on the" +expected_title+ "page");
}


@When("The user clicks Applications of Array link present under topics covered")
public void the_user_clicks_applications_of_array_link_present_under_topics_covered() {
    arraysdocpage.clickApplicationofArray();
}

@Then("The user should be directed to Applications of Array Page")
public void the_user_should_be_directed_to_applications_of_array_page() {
	String actual_title = landingpage.get_Title();
	String expected_title="Applications of Array";
	assertEquals(expected_title,actual_title);
	System.out.println("User is on the" +expected_title+ "page");
}

@Given("The user is on the Applications of Array page")
public void the_user_is_on_the_applications_of_array_page() {
    arraysdocpage.clickApplicationofArray();
}

@When("The User clicks Try Here button of Applications of Array page")
public void the_user_clicks_try_here_button_of_applications_of_array_page() {
	arraysdocpage.clickApplicationofArray();
	arraysdocpage.click_TryHere();
}

@Then("The user redirected to Applications of Arraypage having an tryEditor with a Run button to test")
public void the_user_redirected_to_applications_of_arraypage_having_an_try_editor_with_a_run_button_to_test() {
	String actual_tit = landingpage.get_Title();
	String Expected_tit = "Assessment";
	assertEquals(Expected_tit, actual_tit);
	System.out.println("User is on the " + actual_tit + " Page of Applicatoons of Array section"); 
}


@Given("The user is on the Try Editor page of Array")
public void the_user_is_on_the_try_editor_page_of_array() {
	
	arraysdocpage.click_BasicOpertaionList();
	arraysdocpage.click_TryHere();
}

@When("User writes Python code for Array given sheetname {string} rownumber {int} and columnumber {int}")
public void user_writes_python_code_for_array_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) throws InterruptedException 
{
	String python_code = ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
	System.out.println("First");
	arraysdocpage.getPythonCode_from_excel(python_code); 
    
}

@When("User click on Run button on Array page")
public void user_click_on_run_button_on_array_page() {
	runpythoncode.run_button();
}

@Then("User sees output in the output panel of Array Page")
public void user_sees_output_in_the_output_panel_of_array_page() {
	runpythoncode.Ouptput_ValidCode();
}


@When("User click on Run button on Arrays page")
public void user_click_on_run_button_on_arrays_page() {
	runpythoncode.run_button();
}

/*@Then("The user gets error pop up box of Arrays page")
public void the_user_gets_error_pop_up_box_of_arrays_page() {
    
}*/
@Given("The User is on the Try Editor page of Applications of Array")
public void the_user_is_on_the_try_editor_page_of_applications_of_array() {
	arraysdocpage.clickApplicationofArray();
	arraysdocpage.click_TryHere();
}

@When("The user clicks on the back arrow under Applications of Arrays")
public void the_user_clicks_on_the_back_arrow_under_applications_of_arrays() {
	arraysdocpage.goback_frmTryeditor();
}

@Then("It should redirect to of Applications of Arrays")
public void it_should_redirect_to_of_applications_of_arrays() {
	String actual_title = landingpage.get_Title();
	String expected_title="Applications of Array";
	assertEquals(expected_title,actual_title);
	System.out.println("User is on the" +expected_title+ "page");
}
@Given("Navigated to any topics of the Arrays page -Applications of Arrays")
public void navigated_to_any_topics_of_the_arrays_page_applications_of_arrays() {
	arraysdocpage.clickApplicationofArray();
}

@When("The user clicks on the Practice Questions of Arrays")
public void the_user_clicks_on_the_practice_questions_of_arrays() {
	arraysdocpage.click_PracticeQuestion();
}

@Then("Practice Question Page should be open on Arrays")
public void practice_question_page_should_be_open_on_arrays() {
	String actual_tit = landingpage.get_Title();
	String exp_tit = "Practice Questions";
	Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
	System.out.println("User navigated to " + actual_tit);
}


@Given("The user is in the Arrays page after loggedin")
public void the_user_is_in_the_arrays_page_after_loggedin() {
	String actual_title=landingpage.get_Title();
	String expected_title="Array";
	assertEquals(expected_title,actual_title);
	System.out.println("User is on the" +expected_title+ "page");
    
}

@Given("Navigated to any topics of the Linked list page -Applications of Arrays")
public void navigated_to_any_topics_of_the_linked_list_page_applications_of_arrays() {
	arraysdocpage.clickApplicationofArray();
}

@When("The user clicks Practice Questions of Arrays")
public void the_user_clicks_practice_questions_of_arrays() {
	arraysdocpage.click_PracticeQuestion();
    
}

@Then("Sets of practice questions should be available on the Arrays")
public void sets_of_practice_questions_should_be_available_on_the_arrays() {
	arraysdocpage.is_practiceQuestion_Displayed();
}






}