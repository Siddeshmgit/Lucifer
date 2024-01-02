package methods_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigate {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(6000);
	driver.navigate().to("https://www.instagram.com/");
	Thread.sleep(6000);
	driver.navigate().back();
	Thread.sleep(6000);
	driver.navigate().refresh();
	Thread.sleep(6000);
	driver.navigate().forward();
	driver.quit();
}
}
