package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IphoneNameAndPrice {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("Iphone 14 pro max"+Keys.ENTER);
	Thread.sleep(2000);
List<WebElement> allNames = driver.findElements
(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
List<WebElement> allPrices = driver.findElements
(By.xpath("//div[contains(text(),'APPLE iPhone')]/../../div[2]/div[1]/div[1]/div[1]"));
for(int i=0;i<allNames.size();i++) {
	String mobileName = allNames.get(i).getText();
	String mobilePrice = allPrices.get(i).getText();
	System.out.println(mobileName+" ==> "+mobilePrice);
}
	
}
}
