package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingActiveElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
//It will transfer the control to the element where my control is present
//The returntype of active element is WebElement
	driver.switchTo().activeElement().sendKeys("Selenium");
//	driver.switchTo().activeElement().sendKeys("Selenium"+Keys.TAB+"Java"+Keys.ENTER);
}
}
