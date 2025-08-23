package testNG_practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependTC {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // Test 1: Login
    @Test(priority = 1)
    public void login() throws InterruptedException {
    	 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))).click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userid")))
             .sendKeys("mangalipragati98@gmail.com");
         driver.findElement(By.id("signin-continue-btn")).click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")))
             .sendKeys("Pragati@123");
         driver.findElement(By.id("sgnBt")).click();
         Assert.assertTrue(driver.getPageSource().contains("My eBay"), "Login failed");
    }

    // Test 2: Search Product (depends on login)
    @Test(priority = 2, dependsOnMethods = {"login"})
    public void searchProduct() {
    	WebElement search=driver.findElement(By.id("gh-ac"));
  	  search.sendKeys("watch");
  	  search.sendKeys(Keys.ENTER);

        
        Assert.assertTrue(driver.getTitle().contains("laptop"), "Search failed");
    }

    // Test 3: Logout (depends on searchProduct)
    @Test(priority = 3, dependsOnMethods = {"searchProduct"})
    public void logout() {
  	  driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button/span/span")).click();
  	  driver.findElement(By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[3]/a")).click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
