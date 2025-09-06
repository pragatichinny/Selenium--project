package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommunityPoll {
	WebDriver driver;
	@Given("user open home page")
	public void user_open_home_page() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("user login")
	public void user_login() {
		driver.findElement(By.linkText("Log in")).click();
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("chinny98@gmail.com");
		WebElement pass=driver.findElement(By.id("Password"));
		pass.sendKeys("Chinny@123");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
	    
	}

	@When("user click on good")
	public void user_click_on_good() throws InterruptedException {
	    driver.findElement(By.id("pollanswers-2")).click();
	    Thread.sleep(3000);
	}

	@When("click on vote")
	public void click_on_vote() throws InterruptedException {
	    driver.findElement(By.id("vote-poll-1")).click();
	    Thread.sleep(3000);
	}

	@Then("vote result should displayed")
	public void vote_result_should_displayed() {
	   System.out.println("Vote result displayed");
	   driver.close();
	}




}
