package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUnderFBlogo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.fb.com");
		WebElement ele1 = driver.findElement(By.xpath("//h2"));
		String value = ele1.getCssValue("font-size");
        String text = ele1.getText();
        System.out.println("text under fb logo:"+text+" and its font size is: "+value);

	}

}
