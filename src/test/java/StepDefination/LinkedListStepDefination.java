package StepDefination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
//import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.Linkedlistpageobject;
import Pageobjects.Run_PythonCodes;
import Pageobjects.landingpageobjects;
import Utils.ExcelReader;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListStepDefination {
	WebDriver driver;
	//LinkedList l1= new LinkedList();
	TestContextSetup testcontextsetup;
	Linkedlistpageobject linkedlistpageobj; 
	static String expectedmsg;
	Run_PythonCodes runpythoncode;
	landingpageobjects landingpage;
	public LinkedListStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		this.linkedlistpageobj=testcontextsetup.pageobjectmanager.getlinkedlistpageobj();
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
		this.runpythoncode=testcontextsetup.pageobjectmanager.getruncodeobj();
	
} 
	@And("Clicks on Get Started button on the Linked List Introduction panel")
	public void clicks_on_get_started_button_on_the_linked_list_introduction_panel() {
		linkedlistpageobj.click_linkedlist_getstarted();

	}

	@Given("User is on the Linked List module page")
	public void user_is_on_the_linked_list_module_page() {
		String actual_title=landingpage.get_Title();
		String expected_title="Linked List";
		assertEquals(expected_title,actual_title);
		System.out.println("You are on the" +expected_title+ "Page");
       }
	@When("The user scroll downs to Topics covered section on the Linked List page")
	public void the_user_scroll_downs_to_topics_covered_section_on_the_linked_list_page() 
	{
		linkedlistpageobj.Linkedlist_topics_covered_section();   
      }
    @Then("Required list of Linked List topics covered should be displayed")
	 public void required_list_of_linked_list_topics_covered_should_be_displayed(io.cucumber.datatable.DataTable LinkedlistTopics)
    {
		List<String> Expected_list = LinkedlistTopics.asList();
		List<String> Actual_list = linkedlistpageobj.Linkedlist_topicscovered_list();
	    System.out.println("Expected List is:"+ Expected_list);
	    System.out.println("Actual List is:" + Actual_list);
	    Assert.assertEquals(Expected_list, Actual_list, "List is not present"); 

	}

    @Given("The user is in the Linked List page after logged in")
	public void the_user_is_in_the_linked_list_page_after_logged_in() 
     {
		String actual_title=landingpage.get_Title();
		String expected_title="Linked List";
		assertEquals(expected_title,actual_title);
		System.out.println("User is on the" +expected_title+ "page");
     }
    @When("The user clicks Introduction link present under topics covered")
	  public void the_user_clicks_introduction_link_present_under_topics_covered() 
    {
		linkedlistpageobj.click_introduction_of_Linkedlist();
	    System.out.println("User clicked Introduction of Linkedlist link");

	}
    @Then("The user should be directed to Introduction of Linked List Page")
	 public void the_user_should_be_directed_to_introduction_of_linked_list_page() 
     {
		  String actualtitle = landingpage.get_Title();
			String expectedtitle="Introduction";
			assertEquals(expectedtitle,actualtitle);
			System.out.println("User is on the" +expectedtitle+ "page");
      }


	@Given("The user is on the Introduction of Linked List page")
	public void the_user_is_on_the_introduction_of_linked_list_page()
	 {
		linkedlistpageobj.click_introduction_of_Linkedlist();

     }

	@When("The User clicks Try Here button of Linked List page")
	public void the_user_clicks_try_here_button_of_linked_list_page() 
	{
		linkedlistpageobj.click_TryHere_from_IntroductionofLinkedlist();  
		   System.out.println("User clicked Try Here button from Introduction of Linkedlist"); 

	}

	@Then("The user redirected to on a Linked List page having an tryEditor with a Run button")
	public void the_user_redirected_to_on_a_linked_list_page_having_an_try_editor_with_a_run_button() {
		    String actual_title=landingpage.get_Title();
		    String expected_title="Assessment";
		    assertEquals(expected_title,actual_title);
		    System.out.println("User is on the Try Editor Page");
	}

	@Given("The user is on the Try Editor page of Introduction of Linked List")
	public void the_user_is_on_the_try_editor_page_of_introduction_of_linked_list() 
	 {
		linkedlistpageobj.click_introduction_of_Linkedlist();
		linkedlistpageobj.click_TryHere_from_IntroductionofLinkedlist();
		System.out.println("User is on the Try Editor page of Introduction of Linked List section");  
	 }

	@When("User writes valid Python code of Linked List")
	public void user_writes_valid_python_code_of_linked_list() 
	{
		  runpythoncode.validcode_editor();
		   System.out.println("Valid Python code entered ");
	}

	@When("User click on Run button of Linked List")
	public void user_click_on_run_button_of_linked_list() 
	{
		 runpythoncode.run_button();

	}

	@Then("User sees output in the output panel of Linked List")
	public void user_sees_output_in_the_output_panel_of_linked_list() {
		runpythoncode.Ouptput_ValidCode();
	}


 @Given("The user is already on the Try Editor page of Linked List")
	public void the_user_is_already_on_the_try_editor_page_of_linked_list() 
	{
		linkedlistpageobj.click_introduction_of_Linkedlist();
		linkedlistpageobj.click_TryHere_from_IntroductionofLinkedlist();
		System.out.println("User is on the Try Editor page of Introduction");
	}
	
	@When("User writes invalid Python code of Linked List")
	public void user_writes_invalid_python_code_of_linked_list() 
	{
		runpythoncode.invalidcode_editor();
	}

	@When("The user click on Run button to run invalid code of Linked List")
	public void the_user_click_on_run_button_to_run_invalid_code_of_linked_list() 
	{
		runpythoncode.run_button();
	}

	@Then("The user gets error alert box of Linked List")
	public void the_user_gets_error_alert_box_of_linked_list() {
		runpythoncode.error_alert();

	}

  @Given("The User is on the Try Editorr page of Introduction of Linked List")
    public void the_user_is_on_the_try_editorr_page_of_introduction_of_linked_list() {
	
		linkedlistpageobj.click_introduction_of_Linkedlist();
		linkedlistpageobj.click_TryHere_from_IntroductionofLinkedlist();
		System.out.println("User is on the Try Editor page of Introduction of Linked list");
	}

  @When("The user clicks on the back arrow of Introduction Linked List page")
  public void the_user_clicks_on_the_back_arrow_of_introduction_linked_list_page()
	{
		linkedlistpageobj.goback_frmTryeditor();
	  
	}

  @Then("It should redirect to of Intoduction of Linked List")
  public void it_should_redirect_to_of_intoduction_of_linked_list() {
		String actualtitle = landingpage.get_Title();
		String expectedtitle = "Introduction";
		assertEquals(expectedtitle, actualtitle);
		System.out.println("User is on the" + expectedtitle + "page");
	}

  @Then("The Topics covered section is displayed on left side of the page")
  public void the_topics_covered_section_is_displayed_on_left_side_of_the_page() 
	{ 
		linkedlistpageobj.contents_on_outpage();
	   
	}


	@When("The user clicks Creating Linked List link present under topics covered")
	public void the_user_clicks_creating_linked_link_present_under_topics_covered() {
		linkedlistpageobj.click_CreatingLinkedlist();
	    
	}

	@Then("The user should be directed to Creating Linked List Page")
	public void the_user_should_be_directed_to_creating_linked_list_page() 
	{
		String actual_title = landingpage.get_Title();
		String expected_title="Creating Linked LIst";
		assertEquals(expected_title,actual_title);
		System.out.println("User is on the" +expected_title+ "page");
	}


	@Given("The user is on the Creating Linked List page")
	public void the_user_is_on_the_creating_linked_list_page() 
	{
		linkedlistpageobj.click_CreatingLinkedlist();
	}

	@When("The User clicks Try Here button on Creating Linked List page")
	public void the_user_clicks_try_here_button_on_creating_linked_list_page()
	{
		linkedlistpageobj.click_tryHere_on_CreatingLinkedlist();
	}

	@Then("The user redirected to a Creating Linked List page having an tryEditor with a Run button to test")
	public void the_user_redirected_to_a_creating_linked_list_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String Expected_tit = "Assessment";
		assertEquals(Expected_tit, actual_tit);
		System.out.println("User is on the " + actual_tit + " Page of Creating Linked listsection");
	}


	@Given("The user is on the Try Editor page of Creating Linked List")
	public void the_user_is_on_the_try_editor_page_of_Creating_linked_list() 
	{
		linkedlistpageobj.click_CreatingLinkedlist();
		linkedlistpageobj.click_introduction_of_Linkedlist();
	}
  @Given("The user is on the Try Editor page of Creating Linked list")
    public void The_user_is_on_the_try_editor_page_of_creating_linked_list() {
   
    }
	@When("User writes Python code for linkedlist from given sheetname {string} rownumber {int} and columnumber {int}")
	public void user_writes_python_code_for_linkedlist_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) throws InterruptedException 
	{
		
		String python_code = ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
		System.out.println("First");
		linkedlistpageobj.getPythonCode_from_excel(python_code);
		/*runpythoncode.validcode_editor();
		System.out.println("Valid Python code entered ");*/
	}
	@And("User click on Run button of Linked list page")
	public void User_click_on_run_button_of_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User sees output in the output panel under Creating Linked list")
	public void user_sees_output_in_the_output_panel_under_creating_linked_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User click on Run button of Linked List page")
	public void user_click_on_run_button_of_linked_list_page() 
	{
		runpythoncode.run_button();
	}

   @Then("User sees output in the output panel under Creating Linked List")
    public void user_sees_output_in_the_output_panel_under_creating_linked_list() 
   {
	   runpythoncode.Ouptput_ValidCode();
   }


	@Given("The user is already on the Try Editor page under Creating Linked List Section")
	public void the_user_is_already_on_the_try_editor_page_under_creating_linked_list_section() 
	{
		linkedlistpageobj.click_CreatingLinkedlist();
		linkedlistpageobj.click_introduction_of_Linkedlist();
	}
	@Given("The user is already on the Try Editor page under Creating Linked list Section")
	public void The_user_is_already_on_the_try_editor_page_under_creating_linked_list_section() {
	    
	}
	
	@When("User writes Python code given sheetname {string} rownumber {int} and columnumber {int}")
	public void user_writes_python_code_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) throws InterruptedException
	{
		String python_code = ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
		System.out.println("First");
		linkedlistpageobj.getPythonCode_from_excel(python_code);

          
	}

	@Then("The user gets error alert box under Creating Linked list")
	public void the_user_gets_error_alert_box_under_creating_linked_list()
	{
		runpythoncode.error_alert();

	}
}

 @Given("The User is on the Try Editor page of Creating Linked list")
	public void the_user_is_on_the_try_editor_page_of_creating_linked_list() 
	{
		linkedlistpageobj.click_CreatingLinkedlist();
		linkedlistpageobj.click_introduction_of_Linkedlist();
	}
	    
    @When("The user clicks on the back arrow of Creating Linked list")
	public void the_user_clicks_on_the_back_arrow_of_creating_linked_list()
    {
    	linkedlistpageobj.goback_frmTryeditor();

	}

	@Then("It should redirect to of Creating Linked list")
	public void it_should_redirect_to_of_creating_linked_list() 
	{
		String actualtitle = landingpage.get_Title();
		String expectedtitle = "Creating Linked list";
		assertEquals(expectedtitle, actualtitle);
		System.out.println("User is on the" + expectedtitle + "page");
     }

   @Then("Topics covered section is displayed on left side of the page")
    public void topics_covered_section_is_displayed_on_left_side_of_the_page() {
	   
   };


	@When("The user clicks Types of Linked list link present under topics covered")
	public void the_user_clicks_types_of_linked_list_link_present_under_topics_covered() 
	{
		linkedlistpageobj.click_TypesofLinkedlist();

	}
    @Then("The user should be directed to Types of Linked list Page")
	public void the_user_should_be_directed_to_types_of_linked_list_page() 
    {
    	String actual_title = landingpage.get_Title();
		String expected_title = "Types of Linked list";
		assertEquals(expected_title, actual_title);
		System.out.println("User is on the " + actual_title + " Page");
	}

	@Given("The user is on the Types of Linked list page")
	public void the_user_is_on_the_types_of_linked_list_page() 
	{
		linkedlistpageobj.click_TypesofLinkedlist();
	}

	@When("The User clicks Try Here button on Linked list page")
	public void the_user_clicks_try_here_button_on_linked_list_page()
	{
		linkedlistpageobj.click_tryhere();
	}

	@Then("The user redirected to a Types of Linked list page having an tryEditor with a Run button to test")
	public void the_user_redirected_to_a_types_of_linked_list_page_having_an_try_editor_with_a_run_button_to_test()
	{
		String actual_tit = landingpage.get_Title();
		String Expected_tit = "Assessment";
		assertEquals(Expected_tit, actual_tit);
		System.out.println("User is on the " + actual_tit + " Page of Types of Linked list section");
	}

	@Given("The user is on the Try Editor page of Types of Linked list")
	public void the_user_is_on_the_try_editor_page_f_linked_list()
	{
		linkedlistpageobj.click_TypesofLinkedlist();
		linkedlistpageobj.click_introduction_of_Linkedlist();
	}
		
	@When("User writes Python code from given  sheetname {string} rownumber {int} and columnumber {int}")
	public void user_writes_python_code_from_given_sheetname_rownumber_and_columnumber(String sheetname, Integer rownumber, Integer columnumber) throws InterruptedException 
	{
		String python_code = ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
		System.out.println("First");
		linkedlistpageobj.getPythonCode_from_excel(python_code);
	}

	@Then("User gets output in the output panel of Linked list")
	public void user_gets_output_in_the_output_panel_of_linked_list()
	{
		runpythoncode.Ouptput_ValidCode();
	}

	@Given("The user is on the Try Editor page of Linked list")
	public void the_user_is_on_the_try_editor_page_of_linked_list() 
	{
		linkedlistpageobj.click_TypesofLinkedlist();
		linkedlistpageobj.click_introduction_of_Linkedlist();
    }

	@Then("The user gets error pop up box of Linked list Page")
	public void the_user_gets_error_pop_up_box_of_types_of_Linked_list_page() {
		linkedlistpageobj.invalidcode_error();

	}
	@When("The user clicks on the back arrow of Types of Linked List")
	public void The_user_clicks_on_the_back_arrow_of_types_of_linked_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("It should redirect to of Types of Linked List")
	public void It_should_redirect_to_of_types_of_linked_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The User is on the Try Editor page of Types of Linked List")
	public void the_user_is_on_the_try_editor_page_of_types_of_linked_list()
	{
		linkedlistpageobj.click_introduction_of_Linkedlist();

	}

	@When("The user clicks on the back arrow of Types of Linked list")
	public void the_user_clicks_on_the_back_arrow_of_types_of_linked_list()
	{
		linkedlistpageobj.goback_frmTryeditor();
	}

	@Then("It should redirect to of Types of Linked list")
	public void it_should_redirect_to_of_types_of_linked_list() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Types of Linked list";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");

	}

	@Given("The user is on the Linked list page after logged in")
	public void the_user_is_on_the_linked_list_page_after_logged_in() 
	{
		String actual_title=landingpage.get_Title();
		String expected_title="Linkedlist";
		assertEquals(expected_title,actual_title);
		System.out.println("You are on the" +expected_title+ "Page");

	}

