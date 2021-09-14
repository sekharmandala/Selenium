package Examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Java Selenium\\Jarfiles\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/index.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		//////////////////
		//Alert method
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		///What is the text has displayed on topup
		System.out.println(a.getText());
		//a.accept for "ok"  a.dismiss for "cancle"
		a.accept();
		//////////
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
				
		
	}
	}

