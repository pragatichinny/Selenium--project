package testNG_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DummyLoginPage {
	 WebDriver driver;
	 @BeforeClass
	    public void setUp() {
	        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://example.com/dummy-login"); 
	    }
  @Test
 @Parameters({"username","password"})
  public void loginTest(@Optional("admin") String username,
          @Optional("admin123") String password) {
	  WebElement userField = driver.findElement(By.id("username"));
      userField.clear();
      userField.sendKeys(username);
      
      WebElement passField = driver.findElement(By.id("password"));
      passField.clear();
      passField.sendKeys(password);
      
      driver.findElement(By.id("loginBtn")).click();
  }
  @AfterClass
  public void tearDown() {
      driver.quit();
  }
}
