package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOut {
	WebDriver driver;
	@Given("home page is open")
	public void home_page_is_open() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@When("login the website")
	public void login_the_website() {
		driver.findElement(By.linkText("Log in")).click();
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("mangalipragati98@gmail.com");
		WebElement pass=driver.findElement(By.id("Password"));
		pass.sendKeys("2DLpetsegZ@XeAa");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
	}
	@When("add item to cart")
	public void add_item_to_cart() {
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]")).click();
		driver.findElement(By.id("add-to-cart-button-4")).click();
	}

	@When("click on cart")
	public void click_on_cart() throws InterruptedException {
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(1000);
	    
	}

	@When("click on checkout")
	public void click_on_checkout() {
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		
		/*driver.findElement(By.id("Email")).sendKeys("chinny98@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chinny@123");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();*/
	    
	}

	@When("fill billing address details")
	public void fill_billing_address_details() {
		//driver.findElement(By.xpath("//*[@id=\"opc-billing\"]/div[1]")).click();
		//driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Pragati");
		//driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Mangali");
		//driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("mangalipragati98@gmail.com");
		driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("India");
		driver.findElement(By.id("BillingNewAddress_StateProvinceId")).sendKeys("Telangana");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Hyderabad");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("abc Hyderabad");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("500075");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("2578965245");
	}

	@When("click on continue for four times")
	public void click_on_continue_for_four_times() {
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
	}

	@When("click on confirm order")
	public void click_on_confirm_order() {
	   driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button")).click();
	}

	@Then("order confirmed")
	public void order_confirmed() {
	    System.out.println("Order confirmed");
	    driver.close();
	}


}
