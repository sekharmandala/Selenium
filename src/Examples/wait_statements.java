package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_statements {
public static void main(String args[]) {
	System.setProperty("webdriver.gecko.driver", "D:\\Java Selenium\\Jarfiles\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.125.5/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	//wait until login button need to be load - Explicit wait
	WebDriverWait wait = new WebDriverWait(driver,5000);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
	driver.findElement(By.name("Submit")).click();
	
	//Wait unti page need to be load - implicit wait 
	///driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	///driver.findElement(By.name("Submit")).click();
	
	//Thread.sleep(); we known that
}
}
