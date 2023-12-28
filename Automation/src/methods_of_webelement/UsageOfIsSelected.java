package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
	WebElement checkBox = driver.findElement(By.xpath("//label[text()='Keep me signed in']"));
	checkBox.click();
	Thread.sleep(2000);
	//isSelected() is used to verify element has been selected or not
boolean res = driver.findElement(By.id("filled-in-box")).isSelected();
	if(res) {
		System.out.println("Checkbox is selected");
	}else {
		System.out.println("Checkbox is not selected");
	}
}
}
