/*WS to navigate to flipkart application and search for iphone 14 promax in the search page  
 * Print all mob names as well as price. */
package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneNameAndPrice {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("I Phone 14 Pro max"+Keys.ENTER);
	Thread.sleep(2000);
	List<WebElement> allNames = driver.findElements(By.xpath("//div[contains(text(),'Apple iphone')]"));
	List<WebElement> allPrices = driver.findElements(By.xpath("//div[contains(text(),'Apple iphone')])/../../div[2]/div[1]/div[1]"));
	for(int i=0;i<allNames.size();i++) {
		String MobName = allNames.get(i).getText();
		String MobPrices = allPrices.get(i).getText();
		System.out.println(MobName+" ===> "+MobPrices);
	}
}
}
