package Pageobjects;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TreePageObjects {
	private By Tree_Get_Started=By.xpath("//div/a[@href='tree' and text()='Get Started']");
	private By tree_topics_cvrd=By.xpath("//div/p[@class='bg-secondary text-white']");
	private By tree_listoftopics=By.cssSelector("a.list-group-item");
	private By overview_of_trees=By.linkText("Overview of Trees");
	private By TryHere_OverviewofTrees=By.linkText("Try here>>>");
	
	
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
}
