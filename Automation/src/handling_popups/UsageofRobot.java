package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class UsageofRobot {
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	int n=1000;
	Thread.sleep(n);
	Runtime.getRuntime().exec("notepad");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_Q);Thread.sleep(n);
	r.keyRelease(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_S);Thread.sleep(n);
	r.keyPress(KeyEvent.VK_P);Thread.sleep(n);
	r.keyPress(KeyEvent.VK_CONTROL);Thread.sleep(n);
	r.keyPress(KeyEvent.VK_S);Thread.sleep(n);
	r.keyRelease(KeyEvent.VK_CONTROL);Thread.sleep(n);
	r.keyPress(KeyEvent.VK_Q);Thread.sleep(n);
	r.keyPress(KeyEvent.VK_S);Thread.sleep(n);
	r.keyPress(KeyEvent.VK_P);Thread.sleep(n);
	r.keyPress(KeyEvent.VK_ENTER);Thread.sleep(n);
	
}
}
