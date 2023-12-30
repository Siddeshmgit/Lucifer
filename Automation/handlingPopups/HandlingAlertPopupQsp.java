package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopupQsp {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/alert?sublist=0");
	driver.findElement(By.id("buttonAlert2")).click();
    Alert ok = driver.switchTo().alert();
    /*with the help of alert() we can use 4 methods
     * accept()-to click on ok button
     * dismiss()-to click on cancel button
     * getText()-to get the text from popup
     * sendKeys()-to enter the text
     */
    ok.accept();
    String text = driver.findElement(By.xpath("//p[@class='text-center pt-2']")).getText();
    System.out.println(text);
}
}
//Alert Button Clicked