@Given("The user is on the Linked List page after logged in")
public void The_user_is_on_the_linked_list_page_after_logged_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	@When("The user clicks Implement Linked in Python link present under topics covered")
	public void the_user_clicks_implement_linked_in_python_link_present_under_topics_covered()
	{
		linkedlistpageobj.Linkedlist_topics_covered_section();
	    System.out.println("User clicked Implement Linkedlist in Python link");
	  
	}

@Given("The user is on the Linked List page after logged in")
public void The_user_is_On_the_linked_list_page_after_logged_in() {
   
}
	@Then("The user should be directed to Implement Linked list in Python Page")
	public void the_user_should_be_directed_to_implement_linked_list_in_python_page()
	{
		  String actualtitle = landingpage.get_Title();
			String expectedtitle="Implement Linked list in Python";
			assertEquals(expectedtitle,actualtitle);
			System.out.println("User is on the" +expectedtitle+ "page");
	  
	}
	@Then("The user should be directed to Implement Linked List in Python Page")
	public void The_user_should_be_directed_to_implement_linked_list_in_python_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	@Given("The user is on the Implement Linked list in Python page")
	public void the_user_is_on_the_implement_linked_list_in_python_page()
	{
		linkedlistpageobj.click_ImplementLinkedlistinPython();
	}

	@Then("The user redirected to Implement Linked list in Python page having an tryEditor with a Run button to test")
	public void the_user_redirected_to_implement_linked_list_in_python_page_having_an_try_editor_with_a_run_button_to_test() {
		String actualt_title=landingpage.get_Title();
	    String expected_title="Assessment";
	    assertEquals(expected_title,actualt_title);
	    System.out.println("User is on the Try Editor Page");
}
	@When("The User clicks Try Here button from Implement Linked list page")
	public void the_user_clicks_try_here_button_from_implement_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("The user is on the Try Editor page of Implement Linked list in Python of Linkedlist")
	public void the_user_is_on_the_try_editor_page_of_implement_linked_list_in_python_of_Linkedlist() 
	{
		linkedlistpageobj.click_ImplementLinkedlistinPython();
		linkedlistpageobj.click_tryhere();
		System.out.println("User is on the Try Editor page of Implement linked list in Python section");  
	 }
	@When("User click on Run button on Linked list page")
	public void user_click_on_run_button_on_linked_list_page1() 
	{
	  runpythoncode.run_button();
	   
	}

	@Then("User sees output in the output panel of Linked list Page")
	public void User_sees_output_in_the_output_panel_of_linked_list_page()
	{ 
	linkedlistpageobj.show_output();

	}
	 @Given("The user is on the Try Editor page of Implement Linked list in Python")
	 public void the_user_is_on_the_Try_Editor_page_of_Implement_Linked_list_in_Python()
	 {
		 linkedlistpageobj.click_ImplementLinkedlistinPython();
			linkedlistpageobj.click_introduction_of_Linkedlist();
	 }

	@Then("The user gets error pop up box of Linked list page")
	public void the_user_gets_error_pop_up_box_of_linked_list_page() 
	{
	 
	linkedlistpageobj.invalidcode_error();
	}

	@Given("The User is on the Try Editor page of Implement Linked list in Python")
	public void the_user_is_on_the_try_editor_page_of_implement_linked_list_in_python() 
	{

		linkedlistpageobj.click_ImplementLinkedlistinPython();
		linkedlistpageobj.click_tryhere();
	}
	 
	
   @When("The user clicks on the back arrow under Implement Linked list in Python")
	public void the_user_clicks_on_the_back_arrow_under_implement_linked_list_in_python() {
		linkedlistpageobj.goback_frmTryeditor();

	}
   @Then("It should redirect to of Implement Linked list in Python")
	public void it_should_redirect_to_of_implement_linked_list_in_python() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Implemet Linked list in Python";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
	}

	@When("The user clicks Traversal link present under topics covered")
	public void the_user_clicks_traversal_link_present_under_topics_covered() {
		linkedlistpageobj.click_Traversal();
	}

	@Then("The user should be directed to Traversal Page")
	public void the_user_should_be_directed_to_traversal_page() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Linked list Traversals";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");

	}

	@Given("The user is on the Traversal page")
	public void the_user_is_on_the_traversal_page() {
		linkedlistpageobj.click_Traversal();
	   String actual_tit = landingpage.get_Title();
		String exp_tit = "Linked list Traversals";
		if (actual_tit.equals(exp_tit)) {
			System.out.println("User is on the Linked list Traversal Page");
		} else {
			System.out.println("User is not on the Linked list Traversal Page");
		}
	}

	@When("The User clicks Try Here button on Traversal page")
	public void the_user_clicks_try_here_button_on_traversal_page() {
	    linkedlistpageobj.click_introduction_of_Linkedlist();
	}

	@Then("The user redirected to Traversal page having an tryEditor with a Run button to test")
	public void the_user_redirected_to_traversal_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
	}

	@Given("The user is on the Try Editor page of Traversal")
	public void The_user_is_on_the_try_editor_page_of_traversal() 
	{
		linkedlistpageobj.click_Traversal();
		linkedlistpageobj.click_introduction_of_Linkedlist();
	    
	}

	@Then("User sees output in the output panel of Linked list page")
	public void user_sees_output_in_the_output_panel_of_linked_list_page() {
		linkedlistpageobj.show_output();
	}

	@Given("The user is already on the Try Editor page of Traversal")
	public void the_user_is_already_on_the_try_editor_page_of_traversal() {
		linkedlistpageobj.click_Traversal();
		linkedlistpageobj.click_introduction_of_Linkedlist();
		
	}

	@When("User Click on Run button on Linked list page")
	public void user_click_on_run_button_on_linked_list_page() {
		runpythoncode.run_button();
	}

	@Then("The user gets error pop box of Linked list page")
	public void the_user_gets_error_pop_box_of_linked_list_page() {
		linkedlistpageobj.invalidcode_error();

	}

	@Given("The User is on the Try Editor page of Traversal")
	public void the_user_is_on_the_try_editor_page_of_traversal() {
		linkedlistpageobj.click_Traversal();
		linkedlistpageobj.click_introduction_of_Linkedlist();
	}

	@When("The user clicks on the back arrow of Traversal")
	public void the_user_clicks_on_the_back_arrow_of_traversal() {
		linkedlistpageobj.goback_frmTryeditor();

	}

	@Then("It should redirect to of Traversal")
	public void it_should_redirect_to_of_traversal() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Linked list Traversal";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}

	@When("The user clicks Insertion link present under topics covered")
	public void the_user_clicks_insertion_link_present_under_topics_covered() {
		linkedlistpageobj.click_Insertion();

	}

	@Then("The user should be directed to Insertion Page")
	public void the_user_should_be_directed_to_insertion_page() {
	 
	String actual_tit1 = landingpage.get_Title();
	String exp_tit1 = "Linked list Insertion";
	Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
	System.out.println("User navigated to " + actual_tit1);
	}


	@Given("The user is on the Insertion page")
	public void the_user_is_on_the_insertion_page() {
		linkedlistpageobj.click_Insertion();
	}

	@When("The User clicks Try Here button on Insertion page")
	public void the_user_clicks_try_here_button_on_insertion_page() {
		linkedlistpageobj.click_introduction_of_Linkedlist();
	}

	@Then("The user redirected to Insertion page having an tryEditor with a Run button to test")
	public void the_user_redirected_to_insertion_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit); 
	}

	@Given("The user is on the Try Editor page of Insertion page")
	public void the_user_is_on_the_try_editor_page_of_insertion_page() {
		linkedlistpageobj.click_Insertion();
		linkedlistpageobj.click_tryhere();
	}

	@Given("The User is on the Try Editor page of Insertion")
	public void the_user_is_on_the_try_editor_page_of_insertion() {
		linkedlistpageobj.click_Insertion();
		linkedlistpageobj.click_tryhere();
	}

	@When("The user clicks on the back arrow of Insertion page")
	public void the_user_clicks_on_the_back_arrow_of_insertion_page() {
		linkedlistpageobj.goback_frmTryeditor();
	}

	@Then("It should redirect to of Insertion")
	public void it_should_redirect_to_of_insertion() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Linked list Insertion";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}
	

	@When("The user clicks Deletion link present under topics covered")
	public void the_user_clicks_deletion_link_present_under_topics_covered() {
		linkedlistpageobj.click_Deletion();
	}

	@Then("The user should be directed to Deletion Page")
	public void the_user_should_be_directed_to_deletion_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Linked list Deletion";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}

	@Given("The user is on the Deletion page")
	public void the_user_is_on_the_deletion_page() {
		linkedlistpageobj.click_Deletion();
	}

	@When("The User clicks Try Here button of Deletion page")
	public void the_user_clicks_try_here_button_of_deletion_page() {
		linkedlistpageobj.click_tryhere();
	}

	@Then("The user redirected to Deletion page having an tryEditor with a Run button to test")
	public void the_user_redirected_to_deletion_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit);
	}

	@Given("The user is on the Try Editor page of Deletion page")
	public void the_user_is_on_the_try_editor_page_of_deletion_page() {
		linkedlistpageobj.click_Deletion();
		linkedlistpageobj.click_tryhere();
	}

	@Then("User sees output in the output panel under Deletion page")
	public void user_sees_output_in_the_output_panel_under_deletion_page() {
		linkedlistpageobj.show_output();
	}

	@Given("The user is already on the Try Editor page of Deletion page")
	public void the_user_is_already_on_the_try_editor_page_of_deletion_page() {
		linkedlistpageobj.click_Deletion();
		linkedlistpageobj.click_tryhere();
	}

	@Given("The User is on the Try Editor page of Deletion")
	public void the_user_is_on_the_try_editor_page_of_deletion() {
		linkedlistpageobj.click_Deletion();
		linkedlistpageobj.click_tryhere();
	}

	@When("The user clicks on the back arrow of Deletion Page")
	public void the_user_clicks_on_the_back_arrow_of_deletion_page() {
		linkedlistpageobj.goback_frmTryeditor();
	}

	@Then("It should redirect to of Deletion")
	public void it_should_redirect_to_of_deletion() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Linked list Deletion";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}
	

	@When("The user clicks on the Practice Questions of linked list")
	public void the_user_clicks_on_the_practice_questions_of_linked_list() {
		linkedlistpageobj.click_PracticeQuestion();
	}

	@Then("The user should be directed to Practice of linkedlist")
	public void the_user_should_be_directed_to_practice_of_linkedlist() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Practice Questions";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}
	@Then("Practice Question Page should be open on Linkedlist")
	public void practice_question_page_should_be_open_on_linkedlist() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the Linked list page after loggedin")
	public void the_user_is_in_the_linked_list_page_after_loggedin() {
	    
	}

	@Given("Navigated to any topics of the Linked list page -Types of Linkedlist")
	public void navigated_to_any_topics_of_the_linked_list_page_types_of_linkedlist()
	{
		linkedlistpageobj.click_TypesofLinkedlist();
	  
	}

	@When("The user clicks Practice Questions of LinkedList Section")
	public void the_user_clicks_practice_questions_of_linked_list_section() 
	{
		linkedlistpageobj.click_PracticeQuestion();

	}

	@Then("Sets of practice questions should be available on the LinkedList")
	public void sets_of_practice_questions_should_be_available_on_the_linked_list() 
	{
		linkedlistpageobj.is_practiceQuestion_Displayed();

	 }



