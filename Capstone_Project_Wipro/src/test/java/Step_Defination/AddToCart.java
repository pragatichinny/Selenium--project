package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	WebDriver driver;
	@Given("Home page is opened")
	public void home_page_is_opened() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("search for a item")
	public void search_for_a_item() {
		WebElement search=driver.findElement(By.id("small-searchterms"));
		search.sendKeys("Apple icam");
		search.sendKeys(Keys.ENTER);
	    
	}

	@When("click on addtocart")
	public void click_on_addtocart() throws InterruptedException {
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]"));
		 Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cart);
		 cart.click();
	    
	}

	@Then("item should be added to cart")
	public void item_should_be_added_to_cart() {
		System.out.println("Item added to cart");
		driver.close();
	    
	}

}
