package handling_disabled_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*	Sample HTML Code
 * T1:<input type='text' id='t1'>
	<br>
	T2:<input type='text' id='t2' disabled>			-->disabled.html
 */
public class EneteringTextIntoDisabledTextbox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/disabled.html");
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	driver.findElement(By.id("t1")).sendKeys("QSP");
	WebElement ele = driver.findElement(By.id("t2"));
	if(ele.isEnabled()) {
		driver.findElement(By.id("t2")).sendKeys("JSP");
	}else {
		jse.executeScript("document.getElementById('t2').value='JSP'");
	}
//In order to clear the text in the textbox which is disabled
	jse.executeScript("document.getElementById('t2').value=''");
//In order to click on the element which is disabled
//	jse.executeScript("document.getElementById('t2').click()");

}
}
