package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintURL {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Qspiders"+Keys.ENTER);
	Thread.sleep(2000);
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	int count = allLinks.size();
	System.out.println("Total linktext and url present :"+count);
	for(int i=0;i<count;i++) {
		String text = allLinks.get(i).getText();//We will get all the links
		System.out.println(text);
	}
	for(int i=0;i<count;i++) {
		String links = allLinks.get(i).getAttribute("href");
		System.out.println(links);
	}
}
}
