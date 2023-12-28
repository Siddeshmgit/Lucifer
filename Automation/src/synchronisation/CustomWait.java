package synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chat.qspiders.com/");
	driver.findElement(By.name("username")).sendKeys("9901801189");
	driver.findElement(By.name("password")).sendKeys("Ishank1234$");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	for(int i=0;i<100;i++){
	try {
		driver.findElement(By.xpath("//button[text()='logout']")).click();
		break;
	}catch(NoSuchElementException e) {//catch(Exception e)
		System.out.println(i);
	}}
}
}
