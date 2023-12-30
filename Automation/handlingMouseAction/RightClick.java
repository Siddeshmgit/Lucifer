//Write a script to open link in a new window(Perform right click)
package handlingMouseAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) throws AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement link = driver.findElement(By.linkText("Forgotten password?"));
	Actions a=new Actions(driver);
	a.contextClick(link);
	//When we run there will be no action we have to use perform()
	a.contextClick(link).perform();
	//contextClick() is used to right click in mouse.
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_W);//New window will be open
	//r.keyPress(KeyEvent.vk_T);
}
}
