package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExplicitWait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chats.qspiders.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	driver.findElement(By.name("username")).sendKeys("990181189");
	driver.findElement(By.name("password")).sendKeys("Ishank1234$");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	wait.until(ExpectedConditions.urlToBe("https://chat.qspiders.com/student-dashboard"));
	//urlToBe is used to wait until given url is loaded.
	wait.until(ExpectedConditions.titleIs("Qtalk"));
	//titleIs is used to wait until given title is fetched.
	String url = driver.getCurrentUrl();
	System.out.println(url);
}
}
