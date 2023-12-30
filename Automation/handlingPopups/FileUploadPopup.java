package handlingPopups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/Home/Desktop/Naukri.html");
	File f=new File("C:\\Users\\Home\\Desktop\\resume.docx");
	String absPath = f.getAbsolutePath();
	driver.findElement(By.id("cv")).sendKeys(absPath);
	
}
}
