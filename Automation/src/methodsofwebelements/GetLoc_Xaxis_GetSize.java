package methodsofwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLoc_Xaxis_GetSize {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement u = driver.findElement(By.id("email"));
	WebElement p = driver.findElement(By.xpath("//input[@type='password']"));
	Point u1 = u.getLocation();
	Point p1 = p.getLocation();
	/*getLocation() is used to get the location of a webElement. The returntype is Point class
	 * in which we can use getX() and getY() to get the values of xaxis and yaxis. */
	int xAxis = u1.getX();
	int xAxis1 = p1.getX();
	System.out.println("xAxis of email:"+xAxis);
	System.out.println("xAxis of password:"+xAxis1);
	if(xAxis==xAxis1) {
		System.out.println("Pass: Both text boxes are aligned properly");
	}
	else {
		System.out.println("Fail: Both textboxes are not aligned properly");
	}
  }
}
/*
xAxis of email:780
xAxis of password:797
Fail: Both textboxes are not aligned properly
*/