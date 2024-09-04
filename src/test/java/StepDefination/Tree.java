package StepDefination;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Pageobjects.TreePageObjects;
import Pageobjects.landingpageobjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;
import io.cucumber.messages.types.Duration;

public class Tree {
WebDriver driver;
TestContextSetup testcontextsetup;
TreePageObjects treepageobj;
landingpageobjects landingpage;
public Tree(TestContextSetup testcontextsetup)
{
	this.testcontextsetup=testcontextsetup;
	this.treepageobj=testcontextsetup.pageobjectmanager.gettreepageobj();
	this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
}


@And("Clicks on Get Started button on the Tree introduction panel")
public void user_clicks_get_started_button_of_tree_panel() {
	treepageobj.click_tree_getstarted();   
}


@Given("User is on the Tree module page")
public void user_is_on_the_tree_module_page() {
	String actual_title=landingpage.get_Title();
	String expected_title="Tree";
	assertEquals(expected_title,actual_title);
	System.out.println("You are on the" +expected_title+ "Page");
}

@When("The user scroll downs to Topics covered section on the Tree page")
public void the_user_scroll_downs_to_topics_covered_section_on_the_tree_page() {
  treepageobj.tree_topics_covered_section();   
}

@Then("Required list of topics covered should be displayed")
public void regiquered_list_of_topics_covered_should_be_displayed(io.cucumber.datatable.DataTable TreeTopics) 
{
    List<String>Expected_list=TreeTopics.asList();
    System.out.println("Expected List is:"+Expected_list);
    System.out.println("Actual List is:"+treepageobj.tree_topicscovered_list());
    Assert.assertEquals(treepageobj.tree_topicscovered_list(), Expected_list);  
}

@Given("The user is in the Tree page after loggedin")
public void the_user_is_in_the_tree_page_after_loggedin() {
	//treepageobj.click_tree_getstarted(); 
	String actual_title=landingpage.get_Title();
	String expected_title="Tree";
	assertEquals(expected_title,actual_title);
	System.out.println("User is on the" +expected_title+ "page");
 
}

@When("The user clicks Overview of Trees link present under topics covered")
public void the_user_clicks_overview_of_trees_link_present_under_topics_covered() {
    treepageobj.click_overview_of_tree();
    System.out.println("User clicked Overview of Tree link");
}

@Then("The user should be directed to Overview of Trees page")
public void the_user_should_be_directed_to_overview_of_trees_page() {
    String actualtitle = landingpage.get_Title();
	String expectedtitle="Overview of Trees";
	assertEquals(expectedtitle,actualtitle);
	System.out.println("User is on the" +expectedtitle+ "page");
	
    
}

@Given("The user is on the Overview of Trees page")
public void the_user_is_already_on_the_tree_page_after_loggedin() throws InterruptedException {
	treepageobj.click_overview_of_tree();
    
}


@When("User clicks Try Here button")
public void user_clicks_try_here_button() {
  treepageobj.click_TryHere_from_OverviewOfTrees();  
  System.out.println("User clicked Try Here button from Overview of Trees");   
}

@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
    String actualt_title=landingpage.get_Title();
    String expected_title="Assessment";
    assertEquals(expected_title,actualt_title);
    System.out.println("User is on the Try Editor Page");
     
}

@Given("User is on the Try Editor page of Overview of Trees section")
public void user_is_on_the_try_editor_page() {
	treepageobj.click_overview_of_tree();
	treepageobj.click_TryHere_from_OverviewOfTrees();
	System.out.println("User is on the Try Editor page of Overview of Trees section");   
}

@When("The user writes valid Python code")
public void the_user_writes_valid_python_code() {
 treepageobj.validcode_editor_oot();
 System.out.println("Valid Python code entered ");
    
}

@And("Click on Run button")
public void click_on_run_button() {
	treepageobj.run_OverviewOfTree();
}

@Then("User sees output in the output panel")
public void user_is_see_output_in_the_output_panel() {
	
	treepageobj.Ouptput_OverviewOfTree();
}

@Given("User is already on the Try Editor page")
public void user_is_alreadyon_the_try_editor_page() {
	treepageobj.click_overview_of_tree();
	treepageobj.click_TryHere_from_OverviewOfTrees();
	System.out.println("User is on the Try Editor page of Overview of Trees section");      
}

@When("The user writes invalid Python code")
public void the_user_writes_invalid_python_code() {
	treepageobj.invalid_editor_oot();      
}

@And("Click on Run button to run invalid code")
public void click_on_run_button_forInvalidCode() {
	treepageobj.run_OverviewOfTree();
}

@Then("User gets error alert box")
public void user_gets_error_alert_box() {
    
    treepageobj.error_alert_oot();
    
}




@Given("User is on the Try Eiotr page of Overview of Trees section")
public void user_is_on_the_try_eiotr_page_of_overview_of_trees_section() {
		treepageobj.click_overview_of_tree();
		treepageobj.click_TryHere_from_OverviewOfTrees();
		System.out.println("User is on the Try Editor page of Overview of Trees section");      
}

@When("User clicks on the back arrow")
public void user_clicks_on_the_back_arrow() {
	treepageobj.goback_frmTryeditor();
    
}

@Then("It should redirect to Overview of Trees page")
public void it_should_redirect_to_overview_of_trees_page() {
	String actualtitle = landingpage.get_Title();
	String expectedtitle="Overview of Trees";
	assertEquals(expectedtitle,actualtitle);
	System.out.println("User is on the" +expectedtitle+ "page");
    
}

@Then("Topics covered section is displayed on the left")
public void topics_covered_section_is_displayed_on_the_left() {
	treepageobj.contents_on_ootpage();
	
    
}

}
