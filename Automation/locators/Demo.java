package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/Demo.html");
	WebElement ele=driver.findElement(By.tagName("a"));
	ele.click();
	driver.navigate().back();
	driver.findElement(By.id("d2")).click();
	driver.navigate().back();
	driver.findElement(By.name("n1")).click();
	driver.navigate().back();
	driver.findElement(By.className("c2")).click();//NoSuchElementException
	driver.findElement(By.linkText("Qspiders")).click();//linkText("Complete tagText of a link")(equals())
	driver.navigate().back();
	driver.findElement(By.partialLinkText("Jsp")).click();//partialLinkText("partialTagText of a link")(Contains())
	//whenever the tagText is changing partially.
	driver.navigate().back();
	driver.quit();
}
}
