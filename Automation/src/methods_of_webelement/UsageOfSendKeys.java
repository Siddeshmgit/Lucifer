package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.fb.com");
WebElement txtBox = driver.findElement(By.id("email"));
//sendKeys() is used to enter the text inside a textbox. It will take String as parameter
Thread.sleep(2000);
txtBox.sendKeys("Abc@gmail.com");
Thread.sleep(2000);
//In order to click on Keys we use Keys.(static_final_variables) in sendKeys()
txtBox.sendKeys(Keys.CONTROL +"AC");
Thread.sleep(2000);
driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"V");
}
}
