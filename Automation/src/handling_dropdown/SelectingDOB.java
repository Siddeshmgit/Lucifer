package handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingDOB {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement day = driver.findElement(By.id("day"));
	WebElement month = driver.findElement(By.id("month"));
	WebElement year = driver.findElement(By.id("year"));
	Select s1=new Select(day);
	Select s2=new Select(month);
	Select s3=new Select(year);
	Thread.sleep(2000);
	s1.selectByIndex(4);Thread.sleep(2000);
	s2.selectByValue("11");Thread.sleep(2000);
	s3.selectByVisibleText("2000");
}
}
