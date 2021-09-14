package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Practices {
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.gecko.driver", "D:\\Java Selenium\\Jarfiles\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.125.5/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login Completed");
	
	//Mouseover // First we need to creat an object
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("Time"))).perform();;
	Thread.sleep(2000);
	ac.moveToElement(driver.findElement(By.linkText("Timesheets"))).perform();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Print Timesheets")).click();
	
	
}
}
