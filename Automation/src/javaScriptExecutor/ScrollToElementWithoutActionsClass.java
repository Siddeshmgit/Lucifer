package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElementWithoutActionsClass {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.bbc.com/");
	WebElement ele = driver.findElement(By.xpath("//span[text()='Editor’s Picks']"));
	int YAxis = ele.getLocation().getY();
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,"+YAxis+")");
}
}
