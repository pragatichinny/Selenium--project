package testng_package;

import org.testng.annotations.Test;

import graphql.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Ebay_testng {
	WebDriver driver;
  @Test//2
  public void search() {
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  search.sendKeys("Watch");
	  search.sendKeys(Keys.ENTER);
	  driver.navigate().refresh();
  } 
	  @Test
	  public void search1() {
		  WebElement search=driver.findElement(By.id("gh-ac"));
		  search.clear();
		  search.sendKeys("phone");
		  search.sendKeys(Keys.ENTER);
		  driver.navigate().refresh();	  
	  
	  }
	  @Test//2
	  public void search2() {
		  WebElement search=driver.findElement(By.id("gh-ac"));
		  search.clear();
		  search.sendKeys("bag");
		  search.sendKeys(Keys.ENTER);
		  driver.navigate().refresh();
	  }
  @BeforeTest//1 priority
  public void beforeTest() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
  }

  @AfterTest//3
  public void afterTest() {
	  Assert.assertTrue(true,"Search button is not working");
	  driver.close();
  }

}
