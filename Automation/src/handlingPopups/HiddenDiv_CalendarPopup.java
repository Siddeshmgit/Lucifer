package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDiv_CalendarPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://www.flipkart.com");
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//span[text()='✕']"));
	Thread.sleep(3000);
	ele.click();
	driver.navigate().to("https://www.makemytrip.com/");
	driver.findElement(By.className("commonModal__close")).click();
	driver.findElement(By.xpath("//label[@for='departure']")).click();
	driver.findElement(By.xpath("(//div[text()='December 2023']/../..//div[@class='dateInnerCell'])[1]")).click();
}
}
