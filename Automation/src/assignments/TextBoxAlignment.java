package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxAlignment {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	WebElement emailTbx = driver.findElement(By.name("username"));
	WebElement newPwdTbx = driver.findElement(By.name("password"));
	Dimension d1 = emailTbx.getSize();
	int h1 = d1.getHeight();
	int w1 = d1.getWidth();
	Dimension d2 = newPwdTbx.getSize();
	int h2 = d2.getHeight();
	int w2 = d2.getWidth();
	if(h1==h2&&w1==w2) {
		System.out.println("Pass: Both textbox are of same size");
	}else {
		System.out.println("Fail: Both textbox are not of same size");
	}
	System.out.println(emailTbx.getAttribute("aria-label"));
	System.out.println(newPwdTbx.getAttribute("aria-label"));
}
}
