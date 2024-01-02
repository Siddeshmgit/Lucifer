package methodsofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {//Return type is void
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.linkText("Help"));
	ele.click();// click() is used to click on a WebElement and in Static web page it will scroll and click on the element
	
	driver.quit();
}

}
