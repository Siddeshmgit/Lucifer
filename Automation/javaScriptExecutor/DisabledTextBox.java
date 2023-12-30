package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextBox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/Disabled.html");
	driver.findElement(By.id("t1")).sendKeys("QSP");
	JavascriptExecutor jse=(JavascriptExecutor) driver;//Non-primitive typecasting
	WebElement ele = driver.findElement(By.id("t2"));
	if(ele.isEnabled()) {
		 driver.findElement(By.id("t2")).sendKeys("JSP");
	}else {
		jse.executeScript("document.getElementById('t2').value='JSP'");	
	}
	//To clear the text in disabled textbox.
	 jse.executeScript("  document.getElementById('t2').value=''");
	//To click on disabled button
	 jse.executeScript(" document.getElementById('t2').click()");
}
}
