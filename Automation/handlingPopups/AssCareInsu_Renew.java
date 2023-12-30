/*write a script to navigate into https://www.careinsurance.com/rhicl/proposalcp/renew/index-care
 *1.Enter policy no as 123.
 *2.click on dob
 *3.Select apr 94 19 month year and date.
 *4.Enter contact number 9876543210 and click on lets renew button.
 * 
 */
package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssCareInsu_Renew {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.name("policynumber")).sendKeys("123");
	driver.findElement(By.id("dob")).click();
	WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select sel=new Select(month);
	Thread.sleep(2000);
	sel.selectByIndex(3);
	WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select sel1=new Select(year);
	Thread.sleep(2000);
	sel1.selectByValue("1994");
	driver.findElement(By.xpath("(//a[@class='ui-state-default'])[19]")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Lets Renew']")).click();
	WebElement error = driver.findElement(By.id("policynumberError"));
	error.isDisplayed();
	String text = error.getText();
	System.out.println(text);
	}
}
//Please enter valid Policy No.