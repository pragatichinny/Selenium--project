package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAddress {
	WebDriver driver;
	@Given("main page is opened in browzer")
	public void main_page_is_opened_in_browzer() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on addresses")
	public void click_on_addresses() {
		driver.findElement(By.linkText("Log in")).click();
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("mangalipragati98@gmail.com");
		WebElement pass=driver.findElement(By.id("Password"));
		pass.sendKeys("2DLpetsegZ@XeAa");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
	    
		driver.findElement(By.linkText("My account")).click();
		
		driver.findElement(By.linkText("Addresses")).click();
	}

	@When("click on edit")
	public void click_on_edit() {
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[1]/div/div[2]/button[1]")).click();
	    
	}

	@When("Enter New Address")
	public void enter_new_address() {
		driver.findElement(By.id("Address_CountryId")).sendKeys("India");
		driver.findElement(By.id("Address_StateProvinceId")).sendKeys("Telangana");
		driver.findElement(By.id("Address_Address1")).sendKeys("Hyderabadasdfgh");
	}

	@When("click on save")
	public void click_on_save() {
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/form/div/div[2]/div[2]/button")).click();
	}

	@Then("Address updated")
	public void address_updated() {
		System.out.println("Address updated");
		driver.close();
	    
	}


}
