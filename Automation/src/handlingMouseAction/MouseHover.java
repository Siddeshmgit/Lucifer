/*Write a script to automate following scenario
 * 1.Trigger vtiger.com
 * 2.MouseHover on resources
 * 3.Click on contact us button present under blore
 * 4.Get the number and print it.
 */

package handlingMouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.vtiger.com/");
	WebElement tab = driver.findElement(By.partialLinkText("Resources"));
	Actions a=new Actions(driver);
	a.moveToElement(tab).perform();
	driver.findElement(By.partialLinkText("Contact Us")).click();
	WebElement contact = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../p[2]"));
	String text = contact.getText();
	System.out.println(text);
}
}
