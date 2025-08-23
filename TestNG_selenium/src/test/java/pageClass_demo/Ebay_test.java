package pageClass_demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ebay_test {
	WebDriver driver;
	PageClass pg;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        pg=new PageClass(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));        
        driver.get("https://www.ebay.com/");
    }
    
    @Test
    public void login() {
    	driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh");
  	    pg.email_in();
  	    pg.con_in();
  	    pg.pass_in();
  	    pg.submit_in();
    }
   
  @Test
  public void Searches() {
	  pg.search_in();
  }
  
  @Test
  public void testMultipleSearches() throws InterruptedException {
	  pg.multipleSearch_in();
  }
  @Test
  public void addToCart() throws InterruptedException {
	  pg.addToCart();
  }
  @Test
  public void deleteFromCart() throws InterruptedException {
	  pg.deleteFromCart();
  }
  @Test
  public void changeLoginNameTest()  throws InterruptedException {
	  pg.changeLoginNameTest();
  }
  @Test
  public void changeAddressTest() throws InterruptedException {
	  pg.changeAddressTest();
  }
  
  @Test
  public void shopByCategoriesTest() throws InterruptedException {
	  pg.shopByCategoriesTest();
  }
  
  @Test
  public void getProductDescription() throws InterruptedException {
	  pg.getProductDescription();
  }
  
  
  @Test
  public void shopByAllCategories() throws InterruptedException {
	  pg.shopByAllCategories();
  }
  
  @Test
  public void changeLanguage() throws InterruptedException {
	  pg.changeLanguage();
  }
  
}
