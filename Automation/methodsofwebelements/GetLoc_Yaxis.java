/*Open the FB browser click on create new account link.Give Thread.sleep for 2 seconds. Find all 
 * 3 radio button using Independent and dependent xpath.
 * Get yaxis of all 3 elements check whether all 3 are properly aligned or not. */
package methodsofwebelements;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLoc_Yaxis {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@rel='async']")).click();
	WebElement f1 = driver.findElement(By.xpath("//label[text()='female']"));
		int f2 = f1.getLocation().getY();
	int m1 = driver.findElement(By.xpath("//label[.='Male']")).getLocation().getY();
	int c1 = driver.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();
	if(f2==m1&&m1==c1) {
		System.out.println("All 3 radio button are aligned properly");
		}
	else {
		System.out.println("All 3 radio button are not aligned properly");
	}
	driver.quit();
}
}
