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

public class CurrencyChange {
	WebDriver driver;
	@Given("user open the main page")
	public void user_open_the_main_page() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on left up corner")
	public void click_on_left_up_corner() throws InterruptedException {
		driver.findElement(By.id("customerCurrency")).click();
		Thread.sleep(2000);
	   
	}

	@When("change the currency")
	public void change_the_currency() throws InterruptedException {
		WebElement curr=driver.findElement(By.id("customerCurrency"));
		curr.sendKeys("Euro");
		Thread.sleep(2000);
		curr.sendKeys(Keys.ENTER);
	}

	@Then("changes has updated")
	public void changes_has_updated() {
		System.out.println("Chnages updated");
		driver.close();
	    
	}




}
