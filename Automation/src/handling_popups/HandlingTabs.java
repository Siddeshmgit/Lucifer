package handling_popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingTabs {
public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications","--start-maximized");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://pib.gov.in/");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().dismiss();
	driver.findElement(By.linkText("Ministry of Commerce & Industry")).click();
	driver.switchTo().alert().accept();
Set<String> allWid = driver.getWindowHandles();
System.out.println(allWid.size());
for (String wid : allWid) {	
	driver.switchTo().window(wid);
}	
	String title = driver.getTitle();
	System.out.println(title);
}
}
