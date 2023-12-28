package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		System.out.println(jse.executeScript("return document.title"));
		System.out.println(jse.executeScript("return document.URL"));
	}
}
