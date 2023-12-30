package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAndPromptPopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.automationtesting.in/Alerts.html");
	System.out.println("---------CONFIRMATION POPUP-------------");
	driver.findElement(By.linkText("Alert with OK & Cancel")).click();
	driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	Alert ok = driver.switchTo().alert();
	ok.accept();
	String text = driver.findElement(By.id("demo")).getText();
	System.out.println(text);
	driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	ok.dismiss();
	//dismiss() is used to click cancel
	String text1 = driver.findElement(By.id("demo")).getText();
	System.out.println(text1);
	System.out.println("=============================");
	System.out.println("---------PROMPT POPUP-------------");
	driver.findElement(By.linkText("Alert with Textbox")).click();
	driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	Alert a = driver.switchTo().alert();
	a.sendKeys("Hi");//We are entering values in textbox.
	a.accept();
	String text2 = driver.findElement(By.id("demo1")).getText();
	System.out.println(text2);
	
}
}
/*
---------CONFIRMATION POPUP-------------
You pressed Ok
You Pressed Cancel
=============================
---------PROMPT POPUP-------------
Hello Hi How are you today
*/
