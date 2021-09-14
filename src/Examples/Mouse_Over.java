package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over {
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.gecko.driver", "D:\\Java Selenium\\Jarfiles\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.125.5/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login Completed");
	////////////////////////////////////////
	//Mouseover // First we need to creat an object
	Actions ac = new Actions(driver);
	Thread.sleep(3000);
	//then movetoelement to find the elements and perform 
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	Thread.sleep(3000);
	//after perform dropdown the elements then find the element which one u need to click
	driver.findElement(By.linkText("Employee List")).click();
	///////////////////////////////
	System.out.println("Mouseover Completed");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
	
	
	
}
}
