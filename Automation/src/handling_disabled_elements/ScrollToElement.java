package handling_disabled_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com/");
	WebElement ele = driver.findElement(By.xpath("//span[text()='Editor’s Picks']"));
	int yAxis = ele.getLocation().getY();
//	int yAxis = ele.getRect().getY();
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,"+yAxis+")");
}
}
