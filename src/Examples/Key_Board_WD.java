package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Key_Board_WD {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Java Selenium\\Jarfiles\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/index.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(3000);	
		////WebDriver Method
		driver.findElement(By.name("txtUserName")).sendKeys(Keys.TAB);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.close();
		/////
	}
}
