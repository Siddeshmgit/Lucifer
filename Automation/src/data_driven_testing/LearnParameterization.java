package data_driven_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameterization {
	@Parameters({"url","un","pwd"})
	@Test
public void login(String url,String un,String pwd) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
