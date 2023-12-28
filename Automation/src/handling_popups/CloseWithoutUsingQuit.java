package handling_popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWithoutUsingQuit {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://secure.indeed.com/");
driver.findElement(By.id("login-google-button")).click();
driver.findElement(By.id("apple-signin-button")).click();
Set<String> allWid = driver.getWindowHandles();
for(String wid:allWid) {
	driver.switchTo().window(wid);
	driver.close();	
}

}
}
