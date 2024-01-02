package handlingPopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("apple-signin-button")).click();
	Set<String> wid = driver.getWindowHandles();//We have to fetch the window id of child window
	for (String s : wid) {
		driver.switchTo().window(s);//We are transfering control to child window.
		String title = driver.getTitle();
		System.out.println(title);
		}
	driver.findElement(By.id("account_name_text_field")).sendKeys("ABC");
}
}
