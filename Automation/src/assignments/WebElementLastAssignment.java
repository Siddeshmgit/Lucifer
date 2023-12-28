package assignments;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLastAssignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(Keys.SHIFT+"dinga"+Keys.SHIFT+"@123");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("pass")).clear();
		WebElement link= driver.findElement(By.linkText("Create new account"));
	if(link.isDisplayed()&&link.isEnabled())
		{
			System.out.println("create new account is displayed nd enable");}
		else {
			System.out.println("fail");}
	String text = link.getText();
	String tag = link.getTagName();
	String value = link.getAttribute("role");
	System.out.println(text);
	System.out.println(tag);
	System.out.println(value);
	WebElement logo = driver.findElement(By.xpath("//img[1]"));
	Rectangle log = logo.getRect();
	int x = log.getX();int y = log.getY();int w = log.getWidth();int h = log.getHeight();
	System.out.println("xaxies:"+x+" yaxies:"+y+" width:"+w+" height"+h);
	driver.findElement(By.linkText("Create new account")).click();
	WebElement sub = driver.findElement(By.name("websubmit"));
	String colour = sub.getCssValue("background-color");
	System.out.println(colour);
	sub.submit();
	//driver.navigate().forward();
	driver.findElement(By.xpath("//input[@value='1']")).click();
	boolean selc = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
	if(selc)
	{
		System.out.println("pass");}
	else
		System.out.println("fail");}
	
	

}
