package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogo {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
WebElement ele = driver.findElement(By.tagName("h2"));
String text = ele.getText();
String size = ele.getCssValue("font-size");
System.out.println("The text present under the logo :"+text);
System.out.println("The size of text present under the logo :"+size);
}
}
