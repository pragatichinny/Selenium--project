package sele_package;
 
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Web_element_zeroban{
public static void loginStep(WebDriver driver,String user1,String pass1,String testexecution) throws InterruptedException{
System.out.println("Manual test-->"+testexecution);

WebElement user=driver.findElement(By.id("user_login"));
user.sendKeys(user1);

//locating password
WebElement pass=driver.findElement(By.id("User_password"));
pass.sendKeys(pass1);

//click on singin button
driver.findElement(By.name("submit")).click();
Thread.sleep(5000);
}
public static void main(String[] args) throws InterruptedException{
WebDriver driver=new ChromeDriver();
driver.get("http://Zero.webappsecurity.com/login.html");
System.out.println("Welcome to zero bank login");
loginStep(driver,"865645","password","Unabale to login");
loginStep(driver,"username","9878745","Unabale to login");
loginStep(driver,"8659jhfd","ngdj56465","Unabale to login");
loginStep(driver,"","","Unabale to login");
loginStep(driver,"username","password","Unabale to login");
}
}
