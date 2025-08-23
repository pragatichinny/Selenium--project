
package sele_package;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
public class FirstScript{
public static void main(String[] args) throws InterruptedException{
System.out.println("this is my first automation Script");

WebDriver driver=new ChromeDriver();

driver.get("https://www.selenium.dev");
System.out.println("page load successfully");

String expectedurl="https://www.selenium.dev/";
String actualurl=driver.getCurrentUrl();
System.out.println("Expected url:"+expectedurl);
System.out.println("Actual url:"+actualurl);

driver.manage().window().maximize();
Thread.sleep(5000);
if(expectedurl.equals(actualurl)){
System.out.println("url validation successful");
}else{
System.out.println("url validation failed");
}
driver.close();

}
}

