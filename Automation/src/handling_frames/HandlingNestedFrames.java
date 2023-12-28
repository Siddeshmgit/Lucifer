package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingNestedFrames {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/T1.html");
	driver.findElement(By.id("t1")).sendKeys("1");
//frame(int index) will transfer the control to the frame with the specified index
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("2");
//frame(String id/name) will transfer the control to the frame with the
//specified id/name attribute in iframe tag
	driver.switchTo().frame("f2");
	driver.findElement(By.id("t3")).sendKeys("3");
//parentFrame() will transfer the control to the previous/parent frame
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t2")).sendKeys("4");
	WebElement ele = driver.findElement(By.xpath("//iframe[@src='T3.html']"));
//frame(WebElement ele) will transfer the control for the specified webelement(iframe) address
	driver.switchTo().frame(ele);
	driver.findElement(By.id("t3")).sendKeys("5");
//defaultContent() will transfer the control to the main webpage
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t1")).sendKeys("6");
}
}
