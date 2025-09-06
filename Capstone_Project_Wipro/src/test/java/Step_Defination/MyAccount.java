package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccount {
	WebDriver driver;
	@Given("home page is opened in browzer")
	public void home_page_is_opened_in_browzer() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}

	@When("login with credentials")
	public void login_with_credentials() {
		driver.findElement(By.linkText("Log in")).click();
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("mangalipragati98@gmail.com");
		WebElement pass=driver.findElement(By.id("Password"));
		pass.sendKeys("2DLpetsegZ@XeAa");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
	    
	}
	
	@When("click on my account")
	public void click_on_my_account() {
		driver.findElement(By.linkText("My account")).click();
	}

	

	@When("click on orders")
	public void click_on_orders() {
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li[3]/a")).click();
	}

	@Then("Orders informations should display")
	public void orders_informations_should_display() {
		System.out.println("Order information displayed");
		driver.close();
	    
	}

}
