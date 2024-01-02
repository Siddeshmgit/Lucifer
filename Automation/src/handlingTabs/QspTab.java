package handlingTabs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspTab {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/browser/multipleTabs?sublist=3");
	driver.findElement(By.id("browserButton2")).click();
	Set<String> allWid = driver.getWindowHandles();
	System.out.println(allWid.size());
	for (String wid : allWid) {
		driver.switchTo().window(wid);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
  }
}
