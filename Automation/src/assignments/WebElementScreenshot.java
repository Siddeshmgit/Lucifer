package assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("Layer_1"));
//	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ele.getScreenshotAs(OutputType.FILE);
	File dest=new File("./errorshots/img.png");
	FileUtils.copyFile(temp, dest);
}
}
