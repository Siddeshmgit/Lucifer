package handling_mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement link = driver.findElement(By.linkText("Forgotten password?"));
	Actions a=new Actions(driver);
	a.contextClick(link).perform();
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_W);
}
}
