package handlingPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	options.addArguments("--start-maximized");
	driver.get("https://www.yatra.com/");

}
}
