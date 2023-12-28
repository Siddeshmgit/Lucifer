package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropdowns {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//Launching facebook
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement year = driver.findElement(By.id("year"));
	Select s=new Select(year);
	Thread.sleep(2000);
	s.deselectByIndex(12);Thread.sleep(2000);//UnsupportedOperationException
	s.selectByValue("1947");Thread.sleep(2000);
	s.selectByVisibleText("2000");
	
}
}
