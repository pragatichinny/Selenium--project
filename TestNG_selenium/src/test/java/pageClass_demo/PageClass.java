package pageClass_demo;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageClass {
	WebDriver driver;
	By email=By.id("userid");
	By pass=By.id("pass");
	By cont=By.id("signin-continue-btn");
	By search=By.id("gh-ac");
	By submit=By.id("sgnBt");
	
	public PageClass(WebDriver driver) {
		this.driver=driver;
		WebDriverWait wait;
	}
	
	public void email_in() {
		driver.findElement(email).click();
		//driver.findElement(email).clear();
		driver.findElement(email).sendKeys("mangalipragati98@gmail.com");
	}
	public void pass_in() {
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys("Pragati@123");
	}
	
	public void con_in() {
		driver.findElement(cont).click();
	}
	
	public void submit_in() {
		driver.findElement(submit).click();
	}
	
	public void search_in() {
		driver.findElement(search).click();
		driver.findElement(search).sendKeys("watch");
		driver.findElement(search).sendKeys(Keys.ENTER);
	}
	
	public void multipleSearch_in() throws InterruptedException{
		driver.findElement(search).click();
        String[] searchs = {"Laptop", "iPhone", "Watch", "Bag"};
        for (String item : searchs) {
        	driver.findElement(search).sendKeys(item);
        	driver.findElement(search).sendKeys(Keys.ENTER);
        	Thread.sleep(3000);
        	//search=driver.findElement(By.id("gh-ac"));
        	driver.findElement(search).clear();
            
        }
        }
	
	public void addToCart() throws InterruptedException {
		driver.findElement(search).click();
		driver.findElement(search).sendKeys("headset wireless");
		driver.findElement(search).sendKeys(Keys.ENTER);
		WebElement addtocart=driver.findElement(By.xpath("//*[@id=\"item1d909ffc3d\"]/div/div[1]/div/a/div/img"));
		   addtocart.click();
		   Thread.sleep(3000);
	        
		   ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		   driver.switchTo().window(tabs.get(1));
		   
		   /*JavascriptExecutor jse=(JavascriptExecutor)driver;
		   jse.executeScript("window.scrollBy(0.400)");*/
		   
		   driver.findElement(By.id("atcBtn_btn_1")).click();
		   Thread.sleep(3000);
		   driver.switchTo().window(tabs.get(1));
		   
		   WebElement cart=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a"));
		   cart.click();
	}
	
	public void deleteFromCart() {
		WebElement cartIcon=driver.findElement(By.cssSelector("label[\"Your shopping cart contains 1 items\"]"));
        cartIcon.click();
        WebElement removecart=driver.findElement(By.id("cart-remove-item"));
        removecart.click();
       // driver.findElement(By.cssSelector(".cart-bucket .action-link")).click();
        Assert.assertFalse(driver.getPageSource().contains("headset wireless"));
	}
	
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
	public void changeAddressTest() {
        driver.findElement(By.linkText("Addresses")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("address1")).clear();
        driver.findElement(By.id("address1")).sendKeys("123 New Street");
        driver.findElement(By.id("saveAddress")).click();
        Assert.assertTrue(driver.getPageSource().contains("123 New Street"));
    }
	public void shopByCategoriesTest() throws InterruptedException {
   	 WebElement shopbycat=driver.findElement(By.xpath("//*[@id=\"gh\"]/section/div/div/div/button/span"));
   	 shopbycat.click();
   	 Thread.sleep(2000);
   	 WebElement item=driver.findElement(By.xpath("//*[@id=\"s0-1-4-12-0-1-dialog\"]/div/div/div[1]/div[2]/div[1]/a/h3"));
       item.click();
       Assert.assertTrue(driver.getTitle().contains("Electronics"));
   }
	public void getProductDescription() {
		
        driver.findElement(By.id("gh-ac")).sendKeys("Headphones");
        driver.findElement(By.id("gh-btn")).click();
        driver.findElement(By.cssSelector(".s-item a.s-item__link")).click();
       
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement productImage = driver.findElement(By.cssSelector(".ux-image-carousel-item img"));
        String description = productImage.getAttribute("alt");
        Assert.assertNotNull(description, "Product description not found");
        System.out.println("Product Description: " + description);

        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
	public void shopByAllCategories() {
		driver.findElement(By.id("gh-shop-a")).click();
       // wait.until(ExpectedConditions.elementToBeClickable(By.linkText("See all categories"))).click();
        Assert.assertTrue(driver.getTitle().contains("All Categories"), "All categories page not loaded");
    }
	
	public void changeLanguage() {
		driver.findElement(By.cssSelector("button[aria-label*='Language settings']")).click();
		driver.findElement(By.linkText("Español")).click();
   
        Assert.assertTrue(driver.getPageSource().contains("Iniciar sesión"), "Language not changed to Spanish");
    }

	
	
 }


