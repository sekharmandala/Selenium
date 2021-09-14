package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\Java Selenium\\Jarfiles\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().frame("rightMenu");
		/// Drop Down 
		//Creat an object
		Select st = new Select(driver.findElement(By.name("loc_code")));
		Thread.sleep(2000);
		//Dropdown Text
		st.selectByVisibleText("Emp. ID");
		// Index
		//st.selectByIndex(1);
		// Value
		///st.selectByValue("0");
		Thread.sleep(2000);
		//////Done
		driver.findElement(By.name("loc_name")).sendKeys("0672");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value ='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.close();
		
			
	}
}
