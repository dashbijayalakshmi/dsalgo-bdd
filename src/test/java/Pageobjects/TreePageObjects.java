package Pageobjects;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.messages.types.Duration;

public class TreePageObjects {
	private By Tree_Get_Started=By.xpath("//div/a[@href='tree' and text()='Get Started']");
	private By tree_topics_cvrd=By.xpath("//div/p[@class='bg-secondary text-white']");
	private By tree_listoftopics=By.cssSelector("a.list-group-item");
	private By overview_of_trees=By.linkText("Overview of Trees");
	private By TryHere_OverviewofTrees=By.xpath("//div/a[@href='/tryEditor' and text()='Try here>>>']");
	private By Editor_input_box_OverviewofTrees=By.xpath("//div[@class='input']");
	private By run_OverviewofTrees=By.xpath("//form/button[text()='Run']");
	private By output_verviewofTrees=By.id("output");
	
	//private By overviewoftree_page=By.xpath("//div/strong/p[@class='bg-secondary text-white']");
	
	
	public WebDriver driver;
	public 	TreePageObjects(WebDriver driver) {
		this.driver=driver;
	}
	public void click_tree_getstarted()
	{
		driver.findElement(Tree_Get_Started).click();
	}

	public void tree_topics_covered_section()
	{
		WebElement topics=driver.findElement(tree_topics_cvrd);
		new Actions(driver).scrollToElement(topics).perform();
		System.out.println("Scrolled down to Topics Covered under the Tree Section");
	}
	
	public List<String> tree_topicscovered_list()
	{
		List<String>TreeTopics=new ArrayList<>();
		List<WebElement> topics_tree=driver.findElements(tree_listoftopics);
		for (WebElement tree_topics:topics_tree)
		{
			String treetopics=tree_topics.getText();
			TreeTopics.add(treetopics);
		}
		return TreeTopics;
		
	}
	public void click_overview_of_tree()
	{
		driver.findElement(overview_of_trees).click();
	}
	
	public void click_TryHere_from_OverviewOfTrees()
	{
		driver.findElement(TryHere_OverviewofTrees).click();
	}
	
	public void validcode_editor_oot()
	{
		WebElement validcode_oot=driver.findElement(Editor_input_box_OverviewofTrees);
		new Actions(driver).sendKeys(validcode_oot,"print('Hello it is a Valid Python Code')").perform();
		 
	}
	
	public void run_OverviewOfTree()
	{
		driver.findElement(run_OverviewofTrees).click();
	}
	
	public void Ouptput_OverviewOfTree()
	{
		WebElement output=driver.findElement(output_verviewofTrees);
		String result = output.getText();
		System.out.println("The output of valid Python code is:" +result);
		
	}
	
	public void invalid_editor_oot()
	{
		WebElement invalidcode_oot=driver.findElement(Editor_input_box_OverviewofTrees);
		new Actions(driver).sendKeys(invalidcode_oot,"p('Invalid Code')").perform();
	}
	
	public void error_alert_oot()
	{
		Alert alert = driver.switchTo().alert();
		String alert_message=alert.getText();
		System.out.println("Error occured is: " +alert_message);
        alert.accept();
	}
}

