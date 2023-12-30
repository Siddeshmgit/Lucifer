
package handlingPopups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUploadPopupQsp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/fileUpload?sublist=0");
	Thread.sleep(2000);
	File f=new File("C:\\\\Users\\\\Home\\\\Desktop\\\\resume.docx");
	String absPath = f.getAbsolutePath();
	System.out.println(absPath);
	driver.findElement(By.id("fileInput")).sendKeys(absPath);
}
}
