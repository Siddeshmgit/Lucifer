package assignments;

import java.io.FileInputStream;
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

public class ActionsOnActitimeUsingPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties p = new Properties();
p.load(fis);
String url = p.getProperty("url");
String un = p.getProperty("username");
String pwd = p.getProperty("pwd");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
driver.get(url);
driver.findElement(By.id("username")).sendKeys(un);
driver.findElement(By.name("pwd")).sendKeys(pwd);
driver.findElement(By.xpath("//div[text()='Login ']")).click();
driver.findElement(By.xpath("//div[@onclick='openHelpAndSupportMenu(event)']")).click();
driver.findElement(By.linkText("About your actiTIME")).click();
//Thread.sleep(2000);
for (int i = 0; i < 100; i++) {
	try {
		driver.findElement(By.linkText("Read License Agreement")).click();
		break;
	} catch (Exception e) {
		System.out.println(i);
	}
}

Set<String> allid = driver.getWindowHandles();
//for (String id : allid) {
//	driver.switchTo().window(id);
//}
Iterator<String> i = allid.iterator();
while (i.hasNext()) {
String id = i.next();
driver.switchTo().window(id);
}
List<WebElement> allheadings = driver.findElements(By.tagName("h2"));
int c=allheadings.size();
//for (int i = 0; i < c; i++) {
//	String text = allheadings.get(i).getText();
//	System.out.println(text);
//}
for (WebElement text : allheadings) {
	String heading = text.getText();
	System.out.println(heading);
}
//Iterator<WebElement> i1 = allheadings.iterator();
//while (i1.hasNext()) {
//	WebElement text = i1.next();
//	String heading = text.getText();
//	System.out.println(heading);
//}




	}

}
