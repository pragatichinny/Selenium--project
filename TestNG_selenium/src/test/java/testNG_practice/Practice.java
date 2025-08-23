package testNG_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {
	 WebDriver driver;
	 WebDriverWait wait;
	 @BeforeTest
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        driver.get("https://www.ebay.com/");
	 }
  @Test(enabled = true)
  public void login() {
	  wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userid")))
          .sendKeys("mangalipragati98@gmail.com");
      driver.findElement(By.id("signin-continue-btn")).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")))
          .sendKeys("Pragati@123");
      driver.findElement(By.id("sgnBt")).click();
      Assert.assertTrue(driver.getPageSource().contains("My eBay"), "Login failed");
  }
  @Test(enabled = false)
  public void logout() {
	  driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button/span/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[3]/a")).click();
	  
  }
  @AfterTest
  public void afterTest() {
      driver.quit();
  }
}

