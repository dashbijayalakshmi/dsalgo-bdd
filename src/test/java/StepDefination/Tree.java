package StepDefination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pageobjects.Run_PythonCodes;
import Pageobjects.TreePageObjects;
import Pageobjects.landingpageobjects;
import Utils.ExcelReader;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;
import io.cucumber.messages.types.Duration;

public class Tree {
	WebDriver driver;
	TestContextSetup testcontextsetup;
	TreePageObjects treepageobj;
	landingpageobjects landingpage;
	Run_PythonCodes runpythoncode;

	public Tree(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		this.treepageobj = testcontextsetup.pageobjectmanager.gettreepageobj();
		this.landingpage = testcontextsetup.pageobjectmanager.getLandingpageobjects();
		this.runpythoncode = testcontextsetup.pageobjectmanager.getruncodeobj();
	}

	@And("Clicks on Get Started button on the Tree introduction panel")
	public void user_clicks_get_started_button_of_tree_panel() {
		treepageobj.click_tree_getstarted();
	}

	@Given("User is on the Tree module page")
	public void user_is_on_the_tree_module_page() {
		String actual_title = landingpage.get_Title();
		String expected_title = "Tree";
		assertEquals(expected_title, actual_title);
		System.out.println("You are on the" + expected_title + "Page");
	}

	@When("The user scroll downs to Topics covered section on the Tree page")
	public void the_user_scroll_downs_to_topics_covered_section_on_the_tree_page() {
		treepageobj.tree_topics_covered_section();
	}

	@Then("Required list of topics covered should be displayed")
	public void regiquered_list_of_topics_covered_should_be_displayed(io.cucumber.datatable.DataTable TreeTopics) {
		List<String> Expected_list = TreeTopics.asList();
		List<String> Actual_list = treepageobj.tree_topicscovered_list();
		System.out.println("Expected List is:" + Expected_list);
		System.out.println("Actual List is:" + Actual_list);
		Assert.assertEquals(Expected_list, Actual_list, "List is not present");
	}

	@Given("The user is in the Tree page after loggedin")
	public void the_user_is_in_the_tree_page_after_loggedin() {
		// treepageobj.click_tree_getstarted();
		String actual_title = landingpage.get_Title();
		String expected_title = "Tree";
		assertEquals(expected_title, actual_title);
		System.out.println("User is on the" + expected_title + "page");

	}

	@When("The user clicks Overview of Trees link present under topics covered")
	public void the_user_clicks_overview_of_trees_link_present_under_topics_covered() {
		treepageobj.click_overview_of_tree();
		System.out.println("User clicked Overview of Tree link");
	}

	@Then("The user should be directed to Overview of Trees page")
	public void the_user_should_be_directed_to_overview_of_trees_page() {
		String actualtitle = landingpage.get_Title();
		String expectedtitle = "Overview of Trees";
		assertEquals(expectedtitle, actualtitle);
		System.out.println("User is on the" + expectedtitle + "page");

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
		String actualt_title = landingpage.get_Title();
		String expected_title = "Assessment";
		assertEquals(expected_title, actualt_title);
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
		runpythoncode.validcode_editor();
		System.out.println("Valid Python code entered ");

	}

	@And("Click on Run button")
	public void click_on_run_button() {
		runpythoncode.run_button();
	}

	@Then("User sees output in the output panel")
	public void user_is_see_output_in_the_output_panel() {

		runpythoncode.Ouptput_ValidCode();
	}

	@Given("User is already on the Try Editor page")
	public void user_is_alreadyon_the_try_editor_page() {
		treepageobj.click_overview_of_tree();
		treepageobj.click_TryHere_from_OverviewOfTrees();
		System.out.println("User is on the Try Editor page of Overview of Trees section");
	}

	@When("The user writes invalid Python code")
	public void the_user_writes_invalid_python_code() {
		runpythoncode.invalidcode_editor();
	}

