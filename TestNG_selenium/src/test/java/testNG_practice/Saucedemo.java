package testNG_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Saucedemo {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	}
  @Test
  public void Login() throws InterruptedException {
	  driver.get("https://www.saucedemo.com/v1/");
	  driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		
	  
  }
  
  @Test
  public void AddToCart() throws InterruptedException {
	  driver.get("https://www.saucedemo.com/v1/inventory.html");
	  driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();
	  driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
	  Thread.sleep(3000);
	  
  }
  
  @Test
  public void checkOutFlow() throws InterruptedException {
	  driver.get("https://www.saucedemo.com/v1/inventory.html");
	  driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("first-name")).click();
		driver.findElement(By.id("first-name")).sendKeys("Pragati");
		driver.findElement(By.id("last-name")).click();
		driver.findElement(By.id("last-name")).sendKeys("mangali");
		driver.findElement(By.id("postal-code")).click();
		driver.findElement(By.id("postal-code")).sendKeys("500075");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		driver.findElement(By.cssSelector("#checkout_summary_container > div > div.summary_info > div.cart_footer > a.btn_action.cart_button")).click();
		Thread.sleep(3000);
  }
  @AfterTest
  public void afterTest() {
      driver.quit();
  }
}
