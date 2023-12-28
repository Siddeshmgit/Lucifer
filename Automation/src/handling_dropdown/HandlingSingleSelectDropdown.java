package handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleSelectDropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement month = driver.findElement(By.id("month"));
	Select s=new Select(month);
	Thread.sleep(2000);
//selectByIndex() it will select the option based upon index of the element
	s.selectByIndex(0);Thread.sleep(2000);
//selectByValue() will select the option which contains the mentioned value
	s.selectByValue("4");Thread.sleep(2000);
//selectByVisibleText will select the option which contains the mentioned visible text
	s.selectByVisibleText("Oct");
//If the values passed for select methods doesn't match with any element it will throw NSEE
	
}
}
