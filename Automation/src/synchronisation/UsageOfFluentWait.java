package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class UsageOfFluentWait {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	FluentWait wait=new FluentWait<>(driver);
	wait.withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1));
	driver.get("https://opensource-demo.orangehrmlive.com");
//	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("admin");
}
}