	@And("Click on Run button to run invalid code")
	public void click_on_run_button_forInvalidCode() {
		runpythoncode.run_button();
	}

	@Then("User gets error alert box")
	public void user_gets_error_alert_box() {

		runpythoncode.error_alert();

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
		String expectedtitle = "Overview of Trees";
		assertEquals(expectedtitle, actualtitle);
		System.out.println("User is on the" + expectedtitle + "page");

	}

	@Then("Topics covered section is displayed on the left")
	public void topics_covered_section_is_displayed_on_the_left() {
		treepageobj.contents_on_ootpage();
	}

	@Given("The user is in the Tree page after login")
	public void the_user_is_in_the_tree_page_after_login() {
		String actual_title = landingpage.get_Title();
		String expected_title = "Tree";
		assertEquals(expected_title, actual_title);
		System.out.println("User is on the " + actual_title + "page");
	}

	@When("The user clicks Terminologies link present under topics covered")
	public void the_user_clicks_terminologies_link_present_under_topics_covered() {
		treepageobj.click_terminologies();
	}

	@Then("The user should be directed to Terminologies page")
	public void the_user_should_be_directed_to_terminologies_page() {
		String actual_title = landingpage.get_Title();
		String expected_title = "Terminologies";
		assertEquals(expected_title, actual_title);
		System.out.println("User is on the " + actual_title + " Page");

	}

	@Given("The user is on the Terminologies page")
	public void the_user_is_on_the_terminologies_page() {
		treepageobj.click_terminologies();
	}

	@When("User clicks Try Here button on the Terminologies page")
	public void user_clicks_try_here_button_on_the_terminologies_page() {

		treepageobj.click_tryHere_on_Terminologies();
	}

	@Then("The user should be redirected to a Terminologies page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_terminologies_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String Expected_tit = "Assessment";
		assertEquals(Expected_tit, actual_tit);
		System.out.println("User is on the " + actual_tit + " Page of Terminologies section");
	}

	@Given("User is on the Try Editor page of Terminologies section")
	public void user_is_on_the_try_editor_page_of_terminologies_section() {
		treepageobj.click_terminologies();
		treepageobj.click_tryHere_on_Terminologies();
	}

	@When("The user writes valid Python code under Terminologies section")
	public void the_user_writes_valid_python_code_under_terminologies_section() {
		runpythoncode.validcode_editor();
		System.out.println("Valid Python code entered ");

	}

	@When("Click on Run button under Terminologies section")
	public void click_on_run_button_under_terminologies_section() {
		runpythoncode.run_button();

	}

	@Then("User sees output in the output panel under Terminologies section")
	public void user_sees_output_in_the_output_panel_under_terminologies_section() {
		runpythoncode.Ouptput_ValidCode();

	}

	@Given("User is already on the Try Editor page under Terminologies section")
	public void user_is_already_on_the_try_editor_page_under_terminologies_section() {
		treepageobj.click_terminologies();
		treepageobj.click_tryHere_on_Terminologies();

	}

	@When("The user writes invalid Python code under Terminologies section")
	public void the_user_writes_invalid_python_code_under_terminologies_section() {
		runpythoncode.invalidcode_editor();

	}

	@When("Click on Run button to run invalid code under Terminologies section")
	public void click_on_run_button_to_run_invalid_code_under_terminologies_section() {
		runpythoncode.error_alert();

	}

	@Then("User gets error alert box under Terminologies section")
	public void user_gets_error_alert_box_under_terminologies_section() {
		runpythoncode.error_alert();

	}

	@When("The user writes Python code from given sheetname {string} rownumber {int} and columnumber {int}")
	public void the_user_writes_python_code_from_sheetname_rownumber_and_columnumber(String sheetname,
			Integer rownumber, Integer columnumber) throws InterruptedException {

		String python_code = ExcelReader.getExcelValue(sheetname, rownumber, columnumber);
		System.out.println("First");
		treepageobj.getPythonCode_from_excel(python_code);

	}

