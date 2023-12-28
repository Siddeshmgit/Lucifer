package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPrintPopup {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.selenium.dev/downloads/");
	Robot r=new Robot();
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);
	for(int i=0;i<4;i++) {
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_1);Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_MINUS);Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_2);Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);Thread.sleep(1000);
}
}
