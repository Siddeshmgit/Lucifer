//Without using findElement() enter selenium in google search bar.
package javaScriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutFindElementHandlingActiveEle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("Selenium");
}
}
