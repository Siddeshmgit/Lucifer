package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingSynOfFindElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chats.qspiders.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	driver.findElement(By.name("username")).sendKeys("990181189");
	driver.findElement(By.name("password")).sendKeys("Ishank1234$");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
  /*wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='logout']")));
   PresenceOfElementLocated() is used to locate the element.
 */
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='logout'")));
	//visibilityOfElementLocated() is used to locate the element.
	driver.findElement(By.xpath("//button[text()='logout'")).click();
}
}
