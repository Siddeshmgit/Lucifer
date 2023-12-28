package handling_popups;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
public static void main(String[] args) throws AWTException, InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--incognito","--disable-notifications","--start-maximized");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/browserNot?sublist=0");
	driver.findElement(By.id("browNotButton")).click();
//	Robot r=new Robot();Thread.sleep(2000);
//	r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
//	r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
//	r.keyPress(KeyEvent.VK_ENTER);
	//ChromeOptions options=new ChromeOptions();
	//options.addArguments("--disable-notifications");
	//WebDriver driver=new ChromeDriver(options);
	//driver.manage().window().maximize();
	//driver.get("https://www.yatra.com/");
}
}
//WebDriver driver=new ChromeDriver();--> will open the browser in default settings
//
//WebDriver driver=new ChromeDriver(options); will open the browser in modified settings





