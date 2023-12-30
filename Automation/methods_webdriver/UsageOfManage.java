package methods_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Thread.sleep(6000);// Parameter in milliseconds
	driver.manage().window().maximize();//To maximize the window present in manage().window()
	driver.manage().deleteAllCookies();//Deleting all cookies present in manage()
	Thread.sleep(6000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(6000);
	driver.manage().window().fullscreen();//Full screen is used to full screen the browser
	Thread.sleep(6000);
	driver.manage().window().minimize();//minimize() is used to minimize the browser
	Thread.sleep(6000);
	driver.quit();// To close all the browser
	
}
}
// Magic of automation