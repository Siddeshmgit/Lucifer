package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.yatra.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.alertIsPresent());
		//alertIsPresent() is used to check whether alert popup is present or not.
		
	}
}
