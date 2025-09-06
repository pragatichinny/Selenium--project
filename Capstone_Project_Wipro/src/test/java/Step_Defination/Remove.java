package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Remove {
	WebDriver driver;
	@Given("open home page")
	public void open_home_page() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}

	@When("add any item to cart")
	public void add_any_item_to_cart() {
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
		
	   
	}
	@When("click on cart icon")
	public void click_on_cart_icon() throws InterruptedException {
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("quantity-up-754")).click();
	}

	@When("click on remove")
	public void click_on_remove() {
		driver.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr/td[7]/button")).click();
	   
	}

	@Then("item should be removed from cart")
	public void item_should_be_removed_from_cart() {
		System.out.println("Item removed from cart");
		driver.close();
	   
	}


}
