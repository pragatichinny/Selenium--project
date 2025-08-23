package asserts_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Selenium_dev {
	 WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.selenium.dev/");
  }

  @Test
  public void title() {
	  String expectedtitle="Selenium";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation failed");
	  System.out.println("Expected title:"+expectedtitle);
	  System.out.println("Actual Title:"+actualtitle);
  }
  
  @Test
  public void url() {
	  String expectedurl="https://www.selenium.dev/";
	  String actualurl=driver.getCurrentUrl();
	  Assert.assertEquals(actualurl, expectedurl,"Title validation failed");
	  System.out.println("Expected Url:"+expectedurl);
	  System.out.println("Actual Url:"+actualurl);
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
