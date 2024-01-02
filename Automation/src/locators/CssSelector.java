package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/Demo.html");
	//Syntax: tagName[AttributeName='AttributeValue']
	driver.findElement(By.cssSelector("a[id='d1']")).click();
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[name='n2']")).click();
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[class='c1']")).click();
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[class='c1']")).click();
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[href='https://www.jspiders.com']")).click();
	}
}