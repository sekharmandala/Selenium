package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Java Selenium\\Jarfiles\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/index.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		System.out.println("Login Completed");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(2000);
		//Frame ///////////////////////////////
		//frame("id/name/index")
		driver.switchTo().frame("rightMenu");
		System.out.println("Enter in to frame");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Sekhar");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Mandala");
		Thread.sleep(2000);
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(2000);
		//After completed the frame page then switchTo().defaultContent tag
		//Exit from the frame
		driver.switchTo().defaultContent();
		///////////////////////////////
		System.out.println("Exit from frame");
		driver.findElement(By.linkText("Logout")).click();
		driver.close();

		}
}
