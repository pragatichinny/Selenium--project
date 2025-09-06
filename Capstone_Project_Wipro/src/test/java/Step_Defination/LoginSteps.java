package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	@Given("Home page should open in default browzer")
	public void home_page_should_open_in_default_browzer() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("click on login")
	public void click_on_login() {
		driver.findElement(By.linkText("Log in")).click();
	    
	}

	@When("enter email and password")
	public void enter_email_and_password() {
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("MangaliPragati98@gmail.com");
		WebElement pass=driver.findElement(By.id("Password"));
		pass.sendKeys("2DLpetsegZ@XeAa");
		
	    
	}

	@When("click on login for sucessfull login")
	public void click_on_login_for_sucessfull_login() {
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
	}

	@Then("login successfully and open home page")
	public void login_successfully_and_open_home_page() {
		System.out.println("Login Sucessfull");
		driver.close();
	    
	}



}
