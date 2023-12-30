package handlingMouseAction;

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
	driver.get("https://actiTime.com/");
	Actions a=new Actions(driver);
	a.scrollByAmount(0,8000).perform();
	//scrollByAmount(int X,int Y)which will scroll for specified amount in the web page.
	WebElement ele = driver.findElement(By.xpath("//h2[text()='Make data-driven decisions']"));
    a.scrollToElement(ele).perform();
    //scrollToelement(web element)will scroll for specified amount in the webPage.
    }
}
