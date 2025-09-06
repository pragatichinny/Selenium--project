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

public class NewsLetter {
	WebDriver driver;
	@Given("user open home page in browzer")
	public void user_open_home_page_in_browzer() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}
	

	@When("click on bar to enter email")
	public void click_on_bar_to_enter_email() throws InterruptedException {
	   WebElement newsMail=driver.findElement(By.id("newsletter-email"));
	   Thread.sleep(3000);
	   newsMail.sendKeys("mangalipragati98@gmail.com");
	   Thread.sleep(3000);
	}

	@When("click on subscribe")
	public void click_on_subscribe() throws InterruptedException {
	    driver.findElement(By.id("newsletter-subscribe-button")).click();
	    Thread.sleep(3000);
	}

	@Then("subscribe is done")
	public void subscribe_is_done() {
	   System.out.println("message is displayed on subcription");
	   driver.close();
	}




}
