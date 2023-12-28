package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocAndGetSize {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement unTbx = driver.findElement(By.id("email"));
	WebElement pwdTbx = driver.findElement(By.id("passContainer"));
//getLocation() is used to get the location of a webElement. The returnType is Point class
//in which we can use getX() and getY() to get the values of xAxis and yAxis
	Point p1 = unTbx.getLocation();
	Point p2 = pwdTbx.getLocation();
	int xAxis = p1.getX();
//	int yAxis = p1.getY();
	int xAxis2 = p2.getX();
	if(xAxis==xAxis2) {
		System.out.println("Pass: Both textbox are properly aligned");
	}else {
		System.out.println("Fail: Both textbox are not properly aligned");
	}
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(2000);
	WebElement emailTbx = driver.findElement(By.name("reg_email__"));
	WebElement newPwdTbx = driver.findElement(By.id("password_step_input"));
//getSize() is used to get the size of a webElement. The returnType is Dimension class
//in which we can use getHeight() and getWidth() to get the values of height and width
//getRect() is a combination of getLocation() and getSize() 
//	Rectangle r = emailTbx.getRect();
//	r.getX();r.getHeight();
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
	driver.quit();
}
}
