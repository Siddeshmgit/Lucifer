package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyAppleWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
	Set<String> allid = driver.getWindowHandles();
////	for (String id : allid) {
////		driver.switchTo().window(id);
////	   String title = driver.getTitle();
////	   if (title.contains("Apple")) {
////		   driver.close();
////	   }
//	   if (!title.contains("Apple")) {
//	   driver.close();
//  }
//	}
	Iterator<String> i = allid.iterator();
	while (i.hasNext()) {
		String id = i.next();
		driver.switchTo().window(id);
		 String title = driver.getTitle();
   if (title.contains("Apple")) {
	   driver.close();
		
	}
	  

	}
	}

}
