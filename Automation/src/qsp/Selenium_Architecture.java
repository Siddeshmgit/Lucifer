package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium_Architecture {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		String t1 = d.getTitle();
		System.out.println(t1);
		d.close();
		FirefoxDriver f = new FirefoxDriver();
		f.get("https://www.firefox.com/");
		String t2 = f.getTitle();
		System.out.println(t2);
		f.close();
		}

}
/*
 Google
 Firefox
 */
