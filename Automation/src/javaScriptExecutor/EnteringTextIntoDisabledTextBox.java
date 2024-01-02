package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringTextIntoDisabledTextBox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/Disabled.html");
	driver.findElement(By.id("t1")).sendKeys("QSP");
	JavascriptExecutor jse=(JavascriptExecutor) driver;//Non-primitive typecasting
	jse.executeScript("document.getElementById('t2').value='JSP'");
}
}
