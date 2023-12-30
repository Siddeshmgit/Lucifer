package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfTakesScreenShot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	TakesScreenshot ts=(TakesScreenshot) driver;
	File doc = ts.getScreenshotAs(OutputType.FILE);
	File f=new File("./screenshots/img.png");
	FileUtils.copyFile(doc, f);
	driver.quit();
}
}
