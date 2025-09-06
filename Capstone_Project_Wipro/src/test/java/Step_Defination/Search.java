package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver;
	@Given("Home page open")
	public void home_page_open() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("search for a item in searchbar")
	public void search_for_a_item_in_searchbar() {
		WebElement search=driver.findElement(By.id("small-searchterms"));
		search.sendKeys("Apple MacBook Pro");
		search.sendKeys(Keys.ENTER);
	    
	}


	@When("click on item")
	public void click_on_item() {
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[1]/a/img")).click();
	    
	}

	@Then("item appear")
	public void item_appear() {
	    System.out.println("item description appear");
	    driver.close();
	}


}
