package testNG_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTimes {
	 WebDriver driver;
	    WebDriverWait wait;
	    @BeforeTest
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        driver.get("https://www.ebay.com/");
	 }
  @Test(invocationCount = 5)//test will run 5 times
  public void multiplerun() {
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  search.clear();
	  search.sendKeys("watch");
	  search.sendKeys(Keys.ENTER);
	  
  }
  @AfterTest
  public void afterTest() {
      driver.quit();
  }
}
