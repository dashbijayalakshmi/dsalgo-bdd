package StepDefination;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.ArraysDocPageObjects;
import Pageobjects.landingpageobjects;
import Utils.TestContextSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class ArraysDocPageStepDefination {
	WebDriver driver;
	TestContextSetup testcontextsetup;
	ArraysDocPageObjects arraysdocpage;
	landingpageobjects landingpage;
	public ArraysDocPageStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.arraysdocpage=testcontextsetup.pageobjectmanager.getArrayDocPage();
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
	}
	@And("User Clicks GetStated button of Arrays pane.")
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

}