	@When("User clicks on the back arrow under Terminologies section")
	public void user_clicks_on_the_back_arrow_under_terminologies_section() {
		treepageobj.goback_frmTryeditor();

	}

	@Then("It should redirect to Terminologies page")
	public void it_should_redirect_to_terminologies_page() {
		String actualtitle = landingpage.get_Title();
		String expectedtitle = "Terminologies";
		assertEquals(expectedtitle, actualtitle);
		System.out.println("User is on the" + expectedtitle + "page");

	}

	@Given("The user is on the Types of Trees page")
	public void the_user_is_on_the_types_of_trees_page() {
		treepageobj.click_TypesofTreeslink();

	}

	@When("User clicks Try Here button on the Types of Trees page")
	public void user_clicks_try_here_button_on_the_types_of_trees_page() {
		treepageobj.click_tryhere();

	}

	@Then("The user should be redirected to a Types of Trees page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_types_of_trees_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
	}

	@When("The user clicks Types of Trees link present under topics covered")
	public void the_user_clicks_types_of_trees_link_present_under_topics_covered() {
		treepageobj.click_TypesofTreeslink();

	}

	@Then("The user should be directed to Types of Trees page")
	public void the_user_should_be_directed_to_types_of_trees_page() {

		String actual_tit = landingpage.get_Title();
		String exp_tit = "Types of Trees";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");

	}

	@Given("User is on the Try Editor page")
	public void user_is_on_the_try_editor_page_of_types_of_trees_section() {
		treepageobj.click_TypesofTreeslink();
		treepageobj.click_tryhere();
		// treepageobj.isUseron_TryEdiotorPage();

	}

	@Then("User gets output in the output panel")
	public void user_sees_output_in_the_output_panel_under_types_of_trees_section() {
		treepageobj.show_output();

	}

	@Then("User gets error popup box")
	public void user_gets_error_alert_box_under_types_of_trees_section() {
		treepageobj.invalidcode_error();

	}

	@When("User clicks on the back arrow under Types of Trees section")
	public void user_clicks_on_the_back_arrow_under_types_of_trees_section() {
		treepageobj.goback_frmTryeditor();

	}

