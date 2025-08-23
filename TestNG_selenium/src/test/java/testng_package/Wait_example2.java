package testng_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wait_example2 {
	WebDriver driver;
	
  @Test
  public void Explicit_wait() {
	  driver=new ChromeDriver();
	  driver.get("http://zero.webappsecurity.com/login.html");
	  
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  
	  WebElement user=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));
	  user.sendKeys("username");
	  driver.close();
  }
}
