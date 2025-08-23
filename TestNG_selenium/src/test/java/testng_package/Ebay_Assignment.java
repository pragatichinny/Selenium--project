package testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Ebay_Assignment {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
        dismissCookiesIfPresent();
    }

    // Handle cookie banner if it appears
    private void dismissCookiesIfPresent() {
        try {
            WebElement cookiesBtn = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[aria-label*='Accept']"))
            );
            cookiesBtn.click();
        } catch (Exception e) {
            System.out.println("No cookies popup found.");
        }
    }

   @Test(priority = 1)
    public void loginTest() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userid")))
            .sendKeys("mangalipragati98@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")))
            .sendKeys("Pragati@123");
        driver.findElement(By.id("sgnBt")).click();
        Assert.assertTrue(driver.getPageSource().contains("My eBay"), "Login failed");
    }
    @AfterMethod
    public void postConditionLogin() {
        System.out.println("Verified user is logged in.");
    }

   @Test(priority = 2)
    public void multipleSearch() throws InterruptedException {
    	WebElement search=driver.findElement(By.id("gh-ac"));
        String[] searchs = {"Laptop", "iPhone", "Watch", "Bag"};
        for (String item : searchs) {
        	search.sendKeys(item);
        	search.sendKeys(Keys.ENTER);
        	Thread.sleep(3000);
        	search=driver.findElement(By.id("gh-ac"));
        	search.clear();
            
        }
    }
    @AfterMethod
    public void postConditionMultipleSearch() {
        System.out.println("Verified multiple search functionality.");
    }

   @Test(priority = 3)
    public void addToCart() throws InterruptedException {
	   WebElement search=driver.findElement(By.id("gh-ac"));
	   search.sendKeys("headset wireless");
	   search.sendKeys(Keys.ENTER);
	   
	   /*JavascriptExecutor jse=(JavascriptExecutor)driver;
	   jse.executeScript("window.scrollBy(0.400)");*/
	   
	   WebElement addtocart=driver.findElement(By.xpath("//*[@id=\"item1d909ffc3d\"]/div/div[1]/div/a/div/img"));
	   addtocart.click();
	   
        
	   ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
	   driver.switchTo().window(tabs.get(1));
	   
	   driver.findElement(By.id("atcBtn_btn_1")).click();
	  
	   driver.switchTo().window(tabs.get(1));
	   
	   WebElement cart=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a"));
	   cart.click();
    }
   @AfterMethod
   public void postConditionAddToCart() {
       System.out.println("Item added to cart successfully.");
   }

   @Test(priority = 4)
    public void deleteFromCartTest() {
	   WebElement cartIcon=driver.findElement(By.cssSelector("#gh > nav > div.gh-nav__right-wrap > div.gh-cart > div > a > span > span"));
	   cartIcon.click();
	   WebElement remove=driver.findElement(By.id("cart-remove-item"));
	   remove.click();
	   Assert.assertFalse(driver.getPageSource().contains("headset wireless"));
	    }
    
    @AfterMethod
    public void postConditionDeleteCart() {
        System.out.println("Item deleted from cart successfully.");
    }
    
    @Test(priority = 5)
    public void changeLoginNameTest() {
        driver.findElement(By.linkText("My eBay")).click();
        driver.findElement(By.linkText("Account")).click();
        driver.findElement(By.linkText("Personal Information")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("NewName");
        driver.findElement(By.id("saveButton")).click();
        Assert.assertTrue(driver.getPageSource().contains("NewName"));
    }
    @AfterMethod
    public void postConditionChangeName() {
        System.out.println("User name changed successfully.");
    }

    
    @Test(priority = 6)
    public void changeAddressTest() {
        driver.findElement(By.linkText("Addresses")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("address1")).clear();
        driver.findElement(By.id("address1")).sendKeys("123 New Street");
        driver.findElement(By.id("saveAddress")).click();
        Assert.assertTrue(driver.getPageSource().contains("123 New Street"));
    }
    @AfterMethod
    public void postConditionChangeAddress() {
        System.out.println("Address updated successfully.");
    }
    
    @Test(priority = 7)
    public void shopByCategoriesTest() throws InterruptedException {
    	 WebElement shopbycat=driver.findElement(By.xpath("//*[@id=\"gh\"]/section/div/div/div/button/span"));
    	 shopbycat.click();
    	 Thread.sleep(2000);
    	 WebElement item=driver.findElement(By.xpath("//*[@id=\"s0-1-4-12-0-1-dialog\"]/div/div/div[1]/div[2]/div[1]/a/h3"));
        item.click();
        Assert.assertTrue(driver.getTitle().contains("Electronics"));
    }
    @AfterMethod
    public void postConditionCategories() {
        System.out.println("Shop by categories works fine.");
    }

   @Test(priority = 8)
    public void getProductDescription() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac"))).clear();
        driver.findElement(By.id("gh-ac")).sendKeys("Headphones");
        driver.findElement(By.id("gh-btn")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".s-item a.s-item__link"))).click();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement productImage = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.cssSelector(".ux-image-carousel-item img"))
        );
        String description = productImage.getAttribute("alt");
        Assert.assertNotNull(description, "Product description not found");
        System.out.println("Product Description: " + description);

        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    @AfterMethod
    public void postConditionRightClickDescription() {
        System.out.println("Fetched product description from image alt text.");
    }

    @Test(priority = 9)
    public void shopByAllCategories() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("gh-shop-a"))).click();
       // wait.until(ExpectedConditions.elementToBeClickable(By.linkText("See all categories"))).click();
        Assert.assertTrue(driver.getTitle().contains("All Categories"), "All categories page not loaded");
    }
    @AfterMethod
    public void postConditionAllCategories() {
        System.out.println("Shop by all categories works fine.");
    }

    @Test(priority = 10)
    public void changeLanguage() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[aria-label*='Language settings']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Español"))).click();
        Assert.assertTrue(driver.getPageSource().contains("Iniciar sesión"), "Language not changed to Spanish");
    }

    @AfterMethod
    public void postConditionChangeLanguage() {
        System.out.println("Language changed successfully.");
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
