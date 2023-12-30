package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyAppleBrowser {
public static void main(String[] args) {
	String ExpectedTitle = "Apple";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-google-button")).click();
	Set<String> allWid = driver.getWindowHandles();
	String parent = driver.getWindowHandle();
	for (String wid : allWid) {
	driver.switchTo().window(wid);
	String actualTitle = driver.getTitle();	
	if(actualTitle.contains(ExpectedTitle)) {
		driver.close();
	}
	}
}
}
