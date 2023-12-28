package assignments;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindowUsingScanner {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the title:");
		String title = s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
	Set<String> allid = driver.getWindowHandles();
	for (String id : allid) {
		driver.switchTo().window(id);
		String atitle = driver.getTitle();
//		if (atitle.contains(title)) {
//			driver.close();
//		}
		if (atitle.contains(title)) {
			driver.close();
		}
			
		}

	}

}
