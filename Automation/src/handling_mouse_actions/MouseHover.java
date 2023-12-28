package handling_mouse_actions;

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
	WebElement Resources = driver.findElement(By.partialLinkText("Resources"));
	Actions a=new Actions(driver);
	a.moveToElement(Resources).perform();
	driver.findElement(By.partialLinkText("Contact Us")).click();
WebElement ele = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../p[2]"));
	String text = ele.getText();
	System.out.println(text);
}
}