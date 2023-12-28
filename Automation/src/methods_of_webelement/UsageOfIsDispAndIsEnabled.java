package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDispAndIsEnabled {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.instagram.com/");
	driver.get("https://www.fb.com/");
	Thread.sleep(2000);
	 WebElement loginBtn = driver.findElement(By.name("login"));
//	 WebElement loginBtn = driver.findElement(By.xpath("//button[@disabled]"));
	//isDisplayed() is used to verify element is displayed or not
	boolean res =loginBtn.isDisplayed();
	if(res) {
		System.out.println("Pass: The Login Button is displayed");
	}else {
		System.out.println("Fail: The Login Button is not displayed");
	}
//isEnabled() is used to verify element is enabled(clickable, type etc) or disabled
	boolean res1 = loginBtn.isEnabled();
	if(res1==true) {
		System.out.println("Pass: The login button is enabled");
	}else {
		System.out.println("Fail: The login button is disabled");
	}
}
}
