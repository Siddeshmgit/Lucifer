package handling_popups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/Naukri.html");
	File f=new File("./data/Resume.docx");
	String absPath = f.getAbsolutePath();
	System.out.println(absPath);
//sendKeys() will accept only absolute path of the file whereas if we use absolute path it will 
//work only in the mentioned system. In order to make it generic we use relative path 
//of the file and use getAbsolutePath() of File class
	driver.findElement(By.id("cv")).sendKeys(absPath);
}
}
