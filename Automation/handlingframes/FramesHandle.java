package handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/T1.html");
	driver.findElement(By.id("t1")).sendKeys("A");
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("B");
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t1")).sendKeys("C");
	driver.switchTo().frame("f1");
	driver.findElement(By.id("t2")).sendKeys("D");
}
}
