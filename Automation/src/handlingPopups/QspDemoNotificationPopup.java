//Write a script to click on allow button in notification popup in Qspiders demo app.
package handlingPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspDemoNotificationPopup {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/browserNot?sublist=0");
	driver.findElement(By.id("browNotButton")).click();
	Robot r= new Robot();Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);Thread.sleep(2000);
	}
}
