package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/Demo.html");
	WebElement ele=driver.findElement(By.tagName("a"));
	ele.click();
	driver.navigate().back();
	driver.get("https://www.fb.com");
	driver.navigate().back();
	driver.quit();
}
}
