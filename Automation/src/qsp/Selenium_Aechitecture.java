package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Aechitecture {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.instagram.com/");
	    d.close();

	}

}
