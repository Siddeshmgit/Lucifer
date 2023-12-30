package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrames {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/frames/multiple?sublist=2");
	driver.switchTo().frame(0);
	driver.findElement(By.id("email")).sendKeys("poojabiet19@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.id("confirm-password")).sendKeys("123456");
	driver.switchTo().parentFrame();
	WebElement ele = driver.findElement(By.xpath("//iframe[@src='../signin.html']"));
	driver.switchTo().frame(ele);
	driver.findElement(By.id("email")).sendKeys("poojabiet19@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");

}
}
