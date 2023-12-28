package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSERE {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/Demo.html");
//	@01 will be stored in the ele ref var
	WebElement ele = driver.findElement(By.tagName("a"));
//	The address of the ele will be changed to @02
//	driver.navigate().refresh();
	ele.click();
	driver.navigate().back();
//	It will throw SERE since we try to click on the ele with the help of old address
	ele.click();	
}
}
