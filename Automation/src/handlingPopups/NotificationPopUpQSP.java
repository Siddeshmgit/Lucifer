package handlingPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUpQSP {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications","--start-maximized","--incognito");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://demoapps.qspiders.com/browserNot?sublist=0");
	driver.findElement(By.id("browNotButton")).click();
}
}
