package sele_package;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
public class FirstScript1{
public static void main(String[] args) throws InterruptedException{
System.out.println("this is my first automation Script");


WebDriver driver=new ChromeDriver();
//set webApplication url
driver.get("https://www.selenium.dev");
System.out.println("page load successfully");

String expectedtitle="Selenium";
String actualtitle=driver.getTitle();
System.out.println("Expected Title:"+expectedtitle);
System.out.println("Actual Title:"+actualtitle);

driver.manage().window().maximize();
Thread.sleep(5000);
if(expectedtitle.equals(actualtitle)){
System.out.println("title validation successful");
}else{
System.out.println("title validation failed");
}
driver.close();

}
}



