package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingSynchronisationOfFindELement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chat.qspiders.com");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.findElement(By.name("username")).sendKeys("9901801189");
	driver.findElement(By.name("password")).sendKeys("Ishank1234$");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='logout']")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='logout']")));
	driver.findElement(By.xpath("//button[text()='logout']")).click();
}
}
