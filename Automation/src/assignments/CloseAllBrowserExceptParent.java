package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserExceptParent {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-google-button")).click();
	Set<String> allWid = driver.getWindowHandles();
	String parent = driver.getWindowHandle();
	int count=allWid.size();
	System.out.println(count);
	for (String wid : allWid) {
    	driver.switchTo().window(wid);
    	String title = driver.getTitle();
    	System.out.println(title);
    	if(!(wid.equals(parent))) {
    		driver.close();
    	}
    }
}
}
