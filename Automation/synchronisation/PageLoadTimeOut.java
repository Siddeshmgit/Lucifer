package synchronisation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Timeouts decTime = driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
	System.out.println(decTime);
	//pageLoadTimeout() is used to decide how many seconds page should take to load.
	Duration loadTime = driver.manage().timeouts().getPageLoadTimeout();
	//getPageLoadTimeout() is used to check how many seconds page is taking to load. 
	System.out.println(loadTime);
	driver.get("https://www.ajio.com/");
}
}
