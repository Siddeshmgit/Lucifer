package methodsofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
	WebElement ele = driver.findElement(By.id("email"));
	ele.clear();//clear() is used to clear the text present in the textbox.
	WebElement ele2 = driver.findElement(By.id("password"));	
	ele2.clear();
	driver.quit();
}
}
