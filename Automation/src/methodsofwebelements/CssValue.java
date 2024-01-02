package methodsofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.linkText("Forgotten password?"));
	/*getCssValue(String property name)is used to get the css value(color,font size,font type) of a webelement.
	 * It also takes the propertyname as parameter since one webelement contains more than one property.
	 * It will return null if there is no mentioned property.  */
	String color = ele.getCssValue("color");
	System.out.println("The color of forgotpassword link:"+color);
	driver.quit();
}
}
//The color of forgotpassword link:rgba(24, 119, 242, 1)