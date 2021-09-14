package Examples;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Key_Board {
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.gecko.driver", "D:\\Java Selenium\\Jarfiles\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.125.5/nareshit/index.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	Thread.sleep(3000);
	//////////////////////////
	//Robot Method by using 1. TAB  2. ENTER (IT is JAVA Base Keys)
	Robot r = new Robot();
	///TAB
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	//ENTER
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	/////////////////////////////
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(2000);
	driver.close();
}
}

