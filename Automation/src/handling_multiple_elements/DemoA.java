package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoA {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/Demo.html");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	WebElement ele = allLinks.get(0); 
	String text = ele.getText();
	System.out.println(text);
}
}
