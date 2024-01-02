package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome1 {
public static void main(String[] args) {
	ChromeDriver d = new ChromeDriver();
    d.get("https://www.google.com/");
    String actualtitle = "Google";
    String expectedtitle = d.getTitle();
    System.out.println(expectedtitle);
    String actualurl = "https://www.google.com/";
    String expectedurl = d.getCurrentUrl();
    System.out.println(expectedurl);
    //In order to verify a web page we should compare the url and title.
    if(actualtitle.equals(expectedtitle)&&actualurl.equals(expectedurl))
    {//equals should be used because we are comparing values not address.
    System.out.println("Both title and url are same");
    }
    else {
    	System.out.println("Both title and url are not same");
    }
    d.close();
}
}
/*
Google
https://www.google.com/
Both title and url are same
*/
