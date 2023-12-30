package handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedFrame {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/T1.html");
	driver.findElement(By.id("t1")).sendKeys("1");
	driver.switchTo().frame(0);
	//frame(int index) will transfer the control to the frame with specified index.
	driver.findElement(By.id("t2")).sendKeys("2");
	driver.switchTo().frame("f2");
	//frame(String Id/name)will transfer the control to the frame with the specified id/name 
	//attribute in iframe tag.  
	driver.findElement(By.id("t3")).sendKeys("3");
	driver.switchTo().parentFrame();
	//parentFrame() will transfer control to the parent frame.
	driver.findElement(By.id("t2")).sendKeys("4");
	WebElement ele = driver.findElement(By.xpath("//iframe[@src='T3.html']"));
	driver.switchTo().frame(ele);
	//frame(WebElement ele)will transfer the control to the specified webelement address.
	driver.findElement(By.id("t3")).sendKeys("5");
	driver.switchTo().defaultContent();
	//defaultContent() will transfer the control to the main WebPage.
	driver.findElement(By.id("t1")).sendKeys("6");
}
}
