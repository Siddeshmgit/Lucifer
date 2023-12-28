package handling_popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindowPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-google-button")).click();
		String pwid = driver.getWindowHandle();
		Set<String> allWid = driver.getWindowHandles();
		System.out.println(pwid);
		int count = allWid.size();
		System.out.println(count);
		for(String wid:allWid) {
			driver.switchTo().window(wid);
			String title = driver.getTitle();
			System.out.println(title);
		}
		driver.findElement(By.id("account_name_text_field")).sendKeys("ABC");
	}
}
