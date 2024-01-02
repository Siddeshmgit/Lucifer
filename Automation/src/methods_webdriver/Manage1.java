package methods_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage1 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	 Point p = driver.manage().window().getPosition();
	 int xAxis=p.getX();
	 int yAxis=p.getY();
	 System.out.println("x axis:"+xAxis+"\n y axis:"+yAxis);
	 driver.manage().window().setPosition(p);
	 p.x=111;
	 p.y=222;
	 Point p1=driver.manage().window().getPosition();
	 int x=p1.getX();
	 int y=p1.getY();
	 System.out.println("x axis:"+x+"\n y axis:"+y);
	 Dimension d=driver.manage().window().getSize();
	 int h=d.getHeight();
	 int w=d.getWidth();
	 System.out.println("height:"+h+"\n Width:"+w);
	 driver.manage().window().setSize(new Dimension(111,333));
	 driver.quit();
 }
}
/*
x axis:10
y axis:10
x axis:10
y axis:10
height:718
Width:1050
*/