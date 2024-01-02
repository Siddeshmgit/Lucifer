package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAndPromptPopupQsp {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/alert?sublist=0");
	driver.findElement(By.linkText("Confirm")).click();
	driver.findElement(By.id("buttonAlert5")).click();
	driver.switchTo().alert().dismiss();
	driver.findElement(By.linkText("Prompt")).click();
	driver.findElement(By.id("buttonAlert1")).click();
	Alert a = driver.switchTo().alert();
	a.sendKeys("Pooja");
	a.accept();
	String ans = driver.findElement(By.xpath("//p[@class='pt-2 text-center']")).getText();
	System.out.println(ans);
}
}
//Please reply with yes/no
