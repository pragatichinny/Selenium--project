package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	WebDriver driver;
	@Given("Home page should open")
	public void home_page_should_open() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on register")
	public void click_on_register() {
		driver.findElement(By.linkText("Register")).click();
	    
	}

	@When("enter Personal Details")
	public void enter_personal_details() {
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Pragati");
		driver.findElement(By.id("LastName")).sendKeys("chinny");
		driver.findElement(By.id("Email")).sendKeys("chinny98@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("chinny@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("chinny@123");
	    
	}

	@When("click on register to register")
	public void click_on_register_to_register() {
		driver.findElement(By.id("register-button")).click();
	   
	}

	@When("click on continue")
	public void click_on_continue() {
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[2]/a")).click();
	}

	@Then("registration successfull")
	public void registration_successfull() {
	    System.out.println("Registed sucessfully");
	    driver.close();
	}

}
