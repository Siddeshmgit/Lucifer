package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Hiddedn_Div_popup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	driver.navigate().to("https://www.makemytrip.com/");
	driver.findElement(By.className("commonModal__close")).click();
	driver.findElement(By.xpath("//label[@for='departure']")).click();
	driver.findElement
(By.xpath("(//div[text()='December 2023']/../..//div[@class='dateInnerCell'])[1]")).click();
}
}
