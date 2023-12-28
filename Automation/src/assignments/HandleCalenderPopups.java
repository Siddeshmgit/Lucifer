package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalenderPopups {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Thread.sleep(1000);
		Select s1=new Select(month);
		Thread.sleep(1000);
		s1.selectByValue("9");
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Thread.sleep(1000);
		Select s=new Select(year);
		Thread.sleep(1000);
		s.selectByVisibleText("1991");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//select)[1]//..//..//../table/tbody/tr[1]/td[5]")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9972566747")	;
		driver.findElement(By.id("renew_policy_submit")).click();
		
		 WebElement ele = driver.findElement(By.id("policynumberError"));
		 if (ele.isDisplayed()) {
			 String text=ele.getText();
						System.out.println(text);
		}
		 else
		 {
			 System.out.println("not displayed");
		 }
		 
	
	}

}
