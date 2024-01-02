package methods_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfQuit {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
    driver.findElement(By.id("tophf")).click();
    Thread.sleep(6000);
    driver.navigate().refresh();
    Thread.sleep(6000);
    driver.navigate().back();
    Thread.sleep(6000);
    driver.close();
    


}


}
