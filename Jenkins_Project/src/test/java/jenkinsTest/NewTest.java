package jenkinsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://www.ebay.com/");
      
  }
}