	@Then("It should redirect to Types of Trees page")
	public void it_should_redirect_to_types_of_trees_page() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Types of Trees";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");

	}

	@When("The user clicks Tree Traversals link present under topics covered")
	public void the_user_clicks_tree_traversals_link_present_under_topics_covered() {
		treepageobj.click_TreeTraversals();

	}

	@Then("The user should be directed to Tree Traversals page")
	public void the_user_should_be_directed_to_tree_traversals_page() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Tree Traversals";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");

	}

	@Given("The user is on the Tree Traversals page")
	public void the_user_is_on_the_tree_traversals_page() {
		treepageobj.click_TreeTraversals();
		// treepageobj.click_tryhere();
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Tree Traversals";
		if (actual_tit.equals(exp_tit)) {
			System.out.println("User is on the Tree Traversal Page");
		} else {
			System.out.println("User is not on the Tree Traversal Page");
		}

	}

	@Then("The user should be redirected to a Tree Traversals page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_tree_traversals_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");

	}

	@When("User clicks on the back arrow under Tree Traversals section")
	public void user_clicks_on_the_back_arrow_under_tree_traversals_section() {
		treepageobj.goback_frmTryeditor();

	}

	@Then("It should redirect to Tree Traversals page")
	public void it_should_redirect_to_tree_traversals_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Tree Traversals";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");

	}

	@When("User clicks Try Here button from Tree Traversals page")
	public void user_clicks_try_here_button1() {
		treepageobj.click_tryhere();
		System.out.println("User clicked Try Here button from Overview of Trees");
	}

	@Given("User is on the Try Editor page from Tree Traversals")
	public void user_is_on_the_try_editor_page_of_TreeTravelsal_section() {
		treepageobj.click_TreeTraversals();
		treepageobj.click_tryhere();
		// treepageobj.isUseron_TryEdiotorPage();

	}

	@Given("User is on the Try Editor page of Tree Traversals")
	public void user_is_on_the_try_editor_page_of_tree_traversals() {
		treepageobj.click_TreeTraversals();
		treepageobj.click_tryhere();

	}

	@When("The user clicks Traversals-Illustrations link present under topics covered")
	public void the_user_clicks_traversals_illustrations_link_present_under_topics_covered() {

		treepageobj.click_Traversals_illustration();
	}

	@Then("The user should be directed to Traversals-Illustrations page")
	public void the_user_should_be_directed_to_traversals_illustrations_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Traversals-Illustration";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}

	@Given("The user is on the Traversals-Illustrations page")
	public void the_user_is_on_the_traversals_illustrations_page() {
		treepageobj.click_Traversals_illustration();

	}

	@When("User clicks Try Here button from Traversals-Illustrations page")
	public void user_clicks_try_here_button_from_traversals_illustrations_page() {
		treepageobj.click_tryhere();

	}

	@Then("The user should be redirected to a Traversals-Illustrations page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_traversals_illustrations_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit);

	}

	@Given("User is on the Try Editor page of Traversals-Illustrations page")
	public void user_is_on_the_try_editor_page_of_traversals_illustrations_page() {
		treepageobj.click_Traversals_illustration();
		treepageobj.click_tryhere();
	}

	@Given("User is on the Try Editor page from Traversals-Illustrations page")
	public void user_is_on_the_try_editor_page_from_traversals_illustrations_page() {
		treepageobj.click_Traversals_illustration();
		treepageobj.click_tryhere();

	}

	@When("User clicks on the back arrow under Traversals-Illustrations section")
	public void user_clicks_on_the_back_arrow_under_traversals_illustrations_section() {
		treepageobj.goback_frmTryeditor();

	}

	@Then("It should redirect to Traversals-Illustrations page")
	public void it_should_redirect_to_traversals_illustrations_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Traversals-Illustration";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}

	@When("The user clicks Binary Trees link present under topics covered")
	public void the_user_clicks_binary_trees_link_present_under_topics_covered() {
		treepageobj.click_BinaryTree();

	}

	@Then("The user should be directed to Binary Trees page")
	public void the_user_should_be_directed_to_binary_trees_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Binary Trees";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);

	}

	@Given("The user is on the Binary Trees page")
	public void the_user_is_on_the_binary_trees_page() {
		treepageobj.click_BinaryTree();

	}

	@When("User clicks Try Here button from Binary Trees page")
	public void user_clicks_try_here_button_from_binary_trees_page() {
		treepageobj.click_tryhere();

	}

	@Then("The user should be redirected to a Binary Trees page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_binary_trees_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit);

	}

	@Given("User is on the Try Editor page of Binary Trees page")
	public void user_is_on_the_try_editor_page_of_binary_trees_page() {
		treepageobj.click_BinaryTree();
		treepageobj.click_tryhere();
	}

	@Given("User is on the Try Editor page from Binary Trees page")
	public void user_is_on_the_try_editor_page_from_binary_trees_page() {
		treepageobj.click_BinaryTree();
		treepageobj.click_tryhere();

	}

	@When("User clicks on the back arrow under Binary Trees section")
	public void user_clicks_on_the_back_arrow_under_binary_trees_section() {
		treepageobj.goback_frmTryeditor();

	}

	@Then("It should redirect to Binary Trees page")
	public void it_should_redirect_to_binary_trees_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Binary Trees";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}

	@When("The user clicks Types of Binary Trees link present under topics covered")
	public void the_user_clicks_types_of_binary_trees_link_present_under_topics_covered() {
		treepageobj.click_TypesofBinaryTrees();

	}

	@Then("The user should be directed to Types of Binary Trees page")
	public void the_user_should_be_directed_to_types_of_binary_trees_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Types of Binary Trees";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}

	@Given("The user is on the Types of Binary Trees page")
	public void the_user_is_on_the_types_of_binary_trees_page() {
		treepageobj.click_TypesofBinaryTrees();

	}

	@When("User clicks Try Here button from Types of Binary Trees page")
	public void user_clicks_try_here_button_from_types_of_binary_trees_page() {
		treepageobj.click_tryhere();

	}

	@Then("The user should be redirected to a Types of Binary Trees page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_types_of_binary_trees_page_having_an_try_editor_with_a_run_button_to_test() {

		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit);
	}

	@Given("User is on the Try Editor page of Types of Binary Trees page")
	public void user_is_on_the_try_editor_page_of_types_of_binary_trees_page() {
		treepageobj.click_TypesofBinaryTrees();
		treepageobj.click_tryhere();
	}

	@Given("User is on the Try Editor page from Types of Binary Trees page")
	public void user_is_on_the_try_editor_page_from_types_of_binary_trees_page() {
		treepageobj.click_TypesofBinaryTrees();
		treepageobj.click_tryhere();

	}

	@When("User clicks on the back arrow under Types of Binary Trees section")
	public void user_clicks_on_the_back_arrow_under_types_of_binary_trees_section() {
		treepageobj.goback_frmTryeditor();

	}

	@Then("It should redirect to Types of Binary Trees page")
	public void it_should_redirect_to_types_of_binary_trees_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Types of Binary Trees";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}

	@When("The user clicks Implementation in Python link present under topics covered")
	public void the_user_clicks_implementation_in_python_link_present_under_topics_covered() {
		treepageobj.click_impinPython();

	}

	@Then("The user should be directed to Implementation in Python page")
	public void the_user_should_be_directed_to_implementation_in_python_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Implementation in Python";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);

	}

	@Given("The user is on the Implementation in Python page")
	public void the_user_is_on_the_implementation_in_python_page() {
		treepageobj.click_impinPython();

	}

	@When("User clicks Try Here button from Implementation in Python page")
	public void user_clicks_try_here_button_from_implementation_in_python_page() {
		treepageobj.click_tryhere();

	}

	@Then("The user should be redirected to a Implementation in Python page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_implementation_in_python_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit);

	}

	@Given("User is on the Try Editor page of Implementation in Python page")
	public void user_is_on_the_try_editor_page_of_implementation_in_python_page() {
		treepageobj.click_impinPython();
		treepageobj.click_tryhere();
	}

	@When("User clicks on the back arrow under Implementation in Python section")
	public void user_clicks_on_the_back_arrow_under_implementation_in_python_section() {
		treepageobj.goback_frmTryeditor();

	}

	@Then("It should redirect to Implementation in Python page")
	public void it_should_redirect_to_implementation_in_python_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Implementation in Python";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);

	}

	@When("The user clicks Binary Tree Traversals link present under topics covered")
	public void the_user_clicks_binary_tree_traversals_link_present_under_topics_covered() {
		treepageobj.click_binarytreetrav();

	}

	@Then("The user should be directed to Binary Tree Traversals page")
	public void the_user_should_be_directed_to_binary_tree_traversals_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Binary Tree Traversals";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);

	}

	@Given("The user is on the Binary Tree Traversals page")
	public void the_user_is_on_the_binary_tree_traversals_page() {
		treepageobj.click_binarytreetrav();

	}

	@When("User clicks Try Here button from Binary Tree Traversals page")
	public void user_clicks_try_here_button_from_binary_tree_traversals_page() {
		treepageobj.click_tryhere();
	}

	@Then("The user should be redirected to a Binary Tree Traversals page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_binary_tree_traversals_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit);

	}

	@Given("User is on the Try Editor page of Binary Tree Traversals page")
	public void user_is_on_the_try_editor_page_of_binary_tree_traversals_page() {
		treepageobj.click_binarytreetrav();
		treepageobj.click_tryhere();
	}

	@When("User clicks on the back arrow under Binary Tree Traversals section")
	public void user_clicks_on_the_back_arrow_under_binary_tree_traversals_section() {
		treepageobj.goback_frmTryeditor();

	}

	@Then("It should redirect to Binary Tree Traversals page")
	public void it_should_redirect_to_binary_tree_traversals_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Binary Tree Traversals";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}

	@When("The user clicks Implementation of Binary Trees link present under topics covered")
	public void the_user_clicks_implementation_of_binary_trees_link_present_under_topics_covered() {
		treepageobj.click_ImpofBinaryTrees();

	}

	@Then("The user should be directed to Implementation of Binary Trees page")
	public void the_user_should_be_directed_to_implementation_of_binary_trees_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Implementation of Binary Trees";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);

	}

	@Given("The user is on the Implementation of Binary Trees page")
	public void the_user_is_on_the_implementation_of_binary_trees_page() {
		treepageobj.click_ImpofBinaryTrees();

	}

	@When("User clicks Try Here button from Implementation of Binary Trees page")
	public void user_clicks_try_here_button_from_implementation_of_binary_trees_page() {
		treepageobj.click_tryhere();

	}

	@Then("The user should be redirected to a Implementation of Binary Trees page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_implementation_of_binary_trees_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit);

	}

	@Given("User is on the Try Editor page of Implementation of Binary Trees page")
	public void user_is_on_the_try_editor_page_of_implementation_of_binary_trees_page() {
		treepageobj.click_ImpofBinaryTrees();
		treepageobj.click_tryhere();
	}

	@When("User clicks on the back arrow under Implementation of Binary Trees section")
	public void user_clicks_on_the_back_arrow_under_implementation_of_binary_trees_section() {
		treepageobj.goback_frmTryeditor();

	}

	@Then("It should redirect to Implementation of Binary Trees page")
	public void it_should_redirect_to_implementation_of_binary_trees_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Implementation of Binary Trees";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);

	}

	@When("The user clicks Applications of Binary trees Trees link present under topics covered")
	public void the_user_clicks_applications_of_binary_trees_trees_link_present_under_topics_covered() {

		treepageobj.click_appofBinaryTrees();
	}

	@Then("The user should be directed to Applications of Binary trees Trees page")
	public void the_user_should_be_directed_to_applications_of_binary_trees_trees_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Applications of Binary trees";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);

	}

	@Given("The user is on the Applications of Binary trees Trees page")
	public void the_user_is_on_the_applications_of_binary_trees_trees_page() {

		treepageobj.click_appofBinaryTrees();
	}

	@When("User clicks Try Here button from Applications of Binary trees Trees page")
	public void user_clicks_try_here_button_from_applications_of_binary_trees_trees_page() {

		treepageobj.click_tryhere();
	}

	@Then("The user should be redirected to a Applications of Binary trees Trees page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_applications_of_binary_trees_trees_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit);

	}

	@Given("User is on the Try Editor page of Applications of Binary trees Trees page")
	public void user_is_on_the_try_editor_page_of_applications_of_binary_trees_trees_page() {
		treepageobj.click_appofBinaryTrees();
		treepageobj.click_tryhere();
	}

	@When("User clicks on the back arrow under Applications of Binary trees Trees section")
	public void user_clicks_on_the_back_arrow_under_applications_of_binary_trees_trees_section() {
		treepageobj.goback_frmTryeditor();

	}

	@Then("It should redirect to Applications of Binary trees Trees page")
	public void it_should_redirect_to_applications_of_binary_trees_trees_page() {

		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Applications of Binary trees";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}

	@When("The user clicks Binary Search  Trees link present under topics covered")
	public void the_user_clicks_binary_search_trees_link_present_under_topics_covered() {
		treepageobj.click_BinarySearchTrees();

	}

	@Then("The user should be directed to Binary Search  Trees page")
	public void the_user_should_be_directed_to_binary_search_trees_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Binary Search Trees";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);

	}

	@Given("The user is on the Binary Search  Trees page")
	public void the_user_is_on_the_binary_search_trees_page() {
		treepageobj.click_BinarySearchTrees();

	}

	@When("User clicks Try Here button from Binary Search  Trees page")
	public void user_clicks_try_here_button_from_binary_search_trees_page() {
		treepageobj.click_tryhere();

	}

	@Then("The user should be redirected to a Binary Search  Trees page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_binary_search_trees_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit);

	}

	@Given("User is on the Try Editor page of Binary Search  Trees page")
	public void user_is_on_the_try_editor_page_of_binary_search_trees_page() {
		treepageobj.click_BinarySearchTrees();
		treepageobj.click_tryhere();
	}

	@When("User clicks on the back arrow under Binary Search  Trees section")
	public void user_clicks_on_the_back_arrow_under_binary_search_trees_section() {
		treepageobj.goback_frmTryeditor();

	}

	@Then("It should redirect to Binary Search  Trees page")
	public void it_should_redirect_to_binary_search_trees_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Binary Search Trees";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);

	}

	@When("The user clicks Implementation Of BST link present under topics covered")
	public void the_user_clicks_implementation_of_bst_link_present_under_topics_covered() {
		treepageobj.click_impofBST();

	}

	@Then("The user should be directed to Implementation Of BST page")
	public void the_user_should_be_directed_to_implementation_of_bst_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Implementation Of BST";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);

	}

	@Given("The user is on the Implementation Of BST page")
	public void the_user_is_on_the_implementation_of_bst_page() {
		treepageobj.click_impofBST();

	}

	@When("User clicks Try Here button from Implementation Of BST page")
	public void user_clicks_try_here_button_from_implementation_of_bst_page() {
		treepageobj.click_tryhere();

	}

	@Then("The user should be redirected to a Implementation Of BST page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_implementation_of_bst_page_having_an_try_editor_with_a_run_button_to_test() {
		String actual_tit = landingpage.get_Title();
		String exp_tit = "Assessment";
		Assert.assertEquals(exp_tit, actual_tit, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit);

	}

	@Given("User is on the Try Editor page of Implementation Of BST page")
	public void user_is_on_the_try_editor_page_of_implementation_of_bst_page() {
		treepageobj.click_impofBST();
		treepageobj.click_tryhere();
	}

	@When("User clicks on the back arrow under Implementation Of BST section")
	public void user_clicks_on_the_back_arrow_under_implementation_of_bst_section() {
		treepageobj.goback_frmTryeditor();
	}

	@Then("It should redirect to Implementation Of BST page")
	public void it_should_redirect_to_implementation_of_bst_page() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Implementation Of BST";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);
	}

	@Given("Navigated to any topics of the Tree - Implementation Of BST")
	public void navigated_to_any_topics_of_the_tree_implementation_of_bst() {
		treepageobj.click_impofBST();
	}

	@When("The user clicks Practice Questions of Tree section")
	public void the_user_clicks_practice_questions_of_tree_section() {
		treepageobj.click_PracticeQuestion();

	}

	@Then("Practice Question page should open")
	public void practice_question_page_should_open() {
		String actual_tit1 = landingpage.get_Title();
		String exp_tit1 = "Practice Questions";
		Assert.assertEquals(exp_tit1, actual_tit1, "User wasn't naviagated to expected page");
		System.out.println("User navigated to " + actual_tit1);

	}

	@Then("Sets of practice questions should be available on the page")
	public void sets_of_practice_questions_should_be_visible() {
		treepageobj.is_practiceQuestion_Displayed();

	}
}
