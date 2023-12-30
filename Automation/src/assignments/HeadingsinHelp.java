package assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadingsinHelp {
public static void main(String[] args) throws IOException, InterruptedException {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String url = p.getProperty("url");
	String un = p.getProperty("username");
	String pwd = p.getProperty("password");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	WebElement ele1 = driver.findElement(By.xpath("//div[@onclick='openHelpAndSupportMenu(event)']"));
	Thread.sleep(2000);ele1.click();
	driver.findElement(By.linkText("About your actiTIME")).click();
	WebElement ele = driver.findElement(By.xpath("(//a[@href='javascript:void(0)'])[3]"));
	Thread.sleep(2000);ele.click();
	Set<String> pwid = driver.getWindowHandles();
    for (String s : pwid) {
		driver.switchTo().window(s);}
    List<WebElement> allText = driver.findElements(By.xpath("//h2"));
    /*for (int i=0;i<allText.size();i++) {
		String text = allText.get(i).getText();
		System.out.println(text);*/
	/*for (WebElement text: allText) {
		String texts = text.getText();
		System.out.println(texts);
	}*/
	 Iterator<WebElement> i = allText.iterator();
	 while(i.hasNext()) {
		 WebElement text = i.next();
		 String texts = text.getText();
		 System.out.println(texts);
	 }
	}
}
