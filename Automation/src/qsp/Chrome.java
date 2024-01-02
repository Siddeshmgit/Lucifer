package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
public static void main(String[] args) {
	ChromeDriver d = new ChromeDriver();//It is going to open new chrome browser.
	d.get("https://www.google.com");// get()is used to trigger the url.
	String title = d.getTitle();// getTitle() is used to fetch the title of the current web page.
	System.out.println(title);
	String url = d.getCurrentUrl();//getCurrentUrl() is used to fetch the url of current webpage
	System.out.println(url);
	d.close();//close() is used to close the current browser.
	
}
}
/*
Google
https://www.google.com/
*/