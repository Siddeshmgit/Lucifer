package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {
// SOLUTION: driver.switchTo().alert()
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	/*Here we are using SwitchTo and alert method bcz control will be in web page but we shd go to 
	html code so first we are using switchTo() wch is present under TargetLocator interface
	and alert() is present under Alert Interface. */
	driver.switchTo().alert().accept();
	//accept()is used to click on ok button.
}
}
