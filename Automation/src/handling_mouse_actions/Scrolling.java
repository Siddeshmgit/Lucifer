package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://actitime.com/");
	WebElement target = driver.findElement(By.xpath("//h2[text()='Make data-driven decisions']"));
	Actions a=new Actions(driver);
//scrollByAmount(int x, int y) which will scroll for specified amount in the webpage
	a.scrollByAmount(100, 8000).perform();
//scrollToElement(WebElement)  will scroll the webpage until element is visible
	a.scrollToElement(target).perform();
}
}
