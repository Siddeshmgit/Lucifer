package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
public void demo() {
	Reporter.log("Hello");	//It will be printed in the report
//	Reporter.log("Hello",false);	//It will be printed in the report
}
	@Test
public void demo2() {
	Reporter.log("Bye",true);	//It will be printed both on report as well as console
}
	@Test
public void demo3() {
	System.out.println("Hii");	//It will be printed only on the console
}

}
