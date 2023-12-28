package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmit {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.fb.com/");
//submit() is also used to click on the element
//In order to use submit() the element should be present under form tag and it should have the
//attribute type='submit'
	WebElement loginBtn = driver.findElement(By.name("login"));
	loginBtn.submit();
}
}
