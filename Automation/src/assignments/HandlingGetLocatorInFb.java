package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingGetLocatorInFb {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement ele1 = driver.findElement(By.xpath("//label[text()='Female']//../input"));
		
		WebElement ele2 = driver.findElement(By.xpath("//label[text()='Male']//../input"));
		WebElement ele3 = driver.findElement(By.xpath("//label[text()='Custom']//../input"));
//int y1 = ele1.getRect().getY();
		int y1 = ele1.getLocation().getY();
		int y2 = ele2.getLocation().getY();
		int y3 = ele3.getLocation().getY();
		if((y1==y2)&&(y2==y3))
		{
			System.out.println("both text boxes are alligned");
		}else
		{
			System.out.println("not alligned");
		}

}

}
