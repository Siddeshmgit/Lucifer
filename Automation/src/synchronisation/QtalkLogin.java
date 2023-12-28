package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QtalkLogin {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//implicit wait will work for all the findElement statement in the script
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://chat.qspiders.com/");
	driver.findElement(By.name("username")).sendKeys("9901801189");
	driver.findElement(By.name("password")).sendKeys("Ishank1234$");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//button[text()='logout']")).click();
	driver.findElement(By.xpath("//button[text()='Ok']")).click();
}
}
