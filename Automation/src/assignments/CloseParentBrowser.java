package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentBrowser {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-google-button")).click();
	driver.close();
}
}
/*
for (String wid : allWid) {
driver.switchTo().window(wid);
String title = driver.getTitle();
System.out.println(title);
if(wid.equals(parent)) {
	driver.close();
}*/