package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxOfInstaApp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/?hl=en");
		WebElement ele1 = driver.findElement(By.name("username"));
		WebElement ele2 = driver.findElement(By.name("password"));
		int h1 = ele1.getRect().getHeight();
		int h2 = ele2.getSize().getHeight();
		int w1 = ele1.getRect().getWidth();
		int w2 = ele2.getRect().getWidth();
		if (h1==h2&&w1==w2) {
			System.out.println("pass");
			
		} else {
System.out.println("fail");
		}

String t1 = ele1.getAttribute("aria-label");
String t2 = ele2.getAttribute("aria-label");
System.out.println(t1);
System.out.println(t2);
		
	}

}
